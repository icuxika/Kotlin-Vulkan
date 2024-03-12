// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoH264PictureParameterSet {
 *     StdVideoH264PpsFlags flags;
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint8_t num_ref_idx_l0_default_active_minus1;
 *     uint8_t num_ref_idx_l1_default_active_minus1;
 *     StdVideoH264WeightedBipredIdc weighted_bipred_idc;
 *     int8_t pic_init_qp_minus26;
 *     int8_t pic_init_qs_minus26;
 *     int8_t chroma_qp_index_offset;
 *     int8_t second_chroma_qp_index_offset;
 *     const StdVideoH264ScalingLists* pScalingLists;
 * };
 * }
 */
public class StdVideoH264PictureParameterSet {

    public static MemoryLayout $LAYOUT() {
        return constants$486.const$3;
    }
    public static MemorySegment flags$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle seq_parameter_set_id$VH() {
        return constants$486.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t seq_parameter_set_id;
     * }
     */
    public static byte seq_parameter_set_id$get(MemorySegment seg) {
        return (byte)constants$486.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t seq_parameter_set_id;
     * }
     */
    public static void seq_parameter_set_id$set(MemorySegment seg, byte x) {
        constants$486.const$4.set(seg, x);
    }
    public static byte seq_parameter_set_id$get(MemorySegment seg, long index) {
        return (byte)constants$486.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void seq_parameter_set_id$set(MemorySegment seg, long index, byte x) {
        constants$486.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pic_parameter_set_id$VH() {
        return constants$486.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t pic_parameter_set_id;
     * }
     */
    public static byte pic_parameter_set_id$get(MemorySegment seg) {
        return (byte)constants$486.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t pic_parameter_set_id;
     * }
     */
    public static void pic_parameter_set_id$set(MemorySegment seg, byte x) {
        constants$486.const$5.set(seg, x);
    }
    public static byte pic_parameter_set_id$get(MemorySegment seg, long index) {
        return (byte)constants$486.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pic_parameter_set_id$set(MemorySegment seg, long index, byte x) {
        constants$486.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_ref_idx_l0_default_active_minus1$VH() {
        return constants$487.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t num_ref_idx_l0_default_active_minus1;
     * }
     */
    public static byte num_ref_idx_l0_default_active_minus1$get(MemorySegment seg) {
        return (byte)constants$487.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t num_ref_idx_l0_default_active_minus1;
     * }
     */
    public static void num_ref_idx_l0_default_active_minus1$set(MemorySegment seg, byte x) {
        constants$487.const$0.set(seg, x);
    }
    public static byte num_ref_idx_l0_default_active_minus1$get(MemorySegment seg, long index) {
        return (byte)constants$487.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void num_ref_idx_l0_default_active_minus1$set(MemorySegment seg, long index, byte x) {
        constants$487.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_ref_idx_l1_default_active_minus1$VH() {
        return constants$487.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t num_ref_idx_l1_default_active_minus1;
     * }
     */
    public static byte num_ref_idx_l1_default_active_minus1$get(MemorySegment seg) {
        return (byte)constants$487.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t num_ref_idx_l1_default_active_minus1;
     * }
     */
    public static void num_ref_idx_l1_default_active_minus1$set(MemorySegment seg, byte x) {
        constants$487.const$1.set(seg, x);
    }
    public static byte num_ref_idx_l1_default_active_minus1$get(MemorySegment seg, long index) {
        return (byte)constants$487.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void num_ref_idx_l1_default_active_minus1$set(MemorySegment seg, long index, byte x) {
        constants$487.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle weighted_bipred_idc$VH() {
        return constants$487.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * StdVideoH264WeightedBipredIdc weighted_bipred_idc;
     * }
     */
    public static int weighted_bipred_idc$get(MemorySegment seg) {
        return (int)constants$487.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * StdVideoH264WeightedBipredIdc weighted_bipred_idc;
     * }
     */
    public static void weighted_bipred_idc$set(MemorySegment seg, int x) {
        constants$487.const$2.set(seg, x);
    }
    public static int weighted_bipred_idc$get(MemorySegment seg, long index) {
        return (int)constants$487.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void weighted_bipred_idc$set(MemorySegment seg, long index, int x) {
        constants$487.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pic_init_qp_minus26$VH() {
        return constants$487.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int8_t pic_init_qp_minus26;
     * }
     */
    public static byte pic_init_qp_minus26$get(MemorySegment seg) {
        return (byte)constants$487.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int8_t pic_init_qp_minus26;
     * }
     */
    public static void pic_init_qp_minus26$set(MemorySegment seg, byte x) {
        constants$487.const$3.set(seg, x);
    }
    public static byte pic_init_qp_minus26$get(MemorySegment seg, long index) {
        return (byte)constants$487.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pic_init_qp_minus26$set(MemorySegment seg, long index, byte x) {
        constants$487.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pic_init_qs_minus26$VH() {
        return constants$487.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int8_t pic_init_qs_minus26;
     * }
     */
    public static byte pic_init_qs_minus26$get(MemorySegment seg) {
        return (byte)constants$487.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int8_t pic_init_qs_minus26;
     * }
     */
    public static void pic_init_qs_minus26$set(MemorySegment seg, byte x) {
        constants$487.const$4.set(seg, x);
    }
    public static byte pic_init_qs_minus26$get(MemorySegment seg, long index) {
        return (byte)constants$487.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pic_init_qs_minus26$set(MemorySegment seg, long index, byte x) {
        constants$487.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle chroma_qp_index_offset$VH() {
        return constants$487.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int8_t chroma_qp_index_offset;
     * }
     */
    public static byte chroma_qp_index_offset$get(MemorySegment seg) {
        return (byte)constants$487.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int8_t chroma_qp_index_offset;
     * }
     */
    public static void chroma_qp_index_offset$set(MemorySegment seg, byte x) {
        constants$487.const$5.set(seg, x);
    }
    public static byte chroma_qp_index_offset$get(MemorySegment seg, long index) {
        return (byte)constants$487.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void chroma_qp_index_offset$set(MemorySegment seg, long index, byte x) {
        constants$487.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle second_chroma_qp_index_offset$VH() {
        return constants$488.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int8_t second_chroma_qp_index_offset;
     * }
     */
    public static byte second_chroma_qp_index_offset$get(MemorySegment seg) {
        return (byte)constants$488.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int8_t second_chroma_qp_index_offset;
     * }
     */
    public static void second_chroma_qp_index_offset$set(MemorySegment seg, byte x) {
        constants$488.const$0.set(seg, x);
    }
    public static byte second_chroma_qp_index_offset$get(MemorySegment seg, long index) {
        return (byte)constants$488.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void second_chroma_qp_index_offset$set(MemorySegment seg, long index, byte x) {
        constants$488.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pScalingLists$VH() {
        return constants$488.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const StdVideoH264ScalingLists* pScalingLists;
     * }
     */
    public static MemorySegment pScalingLists$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$488.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const StdVideoH264ScalingLists* pScalingLists;
     * }
     */
    public static void pScalingLists$set(MemorySegment seg, MemorySegment x) {
        constants$488.const$1.set(seg, x);
    }
    public static MemorySegment pScalingLists$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$488.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pScalingLists$set(MemorySegment seg, long index, MemorySegment x) {
        constants$488.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

