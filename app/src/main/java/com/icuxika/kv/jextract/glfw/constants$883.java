// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$883 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$883() {}
    static final VarHandle const$0 = constants$882.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$882.const$4.varHandle(MemoryLayout.PathElement.groupElement("shadingRateType"));
    static final VarHandle const$2 = constants$882.const$4.varHandle(MemoryLayout.PathElement.groupElement("shadingRate"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdSetFragmentShadingRateEnumNV.class, "apply", constants$140.const$5);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdSetFragmentShadingRateEnumNV",
        constants$140.const$5
    );
    static final UnionLayout const$5 = MemoryLayout.unionLayout(
        JAVA_LONG.withName("deviceAddress"),
        RuntimeHelper.POINTER.withName("hostAddress")
    ).withName("VkDeviceOrHostAddressConstKHR");
}

