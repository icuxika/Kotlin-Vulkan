// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$947 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$947() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("pVersionData")
    ).withName("VkMicromapVersionInfoEXT");
    static final VarHandle const$1 = constants$947.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$947.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$947.const$0.varHandle(MemoryLayout.PathElement.groupElement("pVersionData"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
    ).withName("VkCopyMicromapToMemoryInfoEXT");
    static final VarHandle const$5 = constants$947.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}

