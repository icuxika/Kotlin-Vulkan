// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$570 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$570() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        RuntimeHelper.POINTER.withName("pStdPictureInfo"),
        JAVA_INT.withName("sliceSegmentCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pSliceSegmentOffsets")
    ).withName("VkVideoDecodeH265PictureInfoKHR");
    static final VarHandle const$1 = constants$570.const$0.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$2 = constants$570.const$0.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final VarHandle const$3 = constants$570.const$0.varHandle(MemoryLayout.PathElement.groupElement("pStdPictureInfo"));
    static final VarHandle const$4 = constants$570.const$0.varHandle(MemoryLayout.PathElement.groupElement("sliceSegmentCount"));
    static final VarHandle const$5 = constants$570.const$0.varHandle(MemoryLayout.PathElement.groupElement("pSliceSegmentOffsets"));
}


