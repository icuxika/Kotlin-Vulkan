// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetDepthCompareOp)(struct VkCommandBuffer_T* commandBuffer,enum VkCompareOp depthCompareOp);
 * }
 */
public interface PFN_vkCmdSetDepthCompareOp {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int depthCompareOp);
    static MemorySegment allocate(PFN_vkCmdSetDepthCompareOp fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$420.const$2, fi, constants$178.const$3, scope);
    }
    static PFN_vkCmdSetDepthCompareOp ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _depthCompareOp) -> {
            try {
                constants$178.const$5.invokeExact(symbol, _commandBuffer, _depthCompareOp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


