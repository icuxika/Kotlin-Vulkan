// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$228 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$228() {}
    static final VarHandle const$0 = constants$227.const$2.varHandle(MemoryLayout.PathElement.groupElement("pAspectReferences"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("usage"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkImageViewUsageCreateInfo");
    static final VarHandle const$2 = constants$228.const$1.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$3 = constants$228.const$1.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$4 = constants$228.const$1.varHandle(MemoryLayout.PathElement.groupElement("usage"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("domainOrigin"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPipelineTessellationDomainOriginStateCreateInfo");
}

