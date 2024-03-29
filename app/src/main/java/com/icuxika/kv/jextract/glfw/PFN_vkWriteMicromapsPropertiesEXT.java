// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkWriteMicromapsPropertiesEXT)(struct VkDevice_T* device,unsigned int micromapCount,struct VkMicromapEXT_T** pMicromaps,enum VkQueryType queryType,unsigned long long dataSize,void* pData,unsigned long long stride);
 * }
 */
public interface PFN_vkWriteMicromapsPropertiesEXT {

    int apply(java.lang.foreign.MemorySegment device, int accelerationStructureCount, java.lang.foreign.MemorySegment pAccelerationStructures, int queryType, long dataSize, java.lang.foreign.MemorySegment pData, long stride);
    static MemorySegment allocate(PFN_vkWriteMicromapsPropertiesEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$955.const$0, fi, constants$954.const$5, scope);
    }
    static PFN_vkWriteMicromapsPropertiesEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _accelerationStructureCount, java.lang.foreign.MemorySegment _pAccelerationStructures, int _queryType, long _dataSize, java.lang.foreign.MemorySegment _pData, long _stride) -> {
            try {
                return (int)constants$955.const$1.invokeExact(symbol, _device, _accelerationStructureCount, _pAccelerationStructures, _queryType, _dataSize, _pData, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


