// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$165 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$165() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$164.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdSetStencilCompareMask.class, "apply", constants$165.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$165.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdSetStencilWriteMask.class, "apply", constants$165.const$1);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdSetStencilReference.class, "apply", constants$165.const$1);
}


