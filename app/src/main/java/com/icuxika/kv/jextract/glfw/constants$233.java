// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$233 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$233() {}
    static final VarHandle const$0 = constants$232.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$232.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$232.const$5.varHandle(MemoryLayout.PathElement.groupElement("variablePointersStorageBuffer"));
    static final VarHandle const$3 = constants$232.const$5.varHandle(MemoryLayout.PathElement.groupElement("variablePointers"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("protectedMemory"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceProtectedMemoryFeatures");
    static final VarHandle const$5 = constants$233.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}

