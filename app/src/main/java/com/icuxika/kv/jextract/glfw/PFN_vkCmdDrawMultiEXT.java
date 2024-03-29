// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdDrawMultiEXT)(struct VkCommandBuffer_T* commandBuffer,unsigned int drawCount,struct VkMultiDrawInfoEXT* pVertexInfo,unsigned int instanceCount,unsigned int firstInstance,unsigned int stride);
 * }
 */
public interface PFN_vkCmdDrawMultiEXT {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int drawCount, java.lang.foreign.MemorySegment pVertexInfo, int instanceCount, int firstInstance, int stride);
    static MemorySegment allocate(PFN_vkCmdDrawMultiEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$936.const$4, fi, constants$936.const$3, scope);
    }
    static PFN_vkCmdDrawMultiEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _drawCount, java.lang.foreign.MemorySegment _pVertexInfo, int _instanceCount, int _firstInstance, int _stride) -> {
            try {
                constants$936.const$5.invokeExact(symbol, _commandBuffer, _drawCount, _pVertexInfo, _instanceCount, _firstInstance, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


