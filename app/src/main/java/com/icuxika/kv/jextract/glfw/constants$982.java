// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$982 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$982() {}
    static final VarHandle const$0 = constants$981.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$981.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$981.const$5.varHandle(MemoryLayout.PathElement.groupElement("textureSampleWeighted"));
    static final VarHandle const$3 = constants$981.const$5.varHandle(MemoryLayout.PathElement.groupElement("textureBoxFilter"));
    static final VarHandle const$4 = constants$981.const$5.varHandle(MemoryLayout.PathElement.groupElement("textureBlockMatch"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("maxWeightFilterPhases"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("maxWeightFilterDimension"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("maxBlockMatchRegion"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("maxBoxFilterBlockSize"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceImageProcessingPropertiesQCOM");
}


