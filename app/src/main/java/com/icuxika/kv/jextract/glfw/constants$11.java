// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$11 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$11() {}
    static final VarHandle const$0 = constants$10.const$1.varHandle(MemoryLayout.PathElement.groupElement("oldLayout"));
    static final VarHandle const$1 = constants$10.const$1.varHandle(MemoryLayout.PathElement.groupElement("newLayout"));
    static final VarHandle const$2 = constants$10.const$1.varHandle(MemoryLayout.PathElement.groupElement("srcQueueFamilyIndex"));
    static final VarHandle const$3 = constants$10.const$1.varHandle(MemoryLayout.PathElement.groupElement("dstQueueFamilyIndex"));
    static final VarHandle const$4 = constants$10.const$1.varHandle(MemoryLayout.PathElement.groupElement("image"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("srcAccessMask"),
        JAVA_INT.withName("dstAccessMask")
    ).withName("VkMemoryBarrier");
}

