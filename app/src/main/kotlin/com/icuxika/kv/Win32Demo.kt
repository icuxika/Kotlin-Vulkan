package com.icuxika.kv

import com.icuxika.kv.jextract.win32.HOOKPROC
import com.icuxika.kv.jextract.win32.KBDLLHOOKSTRUCT
import com.icuxika.kv.jextract.win32.ffm_h.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.Scanner
import kotlin.concurrent.thread

/**
 * https://learn.microsoft.com/zh-cn/windows/win32/api/winuser/nf-winuser-setwindowshookexw
 * https://learn.microsoft.com/zh-cn/windows/win32/inputdev/virtual-key-codes
 */
class Win32Demo {

    private lateinit var hook: MemorySegment
    private var currentThreadId: Int = 0

    fun launch() {
        thread {
            currentThreadId = GetCurrentThreadId()
            Arena.ofConfined().use { arena ->
                hook = SetWindowsHookExW(WH_KEYBOARD_LL(), HOOKPROC.allocate({ code, wParam, lParam ->
                    val kbDllHookStruct = KBDLLHOOKSTRUCT.ofAddress(MemorySegment.ofAddress(lParam), arena)
                    val vkCode = KBDLLHOOKSTRUCT.`vkCode$get`(kbDllHookStruct, 0)


                    val buffer = arena.allocateArray(ValueLayout.JAVA_SHORT, 32L)
                    val keyNameLength =
                        GetKeyNameTextW(MapVirtualKeyW(vkCode, MAPVK_VK_TO_VSC()).shl(16), buffer, 32 * 2)
                    val keyNameArray = ShortArray(keyNameLength)
                    for (i in 0 until keyNameLength) {
                        keyNameArray[i] = buffer.getAtIndex(ValueLayout.JAVA_SHORT, i.toLong())
                    }
                    val keyName = keyNameArray.joinToString(separator = "") { it.toInt().toChar().toString() }
                    println("key name: $keyName")


                    if (code >= 0) {
                        if (wParam == WM_KEYDOWN().toLong()) {
                            println("按下->${vkCode}")
                        } else if (wParam == WM_KEYUP().toLong()) {
                            println("松开->${vkCode}")
                        }
                    }
                    CallNextHookEx(hook, code, wParam, lParam)
                }, arena), MemorySegment.NULL, 0)
                println("hook")
                while (GetMessageW(arena.allocate(LPMSG), MemorySegment.NULL, 0, 0) != 0) {
                }
                UnhookWindowsHookEx(hook)
                println("unhook")
            }
        }
        var input: String?
        val scanner = Scanner(System.`in`)
        do {
            println("Enter q to exit: ")
            input = scanner.next()
            println(input)
        } while (input != "q")
        println("exit")
        PostThreadMessageW(currentThreadId, WM_QUIT(), 0, 0)
    }
}