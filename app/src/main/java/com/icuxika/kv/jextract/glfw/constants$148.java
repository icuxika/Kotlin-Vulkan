// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$148 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$148() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$147.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkInvalidateMappedMemoryRanges.class, "apply", constants$147.const$4);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetDeviceMemoryCommitment.class, "apply", constants$142.const$0);
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkBindBufferMemory.class, "apply", constants$148.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$148.const$3
    );
}

