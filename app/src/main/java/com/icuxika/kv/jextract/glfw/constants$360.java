// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$360 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$360() {}
    static final VarHandle const$0 = constants$359.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$359.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$359.const$5.varHandle(MemoryLayout.PathElement.groupElement("shaderTerminateInvocation"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("version"),
        JAVA_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
        MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("layer"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceToolProperties");
    static final VarHandle const$4 = constants$360.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$360.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


