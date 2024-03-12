// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBeginQueryIndexedEXT)(struct VkCommandBuffer_T* commandBuffer,struct VkQueryPool_T* queryPool,unsigned int query,unsigned int flags,unsigned int index);
 * }
 */
public interface PFN_vkCmdBeginQueryIndexedEXT {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment queryPool, int query, int flags, int index);
    static MemorySegment allocate(PFN_vkCmdBeginQueryIndexedEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$627.const$4, fi, constants$627.const$3, scope);
    }
    static PFN_vkCmdBeginQueryIndexedEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _queryPool, int _query, int _flags, int _index) -> {
            try {
                constants$627.const$5.invokeExact(symbol, _commandBuffer, _queryPool, _query, _flags, _index);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

