// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetViewportWScalingNV)(struct VkCommandBuffer_T* commandBuffer,unsigned int firstViewport,unsigned int viewportCount,struct VkViewportWScalingNV* pViewportWScalings);
 * }
 */
public interface PFN_vkCmdSetViewportWScalingNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int firstViewport, int viewportCount, java.lang.foreign.MemorySegment pViewportSwizzles);
    static MemorySegment allocate(PFN_vkCmdSetViewportWScalingNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$655.const$1, fi, constants$145.const$0, scope);
    }
    static PFN_vkCmdSetViewportWScalingNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _firstViewport, int _viewportCount, java.lang.foreign.MemorySegment _pViewportSwizzles) -> {
            try {
                constants$145.const$2.invokeExact(symbol, _commandBuffer, _firstViewport, _viewportCount, _pViewportSwizzles);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


