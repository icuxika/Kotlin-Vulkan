// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1051 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1051() {}
    static final VarHandle const$0 = constants$1050.const$3.varHandle(MemoryLayout.PathElement.groupElement("pVersionData"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("src"),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("deviceAddress"),
            RuntimeHelper.POINTER.withName("hostAddress")
        ).withName("dst"),
        JAVA_INT.withName("mode"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkCopyAccelerationStructureToMemoryInfoKHR");
    static final VarHandle const$2 = constants$1051.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$1051.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$1051.const$1.varHandle(MemoryLayout.PathElement.groupElement("src"));
    static final VarHandle const$5 = constants$1051.const$1.varHandle(MemoryLayout.PathElement.groupElement("mode"));
}


