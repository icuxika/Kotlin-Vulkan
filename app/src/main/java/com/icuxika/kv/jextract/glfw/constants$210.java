// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$210 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$210() {}
    static final VarHandle const$0 = constants$209.const$1.varHandle(MemoryLayout.PathElement.groupElement("pDeviceRenderAreas"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("deviceMask"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDeviceGroupCommandBufferBeginInfo");
    static final VarHandle const$2 = constants$210.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$210.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$210.const$1.varHandle(MemoryLayout.PathElement.groupElement("deviceMask"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("waitSemaphoreCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pWaitSemaphoreDeviceIndices"),
        JAVA_INT.withName("commandBufferCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pCommandBufferDeviceMasks"),
        JAVA_INT.withName("signalSemaphoreCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pSignalSemaphoreDeviceIndices")
    ).withName("VkDeviceGroupSubmitInfo");
}


