// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1071 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1071() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCreateRayTracingPipelinesKHR.class, "apply", constants$1071.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$1071.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.class, "apply", constants$736.const$2);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdTraceRaysIndirectKHR.class, "apply", constants$1071.const$4);
}

