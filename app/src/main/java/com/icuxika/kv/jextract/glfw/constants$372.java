// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$372 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$372() {}
    static final VarHandle const$0 = constants$371.const$2.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final VarHandle const$1 = constants$371.const$2.varHandle(MemoryLayout.PathElement.groupElement("stageMask"));
    static final VarHandle const$2 = constants$371.const$2.varHandle(MemoryLayout.PathElement.groupElement("deviceIndex"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("commandBuffer"),
        JAVA_INT.withName("deviceMask"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkCommandBufferSubmitInfo");
    static final VarHandle const$4 = constants$372.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$372.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


