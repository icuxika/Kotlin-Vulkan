// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$866 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$866() {}
    static final VarHandle const$0 = constants$865.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$865.const$4.varHandle(MemoryLayout.PathElement.groupElement("address"));
    static final VarHandle const$2 = constants$865.const$4.varHandle(MemoryLayout.PathElement.groupElement("usage"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("buffer")
    ).withName("VkDescriptorBufferBindingPushDescriptorBufferHandleEXT");
    static final VarHandle const$4 = constants$866.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$866.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}

