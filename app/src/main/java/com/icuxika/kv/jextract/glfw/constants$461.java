// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$461 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$461() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("slotIndex"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pPictureResource")
    ).withName("VkVideoReferenceSlotInfoKHR");
    static final VarHandle const$1 = constants$461.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$461.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$461.const$0.varHandle(MemoryLayout.PathElement.groupElement("slotIndex"));
    static final VarHandle const$4 = constants$461.const$0.varHandle(MemoryLayout.PathElement.groupElement("pPictureResource"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("memoryBindIndex"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("size"),
            JAVA_LONG.withName("alignment"),
            JAVA_INT.withName("memoryTypeBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("memoryRequirements")
    ).withName("VkVideoSessionMemoryRequirementsKHR");
}

