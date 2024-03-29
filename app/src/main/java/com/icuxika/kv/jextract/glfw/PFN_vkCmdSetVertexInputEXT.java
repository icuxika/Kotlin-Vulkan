// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetVertexInputEXT)(struct VkCommandBuffer_T* commandBuffer,unsigned int vertexBindingDescriptionCount,struct VkVertexInputBindingDescription2EXT* pVertexBindingDescriptions,unsigned int vertexAttributeDescriptionCount,struct VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);
 * }
 */
public interface PFN_vkCmdSetVertexInputEXT {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int vertexBindingDescriptionCount, java.lang.foreign.MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, java.lang.foreign.MemorySegment pVertexAttributeDescriptions);
    static MemorySegment allocate(PFN_vkCmdSetVertexInputEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$912.const$0, fi, constants$159.const$4, scope);
    }
    static PFN_vkCmdSetVertexInputEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _vertexBindingDescriptionCount, java.lang.foreign.MemorySegment _pVertexBindingDescriptions, int _vertexAttributeDescriptionCount, java.lang.foreign.MemorySegment _pVertexAttributeDescriptions) -> {
            try {
                constants$160.const$0.invokeExact(symbol, _commandBuffer, _vertexBindingDescriptionCount, _pVertexBindingDescriptions, _vertexAttributeDescriptionCount, _pVertexAttributeDescriptions);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


