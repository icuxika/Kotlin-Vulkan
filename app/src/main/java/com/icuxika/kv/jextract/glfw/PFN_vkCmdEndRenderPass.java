// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdEndRenderPass)(struct VkCommandBuffer_T* commandBuffer);
 * }
 */
public interface PFN_vkCmdEndRenderPass {

    void apply(java.lang.foreign.MemorySegment window);
    static MemorySegment allocate(PFN_vkCmdEndRenderPass fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$179.const$0, fi, constants$0.const$0, scope);
    }
    static PFN_vkCmdEndRenderPass ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _window) -> {
            try {
                constants$179.const$1.invokeExact(symbol, _window);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


