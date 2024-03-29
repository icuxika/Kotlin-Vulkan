// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkBindOpticalFlowSessionImageNV)(struct VkDevice_T* device,struct VkOpticalFlowSessionNV_T* session,enum VkOpticalFlowSessionBindingPointNV bindingPoint,struct VkImageView_T* view,enum VkImageLayout layout);
 * }
 */
public interface PFN_vkBindOpticalFlowSessionImageNV {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment session, int bindingPoint, java.lang.foreign.MemorySegment view, int layout);
    static MemorySegment allocate(PFN_vkBindOpticalFlowSessionImageNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1020.const$1, fi, constants$1020.const$0, scope);
    }
    static PFN_vkBindOpticalFlowSessionImageNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _session, int _bindingPoint, java.lang.foreign.MemorySegment _view, int _layout) -> {
            try {
                return (int)constants$1020.const$2.invokeExact(symbol, _device, _session, _bindingPoint, _view, _layout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


