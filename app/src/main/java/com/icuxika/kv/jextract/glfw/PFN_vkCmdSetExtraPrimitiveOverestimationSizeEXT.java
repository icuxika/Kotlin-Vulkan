// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)(struct VkCommandBuffer_T* commandBuffer,float extraPrimitiveOverestimationSize);
 * }
 */
public interface PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT {

    void apply(java.lang.foreign.MemorySegment commandBuffer, float extraPrimitiveOverestimationSize);
    static MemorySegment allocate(PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$994.const$1, fi, constants$163.const$3, scope);
    }
    static PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, float _extraPrimitiveOverestimationSize) -> {
            try {
                constants$163.const$5.invokeExact(symbol, _commandBuffer, _extraPrimitiveOverestimationSize);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


