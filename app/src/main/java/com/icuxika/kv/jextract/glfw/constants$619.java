// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$619 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$619() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkDebugMarkerSetObjectTagEXT.class, "apply", constants$144.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkDebugMarkerSetObjectNameEXT.class, "apply", constants$144.const$2);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdDebugMarkerBeginEXT.class, "apply", constants$14.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdDebugMarkerEndEXT.class, "apply", constants$0.const$0);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdDebugMarkerInsertEXT.class, "apply", constants$14.const$0);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkDebugMarkerSetObjectTagEXT",
        constants$144.const$2
    );
}

