// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final VarHandle const$0 = constants$18.const$3.varHandle(MemoryLayout.PathElement.groupElement("bufferFeatures"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            JAVA_INT.withName("depth")
        ).withName("maxExtent"),
        JAVA_INT.withName("maxMipLevels"),
        JAVA_INT.withName("maxArrayLayers"),
        JAVA_INT.withName("sampleCounts"),
        JAVA_LONG.withName("maxResourceSize")
    ).withName("VkImageFormatProperties");
    static final VarHandle const$2 = constants$19.const$1.varHandle(MemoryLayout.PathElement.groupElement("maxMipLevels"));
    static final VarHandle const$3 = constants$19.const$1.varHandle(MemoryLayout.PathElement.groupElement("maxArrayLayers"));
    static final VarHandle const$4 = constants$19.const$1.varHandle(MemoryLayout.PathElement.groupElement("sampleCounts"));
    static final VarHandle const$5 = constants$19.const$1.varHandle(MemoryLayout.PathElement.groupElement("maxResourceSize"));
}


