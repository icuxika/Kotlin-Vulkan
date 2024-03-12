// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkGetRayTracingShaderGroupHandlesKHR)(struct VkDevice_T* device,struct VkPipeline_T* pipeline,unsigned int firstGroup,unsigned int groupCount,unsigned long long dataSize,void* pData);
 * }
 */
public interface PFN_vkGetRayTracingShaderGroupHandlesKHR {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pipeline, int firstGroup, int groupCount, long dataSize, java.lang.foreign.MemorySegment pData);
    static MemorySegment allocate(PFN_vkGetRayTracingShaderGroupHandlesKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$736.const$3, fi, constants$736.const$2, scope);
    }
    static PFN_vkGetRayTracingShaderGroupHandlesKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pipeline, int _firstGroup, int _groupCount, long _dataSize, java.lang.foreign.MemorySegment _pData) -> {
            try {
                return (int)constants$736.const$4.invokeExact(symbol, _device, _pipeline, _firstGroup, _groupCount, _dataSize, _pData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


