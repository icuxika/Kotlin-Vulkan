// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$489 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$489() {}
    static final VarHandle const$0 = constants$488.const$3.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    static final VarHandle const$1 = constants$488.const$3.varHandle(MemoryLayout.PathElement.groupElement("reserved2"));
    static final VarHandle const$2 = constants$488.const$3.varHandle(MemoryLayout.PathElement.groupElement("frame_num"));
    static final VarHandle const$3 = constants$488.const$3.varHandle(MemoryLayout.PathElement.groupElement("idr_pic_id"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(4)
    ).withName("StdVideoDecodeH264ReferenceInfoFlags");
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("flags"),
        JAVA_SHORT.withName("FrameNum"),
        JAVA_SHORT.withName("reserved"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("PicOrderCnt")
    ).withName("StdVideoDecodeH264ReferenceInfo");
}


