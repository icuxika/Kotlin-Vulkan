// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$599 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$599() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_vkCmdWaitEvents2KHR.class, "apply", constants$416.const$0);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_vkCmdPipelineBarrier2KHR.class, "apply", constants$14.const$0);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdWriteTimestamp2KHR.class, "apply", constants$416.const$4);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkQueueSubmit2KHR.class, "apply", constants$145.const$3);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkCmdWriteBufferMarker2AMD.class, "apply", constants$599.const$4);
}

