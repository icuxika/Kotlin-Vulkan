// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$716 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$716() {}
    static final VarHandle const$0 = constants$715.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$715.const$4.varHandle(MemoryLayout.PathElement.groupElement("sampleOrderType"));
    static final VarHandle const$2 = constants$715.const$4.varHandle(MemoryLayout.PathElement.groupElement("customSampleOrderCount"));
    static final VarHandle const$3 = constants$715.const$4.varHandle(MemoryLayout.PathElement.groupElement("pCustomSampleOrders"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdBindShadingRateImageNV.class, "apply", constants$174.const$2);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdSetViewportShadingRatePaletteNV.class, "apply", constants$145.const$0);
}


