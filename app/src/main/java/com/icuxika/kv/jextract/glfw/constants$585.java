// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$585 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$585() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkDestroyDeferredOperationKHR",
        constants$142.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkGetDeferredOperationMaxConcurrencyKHR",
        constants$144.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkGetDeferredOperationResultKHR",
        constants$144.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkDeferredOperationJoinKHR",
        constants$144.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("pipelineExecutableInfo"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR");
    static final VarHandle const$5 = constants$585.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


