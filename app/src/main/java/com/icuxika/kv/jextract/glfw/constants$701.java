// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$701 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$701() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withName("drmFormatModifier"),
        JAVA_INT.withName("drmFormatModifierPlaneCount"),
        JAVA_INT.withName("drmFormatModifierTilingFeatures")
    ).withName("VkDrmFormatModifierPropertiesEXT");
    static final VarHandle const$1 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("drmFormatModifier"));
    static final VarHandle const$2 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("drmFormatModifierPlaneCount"));
    static final VarHandle const$3 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("drmFormatModifierTilingFeatures"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("drmFormatModifierCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pDrmFormatModifierProperties")
    ).withName("VkDrmFormatModifierPropertiesListEXT");
    static final VarHandle const$5 = constants$701.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


