// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetLineStippleEXT)(struct VkCommandBuffer_T* commandBuffer,unsigned int lineStippleFactor,unsigned short lineStipplePattern);
 * }
 */
public interface PFN_vkCmdSetLineStippleEXT {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int lineStippleFactor, short lineStipplePattern);
    static MemorySegment allocate(PFN_vkCmdSetLineStippleEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$803.const$0, fi, constants$802.const$5, scope);
    }
    static PFN_vkCmdSetLineStippleEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _lineStippleFactor, short _lineStipplePattern) -> {
            try {
                constants$803.const$1.invokeExact(symbol, _commandBuffer, _lineStippleFactor, _lineStipplePattern);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


