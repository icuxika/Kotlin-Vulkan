// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkTrimCommandPoolKHR)(struct VkDevice_T* device,struct VkCommandPool_T* commandPool,unsigned int flags);
 * }
 */
public interface PFN_vkTrimCommandPoolKHR {

    void apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment swapChain, int localDimmingEnable);
    static MemorySegment allocate(PFN_vkTrimCommandPoolKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$503.const$1, fi, constants$174.const$2, scope);
    }
    static PFN_vkTrimCommandPoolKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _swapChain, int _localDimmingEnable) -> {
            try {
                constants$174.const$4.invokeExact(symbol, _device, _swapChain, _localDimmingEnable);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


