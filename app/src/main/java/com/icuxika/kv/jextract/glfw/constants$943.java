// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$943 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$943() {}
    static final VarHandle const$0 = constants$941.const$5.varHandle(MemoryLayout.PathElement.groupElement("usageCountsCount"));
    static final VarHandle const$1 = constants$941.const$5.varHandle(MemoryLayout.PathElement.groupElement("pUsageCounts"));
    static final VarHandle const$2 = constants$941.const$5.varHandle(MemoryLayout.PathElement.groupElement("ppUsageCounts"));
    static final VarHandle const$3 = constants$941.const$5.varHandle(MemoryLayout.PathElement.groupElement("triangleArrayStride"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("createFlags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("buffer"),
        JAVA_LONG.withName("offset"),
        JAVA_LONG.withName("size"),
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("deviceAddress")
    ).withName("VkMicromapCreateInfoEXT");
    static final VarHandle const$5 = constants$943.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


