// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkGetPerformanceParameterINTEL)(struct VkDevice_T* device,enum VkPerformanceParameterTypeINTEL parameter,struct VkPerformanceValueINTEL* pValue);
 * }
 */
public interface PFN_vkGetPerformanceParameterINTEL {

    int apply(java.lang.foreign.MemorySegment device, int parameter, java.lang.foreign.MemorySegment pValue);
    static MemorySegment allocate(PFN_vkGetPerformanceParameterINTEL fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$772.const$5, fi, constants$147.const$4, scope);
    }
    static PFN_vkGetPerformanceParameterINTEL ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _parameter, java.lang.foreign.MemorySegment _pValue) -> {
            try {
                return (int)constants$148.const$0.invokeExact(symbol, _device, _parameter, _pValue);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


