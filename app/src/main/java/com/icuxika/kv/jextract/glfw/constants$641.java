// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$641 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$641() {}
    static final VarHandle const$0 = constants$640.const$2.varHandle(MemoryLayout.PathElement.groupElement("numAvailableVgprs"));
    static final VarHandle const$1 = constants$640.const$2.varHandle(MemoryLayout.PathElement.groupElement("numAvailableSgprs"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkGetShaderInfoAMD.class, "apply", constants$641.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$641.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkGetShaderInfoAMD",
        constants$641.const$2
    );
}


