// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$456 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$456() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("profileCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pProfiles")
    ).withName("VkVideoProfileListInfoKHR");
    static final VarHandle const$1 = constants$456.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$456.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$456.const$0.varHandle(MemoryLayout.PathElement.groupElement("profileCount"));
    static final VarHandle const$4 = constants$456.const$0.varHandle(MemoryLayout.PathElement.groupElement("pProfiles"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("minBitstreamBufferOffsetAlignment"),
        JAVA_LONG.withName("minBitstreamBufferSizeAlignment"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("pictureAccessGranularity"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("minCodedExtent"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("maxCodedExtent"),
        JAVA_INT.withName("maxDpbSlots"),
        JAVA_INT.withName("maxActiveReferencePictures"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("extensionName"),
            JAVA_INT.withName("specVersion")
        ).withName("stdHeaderVersion"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoCapabilitiesKHR");
}


