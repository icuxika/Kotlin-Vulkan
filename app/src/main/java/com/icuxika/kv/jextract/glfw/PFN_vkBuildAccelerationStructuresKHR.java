// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkBuildAccelerationStructuresKHR)(struct VkDevice_T* device,struct VkDeferredOperationKHR_T* deferredOperation,unsigned int infoCount,struct VkAccelerationStructureBuildGeometryInfoKHR* pInfos,struct VkAccelerationStructureBuildRangeInfoKHR** ppBuildRangeInfos);
 * }
 */
public interface PFN_vkBuildAccelerationStructuresKHR {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment deferredOperation, int infoCount, java.lang.foreign.MemorySegment pInfos, java.lang.foreign.MemorySegment ppBuildRangeInfos);
    static MemorySegment allocate(PFN_vkBuildAccelerationStructuresKHR fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1056.const$0, fi, constants$1055.const$5, scope);
    }
    static PFN_vkBuildAccelerationStructuresKHR ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _deferredOperation, int _infoCount, java.lang.foreign.MemorySegment _pInfos, java.lang.foreign.MemorySegment _ppBuildRangeInfos) -> {
            try {
                return (int)constants$1056.const$1.invokeExact(symbol, _device, _deferredOperation, _infoCount, _pInfos, _ppBuildRangeInfos);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


