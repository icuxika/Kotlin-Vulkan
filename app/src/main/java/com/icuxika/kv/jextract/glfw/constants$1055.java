// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1055 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1055() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkDestroyAccelerationStructureKHR.class, "apply", constants$142.const$0);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdBuildAccelerationStructuresKHR.class, "apply", constants$416.const$0);
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdBuildAccelerationStructuresIndirectKHR.class, "apply", constants$1055.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1055.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}


