// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$144 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$144() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkEnumerateInstanceExtensionProperties.class, "apply", constants$139.const$5);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkEnumerateDeviceExtensionProperties.class, "apply", constants$143.const$2);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkEnumerateInstanceLayerProperties.class, "apply", constants$144.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$144.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkEnumerateDeviceLayerProperties.class, "apply", constants$139.const$5);
}


