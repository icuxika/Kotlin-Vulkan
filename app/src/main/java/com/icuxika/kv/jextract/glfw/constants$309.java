// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$309 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$309() {}
    static final VarHandle const$0 = constants$308.const$2.varHandle(MemoryLayout.PathElement.groupElement("pBindingFlags"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
        JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
        JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
        JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
        JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
        JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
        JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
        JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
        JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
        JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
        JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
        JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
        JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
        JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
        JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
        JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
        JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
        JAVA_INT.withName("descriptorBindingPartiallyBound"),
        JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
        JAVA_INT.withName("runtimeDescriptorArray")
    ).withName("VkPhysicalDeviceDescriptorIndexingFeatures");
    static final VarHandle const$2 = constants$309.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$309.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$309.const$1.varHandle(MemoryLayout.PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    static final VarHandle const$5 = constants$309.const$1.varHandle(MemoryLayout.PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
}


