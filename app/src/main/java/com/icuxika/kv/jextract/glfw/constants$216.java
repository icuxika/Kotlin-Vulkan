// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$216 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$216() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("physicalDeviceCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pPhysicalDevices")
    ).withName("VkDeviceGroupDeviceCreateInfo");
    static final VarHandle const$1 = constants$216.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$216.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$216.const$0.varHandle(MemoryLayout.PathElement.groupElement("physicalDeviceCount"));
    static final VarHandle const$4 = constants$216.const$0.varHandle(MemoryLayout.PathElement.groupElement("pPhysicalDevices"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("buffer")
    ).withName("VkBufferMemoryRequirementsInfo2");
}

