// Generated by jextract

package com.icuxika.kv.jextract.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final VarHandle const$0 = constants$0.const$3.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$1 = constants$0.const$3.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final VarHandle const$2 = constants$0.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetMessageA",
        constants$1.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetMessageW",
        constants$1.const$3
    );
}

