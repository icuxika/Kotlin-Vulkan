// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1029 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1029() {}
    static final VarHandle const$0 = constants$1028.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkGetFramebufferTilePropertiesQCOM.class, "apply", constants$143.const$2);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetDynamicRenderingTilePropertiesQCOM.class, "apply", constants$139.const$5);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkGetFramebufferTilePropertiesQCOM",
        constants$143.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkGetDynamicRenderingTilePropertiesQCOM",
        constants$139.const$5
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("amigoProfiling"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceAmigoProfilingFeaturesSEC");
}


