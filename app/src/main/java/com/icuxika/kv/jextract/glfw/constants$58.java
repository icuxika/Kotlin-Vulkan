// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$58 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$58() {}
    static final VarHandle const$0 = constants$57.const$2.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    static final VarHandle const$1 = constants$57.const$2.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("allocationSize"),
        JAVA_INT.withName("memoryTypeIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkMemoryAllocateInfo");
    static final VarHandle const$3 = constants$58.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$58.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$58.const$2.varHandle(MemoryLayout.PathElement.groupElement("allocationSize"));
}

