// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$755 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$755() {}
    static final VarHandle const$0 = constants$754.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$754.const$4.varHandle(MemoryLayout.PathElement.groupElement("computeDerivativeGroupQuads"));
    static final VarHandle const$2 = constants$754.const$4.varHandle(MemoryLayout.PathElement.groupElement("computeDerivativeGroupLinear"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("taskShader"),
        JAVA_INT.withName("meshShader")
    ).withName("VkPhysicalDeviceMeshShaderFeaturesNV");
    static final VarHandle const$4 = constants$755.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$755.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


