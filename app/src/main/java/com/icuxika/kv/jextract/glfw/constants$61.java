// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$61 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$61() {}
    static final VarHandle const$0 = constants$60.const$5.varHandle(MemoryLayout.PathElement.groupElement("buffer"));
    static final VarHandle const$1 = constants$60.const$5.varHandle(MemoryLayout.PathElement.groupElement("bindCount"));
    static final VarHandle const$2 = constants$60.const$5.varHandle(MemoryLayout.PathElement.groupElement("pBinds"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("image"),
        JAVA_INT.withName("bindCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pBinds")
    ).withName("VkSparseImageOpaqueMemoryBindInfo");
    static final VarHandle const$4 = constants$61.const$3.varHandle(MemoryLayout.PathElement.groupElement("image"));
    static final VarHandle const$5 = constants$61.const$3.varHandle(MemoryLayout.PathElement.groupElement("bindCount"));
}


