// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$734 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$734() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCreateAccelerationStructureNV.class, "apply", constants$143.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkDestroyAccelerationStructureNV.class, "apply", constants$142.const$0);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetAccelerationStructureMemoryRequirementsNV.class, "apply", constants$142.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkBindAccelerationStructureMemoryNV.class, "apply", constants$147.const$4);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdBuildAccelerationStructureNV.class, "apply", constants$734.const$4);
}


