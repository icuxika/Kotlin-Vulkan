// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$941 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$941() {}
    static final VarHandle const$0 = constants$940.const$4.varHandle(MemoryLayout.PathElement.groupElement("subdivisionLevel"));
    static final VarHandle const$1 = constants$940.const$4.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        JAVA_LONG.withName("deviceAddress"),
        RuntimeHelper.POINTER.withName("hostAddress")
    ).withName("VkDeviceOrHostAddressKHR");
    static final VarHandle const$3 = constants$941.const$2.varHandle(MemoryLayout.PathElement.groupElement("deviceAddress"));
    static final VarHandle const$4 = constants$941.const$2.varHandle(MemoryLayout.PathElement.groupElement("hostAddress"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("type"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("mode"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("dstMicromap"),
        JAVA_INT.withName("usageCountsCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pUsageCounts"),
        RuntimeHelper.POINTER.withName("ppUsageCounts"),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("deviceAddress"),
            RuntimeHelper.POINTER.withName("hostAddress")
        ).withName("data"),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("deviceAddress"),
            RuntimeHelper.POINTER.withName("hostAddress")
        ).withName("scratchData"),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("deviceAddress"),
            RuntimeHelper.POINTER.withName("hostAddress")
        ).withName("triangleArray"),
        JAVA_LONG.withName("triangleArrayStride")
    ).withName("VkMicromapBuildInfoEXT");
}


