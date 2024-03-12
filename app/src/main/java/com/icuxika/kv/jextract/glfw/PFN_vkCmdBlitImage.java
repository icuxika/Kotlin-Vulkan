// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBlitImage)(struct VkCommandBuffer_T* commandBuffer,struct VkImage_T* srcImage,enum VkImageLayout srcImageLayout,struct VkImage_T* dstImage,enum VkImageLayout dstImageLayout,unsigned int regionCount,struct VkImageBlit* pRegions,enum VkFilter filter);
 * }
 */
public interface PFN_vkCmdBlitImage {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment srcImage, int srcImageLayout, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, int regionCount, java.lang.foreign.MemorySegment pRegions, int filter);
    static MemorySegment allocate(PFN_vkCmdBlitImage fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$171.const$2, fi, constants$171.const$1, scope);
    }
    static PFN_vkCmdBlitImage ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _srcImage, int _srcImageLayout, java.lang.foreign.MemorySegment _dstImage, int _dstImageLayout, int _regionCount, java.lang.foreign.MemorySegment _pRegions, int _filter) -> {
            try {
                constants$171.const$3.invokeExact(symbol, _commandBuffer, _srcImage, _srcImageLayout, _dstImage, _dstImageLayout, _regionCount, _pRegions, _filter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


