// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1158 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1158() {}
    static final VarHandle const$0 = constants$1157.const$3.varHandle(MemoryLayout.PathElement.groupElement("deallocate"));
    static final VarHandle const$1 = constants$1157.const$3.varHandle(MemoryLayout.PathElement.groupElement("user"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "glfwInit",
        constants$1103.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "glfwTerminate",
        constants$0.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "glfwInitHint",
        constants$1083.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "glfwInitAllocator",
        constants$0.const$0
    );
}

