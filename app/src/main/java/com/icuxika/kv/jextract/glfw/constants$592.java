// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$592 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$592() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkGetPipelineExecutableInternalRepresentationsKHR",
        constants$143.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("memory"),
        JAVA_LONG.withName("offset"),
        JAVA_LONG.withName("size")
    ).withName("VkMemoryMapInfoKHR");
    static final VarHandle const$2 = constants$592.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$592.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$592.const$1.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$5 = constants$592.const$1.varHandle(MemoryLayout.PathElement.groupElement("memory"));
}

