// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$689 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$689() {}
    static final VarHandle const$0 = constants$688.const$2.varHandle(MemoryLayout.PathElement.groupElement("sampleLocationsCount"));
    static final VarHandle const$1 = constants$688.const$2.varHandle(MemoryLayout.PathElement.groupElement("pSampleLocations"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("attachmentIndex"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pNext"),
            JAVA_INT.withName("sampleLocationsPerPixel"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("sampleLocationGridSize"),
            JAVA_INT.withName("sampleLocationsCount"),
            RuntimeHelper.POINTER.withName("pSampleLocations")
        ).withName("sampleLocationsInfo")
    ).withName("VkAttachmentSampleLocationsEXT");
    static final VarHandle const$3 = constants$689.const$2.varHandle(MemoryLayout.PathElement.groupElement("attachmentIndex"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("subpassIndex"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pNext"),
            JAVA_INT.withName("sampleLocationsPerPixel"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("sampleLocationGridSize"),
            JAVA_INT.withName("sampleLocationsCount"),
            RuntimeHelper.POINTER.withName("pSampleLocations")
        ).withName("sampleLocationsInfo")
    ).withName("VkSubpassSampleLocationsEXT");
    static final VarHandle const$5 = constants$689.const$4.varHandle(MemoryLayout.PathElement.groupElement("subpassIndex"));
}

