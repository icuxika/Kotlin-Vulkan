// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$92 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$92() {}
    static final VarHandle const$0 = constants$91.const$0.varHandle(MemoryLayout.PathElement.groupElement("scissorCount"));
    static final VarHandle const$1 = constants$91.const$0.varHandle(MemoryLayout.PathElement.groupElement("pScissors"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("depthClampEnable"),
        JAVA_INT.withName("rasterizerDiscardEnable"),
        JAVA_INT.withName("polygonMode"),
        JAVA_INT.withName("cullMode"),
        JAVA_INT.withName("frontFace"),
        JAVA_INT.withName("depthBiasEnable"),
        JAVA_FLOAT.withName("depthBiasConstantFactor"),
        JAVA_FLOAT.withName("depthBiasClamp"),
        JAVA_FLOAT.withName("depthBiasSlopeFactor"),
        JAVA_FLOAT.withName("lineWidth"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPipelineRasterizationStateCreateInfo");
    static final VarHandle const$3 = constants$92.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$92.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$92.const$2.varHandle(MemoryLayout.PathElement.groupElement("flags"));
}


