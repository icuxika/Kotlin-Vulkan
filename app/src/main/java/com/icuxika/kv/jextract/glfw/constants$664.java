// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$664 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$664() {}
    static final VarHandle const$0 = constants$663.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$663.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$663.const$5.varHandle(MemoryLayout.PathElement.groupElement("swapchainCount"));
    static final VarHandle const$3 = constants$663.const$5.varHandle(MemoryLayout.PathElement.groupElement("pTimes"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkGetRefreshCycleDurationGOOGLE.class, "apply", constants$139.const$5);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkGetPastPresentationTimingGOOGLE.class, "apply", constants$143.const$2);
}

