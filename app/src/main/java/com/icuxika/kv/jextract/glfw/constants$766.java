// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$766 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$766() {}
    static final VarHandle const$0 = constants$765.const$5.varHandle(MemoryLayout.PathElement.groupElement("value32"));
    static final VarHandle const$1 = constants$765.const$5.varHandle(MemoryLayout.PathElement.groupElement("value64"));
    static final VarHandle const$2 = constants$765.const$5.varHandle(MemoryLayout.PathElement.groupElement("valueFloat"));
    static final VarHandle const$3 = constants$765.const$5.varHandle(MemoryLayout.PathElement.groupElement("valueBool"));
    static final VarHandle const$4 = constants$765.const$5.varHandle(MemoryLayout.PathElement.groupElement("valueString"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("value32"),
            JAVA_LONG.withName("value64"),
            JAVA_FLOAT.withName("valueFloat"),
            JAVA_INT.withName("valueBool"),
            RuntimeHelper.POINTER.withName("valueString")
        ).withName("data")
    ).withName("VkPerformanceValueINTEL");
}


