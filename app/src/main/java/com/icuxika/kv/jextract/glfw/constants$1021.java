// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1021 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1021() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkDestroyOpticalFlowSessionNV",
        constants$142.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkBindOpticalFlowSessionImageNV",
        constants$1020.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCmdOpticalFlowExecuteNV",
        constants$142.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("legacyDithering"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceLegacyDitheringFeaturesEXT");
    static final VarHandle const$4 = constants$1021.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$1021.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}

