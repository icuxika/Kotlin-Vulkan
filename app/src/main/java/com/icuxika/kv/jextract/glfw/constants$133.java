// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$133 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$133() {}
    static final VarHandle const$0 = constants$131.const$5.varHandle(MemoryLayout.PathElement.groupElement("queryFlags"));
    static final VarHandle const$1 = constants$131.const$5.varHandle(MemoryLayout.PathElement.groupElement("pipelineStatistics"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pInheritanceInfo")
    ).withName("VkCommandBufferBeginInfo");
    static final VarHandle const$3 = constants$133.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$133.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$133.const$2.varHandle(MemoryLayout.PathElement.groupElement("flags"));
}


