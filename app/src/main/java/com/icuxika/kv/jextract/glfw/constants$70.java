// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$70 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$70() {}
    static final VarHandle const$0 = constants$69.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$69.const$4.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$2 = constants$69.const$4.varHandle(MemoryLayout.PathElement.groupElement("queryType"));
    static final VarHandle const$3 = constants$69.const$4.varHandle(MemoryLayout.PathElement.groupElement("queryCount"));
    static final VarHandle const$4 = constants$69.const$4.varHandle(MemoryLayout.PathElement.groupElement("pipelineStatistics"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("size"),
        JAVA_INT.withName("usage"),
        JAVA_INT.withName("sharingMode"),
        JAVA_INT.withName("queueFamilyIndexCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pQueueFamilyIndices")
    ).withName("VkBufferCreateInfo");
}


