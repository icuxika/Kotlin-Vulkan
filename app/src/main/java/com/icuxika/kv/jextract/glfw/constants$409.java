// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$409 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$409() {}
    static final VarHandle const$0 = constants$403.const$4.varHandle(MemoryLayout.PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceTexelBufferAlignmentProperties");
    static final VarHandle const$2 = constants$409.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$409.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$409.const$1.varHandle(MemoryLayout.PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    static final VarHandle const$5 = constants$409.const$1.varHandle(MemoryLayout.PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
}


