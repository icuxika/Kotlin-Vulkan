// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$746 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$746() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$745.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "vkCmdWriteBufferMarkerAMD",
        constants$745.const$4
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("compilerControlFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPipelineCompilerControlCreateInfoAMD");
    static final VarHandle const$3 = constants$746.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$746.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$746.const$2.varHandle(MemoryLayout.PathElement.groupElement("compilerControlFlags"));
}

