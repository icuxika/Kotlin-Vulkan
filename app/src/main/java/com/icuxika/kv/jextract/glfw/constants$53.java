// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$53 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$53() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("queueCreateInfoCount"),
        RuntimeHelper.POINTER.withName("pQueueCreateInfos"),
        JAVA_INT.withName("enabledLayerCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ppEnabledLayerNames"),
        JAVA_INT.withName("enabledExtensionCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ppEnabledExtensionNames"),
        RuntimeHelper.POINTER.withName("pEnabledFeatures")
    ).withName("VkDeviceCreateInfo");
    static final VarHandle const$1 = constants$53.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$53.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$53.const$0.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$4 = constants$53.const$0.varHandle(MemoryLayout.PathElement.groupElement("queueCreateInfoCount"));
    static final VarHandle const$5 = constants$53.const$0.varHandle(MemoryLayout.PathElement.groupElement("pQueueCreateInfos"));
}

