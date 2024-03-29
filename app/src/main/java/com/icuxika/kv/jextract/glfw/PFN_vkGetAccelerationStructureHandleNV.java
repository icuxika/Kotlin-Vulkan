// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkGetAccelerationStructureHandleNV)(struct VkDevice_T* device,struct VkAccelerationStructureNV_T* accelerationStructure,unsigned long long dataSize,void* pData);
 * }
 */
public interface PFN_vkGetAccelerationStructureHandleNV {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment accelerationStructure, long dataSize, java.lang.foreign.MemorySegment pData);
    static MemorySegment allocate(PFN_vkGetAccelerationStructureHandleNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$737.const$1, fi, constants$737.const$0, scope);
    }
    static PFN_vkGetAccelerationStructureHandleNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _accelerationStructure, long _dataSize, java.lang.foreign.MemorySegment _pData) -> {
            try {
                return (int)constants$737.const$2.invokeExact(symbol, _device, _accelerationStructure, _dataSize, _pData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


