// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$629 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$629() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "vkCmdEndTransformFeedbackEXT",
        constants$167.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkCmdBeginQueryIndexedEXT",
        constants$627.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCmdEndQueryIndexedEXT",
        constants$176.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkCmdDrawIndirectByteCountEXT",
        constants$628.const$1
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_LONG.withName("dataSize"),
        RuntimeHelper.POINTER.withName("pData")
    ).withName("VkCuModuleCreateInfoNVX");
    static final VarHandle const$5 = constants$629.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


