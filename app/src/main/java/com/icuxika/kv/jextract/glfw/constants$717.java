// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$717 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$717() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCmdSetCoarseSampleOrderNV.class, "apply", constants$145.const$0);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkCmdBindShadingRateImageNV",
        constants$174.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCmdSetViewportShadingRatePaletteNV",
        constants$145.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkCmdSetCoarseSampleOrderNV",
        constants$145.const$0
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("type"),
        JAVA_INT.withName("generalShader"),
        JAVA_INT.withName("closestHitShader"),
        JAVA_INT.withName("anyHitShader"),
        JAVA_INT.withName("intersectionShader"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkRayTracingShaderGroupCreateInfoNV");
    static final VarHandle const$5 = constants$717.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}

