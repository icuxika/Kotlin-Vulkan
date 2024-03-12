// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdCopyMemoryIndirectNV)(struct VkCommandBuffer_T* commandBuffer,unsigned long long copyBufferAddress,unsigned int copyCount,unsigned int stride);
 * }
 */
public interface PFN_vkCmdCopyMemoryIndirectNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, long copyBufferAddress, int copyCount, int stride);
    static MemorySegment allocate(PFN_vkCmdCopyMemoryIndirectNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$975.const$2, fi, constants$14.const$3, scope);
    }
    static PFN_vkCmdCopyMemoryIndirectNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, long _copyBufferAddress, int _copyCount, int _stride) -> {
            try {
                constants$14.const$5.invokeExact(symbol, _commandBuffer, _copyBufferAddress, _copyCount, _stride);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


