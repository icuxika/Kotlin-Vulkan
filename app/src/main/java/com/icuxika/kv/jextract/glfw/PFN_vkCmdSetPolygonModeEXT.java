// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetPolygonModeEXT)(struct VkCommandBuffer_T* commandBuffer,enum VkPolygonMode polygonMode);
 * }
 */
public interface PFN_vkCmdSetPolygonModeEXT {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int polygonMode);
    static MemorySegment allocate(PFN_vkCmdSetPolygonModeEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$992.const$2, fi, constants$178.const$3, scope);
    }
    static PFN_vkCmdSetPolygonModeEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _polygonMode) -> {
            try {
                constants$178.const$5.invokeExact(symbol, _commandBuffer, _polygonMode);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

