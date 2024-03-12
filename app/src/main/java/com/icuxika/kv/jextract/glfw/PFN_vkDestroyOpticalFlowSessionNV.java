// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkDestroyOpticalFlowSessionNV)(struct VkDevice_T* device,struct VkOpticalFlowSessionNV_T* session,struct VkAllocationCallbacks* pAllocator);
 * }
 */
public interface PFN_vkDestroyOpticalFlowSessionNV {

    void apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pVersionInfo, java.lang.foreign.MemorySegment pCompatibility);
    static MemorySegment allocate(PFN_vkDestroyOpticalFlowSessionNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1019.const$5, fi, constants$142.const$0, scope);
    }
    static PFN_vkDestroyOpticalFlowSessionNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pVersionInfo, java.lang.foreign.MemorySegment _pCompatibility) -> {
            try {
                constants$142.const$2.invokeExact(symbol, _device, _pVersionInfo, _pCompatibility);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


