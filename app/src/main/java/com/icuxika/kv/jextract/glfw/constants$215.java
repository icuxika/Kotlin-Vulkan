// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$215 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$215() {}
    static final VarHandle const$0 = constants$214.const$0.varHandle(MemoryLayout.PathElement.groupElement("pSplitInstanceBindRegions"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("physicalDeviceCount"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(32, RuntimeHelper.POINTER).withName("physicalDevices"),
        JAVA_INT.withName("subsetAllocation"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceGroupProperties");
    static final VarHandle const$2 = constants$215.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$215.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$215.const$1.varHandle(MemoryLayout.PathElement.groupElement("physicalDeviceCount"));
    static final VarHandle const$5 = constants$215.const$1.varHandle(MemoryLayout.PathElement.groupElement("subsetAllocation"));
}


