// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$544 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$544() {}
    static final VarHandle const$0 = constants$542.const$3.varHandle(MemoryLayout.PathElement.groupElement("pDecPicBufMgr"));
    static final VarHandle const$1 = constants$542.const$3.varHandle(MemoryLayout.PathElement.groupElement("pHrdParameters"));
    static final VarHandle const$2 = constants$542.const$3.varHandle(MemoryLayout.PathElement.groupElement("pProfileTierLevel"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(16, JAVA_BYTE)).withName("ScalingList4x4"),
        MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList8x8"),
        MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList16x16"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList32x32"),
        MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("ScalingListDCCoef16x16"),
        MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("ScalingListDCCoef32x32")
    ).withName("StdVideoH265ScalingLists");
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(4)
    ).withName("StdVideoH265SpsVuiFlags");
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
        JAVA_BYTE.withName("matrix_coeffs"),
        JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        JAVA_BYTE.withName("reserved1"),
        JAVA_BYTE.withName("reserved2"),
        JAVA_SHORT.withName("def_disp_win_left_offset"),
        JAVA_SHORT.withName("def_disp_win_right_offset"),
        JAVA_SHORT.withName("def_disp_win_top_offset"),
        JAVA_SHORT.withName("def_disp_win_bottom_offset"),
        JAVA_INT.withName("vui_num_units_in_tick"),
        JAVA_INT.withName("vui_time_scale"),
        JAVA_INT.withName("vui_num_ticks_poc_diff_one_minus1"),
        JAVA_SHORT.withName("min_spatial_segmentation_idc"),
        JAVA_SHORT.withName("reserved3"),
        JAVA_BYTE.withName("max_bytes_per_pic_denom"),
        JAVA_BYTE.withName("max_bits_per_min_cu_denom"),
        JAVA_BYTE.withName("log2_max_mv_length_horizontal"),
        JAVA_BYTE.withName("log2_max_mv_length_vertical"),
        RuntimeHelper.POINTER.withName("pHrdParameters")
    ).withName("StdVideoH265SequenceParameterSetVui");
}


