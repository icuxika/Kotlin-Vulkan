// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$340 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$340() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("opaqueCaptureAddress")
    ).withName("VkBufferOpaqueCaptureAddressCreateInfo");
    static final VarHandle const$1 = constants$340.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$340.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$340.const$0.varHandle(MemoryLayout.PathElement.groupElement("opaqueCaptureAddress"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("opaqueCaptureAddress")
    ).withName("VkMemoryOpaqueCaptureAddressAllocateInfo");
    static final VarHandle const$5 = constants$340.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


