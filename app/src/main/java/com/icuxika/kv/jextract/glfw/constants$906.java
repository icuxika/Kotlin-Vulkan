// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$906 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$906() {}
    static final VarHandle const$0 = constants$905.const$2.varHandle(MemoryLayout.PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    static final VarHandle const$1 = constants$905.const$2.varHandle(MemoryLayout.PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT");
    static final VarHandle const$3 = constants$906.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$906.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$906.const$2.varHandle(MemoryLayout.PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
}

