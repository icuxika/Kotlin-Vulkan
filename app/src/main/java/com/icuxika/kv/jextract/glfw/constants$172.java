// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$172 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$172() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$171.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdCopyImageToBuffer.class, "apply", constants$172.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$172.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdUpdateBuffer.class, "apply", constants$172.const$4);
}


