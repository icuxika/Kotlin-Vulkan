// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$807 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$807() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("extendedDynamicState"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceExtendedDynamicStateFeaturesEXT");
    static final VarHandle const$1 = constants$807.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$807.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$807.const$0.varHandle(MemoryLayout.PathElement.groupElement("extendedDynamicState"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdSetCullModeEXT.class, "apply", constants$178.const$3);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdSetFrontFaceEXT.class, "apply", constants$178.const$3);
}

