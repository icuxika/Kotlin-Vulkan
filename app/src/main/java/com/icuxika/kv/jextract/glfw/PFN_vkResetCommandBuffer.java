// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkResetCommandBuffer)(struct VkCommandBuffer_T* commandBuffer,unsigned int flags);
 * }
 */
public interface PFN_vkResetCommandBuffer {

    int apply(java.lang.foreign.MemorySegment commandBuffer, int flags);
    static MemorySegment allocate(PFN_vkResetCommandBuffer fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$162.const$4, fi, constants$162.const$3, scope);
    }
    static PFN_vkResetCommandBuffer ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _flags) -> {
            try {
                return (int)constants$162.const$5.invokeExact(symbol, _commandBuffer, _flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

