// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$612 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$612() {}
    static final VarHandle const$0 = constants$611.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$611.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$611.const$5.varHandle(MemoryLayout.PathElement.groupElement("rayTracingPositionFetch"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkDebugReportCallbackEXT.class, "apply", constants$612.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$612.const$3
    );
}


