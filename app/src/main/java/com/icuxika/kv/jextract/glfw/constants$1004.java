// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1004 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1004() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("pRenderPassFeedback")
    ).withName("VkRenderPassCreationFeedbackCreateInfoEXT");
    static final VarHandle const$1 = constants$1004.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$1004.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$1004.const$0.varHandle(MemoryLayout.PathElement.groupElement("pRenderPassFeedback"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("subpassMergeStatus"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
        JAVA_INT.withName("postMergeIndex")
    ).withName("VkRenderPassSubpassFeedbackInfoEXT");
    static final VarHandle const$5 = constants$1004.const$4.varHandle(MemoryLayout.PathElement.groupElement("subpassMergeStatus"));
}


