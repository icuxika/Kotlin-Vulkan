// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$242 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$242() {}
    static final VarHandle const$0 = constants$241.const$4.varHandle(MemoryLayout.PathElement.groupElement("dstArrayElement"));
    static final VarHandle const$1 = constants$241.const$4.varHandle(MemoryLayout.PathElement.groupElement("descriptorCount"));
    static final VarHandle const$2 = constants$241.const$4.varHandle(MemoryLayout.PathElement.groupElement("descriptorType"));
    static final VarHandle const$3 = constants$241.const$4.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    static final VarHandle const$4 = constants$241.const$4.varHandle(MemoryLayout.PathElement.groupElement("stride"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("descriptorUpdateEntryCount"),
        RuntimeHelper.POINTER.withName("pDescriptorUpdateEntries"),
        JAVA_INT.withName("templateType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("descriptorSetLayout"),
        JAVA_INT.withName("pipelineBindPoint"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pipelineLayout"),
        JAVA_INT.withName("set"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDescriptorUpdateTemplateCreateInfo");
}

