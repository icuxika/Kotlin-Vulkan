// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$762 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$762() {}
    static final VarHandle const$0 = constants$761.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$761.const$4.varHandle(MemoryLayout.PathElement.groupElement("exclusiveScissor"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdSetExclusiveScissorEnableNV.class, "apply", constants$145.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdSetExclusiveScissorNV.class, "apply", constants$145.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdSetExclusiveScissorEnableNV",
        constants$145.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkCmdSetExclusiveScissorNV",
        constants$145.const$0
    );
}


