// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkGetImageMemoryRequirements)(struct VkDevice_T* device,struct VkImage_T* image,struct VkMemoryRequirements* pMemoryRequirements);
 * }
 */
public interface PFN_vkGetImageMemoryRequirements {

    void apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pVersionInfo, java.lang.foreign.MemorySegment pCompatibility);
    static MemorySegment allocate(PFN_vkGetImageMemoryRequirements fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$149.const$2, fi, constants$142.const$0, scope);
    }
    static PFN_vkGetImageMemoryRequirements ofAddress(MemorySegment addr, Arena arena) {
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


