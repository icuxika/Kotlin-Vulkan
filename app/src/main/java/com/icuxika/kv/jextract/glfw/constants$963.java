// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$963 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$963() {}
    static final VarHandle const$0 = constants$962.const$3.varHandle(MemoryLayout.PathElement.groupElement("pageableDeviceLocalMemory"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_FLOAT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkSetDeviceMemoryPriorityEXT.class, "apply", constants$963.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$963.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkSetDeviceMemoryPriorityEXT",
        constants$963.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("pixelRate"),
        JAVA_INT.withName("texelRate"),
        JAVA_INT.withName("fmaRate"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderCorePropertiesARM");
}


