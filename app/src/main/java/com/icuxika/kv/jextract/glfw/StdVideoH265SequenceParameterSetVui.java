// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoH265SequenceParameterSetVui {
 *     StdVideoH265SpsVuiFlags flags;
 *     StdVideoH265AspectRatioIdc aspect_ratio_idc;
 *     uint16_t sar_width;
 *     uint16_t sar_height;
 *     uint8_t video_format;
 *     uint8_t colour_primaries;
 *     uint8_t transfer_characteristics;
 *     uint8_t matrix_coeffs;
 *     uint8_t chroma_sample_loc_type_top_field;
 *     uint8_t chroma_sample_loc_type_bottom_field;
 *     uint8_t reserved1;
 *     uint8_t reserved2;
 *     uint16_t def_disp_win_left_offset;
 *     uint16_t def_disp_win_right_offset;
 *     uint16_t def_disp_win_top_offset;
 *     uint16_t def_disp_win_bottom_offset;
 *     uint32_t vui_num_units_in_tick;
 *     uint32_t vui_time_scale;
 *     uint32_t vui_num_ticks_poc_diff_one_minus1;
 *     uint16_t min_spatial_segmentation_idc;
 *     uint16_t reserved3;
 *     uint8_t max_bytes_per_pic_denom;
 *     uint8_t max_bits_per_min_cu_denom;
 *     uint8_t log2_max_mv_length_horizontal;
 *     uint8_t log2_max_mv_length_vertical;
 *     const StdVideoH265HrdParameters* pHrdParameters;
 * };
 * }
 */
public class StdVideoH265SequenceParameterSetVui {

    public static MemoryLayout $LAYOUT() {
        return constants$544.const$5;
    }
    public static MemorySegment flags$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle aspect_ratio_idc$VH() {
        return constants$545.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * StdVideoH265AspectRatioIdc aspect_ratio_idc;
     * }
     */
    public static int aspect_ratio_idc$get(MemorySegment seg) {
        return (int)constants$545.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * StdVideoH265AspectRatioIdc aspect_ratio_idc;
     * }
     */
    public static void aspect_ratio_idc$set(MemorySegment seg, int x) {
        constants$545.const$0.set(seg, x);
    }
    public static int aspect_ratio_idc$get(MemorySegment seg, long index) {
        return (int)constants$545.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void aspect_ratio_idc$set(MemorySegment seg, long index, int x) {
        constants$545.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sar_width$VH() {
        return constants$545.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t sar_width;
     * }
     */
    public static short sar_width$get(MemorySegment seg) {
        return (short)constants$545.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t sar_width;
     * }
     */
    public static void sar_width$set(MemorySegment seg, short x) {
        constants$545.const$1.set(seg, x);
    }
    public static short sar_width$get(MemorySegment seg, long index) {
        return (short)constants$545.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sar_width$set(MemorySegment seg, long index, short x) {
        constants$545.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sar_height$VH() {
        return constants$545.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t sar_height;
     * }
     */
    public static short sar_height$get(MemorySegment seg) {
        return (short)constants$545.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t sar_height;
     * }
     */
    public static void sar_height$set(MemorySegment seg, short x) {
        constants$545.const$2.set(seg, x);
    }
    public static short sar_height$get(MemorySegment seg, long index) {
        return (short)constants$545.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sar_height$set(MemorySegment seg, long index, short x) {
        constants$545.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle video_format$VH() {
        return constants$545.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t video_format;
     * }
     */
    public static byte video_format$get(MemorySegment seg) {
        return (byte)constants$545.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t video_format;
     * }
     */
    public static void video_format$set(MemorySegment seg, byte x) {
        constants$545.const$3.set(seg, x);
    }
    public static byte video_format$get(MemorySegment seg, long index) {
        return (byte)constants$545.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void video_format$set(MemorySegment seg, long index, byte x) {
        constants$545.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle colour_primaries$VH() {
        return constants$545.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t colour_primaries;
     * }
     */
    public static byte colour_primaries$get(MemorySegment seg) {
        return (byte)constants$545.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t colour_primaries;
     * }
     */
    public static void colour_primaries$set(MemorySegment seg, byte x) {
        constants$545.const$4.set(seg, x);
    }
    public static byte colour_primaries$get(MemorySegment seg, long index) {
        return (byte)constants$545.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void colour_primaries$set(MemorySegment seg, long index, byte x) {
        constants$545.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle transfer_characteristics$VH() {
        return constants$545.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t transfer_characteristics;
     * }
     */
    public static byte transfer_characteristics$get(MemorySegment seg) {
        return (byte)constants$545.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t transfer_characteristics;
     * }
     */
    public static void transfer_characteristics$set(MemorySegment seg, byte x) {
        constants$545.const$5.set(seg, x);
    }
    public static byte transfer_characteristics$get(MemorySegment seg, long index) {
        return (byte)constants$545.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void transfer_characteristics$set(MemorySegment seg, long index, byte x) {
        constants$545.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle matrix_coeffs$VH() {
        return constants$546.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t matrix_coeffs;
     * }
     */
    public static byte matrix_coeffs$get(MemorySegment seg) {
        return (byte)constants$546.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t matrix_coeffs;
     * }
     */
    public static void matrix_coeffs$set(MemorySegment seg, byte x) {
        constants$546.const$0.set(seg, x);
    }
    public static byte matrix_coeffs$get(MemorySegment seg, long index) {
        return (byte)constants$546.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void matrix_coeffs$set(MemorySegment seg, long index, byte x) {
        constants$546.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle chroma_sample_loc_type_top_field$VH() {
        return constants$546.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t chroma_sample_loc_type_top_field;
     * }
     */
    public static byte chroma_sample_loc_type_top_field$get(MemorySegment seg) {
        return (byte)constants$546.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t chroma_sample_loc_type_top_field;
     * }
     */
    public static void chroma_sample_loc_type_top_field$set(MemorySegment seg, byte x) {
        constants$546.const$1.set(seg, x);
    }
    public static byte chroma_sample_loc_type_top_field$get(MemorySegment seg, long index) {
        return (byte)constants$546.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void chroma_sample_loc_type_top_field$set(MemorySegment seg, long index, byte x) {
        constants$546.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle chroma_sample_loc_type_bottom_field$VH() {
        return constants$546.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t chroma_sample_loc_type_bottom_field;
     * }
     */
    public static byte chroma_sample_loc_type_bottom_field$get(MemorySegment seg) {
        return (byte)constants$546.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t chroma_sample_loc_type_bottom_field;
     * }
     */
    public static void chroma_sample_loc_type_bottom_field$set(MemorySegment seg, byte x) {
        constants$546.const$2.set(seg, x);
    }
    public static byte chroma_sample_loc_type_bottom_field$get(MemorySegment seg, long index) {
        return (byte)constants$546.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void chroma_sample_loc_type_bottom_field$set(MemorySegment seg, long index, byte x) {
        constants$546.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved1$VH() {
        return constants$546.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t reserved1;
     * }
     */
    public static byte reserved1$get(MemorySegment seg) {
        return (byte)constants$546.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t reserved1;
     * }
     */
    public static void reserved1$set(MemorySegment seg, byte x) {
        constants$546.const$3.set(seg, x);
    }
    public static byte reserved1$get(MemorySegment seg, long index) {
        return (byte)constants$546.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, byte x) {
        constants$546.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved2$VH() {
        return constants$546.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t reserved2;
     * }
     */
    public static byte reserved2$get(MemorySegment seg) {
        return (byte)constants$546.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t reserved2;
     * }
     */
    public static void reserved2$set(MemorySegment seg, byte x) {
        constants$546.const$4.set(seg, x);
    }
    public static byte reserved2$get(MemorySegment seg, long index) {
        return (byte)constants$546.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, byte x) {
        constants$546.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle def_disp_win_left_offset$VH() {
        return constants$546.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t def_disp_win_left_offset;
     * }
     */
    public static short def_disp_win_left_offset$get(MemorySegment seg) {
        return (short)constants$546.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t def_disp_win_left_offset;
     * }
     */
    public static void def_disp_win_left_offset$set(MemorySegment seg, short x) {
        constants$546.const$5.set(seg, x);
    }
    public static short def_disp_win_left_offset$get(MemorySegment seg, long index) {
        return (short)constants$546.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void def_disp_win_left_offset$set(MemorySegment seg, long index, short x) {
        constants$546.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle def_disp_win_right_offset$VH() {
        return constants$547.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t def_disp_win_right_offset;
     * }
     */
    public static short def_disp_win_right_offset$get(MemorySegment seg) {
        return (short)constants$547.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t def_disp_win_right_offset;
     * }
     */
    public static void def_disp_win_right_offset$set(MemorySegment seg, short x) {
        constants$547.const$0.set(seg, x);
    }
    public static short def_disp_win_right_offset$get(MemorySegment seg, long index) {
        return (short)constants$547.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void def_disp_win_right_offset$set(MemorySegment seg, long index, short x) {
        constants$547.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle def_disp_win_top_offset$VH() {
        return constants$547.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t def_disp_win_top_offset;
     * }
     */
    public static short def_disp_win_top_offset$get(MemorySegment seg) {
        return (short)constants$547.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t def_disp_win_top_offset;
     * }
     */
    public static void def_disp_win_top_offset$set(MemorySegment seg, short x) {
        constants$547.const$1.set(seg, x);
    }
    public static short def_disp_win_top_offset$get(MemorySegment seg, long index) {
        return (short)constants$547.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void def_disp_win_top_offset$set(MemorySegment seg, long index, short x) {
        constants$547.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle def_disp_win_bottom_offset$VH() {
        return constants$547.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t def_disp_win_bottom_offset;
     * }
     */
    public static short def_disp_win_bottom_offset$get(MemorySegment seg) {
        return (short)constants$547.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t def_disp_win_bottom_offset;
     * }
     */
    public static void def_disp_win_bottom_offset$set(MemorySegment seg, short x) {
        constants$547.const$2.set(seg, x);
    }
    public static short def_disp_win_bottom_offset$get(MemorySegment seg, long index) {
        return (short)constants$547.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void def_disp_win_bottom_offset$set(MemorySegment seg, long index, short x) {
        constants$547.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vui_num_units_in_tick$VH() {
        return constants$547.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t vui_num_units_in_tick;
     * }
     */
    public static int vui_num_units_in_tick$get(MemorySegment seg) {
        return (int)constants$547.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t vui_num_units_in_tick;
     * }
     */
    public static void vui_num_units_in_tick$set(MemorySegment seg, int x) {
        constants$547.const$3.set(seg, x);
    }
    public static int vui_num_units_in_tick$get(MemorySegment seg, long index) {
        return (int)constants$547.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void vui_num_units_in_tick$set(MemorySegment seg, long index, int x) {
        constants$547.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vui_time_scale$VH() {
        return constants$547.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t vui_time_scale;
     * }
     */
    public static int vui_time_scale$get(MemorySegment seg) {
        return (int)constants$547.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t vui_time_scale;
     * }
     */
    public static void vui_time_scale$set(MemorySegment seg, int x) {
        constants$547.const$4.set(seg, x);
    }
    public static int vui_time_scale$get(MemorySegment seg, long index) {
        return (int)constants$547.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void vui_time_scale$set(MemorySegment seg, long index, int x) {
        constants$547.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vui_num_ticks_poc_diff_one_minus1$VH() {
        return constants$547.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t vui_num_ticks_poc_diff_one_minus1;
     * }
     */
    public static int vui_num_ticks_poc_diff_one_minus1$get(MemorySegment seg) {
        return (int)constants$547.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t vui_num_ticks_poc_diff_one_minus1;
     * }
     */
    public static void vui_num_ticks_poc_diff_one_minus1$set(MemorySegment seg, int x) {
        constants$547.const$5.set(seg, x);
    }
    public static int vui_num_ticks_poc_diff_one_minus1$get(MemorySegment seg, long index) {
        return (int)constants$547.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void vui_num_ticks_poc_diff_one_minus1$set(MemorySegment seg, long index, int x) {
        constants$547.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_spatial_segmentation_idc$VH() {
        return constants$548.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t min_spatial_segmentation_idc;
     * }
     */
    public static short min_spatial_segmentation_idc$get(MemorySegment seg) {
        return (short)constants$548.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t min_spatial_segmentation_idc;
     * }
     */
    public static void min_spatial_segmentation_idc$set(MemorySegment seg, short x) {
        constants$548.const$0.set(seg, x);
    }
    public static short min_spatial_segmentation_idc$get(MemorySegment seg, long index) {
        return (short)constants$548.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void min_spatial_segmentation_idc$set(MemorySegment seg, long index, short x) {
        constants$548.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved3$VH() {
        return constants$548.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t reserved3;
     * }
     */
    public static short reserved3$get(MemorySegment seg) {
        return (short)constants$548.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t reserved3;
     * }
     */
    public static void reserved3$set(MemorySegment seg, short x) {
        constants$548.const$1.set(seg, x);
    }
    public static short reserved3$get(MemorySegment seg, long index) {
        return (short)constants$548.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved3$set(MemorySegment seg, long index, short x) {
        constants$548.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_bytes_per_pic_denom$VH() {
        return constants$548.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t max_bytes_per_pic_denom;
     * }
     */
    public static byte max_bytes_per_pic_denom$get(MemorySegment seg) {
        return (byte)constants$548.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t max_bytes_per_pic_denom;
     * }
     */
    public static void max_bytes_per_pic_denom$set(MemorySegment seg, byte x) {
        constants$548.const$2.set(seg, x);
    }
    public static byte max_bytes_per_pic_denom$get(MemorySegment seg, long index) {
        return (byte)constants$548.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void max_bytes_per_pic_denom$set(MemorySegment seg, long index, byte x) {
        constants$548.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_bits_per_min_cu_denom$VH() {
        return constants$548.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t max_bits_per_min_cu_denom;
     * }
     */
    public static byte max_bits_per_min_cu_denom$get(MemorySegment seg) {
        return (byte)constants$548.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t max_bits_per_min_cu_denom;
     * }
     */
    public static void max_bits_per_min_cu_denom$set(MemorySegment seg, byte x) {
        constants$548.const$3.set(seg, x);
    }
    public static byte max_bits_per_min_cu_denom$get(MemorySegment seg, long index) {
        return (byte)constants$548.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void max_bits_per_min_cu_denom$set(MemorySegment seg, long index, byte x) {
        constants$548.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle log2_max_mv_length_horizontal$VH() {
        return constants$548.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t log2_max_mv_length_horizontal;
     * }
     */
    public static byte log2_max_mv_length_horizontal$get(MemorySegment seg) {
        return (byte)constants$548.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t log2_max_mv_length_horizontal;
     * }
     */
    public static void log2_max_mv_length_horizontal$set(MemorySegment seg, byte x) {
        constants$548.const$4.set(seg, x);
    }
    public static byte log2_max_mv_length_horizontal$get(MemorySegment seg, long index) {
        return (byte)constants$548.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void log2_max_mv_length_horizontal$set(MemorySegment seg, long index, byte x) {
        constants$548.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle log2_max_mv_length_vertical$VH() {
        return constants$548.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t log2_max_mv_length_vertical;
     * }
     */
    public static byte log2_max_mv_length_vertical$get(MemorySegment seg) {
        return (byte)constants$548.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t log2_max_mv_length_vertical;
     * }
     */
    public static void log2_max_mv_length_vertical$set(MemorySegment seg, byte x) {
        constants$548.const$5.set(seg, x);
    }
    public static byte log2_max_mv_length_vertical$get(MemorySegment seg, long index) {
        return (byte)constants$548.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void log2_max_mv_length_vertical$set(MemorySegment seg, long index, byte x) {
        constants$548.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pHrdParameters$VH() {
        return constants$549.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const StdVideoH265HrdParameters* pHrdParameters;
     * }
     */
    public static MemorySegment pHrdParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$549.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const StdVideoH265HrdParameters* pHrdParameters;
     * }
     */
    public static void pHrdParameters$set(MemorySegment seg, MemorySegment x) {
        constants$549.const$0.set(seg, x);
    }
    public static MemorySegment pHrdParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$549.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pHrdParameters$set(MemorySegment seg, long index, MemorySegment x) {
        constants$549.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

