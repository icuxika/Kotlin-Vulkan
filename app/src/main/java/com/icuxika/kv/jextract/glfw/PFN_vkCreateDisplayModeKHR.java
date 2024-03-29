// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkCreateDisplayModeKHR)(struct VkPhysicalDevice_T* physicalDevice,struct VkDisplayKHR_T* display,struct VkDisplayModeCreateInfoKHR* pCreateInfo,struct VkAllocationCallbacks* pAllocator,struct VkDisplayModeKHR_T** pMode);
 * }
 */
public interface PFN_vkCreateDisplayModeKHR {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment display, java.lang.foreign.MemorySegment pDisplayEventInfo, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pFence);
    static MemorySegment allocate(PFN_vkCreateDisplayModeKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$450.const$2, fi, constants$450.const$1, scope);
    }
    static PFN_vkCreateDisplayModeKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _display, java.lang.foreign.MemorySegment _pDisplayEventInfo, java.lang.foreign.MemorySegment _pAllocator, java.lang.foreign.MemorySegment _pFence) -> {
            try {
                return (int)constants$450.const$3.invokeExact(symbol, _device, _display, _pDisplayEventInfo, _pAllocator, _pFence);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


