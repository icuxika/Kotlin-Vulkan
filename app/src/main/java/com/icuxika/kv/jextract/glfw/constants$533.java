// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$533 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$533() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("supportedAlpha"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("x"),
                JAVA_INT.withName("y")
            ).withName("minSrcPosition"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("x"),
                JAVA_INT.withName("y")
            ).withName("maxSrcPosition"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("minSrcExtent"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("maxSrcExtent"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("x"),
                JAVA_INT.withName("y")
            ).withName("minDstPosition"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("x"),
                JAVA_INT.withName("y")
            ).withName("maxDstPosition"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("minDstExtent"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("maxDstExtent")
        ).withName("capabilities"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDisplayPlaneCapabilities2KHR");
    static final VarHandle const$1 = constants$533.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$533.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceDisplayProperties2KHR.class, "apply", constants$139.const$5);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR.class, "apply", constants$139.const$5);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkGetDisplayModeProperties2KHR.class, "apply", constants$143.const$2);
}


