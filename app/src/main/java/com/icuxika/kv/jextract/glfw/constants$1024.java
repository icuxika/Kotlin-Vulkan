// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1024 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1024() {}
    static final VarHandle const$0 = constants$1023.const$3.varHandle(MemoryLayout.PathElement.groupElement("shaderBinaryVersion"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("stage"),
        JAVA_INT.withName("nextStage"),
        JAVA_INT.withName("codeType"),
        JAVA_LONG.withName("codeSize"),
        RuntimeHelper.POINTER.withName("pCode"),
        RuntimeHelper.POINTER.withName("pName"),
        JAVA_INT.withName("setLayoutCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pSetLayouts"),
        JAVA_INT.withName("pushConstantRangeCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pPushConstantRanges"),
        RuntimeHelper.POINTER.withName("pSpecializationInfo")
    ).withName("VkShaderCreateInfoEXT");
    static final VarHandle const$2 = constants$1024.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$1024.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$1024.const$1.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$5 = constants$1024.const$1.varHandle(MemoryLayout.PathElement.groupElement("stage"));
}


