// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$566 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$566() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("stdProfileIdc"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoDecodeH265ProfileInfoKHR");
    static final VarHandle const$1 = constants$566.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$566.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$566.const$0.varHandle(MemoryLayout.PathElement.groupElement("stdProfileIdc"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("maxLevelIdc"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoDecodeH265CapabilitiesKHR");
    static final VarHandle const$5 = constants$566.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


