// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$447 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$447() {}
    static final VarHandle const$0 = constants$446.const$5.varHandle(MemoryLayout.PathElement.groupElement("display"));
    static final VarHandle const$1 = constants$446.const$5.varHandle(MemoryLayout.PathElement.groupElement("displayName"));
    static final VarHandle const$2 = constants$446.const$5.varHandle(MemoryLayout.PathElement.groupElement("supportedTransforms"));
    static final VarHandle const$3 = constants$446.const$5.varHandle(MemoryLayout.PathElement.groupElement("planeReorderPossible"));
    static final VarHandle const$4 = constants$446.const$5.varHandle(MemoryLayout.PathElement.groupElement("persistentContent"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("displayMode"),
        JAVA_INT.withName("planeIndex"),
        JAVA_INT.withName("planeStackIndex"),
        JAVA_INT.withName("transform"),
        JAVA_FLOAT.withName("globalAlpha"),
        JAVA_INT.withName("alphaMode"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("imageExtent"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDisplaySurfaceCreateInfoKHR");
}


