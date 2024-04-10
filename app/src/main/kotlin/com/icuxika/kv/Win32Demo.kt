package com.icuxika.kv

import com.icuxika.kv.jextract.win32.HOOKPROC
import com.icuxika.kv.jextract.win32.KBDLLHOOKSTRUCT
import com.icuxika.kv.jextract.win32.ffm_h.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/**
 * https://learn.microsoft.com/zh-cn/windows/win32/api/winuser/nf-winuser-setwindowshookexw
 * https://learn.microsoft.com/zh-cn/windows/win32/inputdev/virtual-key-codes
 */
class Win32Demo {

    lateinit var hook: MemorySegment

    fun launch() {
        Arena.ofConfined().use { arena ->
            hook = SetWindowsHookExW(WH_KEYBOARD_LL(), HOOKPROC.allocate(object : HOOKPROC {
                override fun apply(code: Int, wParam: Long, lParam: Long): Long {
                    val kbDllHookStruct = KBDLLHOOKSTRUCT.ofAddress(MemorySegment.ofAddress(lParam), arena)
                    val vkCode = KBDLLHOOKSTRUCT.`vkCode$get`(kbDllHookStruct, 0)


                    val buffer = arena.allocateArray(ValueLayout.JAVA_SHORT, 32L)
                    val keyNameLength = GetKeyNameTextW(MapVirtualKeyW(vkCode, MAPVK_VK_TO_VSC()).shl(16), buffer, 32 * 2)
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
                    return CallNextHookEx(hook, code, wParam, lParam)
                }
            }, arena), MemorySegment.NULL, 0)
            while (GetMessageW(arena.allocate(LPMSG), MemorySegment.NULL, 0, 0) > 0) {
            }
            UnhookWindowsHookEx(hook)
        }
    }
}