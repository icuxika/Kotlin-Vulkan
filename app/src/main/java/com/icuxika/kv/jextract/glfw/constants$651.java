// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$651 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$651() {}
    static final VarHandle const$0 = constants$650.const$3.varHandle(MemoryLayout.PathElement.groupElement("buffer"));
    static final VarHandle const$1 = constants$650.const$3.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    static final VarHandle const$2 = constants$650.const$3.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("conditionalRendering"),
        JAVA_INT.withName("inheritedConditionalRendering")
    ).withName("VkPhysicalDeviceConditionalRenderingFeaturesEXT");
    static final VarHandle const$4 = constants$651.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$651.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


