// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$865 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$865() {}
    static final VarHandle const$0 = constants$864.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$864.const$4.varHandle(MemoryLayout.PathElement.groupElement("address"));
    static final VarHandle const$2 = constants$864.const$4.varHandle(MemoryLayout.PathElement.groupElement("range"));
    static final VarHandle const$3 = constants$864.const$4.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("address"),
        JAVA_INT.withName("usage"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDescriptorBufferBindingInfoEXT");
    static final VarHandle const$5 = constants$865.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


