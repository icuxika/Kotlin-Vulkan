// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$960 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$960() {}
    static final VarHandle const$0 = constants$959.const$3.varHandle(MemoryLayout.PathElement.groupElement("maxOutputClusterCount"));
    static final VarHandle const$1 = constants$959.const$3.varHandle(MemoryLayout.PathElement.groupElement("indirectBufferOffsetAlignment"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdDrawClusterHUAWEI.class, "apply", constants$169.const$1);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdDrawClusterIndirectHUAWEI.class, "apply", constants$169.const$4);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdDrawClusterHUAWEI",
        constants$169.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkCmdDrawClusterIndirectHUAWEI",
        constants$169.const$4
    );
}

