// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkWaitSemaphores)(struct VkDevice_T* device,struct VkSemaphoreWaitInfo* pWaitInfo,unsigned long long timeout);
 * }
 */
public interface PFN_vkWaitSemaphores {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pWaitInfo, long timeout);
    static MemorySegment allocate(PFN_vkWaitSemaphores fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$343.const$5, fi, constants$343.const$4, scope);
    }
    static PFN_vkWaitSemaphores ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pWaitInfo, long _timeout) -> {
            try {
                return (int)constants$344.const$0.invokeExact(symbol, _device, _pWaitInfo, _timeout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


