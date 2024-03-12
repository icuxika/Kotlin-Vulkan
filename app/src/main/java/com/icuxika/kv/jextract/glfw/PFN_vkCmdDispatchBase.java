// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdDispatchBase)(struct VkCommandBuffer_T* commandBuffer,unsigned int baseGroupX,unsigned int baseGroupY,unsigned int baseGroupZ,unsigned int groupCountX,unsigned int groupCountY,unsigned int groupCountZ);
 * }
 */
public interface PFN_vkCmdDispatchBase {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ);
    static MemorySegment allocate(PFN_vkCmdDispatchBase fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$259.const$0, fi, constants$258.const$5, scope);
    }
    static PFN_vkCmdDispatchBase ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _baseGroupX, int _baseGroupY, int _baseGroupZ, int _groupCountX, int _groupCountY, int _groupCountZ) -> {
            try {
                constants$259.const$1.invokeExact(symbol, _commandBuffer, _baseGroupX, _baseGroupY, _baseGroupZ, _groupCountX, _groupCountY, _groupCountZ);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

