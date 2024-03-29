// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkOffset3D {
 *     int32_t x;
 *     int32_t y;
 *     int32_t z;
 * };
 * }
 */
public class VkOffset3D {

    public static MemoryLayout $LAYOUT() {
        return constants$3.const$1;
    }
    public static VarHandle x$VH() {
        return constants$3.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$3.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$3.const$2.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$3.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$3.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$3.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$3.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$3.const$3.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$3.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$3.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle z$VH() {
        return constants$3.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t z;
     * }
     */
    public static int z$get(MemorySegment seg) {
        return (int)constants$3.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t z;
     * }
     */
    public static void z$set(MemorySegment seg, int x) {
        constants$3.const$4.set(seg, x);
    }
    public static int z$get(MemorySegment seg, long index) {
        return (int)constants$3.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void z$set(MemorySegment seg, long index, int x) {
        constants$3.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


