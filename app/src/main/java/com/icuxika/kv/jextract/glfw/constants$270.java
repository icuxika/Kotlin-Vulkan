// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$270 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$270() {}
    static final VarHandle const$0 = constants$267.const$4.varHandle(MemoryLayout.PathElement.groupElement("shaderDrawParameters"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("deviceLUID"),
        JAVA_INT.withName("deviceNodeMask"),
        JAVA_INT.withName("deviceLUIDValid"),
        JAVA_INT.withName("subgroupSize"),
        JAVA_INT.withName("subgroupSupportedStages"),
        JAVA_INT.withName("subgroupSupportedOperations"),
        JAVA_INT.withName("subgroupQuadOperationsInAllStages"),
        JAVA_INT.withName("pointClippingBehavior"),
        JAVA_INT.withName("maxMultiviewViewCount"),
        JAVA_INT.withName("maxMultiviewInstanceIndex"),
        JAVA_INT.withName("protectedNoFault"),
        JAVA_INT.withName("maxPerSetDescriptors"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("maxMemoryAllocationSize")
    ).withName("VkPhysicalDeviceVulkan11Properties");
    static final VarHandle const$2 = constants$270.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$270.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$270.const$1.varHandle(MemoryLayout.PathElement.groupElement("deviceNodeMask"));
    static final VarHandle const$5 = constants$270.const$1.varHandle(MemoryLayout.PathElement.groupElement("deviceLUIDValid"));
}


