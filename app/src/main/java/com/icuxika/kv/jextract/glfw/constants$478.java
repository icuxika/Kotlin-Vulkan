// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$478 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$478() {}
    static final VarHandle const$0 = constants$477.const$2.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    static final VarHandle const$1 = constants$477.const$2.varHandle(MemoryLayout.PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
    static final VarHandle const$2 = constants$477.const$2.varHandle(MemoryLayout.PathElement.groupElement("cpb_removal_delay_length_minus1"));
    static final VarHandle const$3 = constants$477.const$2.varHandle(MemoryLayout.PathElement.groupElement("dpb_output_delay_length_minus1"));
    static final VarHandle const$4 = constants$477.const$2.varHandle(MemoryLayout.PathElement.groupElement("time_offset_length"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("flags"),
        JAVA_INT.withName("aspect_ratio_idc"),
        JAVA_SHORT.withName("sar_width"),
        JAVA_SHORT.withName("sar_height"),
        JAVA_BYTE.withName("video_format"),
        JAVA_BYTE.withName("colour_primaries"),
        JAVA_BYTE.withName("transfer_characteristics"),
        JAVA_BYTE.withName("matrix_coefficients"),
        JAVA_INT.withName("num_units_in_tick"),
        JAVA_INT.withName("time_scale"),
        JAVA_BYTE.withName("max_num_reorder_frames"),
        JAVA_BYTE.withName("max_dec_frame_buffering"),
        JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        JAVA_INT.withName("reserved1"),
        RuntimeHelper.POINTER.withName("pHrdParameters")
    ).withName("StdVideoH264SequenceParameterSetVui");
}

