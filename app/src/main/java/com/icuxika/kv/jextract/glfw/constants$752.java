// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$752 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$752() {}
    static final VarHandle const$0 = constants$751.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$751.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$2 = constants$751.const$5.varHandle(MemoryLayout.PathElement.groupElement("maxVertexAttribDivisor"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("binding"),
        JAVA_INT.withName("divisor")
    ).withName("VkVertexInputBindingDivisorDescriptionEXT");
    static final VarHandle const$4 = constants$752.const$3.varHandle(MemoryLayout.PathElement.groupElement("binding"));
    static final VarHandle const$5 = constants$752.const$3.varHandle(MemoryLayout.PathElement.groupElement("divisor"));
}

