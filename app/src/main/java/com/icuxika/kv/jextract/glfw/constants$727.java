// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$727 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$727() {}
    static final VarHandle const$0 = constants$726.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$726.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$726.const$5.varHandle(MemoryLayout.PathElement.groupElement("compactedSize"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("accelerationStructure"),
        RuntimeHelper.POINTER.withName("memory"),
        JAVA_LONG.withName("memoryOffset"),
        JAVA_INT.withName("deviceIndexCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pDeviceIndices")
    ).withName("VkBindAccelerationStructureMemoryInfoNV");
    static final VarHandle const$4 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$727.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


