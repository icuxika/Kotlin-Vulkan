// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$847 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$847() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkGetDrmDisplayEXT.class, "apply", constants$506.const$4);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkAcquireDrmDisplayEXT",
        constants$147.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkGetDrmDisplayEXT",
        constants$506.const$4
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("robustBufferAccess2"),
        JAVA_INT.withName("robustImageAccess2"),
        JAVA_INT.withName("nullDescriptor"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceRobustness2FeaturesEXT");
    static final VarHandle const$4 = constants$847.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$847.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}

