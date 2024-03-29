// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoDecodeH264PictureInfo {
 *     StdVideoDecodeH264PictureInfoFlags flags;
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint8_t reserved1;
 *     uint8_t reserved2;
 *     uint16_t frame_num;
 *     uint16_t idr_pic_id;
 *     int32_t PicOrderCnt[2];
 * };
 * }
 */
public class StdVideoDecodeH264PictureInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$488.const$3;
    }
    public static MemorySegment flags$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle seq_parameter_set_id$VH() {
        return constants$488.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t seq_parameter_set_id;
     * }
     */
    public static byte seq_parameter_set_id$get(MemorySegment seg) {
        return (byte)constants$488.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t seq_parameter_set_id;
     * }
     */
    public static void seq_parameter_set_id$set(MemorySegment seg, byte x) {
        constants$488.const$4.set(seg, x);
    }
    public static byte seq_parameter_set_id$get(MemorySegment seg, long index) {
        return (byte)constants$488.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void seq_parameter_set_id$set(MemorySegment seg, long index, byte x) {
        constants$488.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pic_parameter_set_id$VH() {
        return constants$488.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t pic_parameter_set_id;
     * }
     */
    public static byte pic_parameter_set_id$get(MemorySegment seg) {
        return (byte)constants$488.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t pic_parameter_set_id;
     * }
     */
    public static void pic_parameter_set_id$set(MemorySegment seg, byte x) {
        constants$488.const$5.set(seg, x);
    }
    public static byte pic_parameter_set_id$get(MemorySegment seg, long index) {
        return (byte)constants$488.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pic_parameter_set_id$set(MemorySegment seg, long index, byte x) {
        constants$488.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved1$VH() {
        return constants$489.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t reserved1;
     * }
     */
    public static byte reserved1$get(MemorySegment seg) {
        return (byte)constants$489.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t reserved1;
     * }
     */
    public static void reserved1$set(MemorySegment seg, byte x) {
        constants$489.const$0.set(seg, x);
    }
    public static byte reserved1$get(MemorySegment seg, long index) {
        return (byte)constants$489.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, byte x) {
        constants$489.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved2$VH() {
        return constants$489.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t reserved2;
     * }
     */
    public static byte reserved2$get(MemorySegment seg) {
        return (byte)constants$489.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t reserved2;
     * }
     */
    public static void reserved2$set(MemorySegment seg, byte x) {
        constants$489.const$1.set(seg, x);
    }
    public static byte reserved2$get(MemorySegment seg, long index) {
        return (byte)constants$489.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, byte x) {
        constants$489.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle frame_num$VH() {
        return constants$489.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t frame_num;
     * }
     */
    public static short frame_num$get(MemorySegment seg) {
        return (short)constants$489.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t frame_num;
     * }
     */
    public static void frame_num$set(MemorySegment seg, short x) {
        constants$489.const$2.set(seg, x);
    }
    public static short frame_num$get(MemorySegment seg, long index) {
        return (short)constants$489.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void frame_num$set(MemorySegment seg, long index, short x) {
        constants$489.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle idr_pic_id$VH() {
        return constants$489.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t idr_pic_id;
     * }
     */
    public static short idr_pic_id$get(MemorySegment seg) {
        return (short)constants$489.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t idr_pic_id;
     * }
     */
    public static void idr_pic_id$set(MemorySegment seg, short x) {
        constants$489.const$3.set(seg, x);
    }
    public static short idr_pic_id$get(MemorySegment seg, long index) {
        return (short)constants$489.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void idr_pic_id$set(MemorySegment seg, long index, short x) {
        constants$489.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PicOrderCnt$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


