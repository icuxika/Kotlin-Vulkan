// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$803 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$803() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCmdSetLineStippleEXT.class, "apply", constants$802.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$802.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCmdSetLineStippleEXT",
        constants$802.const$5
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("shaderBufferFloat32Atomics"),
        JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
        JAVA_INT.withName("shaderBufferFloat64Atomics"),
        JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
        JAVA_INT.withName("shaderSharedFloat32Atomics"),
        JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
        JAVA_INT.withName("shaderSharedFloat64Atomics"),
        JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
        JAVA_INT.withName("shaderImageFloat32Atomics"),
        JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
        JAVA_INT.withName("sparseImageFloat32Atomics"),
        JAVA_INT.withName("sparseImageFloat32AtomicAdd")
    ).withName("VkPhysicalDeviceShaderAtomicFloatFeaturesEXT");
    static final VarHandle const$4 = constants$803.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$803.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


