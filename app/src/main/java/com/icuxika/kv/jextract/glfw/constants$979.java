// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$979 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$979() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdDecompressMemoryIndirectCountNV.class, "apply", constants$979.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$979.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkCmdDecompressMemoryNV",
        constants$140.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdDecompressMemoryIndirectCountNV",
        constants$979.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("linearColorAttachment"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceLinearColorAttachmentFeaturesNV");
}


