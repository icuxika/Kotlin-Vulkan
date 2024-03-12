// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdBuildAccelerationStructureNV)(struct VkCommandBuffer_T* commandBuffer,struct VkAccelerationStructureInfoNV* pInfo,struct VkBuffer_T* instanceData,unsigned long long instanceOffset,unsigned int update,struct VkAccelerationStructureNV_T* dst,struct VkAccelerationStructureNV_T* src,struct VkBuffer_T* scratch,unsigned long long scratchOffset);
 * }
 */
public interface PFN_vkCmdBuildAccelerationStructureNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment instanceData, long instanceOffset, int update, java.lang.foreign.MemorySegment dst, java.lang.foreign.MemorySegment src, java.lang.foreign.MemorySegment scratch, long scratchOffset);
    static MemorySegment allocate(PFN_vkCmdBuildAccelerationStructureNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$734.const$5, fi, constants$734.const$4, scope);
    }
    static PFN_vkCmdBuildAccelerationStructureNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, java.lang.foreign.MemorySegment _pInfo, java.lang.foreign.MemorySegment _instanceData, long _instanceOffset, int _update, java.lang.foreign.MemorySegment _dst, java.lang.foreign.MemorySegment _src, java.lang.foreign.MemorySegment _scratch, long _scratchOffset) -> {
            try {
                constants$735.const$0.invokeExact(symbol, _commandBuffer, _pInfo, _instanceData, _instanceOffset, _update, _dst, _src, _scratch, _scratchOffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


