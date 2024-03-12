// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkImageSubresource {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t mipLevel;
 *     uint32_t arrayLayer;
 * };
 * }
 */
public class VkImageSubresource {

    public static MemoryLayout $LAYOUT() {
        return constants$62.const$1;
    }
    public static VarHandle aspectMask$VH() {
        return constants$62.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageAspectFlags aspectMask;
     * }
     */
    public static int aspectMask$get(MemorySegment seg) {
        return (int)constants$62.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageAspectFlags aspectMask;
     * }
     */
    public static void aspectMask$set(MemorySegment seg, int x) {
        constants$62.const$2.set(seg, x);
    }
    public static int aspectMask$get(MemorySegment seg, long index) {
        return (int)constants$62.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void aspectMask$set(MemorySegment seg, long index, int x) {
        constants$62.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mipLevel$VH() {
        return constants$62.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t mipLevel;
     * }
     */
    public static int mipLevel$get(MemorySegment seg) {
        return (int)constants$62.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t mipLevel;
     * }
     */
    public static void mipLevel$set(MemorySegment seg, int x) {
        constants$62.const$3.set(seg, x);
    }
    public static int mipLevel$get(MemorySegment seg, long index) {
        return (int)constants$62.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void mipLevel$set(MemorySegment seg, long index, int x) {
        constants$62.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle arrayLayer$VH() {
        return constants$62.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t arrayLayer;
     * }
     */
    public static int arrayLayer$get(MemorySegment seg) {
        return (int)constants$62.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t arrayLayer;
     * }
     */
    public static void arrayLayer$set(MemorySegment seg, int x) {
        constants$62.const$4.set(seg, x);
    }
    public static int arrayLayer$get(MemorySegment seg, long index) {
        return (int)constants$62.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void arrayLayer$set(MemorySegment seg, long index, int x) {
        constants$62.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

