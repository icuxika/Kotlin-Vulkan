// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$761 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$761() {}
    static final VarHandle const$0 = constants$760.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$760.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$760.const$5.varHandle(MemoryLayout.PathElement.groupElement("exclusiveScissorCount"));
    static final VarHandle const$3 = constants$760.const$5.varHandle(MemoryLayout.PathElement.groupElement("pExclusiveScissors"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("exclusiveScissor"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceExclusiveScissorFeaturesNV");
    static final VarHandle const$5 = constants$761.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


