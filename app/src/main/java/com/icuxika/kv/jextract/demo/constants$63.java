// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$63 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$63() {}
    static final VarHandle const$0 = constants$61.const$5.varHandle(MemoryLayout.PathElement.groupElement("tm_wday"));
    static final VarHandle const$1 = constants$61.const$5.varHandle(MemoryLayout.PathElement.groupElement("tm_yday"));
    static final VarHandle const$2 = constants$61.const$5.varHandle(MemoryLayout.PathElement.groupElement("tm_isdst"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_wasctime",
        constants$25.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_wasctime_s",
        constants$7.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "wcsftime",
        constants$63.const$5
    );
}

