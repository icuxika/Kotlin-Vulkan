// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$673 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$673() {}
    static final VarHandle const$0 = constants$672.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$672.const$4.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$2 = constants$672.const$4.varHandle(MemoryLayout.PathElement.groupElement("conservativeRasterizationMode"));
    static final VarHandle const$3 = constants$672.const$4.varHandle(MemoryLayout.PathElement.groupElement("extraPrimitiveOverestimationSize"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("depthClipEnable"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceDepthClipEnableFeaturesEXT");
    static final VarHandle const$5 = constants$673.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


