// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$97 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$97() {}
    static final VarHandle const$0 = constants$96.const$2.varHandle(MemoryLayout.PathElement.groupElement("compareOp"));
    static final VarHandle const$1 = constants$96.const$2.varHandle(MemoryLayout.PathElement.groupElement("compareMask"));
    static final VarHandle const$2 = constants$96.const$2.varHandle(MemoryLayout.PathElement.groupElement("writeMask"));
    static final VarHandle const$3 = constants$96.const$2.varHandle(MemoryLayout.PathElement.groupElement("reference"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("depthTestEnable"),
        JAVA_INT.withName("depthWriteEnable"),
        JAVA_INT.withName("depthCompareOp"),
        JAVA_INT.withName("depthBoundsTestEnable"),
        JAVA_INT.withName("stencilTestEnable"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("failOp"),
            JAVA_INT.withName("passOp"),
            JAVA_INT.withName("depthFailOp"),
            JAVA_INT.withName("compareOp"),
            JAVA_INT.withName("compareMask"),
            JAVA_INT.withName("writeMask"),
            JAVA_INT.withName("reference")
        ).withName("front"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("failOp"),
            JAVA_INT.withName("passOp"),
            JAVA_INT.withName("depthFailOp"),
            JAVA_INT.withName("compareOp"),
            JAVA_INT.withName("compareMask"),
            JAVA_INT.withName("writeMask"),
            JAVA_INT.withName("reference")
        ).withName("back"),
        JAVA_FLOAT.withName("minDepthBounds"),
        JAVA_FLOAT.withName("maxDepthBounds")
    ).withName("VkPipelineDepthStencilStateCreateInfo");
    static final VarHandle const$5 = constants$97.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


