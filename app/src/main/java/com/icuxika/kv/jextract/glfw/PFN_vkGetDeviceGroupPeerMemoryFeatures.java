// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkGetDeviceGroupPeerMemoryFeatures)(struct VkDevice_T* device,unsigned int heapIndex,unsigned int localDeviceIndex,unsigned int remoteDeviceIndex,unsigned int* pPeerMemoryFeatures);
 * }
 */
public interface PFN_vkGetDeviceGroupPeerMemoryFeatures {

    void apply(java.lang.foreign.MemorySegment device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, java.lang.foreign.MemorySegment pPeerMemoryFeatures);
    static MemorySegment allocate(PFN_vkGetDeviceGroupPeerMemoryFeatures fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$258.const$2, fi, constants$258.const$1, scope);
    }
    static PFN_vkGetDeviceGroupPeerMemoryFeatures ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _heapIndex, int _localDeviceIndex, int _remoteDeviceIndex, java.lang.foreign.MemorySegment _pPeerMemoryFeatures) -> {
            try {
                constants$258.const$3.invokeExact(symbol, _device, _heapIndex, _localDeviceIndex, _remoteDeviceIndex, _pPeerMemoryFeatures);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

