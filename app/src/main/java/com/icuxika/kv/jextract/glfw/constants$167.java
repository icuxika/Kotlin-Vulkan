// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$167 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$167() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdBindVertexBuffers.class, "apply", constants$167.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$167.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdDraw.class, "apply", constants$167.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$167.const$3
    );
}


