// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdDrawClusterIndirectHUAWEI)(struct VkCommandBuffer_T* commandBuffer,struct VkBuffer_T* buffer,unsigned long long offset);
 * }
 */
public interface PFN_vkCmdDrawClusterIndirectHUAWEI {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment buffer, long offset);
    static MemorySegment allocate(PFN_vkCmdDrawClusterIndirectHUAWEI fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$960.const$3, fi, constants$169.const$4, scope);
    }
    static PFN_vkCmdDrawClusterIndirectHUAWEI ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _buffer, long _offset) -> {
            try {
                constants$170.const$0.invokeExact(symbol, _commandBuffer, _buffer, _offset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


