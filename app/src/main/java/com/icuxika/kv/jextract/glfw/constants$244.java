// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$244 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$244() {}
    static final VarHandle const$0 = constants$242.const$5.varHandle(MemoryLayout.PathElement.groupElement("descriptorSetLayout"));
    static final VarHandle const$1 = constants$242.const$5.varHandle(MemoryLayout.PathElement.groupElement("pipelineBindPoint"));
    static final VarHandle const$2 = constants$242.const$5.varHandle(MemoryLayout.PathElement.groupElement("pipelineLayout"));
    static final VarHandle const$3 = constants$242.const$5.varHandle(MemoryLayout.PathElement.groupElement("set"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("externalMemoryFeatures"),
        JAVA_INT.withName("exportFromImportedHandleTypes"),
        JAVA_INT.withName("compatibleHandleTypes")
    ).withName("VkExternalMemoryProperties");
    static final VarHandle const$5 = constants$244.const$4.varHandle(MemoryLayout.PathElement.groupElement("externalMemoryFeatures"));
}


