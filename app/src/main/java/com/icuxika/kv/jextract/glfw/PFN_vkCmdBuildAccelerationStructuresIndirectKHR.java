// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBuildAccelerationStructuresIndirectKHR)(struct VkCommandBuffer_T* commandBuffer,unsigned int infoCount,struct VkAccelerationStructureBuildGeometryInfoKHR* pInfos,unsigned long long* pIndirectDeviceAddresses,unsigned int* pIndirectStrides,unsigned int** ppMaxPrimitiveCounts);
 * }
 */
public interface PFN_vkCmdBuildAccelerationStructuresIndirectKHR {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int infoCount, java.lang.foreign.MemorySegment pInfos, java.lang.foreign.MemorySegment pIndirectDeviceAddresses, java.lang.foreign.MemorySegment pIndirectStrides, java.lang.foreign.MemorySegment ppMaxPrimitiveCounts);
    static MemorySegment allocate(PFN_vkCmdBuildAccelerationStructuresIndirectKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1055.const$3, fi, constants$1055.const$2, scope);
    }
    static PFN_vkCmdBuildAccelerationStructuresIndirectKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _infoCount, java.lang.foreign.MemorySegment _pInfos, java.lang.foreign.MemorySegment _pIndirectDeviceAddresses, java.lang.foreign.MemorySegment _pIndirectStrides, java.lang.foreign.MemorySegment _ppMaxPrimitiveCounts) -> {
            try {
                constants$1055.const$4.invokeExact(symbol, _commandBuffer, _infoCount, _pInfos, _pIndirectDeviceAddresses, _pIndirectStrides, _ppMaxPrimitiveCounts);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


