// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$848 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$848() {}
    static final VarHandle const$0 = constants$847.const$3.varHandle(MemoryLayout.PathElement.groupElement("robustBufferAccess2"));
    static final VarHandle const$1 = constants$847.const$3.varHandle(MemoryLayout.PathElement.groupElement("robustImageAccess2"));
    static final VarHandle const$2 = constants$847.const$3.varHandle(MemoryLayout.PathElement.groupElement("nullDescriptor"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
        JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
    ).withName("VkPhysicalDeviceRobustness2PropertiesEXT");
    static final VarHandle const$4 = constants$848.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$848.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}

