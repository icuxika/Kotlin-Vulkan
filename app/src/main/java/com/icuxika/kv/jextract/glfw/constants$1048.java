// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1048 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1048() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("maxGeometryCount"),
        JAVA_LONG.withName("maxInstanceCount"),
        JAVA_LONG.withName("maxPrimitiveCount"),
        JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"),
        JAVA_INT.withName("maxDescriptorSetAccelerationStructures"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures"),
        JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceAccelerationStructurePropertiesKHR");
    static final VarHandle const$1 = constants$1048.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$1048.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$1048.const$0.varHandle(MemoryLayout.PathElement.groupElement("maxGeometryCount"));
    static final VarHandle const$4 = constants$1048.const$0.varHandle(MemoryLayout.PathElement.groupElement("maxInstanceCount"));
    static final VarHandle const$5 = constants$1048.const$0.varHandle(MemoryLayout.PathElement.groupElement("maxPrimitiveCount"));
}


