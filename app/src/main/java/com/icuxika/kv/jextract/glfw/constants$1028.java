// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1028 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1028() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("tileProperties"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceTilePropertiesFeaturesQCOM");
    static final VarHandle const$1 = constants$1028.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$1028.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$1028.const$0.varHandle(MemoryLayout.PathElement.groupElement("tileProperties"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            JAVA_INT.withName("depth")
        ).withName("tileSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("apronSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("origin"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkTilePropertiesQCOM");
    static final VarHandle const$5 = constants$1028.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}

