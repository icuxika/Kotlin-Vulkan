// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$463 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$463() {}
    static final VarHandle const$0 = constants$462.const$3.varHandle(MemoryLayout.PathElement.groupElement("memoryBindIndex"));
    static final VarHandle const$1 = constants$462.const$3.varHandle(MemoryLayout.PathElement.groupElement("memory"));
    static final VarHandle const$2 = constants$462.const$3.varHandle(MemoryLayout.PathElement.groupElement("memoryOffset"));
    static final VarHandle const$3 = constants$462.const$3.varHandle(MemoryLayout.PathElement.groupElement("memorySize"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("queueFamilyIndex"),
        JAVA_INT.withName("flags"),
        RuntimeHelper.POINTER.withName("pVideoProfile"),
        JAVA_INT.withName("pictureFormat"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height")
        ).withName("maxCodedExtent"),
        JAVA_INT.withName("referencePictureFormat"),
        JAVA_INT.withName("maxDpbSlots"),
        JAVA_INT.withName("maxActiveReferencePictures"),
        RuntimeHelper.POINTER.withName("pStdHeaderVersion")
    ).withName("VkVideoSessionCreateInfoKHR");
    static final VarHandle const$5 = constants$463.const$4.varHandle(MemoryLayout.PathElement.groupElement("sType"));
}


