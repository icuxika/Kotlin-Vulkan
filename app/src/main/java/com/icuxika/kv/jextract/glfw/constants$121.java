// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$121 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$121() {}
    static final VarHandle const$0 = constants$119.const$3.varHandle(MemoryLayout.PathElement.groupElement("pBufferInfo"));
    static final VarHandle const$1 = constants$119.const$3.varHandle(MemoryLayout.PathElement.groupElement("pTexelBufferView"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("format"),
        JAVA_INT.withName("samples"),
        JAVA_INT.withName("loadOp"),
        JAVA_INT.withName("storeOp"),
        JAVA_INT.withName("stencilLoadOp"),
        JAVA_INT.withName("stencilStoreOp"),
        JAVA_INT.withName("initialLayout"),
        JAVA_INT.withName("finalLayout")
    ).withName("VkAttachmentDescription");
    static final VarHandle const$3 = constants$121.const$2.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$4 = constants$121.const$2.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final VarHandle const$5 = constants$121.const$2.varHandle(MemoryLayout.PathElement.groupElement("samples"));
}

