// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$703 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$703() {}
    static final VarHandle const$0 = constants$702.const$3.varHandle(MemoryLayout.PathElement.groupElement("drmFormatModifier"));
    static final VarHandle const$1 = constants$702.const$3.varHandle(MemoryLayout.PathElement.groupElement("sharingMode"));
    static final VarHandle const$2 = constants$702.const$3.varHandle(MemoryLayout.PathElement.groupElement("queueFamilyIndexCount"));
    static final VarHandle const$3 = constants$702.const$3.varHandle(MemoryLayout.PathElement.groupElement("pQueueFamilyIndices"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("drmFormatModifierCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pDrmFormatModifiers")
    ).withName("VkImageDrmFormatModifierListCreateInfoEXT");
    static final VarHandle const$5 = constants$703.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


