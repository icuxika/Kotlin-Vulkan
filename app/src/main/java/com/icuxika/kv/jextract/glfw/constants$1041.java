// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1041 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1041() {}
    static final VarHandle const$0 = constants$1040.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$1040.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$1040.const$5.varHandle(MemoryLayout.PathElement.groupElement("arrayOfPointers"));
    static final UnionLayout const$3 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pNext"),
            JAVA_INT.withName("vertexFormat"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                JAVA_LONG.withName("deviceAddress"),
                RuntimeHelper.POINTER.withName("hostAddress")
            ).withName("vertexData"),
            JAVA_LONG.withName("vertexStride"),
            JAVA_INT.withName("maxVertex"),
            JAVA_INT.withName("indexType"),
            MemoryLayout.unionLayout(
                JAVA_LONG.withName("deviceAddress"),
                RuntimeHelper.POINTER.withName("hostAddress")
            ).withName("indexData"),
            MemoryLayout.unionLayout(
                JAVA_LONG.withName("deviceAddress"),
                RuntimeHelper.POINTER.withName("hostAddress")
            ).withName("transformData")
        ).withName("triangles"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pNext"),
            MemoryLayout.unionLayout(
                JAVA_LONG.withName("deviceAddress"),
                RuntimeHelper.POINTER.withName("hostAddress")
            ).withName("data"),
            JAVA_LONG.withName("stride")
        ).withName("aabbs"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pNext"),
            JAVA_INT.withName("arrayOfPointers"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                JAVA_LONG.withName("deviceAddress"),
                RuntimeHelper.POINTER.withName("hostAddress")
            ).withName("data")
        ).withName("instances")
    ).withName("VkAccelerationStructureGeometryDataKHR");
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("geometryType"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("sType"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pNext"),
                JAVA_INT.withName("vertexFormat"),
                MemoryLayout.paddingLayout(4),
                MemoryLayout.unionLayout(
                    JAVA_LONG.withName("deviceAddress"),
                    RuntimeHelper.POINTER.withName("hostAddress")
                ).withName("vertexData"),
                JAVA_LONG.withName("vertexStride"),
                JAVA_INT.withName("maxVertex"),
                JAVA_INT.withName("indexType"),
                MemoryLayout.unionLayout(
                    JAVA_LONG.withName("deviceAddress"),
                    RuntimeHelper.POINTER.withName("hostAddress")
                ).withName("indexData"),
                MemoryLayout.unionLayout(
                    JAVA_LONG.withName("deviceAddress"),
                    RuntimeHelper.POINTER.withName("hostAddress")
                ).withName("transformData")
            ).withName("triangles"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("sType"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pNext"),
                MemoryLayout.unionLayout(
                    JAVA_LONG.withName("deviceAddress"),
                    RuntimeHelper.POINTER.withName("hostAddress")
                ).withName("data"),
                JAVA_LONG.withName("stride")
            ).withName("aabbs"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("sType"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pNext"),
                JAVA_INT.withName("arrayOfPointers"),
                MemoryLayout.paddingLayout(4),
                MemoryLayout.unionLayout(
                    JAVA_LONG.withName("deviceAddress"),
                    RuntimeHelper.POINTER.withName("hostAddress")
                ).withName("data")
            ).withName("instances")
        ).withName("geometry"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkAccelerationStructureGeometryKHR");
    static final VarHandle const$5 = constants$1041.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


