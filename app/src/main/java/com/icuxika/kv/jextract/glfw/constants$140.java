// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$140 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$140() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCreateInstance.class, "apply", constants$139.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$139.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkDestroyInstance.class, "apply", constants$14.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkEnumeratePhysicalDevices.class, "apply", constants$139.const$5);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceFeatures.class, "apply", constants$14.const$0);
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
}


