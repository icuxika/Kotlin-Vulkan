// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$101 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$101() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("logicOpEnable"),
        JAVA_INT.withName("logicOp"),
        JAVA_INT.withName("attachmentCount"),
        RuntimeHelper.POINTER.withName("pAttachments"),
        MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("blendConstants")
    ).withName("VkPipelineColorBlendStateCreateInfo");
    static final VarHandle const$1 = constants$101.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$101.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$101.const$0.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$4 = constants$101.const$0.varHandle(MemoryLayout.PathElement.groupElement("logicOpEnable"));
    static final VarHandle const$5 = constants$101.const$0.varHandle(MemoryLayout.PathElement.groupElement("logicOp"));
}

