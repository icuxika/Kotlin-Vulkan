// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$169 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$169() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCmdDrawIndexedIndirect.class, "apply", constants$168.const$3);
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdDispatch.class, "apply", constants$169.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$169.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdDispatchIndirect.class, "apply", constants$169.const$4);
}


