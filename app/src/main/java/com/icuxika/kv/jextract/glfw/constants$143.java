// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$143 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$143() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$142.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkGetDeviceProcAddr.class, "apply", constants$142.const$4);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCreateDevice.class, "apply", constants$143.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$143.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkDestroyDevice.class, "apply", constants$14.const$0);
}


