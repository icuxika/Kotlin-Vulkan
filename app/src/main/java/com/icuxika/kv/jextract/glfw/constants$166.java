// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$166 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$166() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdBindDescriptorSets.class, "apply", constants$166.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$166.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdBindIndexBuffer.class, "apply", constants$166.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$166.const$3
    );
}


