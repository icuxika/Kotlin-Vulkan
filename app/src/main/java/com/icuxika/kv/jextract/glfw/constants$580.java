// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$580 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$580() {}
    static final VarHandle const$0 = constants$579.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$579.const$4.varHandle(MemoryLayout.PathElement.groupElement("sampleCounts"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR.class, "apply", constants$139.const$5);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdSetFragmentShadingRateKHR.class, "apply", constants$142.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkGetPhysicalDeviceFragmentShadingRatesKHR",
        constants$139.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkCmdSetFragmentShadingRateKHR",
        constants$142.const$0
    );
}


