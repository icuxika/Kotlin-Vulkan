// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$305 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$305() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("denormBehaviorIndependence"),
        JAVA_INT.withName("roundingModeIndependence"),
        JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        JAVA_INT.withName("shaderDenormPreserveFloat16"),
        JAVA_INT.withName("shaderDenormPreserveFloat32"),
        JAVA_INT.withName("shaderDenormPreserveFloat64"),
        JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
        JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
        JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
        JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
        JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
        JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
        JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
        JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
        JAVA_INT.withName("shaderRoundingModeRTZFloat64"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFloatControlsProperties");
    static final VarHandle const$1 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("denormBehaviorIndependence"));
    static final VarHandle const$4 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("roundingModeIndependence"));
    static final VarHandle const$5 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
}


