// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$59 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$59() {}
    static final VarHandle const$0 = constants$58.const$2.varHandle(MemoryLayout.PathElement.groupElement("memoryTypeIndex"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("size"),
        JAVA_LONG.withName("alignment"),
        JAVA_INT.withName("memoryTypeBits"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkMemoryRequirements");
    static final VarHandle const$2 = constants$59.const$1.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final VarHandle const$3 = constants$59.const$1.varHandle(MemoryLayout.PathElement.groupElement("alignment"));
    static final VarHandle const$4 = constants$59.const$1.varHandle(MemoryLayout.PathElement.groupElement("memoryTypeBits"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_LONG.withName("resourceOffset"),
        JAVA_LONG.withName("size"),
        RuntimeHelper.POINTER.withName("memory"),
        JAVA_LONG.withName("memoryOffset"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkSparseMemoryBind");
}


