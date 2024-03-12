// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetCoarseSampleOrderNV)(struct VkCommandBuffer_T* commandBuffer,enum VkCoarseSampleOrderTypeNV sampleOrderType,unsigned int customSampleOrderCount,struct VkCoarseSampleOrderCustomNV* pCustomSampleOrders);
 * }
 */
public interface PFN_vkCmdSetCoarseSampleOrderNV {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int sampleOrderType, int customSampleOrderCount, java.lang.foreign.MemorySegment pCustomSampleOrders);
    static MemorySegment allocate(PFN_vkCmdSetCoarseSampleOrderNV fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$717.const$0, fi, constants$145.const$0, scope);
    }
    static PFN_vkCmdSetCoarseSampleOrderNV ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _sampleOrderType, int _customSampleOrderCount, java.lang.foreign.MemorySegment _pCustomSampleOrders) -> {
            try {
                constants$145.const$2.invokeExact(symbol, _commandBuffer, _sampleOrderType, _customSampleOrderCount, _pCustomSampleOrders);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

