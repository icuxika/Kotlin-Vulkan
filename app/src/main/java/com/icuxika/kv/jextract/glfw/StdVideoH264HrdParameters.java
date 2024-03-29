// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoH264HrdParameters {
 *     uint8_t cpb_cnt_minus1;
 *     uint8_t bit_rate_scale;
 *     uint8_t cpb_size_scale;
 *     uint8_t reserved1;
 *     uint32_t bit_rate_value_minus1[32];
 *     uint32_t cpb_size_value_minus1[32];
 *     uint8_t cbr_flag[32];
 *     uint32_t initial_cpb_removal_delay_length_minus1;
 *     uint32_t cpb_removal_delay_length_minus1;
 *     uint32_t dpb_output_delay_length_minus1;
 *     uint32_t time_offset_length;
 * };
 * }
 */
public class StdVideoH264HrdParameters {

    public static MemoryLayout $LAYOUT() {
        return constants$477.const$2;
    }
    public static VarHandle cpb_cnt_minus1$VH() {
        return constants$477.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t cpb_cnt_minus1;
     * }
     */
    public static byte cpb_cnt_minus1$get(MemorySegment seg) {
        return (byte)constants$477.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t cpb_cnt_minus1;
     * }
     */
    public static void cpb_cnt_minus1$set(MemorySegment seg, byte x) {
        constants$477.const$3.set(seg, x);
    }
    public static byte cpb_cnt_minus1$get(MemorySegment seg, long index) {
        return (byte)constants$477.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cpb_cnt_minus1$set(MemorySegment seg, long index, byte x) {
        constants$477.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bit_rate_scale$VH() {
        return constants$477.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t bit_rate_scale;
     * }
     */
    public static byte bit_rate_scale$get(MemorySegment seg) {
        return (byte)constants$477.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t bit_rate_scale;
     * }
     */
    public static void bit_rate_scale$set(MemorySegment seg, byte x) {
        constants$477.const$4.set(seg, x);
    }
    public static byte bit_rate_scale$get(MemorySegment seg, long index) {
        return (byte)constants$477.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bit_rate_scale$set(MemorySegment seg, long index, byte x) {
        constants$477.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cpb_size_scale$VH() {
        return constants$477.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t cpb_size_scale;
     * }
     */
    public static byte cpb_size_scale$get(MemorySegment seg) {
        return (byte)constants$477.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t cpb_size_scale;
     * }
     */
    public static void cpb_size_scale$set(MemorySegment seg, byte x) {
        constants$477.const$5.set(seg, x);
    }
    public static byte cpb_size_scale$get(MemorySegment seg, long index) {
        return (byte)constants$477.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cpb_size_scale$set(MemorySegment seg, long index, byte x) {
        constants$477.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved1$VH() {
        return constants$478.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t reserved1;
     * }
     */
    public static byte reserved1$get(MemorySegment seg) {
        return (byte)constants$478.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t reserved1;
     * }
     */
    public static void reserved1$set(MemorySegment seg, byte x) {
        constants$478.const$0.set(seg, x);
    }
    public static byte reserved1$get(MemorySegment seg, long index) {
        return (byte)constants$478.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, byte x) {
        constants$478.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bit_rate_value_minus1$slice(MemorySegment seg) {
        return seg.asSlice(4, 128);
    }
    public static MemorySegment cpb_size_value_minus1$slice(MemorySegment seg) {
        return seg.asSlice(132, 128);
    }
    public static MemorySegment cbr_flag$slice(MemorySegment seg) {
        return seg.asSlice(260, 32);
    }
    public static VarHandle initial_cpb_removal_delay_length_minus1$VH() {
        return constants$478.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t initial_cpb_removal_delay_length_minus1;
     * }
     */
    public static int initial_cpb_removal_delay_length_minus1$get(MemorySegment seg) {
        return (int)constants$478.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t initial_cpb_removal_delay_length_minus1;
     * }
     */
    public static void initial_cpb_removal_delay_length_minus1$set(MemorySegment seg, int x) {
        constants$478.const$1.set(seg, x);
    }
    public static int initial_cpb_removal_delay_length_minus1$get(MemorySegment seg, long index) {
        return (int)constants$478.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void initial_cpb_removal_delay_length_minus1$set(MemorySegment seg, long index, int x) {
        constants$478.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cpb_removal_delay_length_minus1$VH() {
        return constants$478.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t cpb_removal_delay_length_minus1;
     * }
     */
    public static int cpb_removal_delay_length_minus1$get(MemorySegment seg) {
        return (int)constants$478.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t cpb_removal_delay_length_minus1;
     * }
     */
    public static void cpb_removal_delay_length_minus1$set(MemorySegment seg, int x) {
        constants$478.const$2.set(seg, x);
    }
    public static int cpb_removal_delay_length_minus1$get(MemorySegment seg, long index) {
        return (int)constants$478.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cpb_removal_delay_length_minus1$set(MemorySegment seg, long index, int x) {
        constants$478.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dpb_output_delay_length_minus1$VH() {
        return constants$478.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t dpb_output_delay_length_minus1;
     * }
     */
    public static int dpb_output_delay_length_minus1$get(MemorySegment seg) {
        return (int)constants$478.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t dpb_output_delay_length_minus1;
     * }
     */
    public static void dpb_output_delay_length_minus1$set(MemorySegment seg, int x) {
        constants$478.const$3.set(seg, x);
    }
    public static int dpb_output_delay_length_minus1$get(MemorySegment seg, long index) {
        return (int)constants$478.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dpb_output_delay_length_minus1$set(MemorySegment seg, long index, int x) {
        constants$478.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time_offset_length$VH() {
        return constants$478.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t time_offset_length;
     * }
     */
    public static int time_offset_length$get(MemorySegment seg) {
        return (int)constants$478.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t time_offset_length;
     * }
     */
    public static void time_offset_length$set(MemorySegment seg, int x) {
        constants$478.const$4.set(seg, x);
    }
    public static int time_offset_length$get(MemorySegment seg, long index) {
        return (int)constants$478.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void time_offset_length$set(MemorySegment seg, long index, int x) {
        constants$478.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


