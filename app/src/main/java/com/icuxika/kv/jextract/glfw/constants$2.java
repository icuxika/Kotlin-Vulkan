// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        JAVA_INT.withName("depth")
    ).withName("VkExtent3D");
    static final VarHandle const$1 = constants$2.const$0.varHandle(MemoryLayout.PathElement.groupElement("width"));
    static final VarHandle const$2 = constants$2.const$0.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final VarHandle const$3 = constants$2.const$0.varHandle(MemoryLayout.PathElement.groupElement("depth"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y")
    ).withName("VkOffset2D");
    static final VarHandle const$5 = constants$2.const$4.varHandle(MemoryLayout.PathElement.groupElement("x"));
}

