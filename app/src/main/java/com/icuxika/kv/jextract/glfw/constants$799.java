// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$799 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$799() {}
    static final VarHandle const$0 = constants$798.const$3.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCreateHeadlessSurfaceEXT.class, "apply", constants$143.const$2);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCreateHeadlessSurfaceEXT",
        constants$143.const$2
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("rectangularLines"),
        JAVA_INT.withName("bresenhamLines"),
        JAVA_INT.withName("smoothLines"),
        JAVA_INT.withName("stippledRectangularLines"),
        JAVA_INT.withName("stippledBresenhamLines"),
        JAVA_INT.withName("stippledSmoothLines")
    ).withName("VkPhysicalDeviceLineRasterizationFeaturesEXT");
    static final VarHandle const$4 = constants$799.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$799.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


