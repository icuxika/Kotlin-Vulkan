// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$898 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$898() {}
    static final VarHandle const$0 = constants$897.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$897.const$4.varHandle(MemoryLayout.PathElement.groupElement("attachmentFeedbackLoopLayout"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("formatA4R4G4B4"),
        JAVA_INT.withName("formatA4B4G4R4")
    ).withName("VkPhysicalDevice4444FormatsFeaturesEXT");
    static final VarHandle const$3 = constants$898.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$898.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$898.const$2.varHandle(MemoryLayout.PathElement.groupElement("formatA4R4G4B4"));
}


