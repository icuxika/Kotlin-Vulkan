// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdFillBuffer)(struct VkCommandBuffer_T* commandBuffer,struct VkBuffer_T* dstBuffer,unsigned long long dstOffset,unsigned long long size,unsigned int data);
 * }
 */
public interface PFN_vkCmdFillBuffer {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment dstBuffer, long dstOffset, long size, int data);
    static MemorySegment allocate(PFN_vkCmdFillBuffer fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$173.const$2, fi, constants$173.const$1, scope);
    }
    static PFN_vkCmdFillBuffer ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _dstBuffer, long _dstOffset, long _size, int _data) -> {
            try {
                constants$173.const$3.invokeExact(symbol, _commandBuffer, _dstBuffer, _dstOffset, _size, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


