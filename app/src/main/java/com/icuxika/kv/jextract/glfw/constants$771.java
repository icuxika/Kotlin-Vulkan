// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$771 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$771() {}
    static final VarHandle const$0 = constants$770.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$770.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$770.const$5.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkInitializePerformanceApiINTEL.class, "apply", constants$144.const$2);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkUninitializePerformanceApiINTEL.class, "apply", constants$0.const$0);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdSetPerformanceMarkerINTEL.class, "apply", constants$144.const$2);
}


