// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$728 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$728() {}
    static final VarHandle const$0 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("accelerationStructure"));
    static final VarHandle const$1 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("memory"));
    static final VarHandle const$2 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("memoryOffset"));
    static final VarHandle const$3 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("deviceIndexCount"));
    static final VarHandle const$4 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("pDeviceIndices"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("accelerationStructureCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pAccelerationStructures")
    ).withName("VkWriteDescriptorSetAccelerationStructureNV");
}


