// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$338 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$338() {}
    static final VarHandle const$0 = constants$337.const$3.varHandle(MemoryLayout.PathElement.groupElement("semaphore"));
    static final VarHandle const$1 = constants$337.const$3.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("bufferDeviceAddress"),
        JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        JAVA_INT.withName("bufferDeviceAddressMultiDevice"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceBufferDeviceAddressFeatures");
    static final VarHandle const$3 = constants$338.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$338.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$338.const$2.varHandle(MemoryLayout.PathElement.groupElement("bufferDeviceAddress"));
}


