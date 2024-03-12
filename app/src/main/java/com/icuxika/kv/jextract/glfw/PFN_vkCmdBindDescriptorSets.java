// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBindDescriptorSets)(struct VkCommandBuffer_T* commandBuffer,enum VkPipelineBindPoint pipelineBindPoint,struct VkPipelineLayout_T* layout,unsigned int firstSet,unsigned int descriptorSetCount,struct VkDescriptorSet_T** pDescriptorSets,unsigned int dynamicOffsetCount,unsigned int* pDynamicOffsets);
 * }
 */
public interface PFN_vkCmdBindDescriptorSets {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment layout, int firstSet, int descriptorSetCount, java.lang.foreign.MemorySegment pDescriptorSets, int dynamicOffsetCount, java.lang.foreign.MemorySegment pDynamicOffsets);
    static MemorySegment allocate(PFN_vkCmdBindDescriptorSets fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$166.const$1, fi, constants$166.const$0, scope);
    }
    static PFN_vkCmdBindDescriptorSets ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _pipelineBindPoint, java.lang.foreign.MemorySegment _layout, int _firstSet, int _descriptorSetCount, java.lang.foreign.MemorySegment _pDescriptorSets, int _dynamicOffsetCount, java.lang.foreign.MemorySegment _pDynamicOffsets) -> {
            try {
                constants$166.const$2.invokeExact(symbol, _commandBuffer, _pipelineBindPoint, _layout, _firstSet, _descriptorSetCount, _pDescriptorSets, _dynamicOffsetCount, _pDynamicOffsets);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


