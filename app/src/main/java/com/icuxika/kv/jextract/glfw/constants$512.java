// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$512 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$512() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkCmdPushDescriptorSetWithTemplateKHR",
        constants$170.const$1
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("offset"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("extent"),
        JAVA_INT.withName("layer")
    ).withName("VkRectLayerKHR");
    static final VarHandle const$2 = constants$512.const$1.varHandle(MemoryLayout.PathElement.groupElement("layer"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("rectangleCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pRectangles")
    ).withName("VkPresentRegionKHR");
    static final VarHandle const$4 = constants$512.const$3.varHandle(MemoryLayout.PathElement.groupElement("rectangleCount"));
    static final VarHandle const$5 = constants$512.const$3.varHandle(MemoryLayout.PathElement.groupElement("pRectangles"));
}


