// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$678 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$678() {}
    static final VarHandle const$0 = constants$677.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$677.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$677.const$5.varHandle(MemoryLayout.PathElement.groupElement("objectType"));
    static final VarHandle const$3 = constants$677.const$5.varHandle(MemoryLayout.PathElement.groupElement("objectHandle"));
    static final VarHandle const$4 = constants$677.const$5.varHandle(MemoryLayout.PathElement.groupElement("pObjectName"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pMessageIdName"),
        JAVA_INT.withName("messageIdNumber"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pMessage"),
        JAVA_INT.withName("queueLabelCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pQueueLabels"),
        JAVA_INT.withName("cmdBufLabelCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pCmdBufLabels"),
        JAVA_INT.withName("objectCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pObjects")
    ).withName("VkDebugUtilsMessengerCallbackDataEXT");
}


