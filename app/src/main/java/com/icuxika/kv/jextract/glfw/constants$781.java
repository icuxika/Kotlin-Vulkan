// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$781 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$781() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("shaderImageInt64Atomics"),
        JAVA_INT.withName("sparseImageInt64Atomics")
    ).withName("VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT");
    static final VarHandle const$1 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("shaderImageInt64Atomics"));
    static final VarHandle const$4 = constants$781.const$0.varHandle(MemoryLayout.PathElement.groupElement("sparseImageInt64Atomics"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("heapUsage")
    ).withName("VkPhysicalDeviceMemoryBudgetPropertiesEXT");
}


