// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$636 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$636() {}
    static final VarHandle const$0 = constants$635.const$3.varHandle(MemoryLayout.PathElement.groupElement("imageView"));
    static final VarHandle const$1 = constants$635.const$3.varHandle(MemoryLayout.PathElement.groupElement("descriptorType"));
    static final VarHandle const$2 = constants$635.const$3.varHandle(MemoryLayout.PathElement.groupElement("sampler"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("deviceAddress"),
        JAVA_LONG.withName("size")
    ).withName("VkImageViewAddressPropertiesNVX");
    static final VarHandle const$4 = constants$636.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$636.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


