// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*PFN_vkGetDeferredOperationMaxConcurrencyKHR)(struct VkDevice_T* device,struct VkDeferredOperationKHR_T* operation);
 * }
 */
public interface PFN_vkGetDeferredOperationMaxConcurrencyKHR {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pInfo);
    static MemorySegment allocate(PFN_vkGetDeferredOperationMaxConcurrencyKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$584.const$2, fi, constants$144.const$2, scope);
    }
    static PFN_vkGetDeferredOperationMaxConcurrencyKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pInfo) -> {
            try {
                return (int)constants$144.const$4.invokeExact(symbol, _device, _pInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

