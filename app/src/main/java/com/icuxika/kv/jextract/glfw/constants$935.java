// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$935 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$935() {}
    static final VarHandle const$0 = constants$934.const$4.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$1 = constants$934.const$4.varHandle(MemoryLayout.PathElement.groupElement("maxMultiDrawCount"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("firstVertex"),
        JAVA_INT.withName("vertexCount")
    ).withName("VkMultiDrawInfoEXT");
    static final VarHandle const$3 = constants$935.const$2.varHandle(MemoryLayout.PathElement.groupElement("firstVertex"));
    static final VarHandle const$4 = constants$935.const$2.varHandle(MemoryLayout.PathElement.groupElement("vertexCount"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("firstIndex"),
        JAVA_INT.withName("indexCount"),
        JAVA_INT.withName("vertexOffset")
    ).withName("VkMultiDrawIndexedInfoEXT");
}


