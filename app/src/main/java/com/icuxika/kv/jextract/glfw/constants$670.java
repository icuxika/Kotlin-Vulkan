// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$670 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$670() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCmdSetDiscardRectangleModeEXT.class, "apply", constants$178.const$3);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkCmdSetDiscardRectangleEXT",
        constants$145.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCmdSetDiscardRectangleEnableEXT",
        constants$178.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkCmdSetDiscardRectangleModeEXT",
        constants$178.const$3
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_FLOAT.withName("primitiveOverestimationSize"),
        JAVA_FLOAT.withName("maxExtraPrimitiveOverestimationSize"),
        JAVA_FLOAT.withName("extraPrimitiveOverestimationSizeGranularity"),
        JAVA_INT.withName("primitiveUnderestimation"),
        JAVA_INT.withName("conservativePointAndLineRasterization"),
        JAVA_INT.withName("degenerateTrianglesRasterized"),
        JAVA_INT.withName("degenerateLinesRasterized"),
        JAVA_INT.withName("fullyCoveredFragmentShaderInputVariable"),
        JAVA_INT.withName("conservativeRasterizationPostDepthCoverage"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceConservativeRasterizationPropertiesEXT");
    static final VarHandle const$5 = constants$670.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}

