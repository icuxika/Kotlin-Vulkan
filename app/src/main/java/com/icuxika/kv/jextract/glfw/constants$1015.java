// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1015 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1015() {}
    static final VarHandle const$0 = constants$1014.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$1014.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$1014.const$5.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        JAVA_INT.withName("imageFormat"),
        JAVA_INT.withName("flowVectorFormat"),
        JAVA_INT.withName("costFormat"),
        JAVA_INT.withName("outputGridSize"),
        JAVA_INT.withName("hintGridSize"),
        JAVA_INT.withName("performanceLevel"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkOpticalFlowSessionCreateInfoNV");
    static final VarHandle const$4 = constants$1015.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$1015.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


