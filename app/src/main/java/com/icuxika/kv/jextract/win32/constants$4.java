// Generated by jextract

package com.icuxika.kv.jextract.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "UnhookWindowsHookEx",
        constants$4.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CallNextHookEx",
        constants$4.const$2
    );
}


