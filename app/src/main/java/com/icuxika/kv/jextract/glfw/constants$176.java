// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$176 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$176() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdBeginQuery.class, "apply", constants$176.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$176.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdEndQuery.class, "apply", constants$174.const$2);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdResetQueryPool.class, "apply", constants$176.const$0);
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
}


