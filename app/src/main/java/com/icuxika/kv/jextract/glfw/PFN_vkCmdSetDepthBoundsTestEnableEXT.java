// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetDepthBoundsTestEnableEXT)(struct VkCommandBuffer_T* commandBuffer,unsigned int depthBoundsTestEnable);
 * }
 */
public interface PFN_vkCmdSetDepthBoundsTestEnableEXT {

    void apply(java.lang.foreign.MemorySegment window, int codepoint);
    static MemorySegment allocate(PFN_vkCmdSetDepthBoundsTestEnableEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$809.const$1, fi, constants$178.const$3, scope);
    }
    static PFN_vkCmdSetDepthBoundsTestEnableEXT ofAddress(MemorySegment addr, Arena arena) {
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


