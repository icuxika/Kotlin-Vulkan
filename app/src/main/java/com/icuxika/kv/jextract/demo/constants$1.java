// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "__report_gsfailure",
        constants$0.const$4
    );
    static final VarHandle const$1 = JAVA_LONG.varHandle();
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("__security_cookie", JAVA_LONG);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_invalid_parameter_noinfo",
        constants$0.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_invalid_parameter_noinfo_noreturn",
        constants$0.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "_invoke_watson",
        constants$1.const$5
    );
}


