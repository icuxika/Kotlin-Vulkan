// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetStencilReference)(struct VkCommandBuffer_T* commandBuffer,unsigned int faceMask,unsigned int reference);
 * }
 */
public interface PFN_vkCmdSetStencilReference {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int taskCount, int firstTask);
    static MemorySegment allocate(PFN_vkCmdSetStencilReference fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$165.const$5, fi, constants$165.const$1, scope);
    }
    static PFN_vkCmdSetStencilReference ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _taskCount, int _firstTask) -> {
            try {
                constants$165.const$3.invokeExact(symbol, _commandBuffer, _taskCount, _firstTask);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


