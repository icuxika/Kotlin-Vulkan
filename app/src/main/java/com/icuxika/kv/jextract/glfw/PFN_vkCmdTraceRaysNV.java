// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdTraceRaysNV)(struct VkCommandBuffer_T* commandBuffer,struct VkBuffer_T* raygenShaderBindingTableBuffer,unsigned long long raygenShaderBindingOffset,struct VkBuffer_T* missShaderBindingTableBuffer,unsigned long long missShaderBindingOffset,unsigned long long missShaderBindingStride,struct VkBuffer_T* hitShaderBindingTableBuffer,unsigned long long hitShaderBindingOffset,unsigned long long hitShaderBindingStride,struct VkBuffer_T* callableShaderBindingTableBuffer,unsigned long long callableShaderBindingOffset,unsigned long long callableShaderBindingStride,unsigned int width,unsigned int height,unsigned int depth);
 * }
 */
public interface PFN_vkCmdTraceRaysNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment raygenShaderBindingTableBuffer, long raygenShaderBindingOffset, java.lang.foreign.MemorySegment missShaderBindingTableBuffer, long missShaderBindingOffset, long missShaderBindingStride, java.lang.foreign.MemorySegment hitShaderBindingTableBuffer, long hitShaderBindingOffset, long hitShaderBindingStride, java.lang.foreign.MemorySegment callableShaderBindingTableBuffer, long callableShaderBindingOffset, long callableShaderBindingStride, int width, int height, int depth);
    static MemorySegment allocate(PFN_vkCmdTraceRaysNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$735.const$5, fi, constants$735.const$4, scope);
    }
    static PFN_vkCmdTraceRaysNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _raygenShaderBindingTableBuffer, long _raygenShaderBindingOffset, java.lang.foreign.MemorySegment _missShaderBindingTableBuffer, long _missShaderBindingOffset, long _missShaderBindingStride, java.lang.foreign.MemorySegment _hitShaderBindingTableBuffer, long _hitShaderBindingOffset, long _hitShaderBindingStride, java.lang.foreign.MemorySegment _callableShaderBindingTableBuffer, long _callableShaderBindingOffset, long _callableShaderBindingStride, int _width, int _height, int _depth) -> {
            try {
                constants$736.const$0.invokeExact(symbol, _commandBuffer, _raygenShaderBindingTableBuffer, _raygenShaderBindingOffset, _missShaderBindingTableBuffer, _missShaderBindingOffset, _missShaderBindingStride, _hitShaderBindingTableBuffer, _hitShaderBindingOffset, _hitShaderBindingStride, _callableShaderBindingTableBuffer, _callableShaderBindingOffset, _callableShaderBindingStride, _width, _height, _depth);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


