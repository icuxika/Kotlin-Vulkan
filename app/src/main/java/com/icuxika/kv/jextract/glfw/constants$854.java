// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$854 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$854() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkGetPrivateDataEXT.class, "apply", constants$415.const$1);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkCreatePrivateDataSlotEXT",
        constants$143.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkDestroyPrivateDataSlotEXT",
        constants$142.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkSetPrivateDataEXT",
        constants$414.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkGetPrivateDataEXT",
        constants$415.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("diagnosticsConfig"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceDiagnosticsConfigFeaturesNV");
}


