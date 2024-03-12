// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdTraceRaysIndirectKHR)(struct VkCommandBuffer_T* commandBuffer,struct VkStridedDeviceAddressRegionKHR* pRaygenShaderBindingTable,struct VkStridedDeviceAddressRegionKHR* pMissShaderBindingTable,struct VkStridedDeviceAddressRegionKHR* pHitShaderBindingTable,struct VkStridedDeviceAddressRegionKHR* pCallableShaderBindingTable,unsigned long long indirectDeviceAddress);
 * }
 */
public interface PFN_vkCmdTraceRaysIndirectKHR {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment pRaygenShaderBindingTable, java.lang.foreign.MemorySegment pMissShaderBindingTable, java.lang.foreign.MemorySegment pHitShaderBindingTable, java.lang.foreign.MemorySegment pCallableShaderBindingTable, long indirectDeviceAddress);
    static MemorySegment allocate(PFN_vkCmdTraceRaysIndirectKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1071.const$5, fi, constants$1071.const$4, scope);
    }
    static PFN_vkCmdTraceRaysIndirectKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _pRaygenShaderBindingTable, java.lang.foreign.MemorySegment _pMissShaderBindingTable, java.lang.foreign.MemorySegment _pHitShaderBindingTable, java.lang.foreign.MemorySegment _pCallableShaderBindingTable, long _indirectDeviceAddress) -> {
            try {
                constants$1072.const$0.invokeExact(symbol, _commandBuffer, _pRaygenShaderBindingTable, _pMissShaderBindingTable, _pHitShaderBindingTable, _pCallableShaderBindingTable, _indirectDeviceAddress);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


