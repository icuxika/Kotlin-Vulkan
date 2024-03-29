// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdDecompressMemoryIndirectCountNV)(struct VkCommandBuffer_T* commandBuffer,unsigned long long indirectCommandsAddress,unsigned long long indirectCommandsCountAddress,unsigned int stride);
 * }
 */
public interface PFN_vkCmdDecompressMemoryIndirectCountNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, long indirectCommandsAddress, long indirectCommandsCountAddress, int stride);
    static MemorySegment allocate(PFN_vkCmdDecompressMemoryIndirectCountNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$979.const$1, fi, constants$979.const$0, scope);
    }
    static PFN_vkCmdDecompressMemoryIndirectCountNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, long _indirectCommandsAddress, long _indirectCommandsCountAddress, int _stride) -> {
            try {
                constants$979.const$2.invokeExact(symbol, _commandBuffer, _indirectCommandsAddress, _indirectCommandsCountAddress, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


