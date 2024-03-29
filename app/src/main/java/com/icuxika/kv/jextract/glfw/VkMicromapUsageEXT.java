// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkMicromapUsageEXT {
 *     uint32_t count;
 *     uint32_t subdivisionLevel;
 *     uint32_t format;
 * };
 * }
 */
public class VkMicromapUsageEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$940.const$4;
    }
    public static VarHandle count$VH() {
        return constants$940.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t count;
     * }
     */
    public static int count$get(MemorySegment seg) {
        return (int)constants$940.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t count;
     * }
     */
    public static void count$set(MemorySegment seg, int x) {
        constants$940.const$5.set(seg, x);
    }
    public static int count$get(MemorySegment seg, long index) {
        return (int)constants$940.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void count$set(MemorySegment seg, long index, int x) {
        constants$940.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subdivisionLevel$VH() {
        return constants$941.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t subdivisionLevel;
     * }
     */
    public static int subdivisionLevel$get(MemorySegment seg) {
        return (int)constants$941.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t subdivisionLevel;
     * }
     */
    public static void subdivisionLevel$set(MemorySegment seg, int x) {
        constants$941.const$0.set(seg, x);
    }
    public static int subdivisionLevel$get(MemorySegment seg, long index) {
        return (int)constants$941.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void subdivisionLevel$set(MemorySegment seg, long index, int x) {
        constants$941.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$941.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$941.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$941.const$1.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$941.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$941.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


