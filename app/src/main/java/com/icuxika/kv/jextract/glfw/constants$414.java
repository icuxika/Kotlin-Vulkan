// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$414 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$414() {}
    static final VarHandle const$0 = constants$413.const$2.varHandle(MemoryLayout.PathElement.groupElement("planeAspect"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceToolProperties.class, "apply", constants$139.const$5);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCreatePrivateDataSlot.class, "apply", constants$143.const$2);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkDestroyPrivateDataSlot.class, "apply", constants$142.const$0);
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkSetPrivateData.class, "apply", constants$414.const$4);
}

