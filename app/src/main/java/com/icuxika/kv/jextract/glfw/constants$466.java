// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$466 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$466() {}
    static final VarHandle const$0 = constants$465.const$3.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$1 = constants$465.const$3.varHandle(MemoryLayout.PathElement.groupElement("videoSessionParametersTemplate"));
    static final VarHandle const$2 = constants$465.const$3.varHandle(MemoryLayout.PathElement.groupElement("videoSession"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("updateSequenceCount"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoSessionParametersUpdateInfoKHR");
    static final VarHandle const$4 = constants$466.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$466.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


