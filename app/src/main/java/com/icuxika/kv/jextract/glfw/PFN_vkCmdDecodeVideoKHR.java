// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdDecodeVideoKHR)(struct VkCommandBuffer_T* commandBuffer,struct VkVideoDecodeInfoKHR* pDecodeInfo);
 * }
 */
public interface PFN_vkCmdDecodeVideoKHR {

    void apply(java.lang.foreign.MemorySegment block, java.lang.foreign.MemorySegment user);
    static MemorySegment allocate(PFN_vkCmdDecodeVideoKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$476.const$5, fi, constants$14.const$0, scope);
    }
    static PFN_vkCmdDecodeVideoKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _block, java.lang.foreign.MemorySegment _user) -> {
            try {
                constants$14.const$2.invokeExact(symbol, _block, _user);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


