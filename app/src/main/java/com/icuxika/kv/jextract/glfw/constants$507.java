// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$507 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$507() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$506.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkGetMemoryFdKHR",
        constants$139.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkGetMemoryFdPropertiesKHR",
        constants$506.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR.class, "apply", constants$142.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkGetPhysicalDeviceExternalSemaphorePropertiesKHR",
        constants$142.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("semaphore"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("handleType"),
        JAVA_INT.withName("fd"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkImportSemaphoreFdInfoKHR");
}


