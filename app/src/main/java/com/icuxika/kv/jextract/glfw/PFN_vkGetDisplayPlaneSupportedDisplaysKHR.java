// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkGetDisplayPlaneSupportedDisplaysKHR)(struct VkPhysicalDevice_T* physicalDevice,unsigned int planeIndex,unsigned int* pDisplayCount,struct VkDisplayKHR_T** pDisplays);
 * }
 */
public interface PFN_vkGetDisplayPlaneSupportedDisplaysKHR {

    int apply(java.lang.foreign.MemorySegment queue, int submitCount, java.lang.foreign.MemorySegment pSubmits, java.lang.foreign.MemorySegment fence);
    static MemorySegment allocate(PFN_vkGetDisplayPlaneSupportedDisplaysKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$449.const$5, fi, constants$145.const$3, scope);
    }
    static PFN_vkGetDisplayPlaneSupportedDisplaysKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _queue, int _submitCount, java.lang.foreign.MemorySegment _pSubmits, java.lang.foreign.MemorySegment _fence) -> {
            try {
                return (int)constants$145.const$5.invokeExact(symbol, _queue, _submitCount, _pSubmits, _fence);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

