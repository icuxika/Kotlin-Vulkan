// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$815 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$815() {}
    static final VarHandle const$0 = constants$814.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$814.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$814.const$5.varHandle(MemoryLayout.PathElement.groupElement("supportedPresentScaling"));
    static final VarHandle const$3 = constants$814.const$5.varHandle(MemoryLayout.PathElement.groupElement("supportedPresentGravityX"));
    static final VarHandle const$4 = constants$814.const$5.varHandle(MemoryLayout.PathElement.groupElement("supportedPresentGravityY"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("presentModeCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pPresentModes")
    ).withName("VkSurfacePresentModeCompatibilityEXT");
}


