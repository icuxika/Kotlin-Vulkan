// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$290 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$290() {}
    static final VarHandle const$0 = constants$281.const$5.varHandle(MemoryLayout.PathElement.groupElement("filterMinmaxImageComponentMapping"));
    static final VarHandle const$1 = constants$281.const$5.varHandle(MemoryLayout.PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    static final VarHandle const$2 = constants$281.const$5.varHandle(MemoryLayout.PathElement.groupElement("framebufferIntegerColorSampleCounts"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("viewFormatCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pViewFormats")
    ).withName("VkImageFormatListCreateInfo");
    static final VarHandle const$4 = constants$290.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$290.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


