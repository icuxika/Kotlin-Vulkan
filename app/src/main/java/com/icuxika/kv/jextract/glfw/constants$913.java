// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$913 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$913() {}
    static final VarHandle const$0 = constants$912.const$2.varHandle(MemoryLayout.PathElement.groupElement("hasRender"));
    static final VarHandle const$1 = constants$912.const$2.varHandle(MemoryLayout.PathElement.groupElement("primaryMajor"));
    static final VarHandle const$2 = constants$912.const$2.varHandle(MemoryLayout.PathElement.groupElement("primaryMinor"));
    static final VarHandle const$3 = constants$912.const$2.varHandle(MemoryLayout.PathElement.groupElement("renderMajor"));
    static final VarHandle const$4 = constants$912.const$2.varHandle(MemoryLayout.PathElement.groupElement("renderMinor"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("reportAddressBinding"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceAddressBindingReportFeaturesEXT");
}


