// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$991 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$991() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("advancedBlendOp"),
        JAVA_INT.withName("srcPremultiplied"),
        JAVA_INT.withName("dstPremultiplied"),
        JAVA_INT.withName("blendOverlap"),
        JAVA_INT.withName("clampResults")
    ).withName("VkColorBlendAdvancedEXT");
    static final VarHandle const$1 = constants$991.const$0.varHandle(MemoryLayout.PathElement.groupElement("advancedBlendOp"));
    static final VarHandle const$2 = constants$991.const$0.varHandle(MemoryLayout.PathElement.groupElement("srcPremultiplied"));
    static final VarHandle const$3 = constants$991.const$0.varHandle(MemoryLayout.PathElement.groupElement("dstPremultiplied"));
    static final VarHandle const$4 = constants$991.const$0.varHandle(MemoryLayout.PathElement.groupElement("blendOverlap"));
    static final VarHandle const$5 = constants$991.const$0.varHandle(MemoryLayout.PathElement.groupElement("clampResults"));
}

