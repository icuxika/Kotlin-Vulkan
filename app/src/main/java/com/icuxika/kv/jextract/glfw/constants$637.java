// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$637 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$637() {}
    static final VarHandle const$0 = constants$636.const$3.varHandle(MemoryLayout.PathElement.groupElement("deviceAddress"));
    static final VarHandle const$1 = constants$636.const$3.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkGetImageViewHandleNVX.class, "apply", constants$144.const$2);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkGetImageViewAddressNVX.class, "apply", constants$139.const$5);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkGetImageViewHandleNVX",
        constants$144.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkGetImageViewAddressNVX",
        constants$139.const$5
    );
}


