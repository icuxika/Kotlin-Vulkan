// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetFragmentShadingRateEnumNV)(struct VkCommandBuffer_T* commandBuffer,enum VkFragmentShadingRateNV shadingRate,enum VkFragmentShadingRateCombinerOpKHR* combinerOps);
 * }
 */
public interface PFN_vkCmdSetFragmentShadingRateEnumNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int shadingRate, java.lang.foreign.MemorySegment combinerOps);
    static MemorySegment allocate(PFN_vkCmdSetFragmentShadingRateEnumNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$883.const$3, fi, constants$140.const$5, scope);
    }
    static PFN_vkCmdSetFragmentShadingRateEnumNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _shadingRate, java.lang.foreign.MemorySegment _combinerOps) -> {
            try {
                constants$141.const$1.invokeExact(symbol, _commandBuffer, _shadingRate, _combinerOps);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


