// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoH265SpsVuiFlags {
 *      *     uint32_t aspect_ratio_info_present_flag;
 *     uint32_t overscan_info_present_flag;
 *     uint32_t overscan_appropriate_flag;
 *     uint32_t video_signal_type_present_flag;
 *     uint32_t video_full_range_flag;
 *     uint32_t colour_description_present_flag;
 *     uint32_t chroma_loc_info_present_flag;
 *     uint32_t neutral_chroma_indication_flag;
 *     uint32_t field_seq_flag;
 *     uint32_t frame_field_info_present_flag;
 *     uint32_t default_display_window_flag;
 *     uint32_t vui_timing_info_present_flag;
 *     uint32_t vui_poc_proportional_to_timing_flag;
 *     uint32_t vui_hrd_parameters_present_flag;
 *     uint32_t bitstream_restriction_flag;
 *     uint32_t tiles_fixed_structure_flag;
 *     uint32_t motion_vectors_over_pic_boundaries_flag;
 *     uint32_t restricted_ref_pic_lists_flag;
 * };
 * }
 */
public class StdVideoH265SpsVuiFlags {

    public static MemoryLayout $LAYOUT() {
        return constants$544.const$4;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

