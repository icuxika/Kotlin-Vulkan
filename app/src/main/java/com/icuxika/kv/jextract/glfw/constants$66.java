// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$66 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$66() {}
    static final VarHandle const$0 = constants$64.const$1.varHandle(MemoryLayout.PathElement.groupElement("signalSemaphoreCount"));
    static final VarHandle const$1 = constants$64.const$1.varHandle(MemoryLayout.PathElement.groupElement("pSignalSemaphores"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("aspectMask"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            JAVA_INT.withName("depth")
        ).withName("imageGranularity"),
        JAVA_INT.withName("flags")
    ).withName("VkSparseImageFormatProperties");
    static final VarHandle const$3 = constants$66.const$2.varHandle(MemoryLayout.PathElement.groupElement("aspectMask"));
    static final VarHandle const$4 = constants$66.const$2.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("aspectMask"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height"),
                JAVA_INT.withName("depth")
            ).withName("imageGranularity"),
            JAVA_INT.withName("flags")
        ).withName("formatProperties"),
        JAVA_INT.withName("imageMipTailFirstLod"),
        JAVA_LONG.withName("imageMipTailSize"),
        JAVA_LONG.withName("imageMipTailOffset"),
        JAVA_LONG.withName("imageMipTailStride")
    ).withName("VkSparseImageMemoryRequirements");
}

