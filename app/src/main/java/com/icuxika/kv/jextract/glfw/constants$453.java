// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$453 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$453() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCreateSharedSwapchainsKHR.class, "apply", constants$452.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$452.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vkCreateSharedSwapchainsKHR",
        constants$452.const$5
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("queryResultStatusSupport"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkQueueFamilyQueryResultStatusPropertiesKHR");
    static final VarHandle const$4 = constants$453.const$3.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$5 = constants$453.const$3.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
}


