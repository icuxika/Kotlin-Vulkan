// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$631 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$631() {}
    static final VarHandle const$0 = constants$630.const$3.varHandle(MemoryLayout.PathElement.groupElement("module"));
    static final VarHandle const$1 = constants$630.const$3.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("function"),
        JAVA_INT.withName("gridDimX"),
        JAVA_INT.withName("gridDimY"),
        JAVA_INT.withName("gridDimZ"),
        JAVA_INT.withName("blockDimX"),
        JAVA_INT.withName("blockDimY"),
        JAVA_INT.withName("blockDimZ"),
        JAVA_INT.withName("sharedMemBytes"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("paramCount"),
        RuntimeHelper.POINTER.withName("pParams"),
        JAVA_LONG.withName("extraCount"),
        RuntimeHelper.POINTER.withName("pExtras")
    ).withName("VkCuLaunchInfoNVX");
    static final VarHandle const$3 = constants$631.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$631.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$631.const$2.varHandle(MemoryLayout.PathElement.groupElement("function"));
}


