// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$796 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$796() {}
    static final VarHandle const$0 = constants$795.const$3.varHandle(MemoryLayout.PathElement.groupElement("ycbcrImageArrays"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("provokingVertexLast"),
        JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
    ).withName("VkPhysicalDeviceProvokingVertexFeaturesEXT");
    static final VarHandle const$2 = constants$796.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$796.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$796.const$1.varHandle(MemoryLayout.PathElement.groupElement("provokingVertexLast"));
    static final VarHandle const$5 = constants$796.const$1.varHandle(MemoryLayout.PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));
}


