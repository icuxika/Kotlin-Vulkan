// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$574 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$574() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkSignalSemaphoreKHR.class, "apply", constants$144.const$2);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkGetSemaphoreCounterValueKHR",
        constants$139.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkWaitSemaphoresKHR",
        constants$343.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkSignalSemaphoreKHR",
        constants$144.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("pFragmentShadingRateAttachment"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("shadingRateAttachmentTexelSize")
    ).withName("VkFragmentShadingRateAttachmentInfoKHR");
    static final VarHandle const$5 = constants$574.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


