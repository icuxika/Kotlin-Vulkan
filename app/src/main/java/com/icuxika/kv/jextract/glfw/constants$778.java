// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$778 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$778() {}
    static final VarHandle const$0 = constants$777.const$2.varHandle(MemoryLayout.PathElement.groupElement("fragmentDensityMapDynamic"));
    static final VarHandle const$1 = constants$777.const$2.varHandle(MemoryLayout.PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("minFragmentDensityTexelSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("maxFragmentDensityTexelSize"),
        JAVA_INT.withName("fragmentDensityInvocations"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentDensityMapPropertiesEXT");
    static final VarHandle const$3 = constants$778.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$778.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$778.const$2.varHandle(MemoryLayout.PathElement.groupElement("fragmentDensityInvocations"));
}

