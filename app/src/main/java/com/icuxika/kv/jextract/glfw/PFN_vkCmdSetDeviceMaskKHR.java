// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetDeviceMaskKHR)(struct VkCommandBuffer_T* commandBuffer,unsigned int deviceMask);
 * }
 */
public interface PFN_vkCmdSetDeviceMaskKHR {

    void apply(java.lang.foreign.MemorySegment window, int codepoint);
    static MemorySegment allocate(PFN_vkCmdSetDeviceMaskKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$502.const$2, fi, constants$178.const$3, scope);
    }
    static PFN_vkCmdSetDeviceMaskKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _window, int _codepoint) -> {
            try {
                constants$178.const$5.invokeExact(symbol, _window, _codepoint);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


