// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$971 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$971() {}
    static final VarHandle const$0 = constants$970.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$970.const$4.varHandle(MemoryLayout.PathElement.groupElement("fragmentDensityMapOffset"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("fragmentDensityOffsetGranularity")
    ).withName("VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM");
    static final VarHandle const$3 = constants$971.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$971.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("fragmentDensityOffsetCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pFragmentDensityOffsets")
    ).withName("VkSubpassFragmentDensityMapOffsetEndInfoQCOM");
}


