// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$583 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$583() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkGetBufferDeviceAddressKHR.class, "apply", constants$344.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkGetBufferOpaqueCaptureAddressKHR.class, "apply", constants$344.const$2);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR.class, "apply", constants$344.const$2);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkGetBufferDeviceAddressKHR",
        constants$344.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkGetBufferOpaqueCaptureAddressKHR",
        constants$344.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkGetDeviceMemoryOpaqueCaptureAddressKHR",
        constants$344.const$2
    );
}


