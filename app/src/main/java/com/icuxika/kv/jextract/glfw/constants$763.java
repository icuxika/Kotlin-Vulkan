// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$763 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$763() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("checkpointExecutionStageMask"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkQueueFamilyCheckpointPropertiesNV");
    static final VarHandle const$1 = constants$763.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$763.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$763.const$0.varHandle(MemoryLayout.PathElement.groupElement("checkpointExecutionStageMask"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("stage"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pCheckpointMarker")
    ).withName("VkCheckpointDataNV");
    static final VarHandle const$5 = constants$763.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}

