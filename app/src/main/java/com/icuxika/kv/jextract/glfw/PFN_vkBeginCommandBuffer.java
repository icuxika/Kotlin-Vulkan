// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkBeginCommandBuffer)(struct VkCommandBuffer_T* commandBuffer,struct VkCommandBufferBeginInfo* pBeginInfo);
 * }
 */
public interface PFN_vkBeginCommandBuffer {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pReleaseInfo);
    static MemorySegment allocate(PFN_vkBeginCommandBuffer fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$162.const$1, fi, constants$144.const$2, scope);
    }
    static PFN_vkBeginCommandBuffer ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pReleaseInfo) -> {
            try {
                return (int)constants$144.const$4.invokeExact(symbol, _device, _pReleaseInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


