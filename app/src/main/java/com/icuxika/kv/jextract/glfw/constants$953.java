// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$953 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$953() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("dataOffset"),
        JAVA_SHORT.withName("subdivisionLevel"),
        JAVA_SHORT.withName("format")
    ).withName("VkMicromapTriangleEXT");
    static final VarHandle const$1 = constants$953.const$0.varHandle(MemoryLayout.PathElement.groupElement("dataOffset"));
    static final VarHandle const$2 = constants$953.const$0.varHandle(MemoryLayout.PathElement.groupElement("subdivisionLevel"));
    static final VarHandle const$3 = constants$953.const$0.varHandle(MemoryLayout.PathElement.groupElement("format"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PFN_vkCreateMicromapEXT.class, "apply", constants$143.const$2);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_vkDestroyMicromapEXT.class, "apply", constants$142.const$0);
}


