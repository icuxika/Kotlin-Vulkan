// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$434 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$434() {}
    static final VarHandle const$0 = constants$431.const$4.varHandle(MemoryLayout.PathElement.groupElement("compositeAlpha"));
    static final VarHandle const$1 = constants$431.const$4.varHandle(MemoryLayout.PathElement.groupElement("presentMode"));
    static final VarHandle const$2 = constants$431.const$4.varHandle(MemoryLayout.PathElement.groupElement("clipped"));
    static final VarHandle const$3 = constants$431.const$4.varHandle(MemoryLayout.PathElement.groupElement("oldSwapchain"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("waitSemaphoreCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pWaitSemaphores"),
        JAVA_INT.withName("swapchainCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pSwapchains"),
        RuntimeHelper.POINTER.withName("pImageIndices"),
        RuntimeHelper.POINTER.withName("pResults")
    ).withName("VkPresentInfoKHR");
    static final VarHandle const$5 = constants$434.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


