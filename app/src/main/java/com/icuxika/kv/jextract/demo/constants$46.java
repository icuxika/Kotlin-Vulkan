// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$46 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$46() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_i64tow_s",
        constants$46.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_i64tow",
        constants$46.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_ui64tow_s",
        constants$46.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_ui64tow",
        constants$46.const$2
    );
}


