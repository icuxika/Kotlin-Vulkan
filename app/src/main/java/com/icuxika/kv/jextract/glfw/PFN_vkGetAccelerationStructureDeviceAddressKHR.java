// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned long long (*PFN_vkGetAccelerationStructureDeviceAddressKHR)(struct VkDevice_T* device,struct VkAccelerationStructureDeviceAddressInfoKHR* pInfo);
 * }
 */
public interface PFN_vkGetAccelerationStructureDeviceAddressKHR {

    long apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pInfo);
    static MemorySegment allocate(PFN_vkGetAccelerationStructureDeviceAddressKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1057.const$3, fi, constants$344.const$2, scope);
    }
    static PFN_vkGetAccelerationStructureDeviceAddressKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pInfo) -> {
            try {
                return (long)constants$344.const$4.invokeExact(symbol, _device, _pInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


