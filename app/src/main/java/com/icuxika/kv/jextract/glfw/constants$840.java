// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$840 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$840() {}
    static final VarHandle const$0 = constants$839.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$839.const$4.varHandle(MemoryLayout.PathElement.groupElement("inheritedViewportScissor2D"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("viewportScissor2D"),
        JAVA_INT.withName("viewportDepthCount"),
        RuntimeHelper.POINTER.withName("pViewportDepths")
    ).withName("VkCommandBufferInheritanceViewportScissorInfoNV");
    static final VarHandle const$3 = constants$840.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$840.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$840.const$2.varHandle(MemoryLayout.PathElement.groupElement("viewportScissor2D"));
}


