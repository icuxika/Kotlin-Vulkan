// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkGetDeviceFaultInfoEXT)(struct VkDevice_T* device,struct VkDeviceFaultCountsEXT* pFaultCounts,struct VkDeviceFaultInfoEXT* pFaultInfo);
 * }
 */
public interface PFN_vkGetDeviceFaultInfoEXT {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment deferredOperation, java.lang.foreign.MemorySegment pInfo);
    static MemorySegment allocate(PFN_vkGetDeviceFaultInfoEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$905.const$0, fi, constants$139.const$5, scope);
    }
    static PFN_vkGetDeviceFaultInfoEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _deferredOperation, java.lang.foreign.MemorySegment _pInfo) -> {
            try {
                return (int)constants$140.const$1.invokeExact(symbol, _device, _deferredOperation, _pInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


