// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$67 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$67() {}
    static final VarHandle const$0 = constants$66.const$5.varHandle(MemoryLayout.PathElement.groupElement("imageMipTailFirstLod"));
    static final VarHandle const$1 = constants$66.const$5.varHandle(MemoryLayout.PathElement.groupElement("imageMipTailSize"));
    static final VarHandle const$2 = constants$66.const$5.varHandle(MemoryLayout.PathElement.groupElement("imageMipTailOffset"));
    static final VarHandle const$3 = constants$66.const$5.varHandle(MemoryLayout.PathElement.groupElement("imageMipTailStride"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkFenceCreateInfo");
    static final VarHandle const$5 = constants$67.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


