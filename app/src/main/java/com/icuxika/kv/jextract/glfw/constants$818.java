// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$818 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$818() {}
    static final VarHandle const$0 = constants$817.const$2.varHandle(MemoryLayout.PathElement.groupElement("pFences"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("presentModeCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pPresentModes")
    ).withName("VkSwapchainPresentModesCreateInfoEXT");
    static final VarHandle const$2 = constants$818.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$818.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$818.const$1.varHandle(MemoryLayout.PathElement.groupElement("presentModeCount"));
    static final VarHandle const$5 = constants$818.const$1.varHandle(MemoryLayout.PathElement.groupElement("pPresentModes"));
}


