// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdPushDescriptorSetWithTemplateKHR)(struct VkCommandBuffer_T* commandBuffer,struct VkDescriptorUpdateTemplate_T* descriptorUpdateTemplate,struct VkPipelineLayout_T* layout,unsigned int set,void* pData);
 * }
 */
public interface PFN_vkCmdPushDescriptorSetWithTemplateKHR {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment descriptorUpdateTemplate, java.lang.foreign.MemorySegment layout, int set, java.lang.foreign.MemorySegment pData);
    static MemorySegment allocate(PFN_vkCmdPushDescriptorSetWithTemplateKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$511.const$4, fi, constants$170.const$1, scope);
    }
    static PFN_vkCmdPushDescriptorSetWithTemplateKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _descriptorUpdateTemplate, java.lang.foreign.MemorySegment _layout, int _set, java.lang.foreign.MemorySegment _pData) -> {
            try {
                constants$170.const$3.invokeExact(symbol, _commandBuffer, _descriptorUpdateTemplate, _layout, _set, _pData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

