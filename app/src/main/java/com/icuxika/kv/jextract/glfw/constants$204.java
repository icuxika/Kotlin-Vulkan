// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$204 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$204() {}
    static final VarHandle const$0 = constants$203.const$3.varHandle(MemoryLayout.PathElement.groupElement("buffer"));
    static final VarHandle const$1 = constants$203.const$3.varHandle(MemoryLayout.PathElement.groupElement("memory"));
    static final VarHandle const$2 = constants$203.const$3.varHandle(MemoryLayout.PathElement.groupElement("memoryOffset"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("image"),
        RuntimeHelper.POINTER.withName("memory"),
        JAVA_LONG.withName("memoryOffset")
    ).withName("VkBindImageMemoryInfo");
    static final VarHandle const$4 = constants$204.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$204.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


