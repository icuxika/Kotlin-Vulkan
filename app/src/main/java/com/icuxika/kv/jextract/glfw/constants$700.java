// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$700 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$700() {}
    static final VarHandle const$0 = constants$699.const$3.varHandle(MemoryLayout.PathElement.groupElement("shaderSMCount"));
    static final VarHandle const$1 = constants$699.const$3.varHandle(MemoryLayout.PathElement.groupElement("shaderWarpsPerSM"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("shaderSMBuiltins"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderSMBuiltinsFeaturesNV");
    static final VarHandle const$3 = constants$700.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$700.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$700.const$2.varHandle(MemoryLayout.PathElement.groupElement("shaderSMBuiltins"));
}

