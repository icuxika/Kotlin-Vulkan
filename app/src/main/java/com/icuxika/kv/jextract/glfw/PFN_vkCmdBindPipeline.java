// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBindPipeline)(struct VkCommandBuffer_T* commandBuffer,enum VkPipelineBindPoint pipelineBindPoint,struct VkPipeline_T* pipeline);
 * }
 */
public interface PFN_vkCmdBindPipeline {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int pipelineBindPoint, java.lang.foreign.MemorySegment pipeline);
    static MemorySegment allocate(PFN_vkCmdBindPipeline fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$163.const$0, fi, constants$140.const$5, scope);
    }
    static PFN_vkCmdBindPipeline ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _pipelineBindPoint, java.lang.foreign.MemorySegment _pipeline) -> {
            try {
                constants$141.const$1.invokeExact(symbol, _commandBuffer, _pipelineBindPoint, _pipeline);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

