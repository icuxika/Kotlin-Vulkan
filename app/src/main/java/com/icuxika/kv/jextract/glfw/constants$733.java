// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$733 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$733() {}
    static final VarHandle const$0 = constants$732.const$3.varHandle(MemoryLayout.PathElement.groupElement("minZ"));
    static final VarHandle const$1 = constants$732.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxX"));
    static final VarHandle const$2 = constants$732.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxY"));
    static final VarHandle const$3 = constants$732.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxZ"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, JAVA_FLOAT)).withName("matrix")
        ).withName("transform"),
        MemoryLayout.paddingLayout(8),
        JAVA_LONG.withName("accelerationStructureReference")
    ).withName("VkAccelerationStructureInstanceKHR");
    static final VarHandle const$5 = constants$733.const$4.varHandle(MemoryLayout.PathElement.groupElement("accelerationStructureReference"));
}


