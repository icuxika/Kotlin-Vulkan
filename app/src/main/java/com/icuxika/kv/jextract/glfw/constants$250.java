// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$250 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$250() {}
    static final VarHandle const$0 = constants$249.const$3.varHandle(MemoryLayout.PathElement.groupElement("handleTypes"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("handleTypes"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkExportMemoryAllocateInfo");
    static final VarHandle const$2 = constants$250.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$250.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$250.const$1.varHandle(MemoryLayout.PathElement.groupElement("handleTypes"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("handleType"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceExternalFenceInfo");
}


