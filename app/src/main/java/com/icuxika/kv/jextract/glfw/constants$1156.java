// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1156 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1156() {}
    static final VarHandle const$0 = constants$1155.const$5.varHandle(MemoryLayout.PathElement.groupElement("red"));
    static final VarHandle const$1 = constants$1155.const$5.varHandle(MemoryLayout.PathElement.groupElement("green"));
    static final VarHandle const$2 = constants$1155.const$5.varHandle(MemoryLayout.PathElement.groupElement("blue"));
    static final VarHandle const$3 = constants$1155.const$5.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        RuntimeHelper.POINTER.withName("pixels")
    ).withName("GLFWimage");
    static final VarHandle const$5 = constants$1156.const$4.varHandle(MemoryLayout.PathElement.groupElement("width"));
}

