// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$663 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$663() {}
    static final VarHandle const$0 = constants$662.const$2.varHandle(MemoryLayout.PathElement.groupElement("earliestPresentTime"));
    static final VarHandle const$1 = constants$662.const$2.varHandle(MemoryLayout.PathElement.groupElement("presentMargin"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("presentID"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("desiredPresentTime")
    ).withName("VkPresentTimeGOOGLE");
    static final VarHandle const$3 = constants$663.const$2.varHandle(MemoryLayout.PathElement.groupElement("presentID"));
    static final VarHandle const$4 = constants$663.const$2.varHandle(MemoryLayout.PathElement.groupElement("desiredPresentTime"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("swapchainCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pTimes")
    ).withName("VkPresentTimesInfoGOOGLE");
}


