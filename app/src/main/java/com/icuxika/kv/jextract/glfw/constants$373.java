// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$373 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$373() {}
    static final VarHandle const$0 = constants$372.const$3.varHandle(MemoryLayout.PathElement.groupElement("commandBuffer"));
    static final VarHandle const$1 = constants$372.const$3.varHandle(MemoryLayout.PathElement.groupElement("deviceMask"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("waitSemaphoreInfoCount"),
        RuntimeHelper.POINTER.withName("pWaitSemaphoreInfos"),
        JAVA_INT.withName("commandBufferInfoCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pCommandBufferInfos"),
        JAVA_INT.withName("signalSemaphoreInfoCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pSignalSemaphoreInfos")
    ).withName("VkSubmitInfo2");
    static final VarHandle const$3 = constants$373.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$373.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$373.const$2.varHandle(MemoryLayout.PathElement.groupElement("flags"));
}


