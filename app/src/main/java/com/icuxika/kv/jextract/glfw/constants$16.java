// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$16 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$16() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pUserData"),
        RuntimeHelper.POINTER.withName("pfnAllocation"),
        RuntimeHelper.POINTER.withName("pfnReallocation"),
        RuntimeHelper.POINTER.withName("pfnFree"),
        RuntimeHelper.POINTER.withName("pfnInternalAllocation"),
        RuntimeHelper.POINTER.withName("pfnInternalFree")
    ).withName("VkAllocationCallbacks");
    static final VarHandle const$1 = constants$16.const$0.varHandle(MemoryLayout.PathElement.groupElement("pUserData"));
    static final VarHandle const$2 = constants$16.const$0.varHandle(MemoryLayout.PathElement.groupElement("pfnAllocation"));
    static final VarHandle const$3 = constants$16.const$0.varHandle(MemoryLayout.PathElement.groupElement("pfnReallocation"));
    static final VarHandle const$4 = constants$16.const$0.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    static final VarHandle const$5 = constants$16.const$0.varHandle(MemoryLayout.PathElement.groupElement("pfnInternalAllocation"));
}


