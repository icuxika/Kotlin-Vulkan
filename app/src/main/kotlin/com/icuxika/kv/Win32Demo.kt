package com.icuxika.kv

import com.icuxika.kv.jextract.win32.HOOKPROC
import com.icuxika.kv.jextract.win32.KBDLLHOOKSTRUCT
import com.icuxika.kv.jextract.win32.ffm_h.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment

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