// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$530 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$530() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR.class, "apply", constants$139.const$5);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceSurfaceFormats2KHR.class, "apply", constants$143.const$2);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkGetPhysicalDeviceSurfaceCapabilities2KHR",
        constants$139.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkGetPhysicalDeviceSurfaceFormats2KHR",
        constants$143.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("display"),
            RuntimeHelper.POINTER.withName("displayName"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("physicalDimensions"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("physicalResolution"),
            JAVA_INT.withName("supportedTransforms"),
            JAVA_INT.withName("planeReorderPossible"),
            JAVA_INT.withName("persistentContent"),
            MemoryLayout.paddingLayout(4)
        ).withName("displayProperties")
    ).withName("VkDisplayProperties2KHR");
    static final VarHandle const$5 = constants$530.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


