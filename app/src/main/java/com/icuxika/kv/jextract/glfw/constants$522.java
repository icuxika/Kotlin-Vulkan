// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$522 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$522() {}
    static final VarHandle const$0 = constants$521.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$521.const$4.varHandle(MemoryLayout.PathElement.groupElement("unit"));
    static final VarHandle const$2 = constants$521.const$4.varHandle(MemoryLayout.PathElement.groupElement("scope"));
    static final VarHandle const$3 = constants$521.const$4.varHandle(MemoryLayout.PathElement.groupElement("storage"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("category"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPerformanceCounterDescriptionKHR");
    static final VarHandle const$5 = constants$522.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


