// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$48 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$48() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "_wfullpath",
        constants$5.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_wmakepath_s",
        constants$48.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_wmakepath",
        constants$48.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_wsplitpath",
        constants$48.const$3
    );
}


