// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$615 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$615() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkDestroyDebugReportCallbackEXT",
        constants$142.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkDebugReportMessageEXT",
        constants$614.const$2
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("rasterizationOrder"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPipelineRasterizationStateRasterizationOrderAMD");
    static final VarHandle const$3 = constants$615.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$615.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$615.const$2.varHandle(MemoryLayout.PathElement.groupElement("rasterizationOrder"));
}


