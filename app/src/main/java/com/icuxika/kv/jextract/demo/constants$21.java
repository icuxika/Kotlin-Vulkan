// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$21 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$21() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("attrib"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("time_create"),
        JAVA_LONG.withName("time_access"),
        JAVA_LONG.withName("time_write"),
        JAVA_INT.withName("size"),
        MemoryLayout.sequenceLayout(260, JAVA_SHORT).withName("name"),
        MemoryLayout.paddingLayout(4)
    ).withName("_wfinddata64i32_t");
    static final VarHandle const$1 = constants$21.const$0.varHandle(MemoryLayout.PathElement.groupElement("attrib"));
    static final VarHandle const$2 = constants$21.const$0.varHandle(MemoryLayout.PathElement.groupElement("time_create"));
    static final VarHandle const$3 = constants$21.const$0.varHandle(MemoryLayout.PathElement.groupElement("time_access"));
    static final VarHandle const$4 = constants$21.const$0.varHandle(MemoryLayout.PathElement.groupElement("time_write"));
    static final VarHandle const$5 = constants$21.const$0.varHandle(MemoryLayout.PathElement.groupElement("size"));
}

