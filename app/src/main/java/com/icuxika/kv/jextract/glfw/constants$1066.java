// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1066 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1066() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("rayTracingPipeline"),
        JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
        JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
        JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
        JAVA_INT.withName("rayTraversalPrimitiveCulling"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceRayTracingPipelineFeaturesKHR");
    static final VarHandle const$1 = constants$1066.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$1066.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$1066.const$0.varHandle(MemoryLayout.PathElement.groupElement("rayTracingPipeline"));
    static final VarHandle const$4 = constants$1066.const$0.varHandle(MemoryLayout.PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    static final VarHandle const$5 = constants$1066.const$0.varHandle(MemoryLayout.PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
}


