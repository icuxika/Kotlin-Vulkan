// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$393 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$393() {}
    static final VarHandle const$0 = constants$392.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxInlineUniformBlockSize"));
    static final VarHandle const$1 = constants$392.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    static final VarHandle const$2 = constants$392.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    static final VarHandle const$3 = constants$392.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    static final VarHandle const$4 = constants$392.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("dataSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pData")
    ).withName("VkWriteDescriptorSetInlineUniformBlock");
}


