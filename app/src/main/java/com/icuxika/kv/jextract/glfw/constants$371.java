// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$371 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$371() {}
    static final VarHandle const$0 = constants$369.const$4.varHandle(MemoryLayout.PathElement.groupElement("imageMemoryBarrierCount"));
    static final VarHandle const$1 = constants$369.const$4.varHandle(MemoryLayout.PathElement.groupElement("pImageMemoryBarriers"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("semaphore"),
        JAVA_LONG.withName("value"),
        JAVA_LONG.withName("stageMask"),
        JAVA_INT.withName("deviceIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkSemaphoreSubmitInfo");
    static final VarHandle const$3 = constants$371.const$2.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$4 = constants$371.const$2.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$5 = constants$371.const$2.varHandle(MemoryLayout.PathElement.groupElement("semaphore"));
}


