// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$78 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$78() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_SHORT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "btowc",
        constants$78.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mbrlen",
        constants$78.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "mbrtowc",
        constants$58.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "mbsrtowcs_s",
        constants$78.const$5
    );
}


