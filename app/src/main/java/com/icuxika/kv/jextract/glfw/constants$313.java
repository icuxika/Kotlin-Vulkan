// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$313 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$313() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("maxUpdateAfterBindDescriptorsInAllPools"),
        JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexingNative"),
        JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexingNative"),
        JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexingNative"),
        JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexingNative"),
        JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexingNative"),
        JAVA_INT.withName("robustBufferAccessUpdateAfterBind"),
        JAVA_INT.withName("quadDivergentImplicitLod"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSamplers"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindUniformBuffers"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageBuffers"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSampledImages"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageImages"),
        JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInputAttachments"),
        JAVA_INT.withName("maxPerStageUpdateAfterBindResources"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSamplers"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffers"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffers"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSampledImages"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageImages"),
        JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInputAttachments"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceDescriptorIndexingProperties");
    static final VarHandle const$1 = constants$313.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$313.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$313.const$0.varHandle(MemoryLayout.PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    static final VarHandle const$4 = constants$313.const$0.varHandle(MemoryLayout.PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    static final VarHandle const$5 = constants$313.const$0.varHandle(MemoryLayout.PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
}


