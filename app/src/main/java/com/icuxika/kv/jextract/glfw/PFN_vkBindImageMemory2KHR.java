// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkBindImageMemory2KHR)(struct VkDevice_T* device,unsigned int bindInfoCount,struct VkBindImageMemoryInfo* pBindInfos);
 * }
 */
public interface PFN_vkBindImageMemory2KHR {

    int apply(java.lang.foreign.MemorySegment device, int bindInfoCount, java.lang.foreign.MemorySegment pBindInfos);
    static MemorySegment allocate(PFN_vkBindImageMemory2KHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$536.const$4, fi, constants$147.const$4, scope);
    }
    static PFN_vkBindImageMemory2KHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _bindInfoCount, java.lang.foreign.MemorySegment _pBindInfos) -> {
            try {
                return (int)constants$148.const$0.invokeExact(symbol, _device, _bindInfoCount, _pBindInfos);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


