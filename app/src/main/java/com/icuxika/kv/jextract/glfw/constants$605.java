// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$605 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$605() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCmdCopyImage2KHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdCopyBufferToImage2KHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdCopyImageToBuffer2KHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkCmdBlitImage2KHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCmdResolveImage2KHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkCmdCopyBuffer2KHR",
        constants$14.const$0
    );
}

