// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1005 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1005() {}
    static final VarHandle const$0 = constants$1004.const$4.varHandle(MemoryLayout.PathElement.groupElement("postMergeIndex"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("pSubpassFeedback")
    ).withName("VkRenderPassSubpassFeedbackCreateInfoEXT");
    static final VarHandle const$2 = constants$1005.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$1005.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$1005.const$1.varHandle(MemoryLayout.PathElement.groupElement("pSubpassFeedback"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkGetInstanceProcAddrLUNARG.class, "apply", constants$142.const$4);
}


