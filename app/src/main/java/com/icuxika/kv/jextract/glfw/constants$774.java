// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$774 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$774() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkReleasePerformanceConfigurationINTEL",
        constants$144.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkQueueSetPerformanceConfigurationINTEL",
        constants$144.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkGetPerformanceParameterINTEL",
        constants$147.const$4
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("pciDomain"),
        JAVA_INT.withName("pciBus"),
        JAVA_INT.withName("pciDevice"),
        JAVA_INT.withName("pciFunction")
    ).withName("VkPhysicalDevicePCIBusInfoPropertiesEXT");
    static final VarHandle const$4 = constants$774.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$774.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


