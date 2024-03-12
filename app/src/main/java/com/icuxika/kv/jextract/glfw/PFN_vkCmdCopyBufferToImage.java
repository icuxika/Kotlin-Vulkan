// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdCopyBufferToImage)(struct VkCommandBuffer_T* commandBuffer,struct VkBuffer_T* srcBuffer,struct VkImage_T* dstImage,enum VkImageLayout dstImageLayout,unsigned int regionCount,struct VkBufferImageCopy* pRegions);
 * }
 */
public interface PFN_vkCmdCopyBufferToImage {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment srcBuffer, java.lang.foreign.MemorySegment dstImage, int dstImageLayout, int regionCount, java.lang.foreign.MemorySegment pRegions);
    static MemorySegment allocate(PFN_vkCmdCopyBufferToImage fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$171.const$5, fi, constants$171.const$4, scope);
    }
    static PFN_vkCmdCopyBufferToImage ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _srcBuffer, java.lang.foreign.MemorySegment _dstImage, int _dstImageLayout, int _regionCount, java.lang.foreign.MemorySegment _pRegions) -> {
            try {
                constants$172.const$0.invokeExact(symbol, _commandBuffer, _srcBuffer, _dstImage, _dstImageLayout, _regionCount, _pRegions);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


