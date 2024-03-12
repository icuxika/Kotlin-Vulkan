// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR)(struct VkPhysicalDevice_T* physicalDevice,unsigned int queueFamilyIndex,unsigned int* pCounterCount,struct VkPerformanceCounterKHR* pCounters,struct VkPerformanceCounterDescriptionKHR* pCounterDescriptions);
 * }
 */
public interface PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR {

    int apply(java.lang.foreign.MemorySegment device, int createInfoCount, java.lang.foreign.MemorySegment pCreateInfos, java.lang.foreign.MemorySegment pAllocator, java.lang.foreign.MemorySegment pShaders);
    static MemorySegment allocate(PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$527.const$0, fi, constants$452.const$5, scope);
    }
    static PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _createInfoCount, java.lang.foreign.MemorySegment _pCreateInfos, java.lang.foreign.MemorySegment _pAllocator, java.lang.foreign.MemorySegment _pShaders) -> {
            try {
                return (int)constants$453.const$1.invokeExact(symbol, _device, _createInfoCount, _pCreateInfos, _pAllocator, _pShaders);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

