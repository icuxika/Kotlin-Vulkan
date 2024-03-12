// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkCreateValidationCacheEXT)(struct VkDevice_T* device,struct VkValidationCacheCreateInfoEXT* pCreateInfo,struct VkAllocationCallbacks* pAllocator,struct VkValidationCacheEXT_T** pValidationCache);
 * }
 */
public interface PFN_vkCreateValidationCacheEXT {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pCreateInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pAccelerationStructure);
    static MemorySegment allocate(PFN_vkCreateValidationCacheEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$709.const$4, fi, constants$143.const$2, scope);
    }
    static PFN_vkCreateValidationCacheEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pCreateInfo, java.lang.foreign.MemorySegment _pAllocator, java.lang.foreign.MemorySegment _pAccelerationStructure) -> {
            try {
                return (int)constants$143.const$4.invokeExact(symbol, _device, _pCreateInfo, _pAllocator, _pAccelerationStructure);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


