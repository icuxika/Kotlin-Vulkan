// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$634 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$634() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCreateCuFunctionNVX.class, "apply", constants$143.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkDestroyCuModuleNVX.class, "apply", constants$142.const$0);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkDestroyCuFunctionNVX.class, "apply", constants$142.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdCuLaunchKernelNVX.class, "apply", constants$14.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCreateCuModuleNVX",
        constants$143.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkCreateCuFunctionNVX",
        constants$143.const$2
    );
}


