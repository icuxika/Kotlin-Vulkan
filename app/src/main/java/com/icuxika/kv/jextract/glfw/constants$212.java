// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$212 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$212() {}
    static final VarHandle const$0 = constants$210.const$5.varHandle(MemoryLayout.PathElement.groupElement("signalSemaphoreCount"));
    static final VarHandle const$1 = constants$210.const$5.varHandle(MemoryLayout.PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("resourceDeviceIndex"),
        JAVA_INT.withName("memoryDeviceIndex")
    ).withName("VkDeviceGroupBindSparseInfo");
    static final VarHandle const$3 = constants$212.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$212.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$212.const$2.varHandle(MemoryLayout.PathElement.groupElement("resourceDeviceIndex"));
}

