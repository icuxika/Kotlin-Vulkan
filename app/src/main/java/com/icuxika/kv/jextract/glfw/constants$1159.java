// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1159 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1159() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "glfwInitVulkanLoader",
        constants$0.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "glfwGetVersion",
        constants$142.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "glfwGetVersionString",
        constants$1159.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "glfwGetError",
        constants$146.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "glfwSetErrorCallback",
        constants$1159.const$5
    );
}

