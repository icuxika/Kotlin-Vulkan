// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1072 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1072() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$1071.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetRayTracingShaderGroupStackSizeKHR.class, "apply", constants$1072.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$1072.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdSetRayTracingPipelineStackSizeKHR.class, "apply", constants$178.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkCmdTraceRaysKHR",
        constants$1070.const$3
    );
}

