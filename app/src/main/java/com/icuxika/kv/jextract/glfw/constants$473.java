// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$473 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$473() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkUpdateVideoSessionParametersKHR",
        constants$139.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkDestroyVideoSessionParametersKHR",
        constants$142.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCmdBeginVideoCodingKHR",
        constants$14.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkCmdEndVideoCodingKHR",
        constants$14.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdControlVideoCodingKHR",
        constants$14.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkVideoDecodeCapabilitiesKHR");
}


