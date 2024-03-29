// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkGetPrivateDataEXT)(struct VkDevice_T* device,enum VkObjectType objectType,unsigned long long objectHandle,struct VkPrivateDataSlot_T* privateDataSlot,unsigned long long* pData);
 * }
 */
public interface PFN_vkGetPrivateDataEXT {

    void apply(java.lang.foreign.MemorySegment device, int objectType, long objectHandle, java.lang.foreign.MemorySegment privateDataSlot, java.lang.foreign.MemorySegment pData);
    static MemorySegment allocate(PFN_vkGetPrivateDataEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$854.const$0, fi, constants$415.const$1, scope);
    }
    static PFN_vkGetPrivateDataEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _objectType, long _objectHandle, java.lang.foreign.MemorySegment _privateDataSlot, java.lang.foreign.MemorySegment _pData) -> {
            try {
                constants$415.const$3.invokeExact(symbol, _device, _objectType, _objectHandle, _privateDataSlot, _pData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


