// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBindShadingRateImageNV)(struct VkCommandBuffer_T* commandBuffer,struct VkImageView_T* imageView,enum VkImageLayout imageLayout);
 * }
 */
public interface PFN_vkCmdBindShadingRateImageNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment imageView, int imageLayout);
    static MemorySegment allocate(PFN_vkCmdBindShadingRateImageNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$716.const$4, fi, constants$174.const$2, scope);
    }
    static PFN_vkCmdBindShadingRateImageNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _imageView, int _imageLayout) -> {
            try {
                constants$174.const$4.invokeExact(symbol, _commandBuffer, _imageView, _imageLayout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

