// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkGetMicromapBuildSizesEXT)(struct VkDevice_T* device,enum VkAccelerationStructureBuildTypeKHR buildType,struct VkMicromapBuildInfoEXT* pBuildInfo,struct VkMicromapBuildSizesInfoEXT* pSizeInfo);
 * }
 */
public interface PFN_vkGetMicromapBuildSizesEXT {

    void apply(java.lang.foreign.MemorySegment device, int buildType, java.lang.foreign.MemorySegment pBuildInfo, java.lang.foreign.MemorySegment pSizeInfo);
    static MemorySegment allocate(PFN_vkGetMicromapBuildSizesEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$956.const$1, fi, constants$416.const$0, scope);
    }
    static PFN_vkGetMicromapBuildSizesEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, int _buildType, java.lang.foreign.MemorySegment _pBuildInfo, java.lang.foreign.MemorySegment _pSizeInfo) -> {
            try {
                constants$416.const$2.invokeExact(symbol, _device, _buildType, _pBuildInfo, _pSizeInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


