// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$241 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$241() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("combinedImageSamplerDescriptorCount"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkSamplerYcbcrConversionImageFormatProperties");
    static final VarHandle const$1 = constants$241.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$241.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$241.const$0.varHandle(MemoryLayout.PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("dstBinding"),
        JAVA_INT.withName("dstArrayElement"),
        JAVA_INT.withName("descriptorCount"),
        JAVA_INT.withName("descriptorType"),
        JAVA_LONG.withName("offset"),
        JAVA_LONG.withName("stride")
    ).withName("VkDescriptorUpdateTemplateEntry");
    static final VarHandle const$5 = constants$241.const$4.varHandle(MemoryLayout.PathElement.groupElement("dstBinding"));
}


