// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$454 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$454() {}
    static final VarHandle const$0 = constants$453.const$3.varHandle(MemoryLayout.PathElement.groupElement("queryResultStatusSupport"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("videoCodecOperations"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkQueueFamilyVideoPropertiesKHR");
    static final VarHandle const$2 = constants$454.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$454.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$454.const$1.varHandle(MemoryLayout.PathElement.groupElement("videoCodecOperations"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("videoCodecOperation"),
        JAVA_INT.withName("chromaSubsampling"),
        JAVA_INT.withName("lumaBitDepth"),
        JAVA_INT.withName("chromaBitDepth")
    ).withName("VkVideoProfileInfoKHR");
}


