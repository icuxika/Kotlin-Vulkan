// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBeginRenderPass)(struct VkCommandBuffer_T* commandBuffer,struct VkRenderPassBeginInfo* pRenderPassBegin,enum VkSubpassContents contents);
 * }
 */
public interface PFN_vkCmdBeginRenderPass {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment pRenderPassBegin, int contents);
    static MemorySegment allocate(PFN_vkCmdBeginRenderPass fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$178.const$2, fi, constants$174.const$2, scope);
    }
    static PFN_vkCmdBeginRenderPass ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _pRenderPassBegin, int _contents) -> {
            try {
                constants$174.const$4.invokeExact(symbol, _commandBuffer, _pRenderPassBegin, _contents);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

