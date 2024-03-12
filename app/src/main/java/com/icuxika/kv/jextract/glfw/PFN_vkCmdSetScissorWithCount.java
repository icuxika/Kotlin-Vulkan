// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkCmdSetScissorWithCount)(struct VkCommandBuffer_T* commandBuffer,unsigned int scissorCount,struct VkRect2D* pScissors);
 * }
 */
public interface PFN_vkCmdSetScissorWithCount {

    void apply(java.lang.foreign.MemorySegment commandBuffer, int coverageModulationTableCount, java.lang.foreign.MemorySegment pCoverageModulationTable);
    static MemorySegment allocate(PFN_vkCmdSetScissorWithCount fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$419.const$2, fi, constants$140.const$5, scope);
    }
    static PFN_vkCmdSetScissorWithCount ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _commandBuffer, int _coverageModulationTableCount, java.lang.foreign.MemorySegment _pCoverageModulationTable) -> {
            try {
                constants$141.const$1.invokeExact(symbol, _commandBuffer, _coverageModulationTableCount, _pCoverageModulationTable);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

