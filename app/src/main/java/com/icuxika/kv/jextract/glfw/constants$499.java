// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$499 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$499() {}
    static final VarHandle const$0 = constants$498.const$2.varHandle(MemoryLayout.PathElement.groupElement("perViewAttributesPositionXOnly"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdBeginRenderingKHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdEndRenderingKHR.class, "apply", constants$0.const$0);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vkCmdBeginRenderingKHR",
        constants$14.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdEndRenderingKHR",
        constants$0.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceFeatures2KHR.class, "apply", constants$14.const$0);
}


