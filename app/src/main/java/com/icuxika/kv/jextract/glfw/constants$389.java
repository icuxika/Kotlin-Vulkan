// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$389 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$389() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("subgroupSizeControl"),
        JAVA_INT.withName("computeFullSubgroups")
    ).withName("VkPhysicalDeviceSubgroupSizeControlFeatures");
    static final VarHandle const$1 = constants$389.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$389.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$389.const$0.varHandle(MemoryLayout.PathElement.groupElement("subgroupSizeControl"));
    static final VarHandle const$4 = constants$389.const$0.varHandle(MemoryLayout.PathElement.groupElement("computeFullSubgroups"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("minSubgroupSize"),
        JAVA_INT.withName("maxSubgroupSize"),
        JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        JAVA_INT.withName("requiredSubgroupSizeStages")
    ).withName("VkPhysicalDeviceSubgroupSizeControlProperties");
}


