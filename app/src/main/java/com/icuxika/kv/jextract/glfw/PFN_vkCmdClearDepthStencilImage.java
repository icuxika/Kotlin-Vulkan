// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdClearDepthStencilImage)(struct VkCommandBuffer_T* commandBuffer,struct VkImage_T* image,enum VkImageLayout imageLayout,struct VkClearDepthStencilValue* pDepthStencil,unsigned int rangeCount,struct VkImageSubresourceRange* pRanges);
 * }
 */
public interface PFN_vkCmdClearDepthStencilImage {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment image, int imageLayout, java.lang.foreign.MemorySegment pDepthStencil, int rangeCount, java.lang.foreign.MemorySegment pRanges);
    static MemorySegment allocate(PFN_vkCmdClearDepthStencilImage fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$173.const$5, fi, constants$172.const$1, scope);
    }
    static PFN_vkCmdClearDepthStencilImage ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _image, int _imageLayout, java.lang.foreign.MemorySegment _pDepthStencil, int _rangeCount, java.lang.foreign.MemorySegment _pRanges) -> {
            try {
                constants$172.const$3.invokeExact(symbol, _commandBuffer, _image, _imageLayout, _pDepthStencil, _rangeCount, _pRanges);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


