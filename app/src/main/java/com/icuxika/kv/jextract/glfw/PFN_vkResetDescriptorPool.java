// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkResetDescriptorPool)(struct VkDevice_T* device,struct VkDescriptorPool_T* descriptorPool,unsigned int flags);
 * }
 */
public interface PFN_vkResetDescriptorPool {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pipeline, int shader);
    static MemorySegment allocate(PFN_vkResetDescriptorPool fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$159.const$0, fi, constants$158.const$5, scope);
    }
    static PFN_vkResetDescriptorPool ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pipeline, int _shader) -> {
            try {
                return (int)constants$159.const$1.invokeExact(symbol, _device, _pipeline, _shader);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


