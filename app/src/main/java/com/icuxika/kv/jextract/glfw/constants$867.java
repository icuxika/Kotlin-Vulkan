// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$867 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$867() {}
    static final VarHandle const$0 = constants$866.const$3.varHandle(MemoryLayout.PathElement.groupElement("buffer"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        RuntimeHelper.POINTER.withName("pSampler"),
        RuntimeHelper.POINTER.withName("pCombinedImageSampler"),
        RuntimeHelper.POINTER.withName("pInputAttachmentImage"),
        RuntimeHelper.POINTER.withName("pSampledImage"),
        RuntimeHelper.POINTER.withName("pStorageImage"),
        RuntimeHelper.POINTER.withName("pUniformTexelBuffer"),
        RuntimeHelper.POINTER.withName("pStorageTexelBuffer"),
        RuntimeHelper.POINTER.withName("pUniformBuffer"),
        RuntimeHelper.POINTER.withName("pStorageBuffer"),
        JAVA_LONG.withName("accelerationStructure")
    ).withName("VkDescriptorDataEXT");
    static final VarHandle const$2 = constants$867.const$1.varHandle(MemoryLayout.PathElement.groupElement("pSampler"));
    static final VarHandle const$3 = constants$867.const$1.varHandle(MemoryLayout.PathElement.groupElement("pCombinedImageSampler"));
    static final VarHandle const$4 = constants$867.const$1.varHandle(MemoryLayout.PathElement.groupElement("pInputAttachmentImage"));
    static final VarHandle const$5 = constants$867.const$1.varHandle(MemoryLayout.PathElement.groupElement("pSampledImage"));
}

