// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkSparseImageFormatProperties {
 *     VkImageAspectFlags aspectMask;
 *     VkExtent3D imageGranularity;
 *     VkSparseImageFormatFlags flags;
 * };
 * }
 */
public class VkSparseImageFormatProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$66.const$2;
    }
    public static VarHandle aspectMask$VH() {
        return constants$66.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageAspectFlags aspectMask;
     * }
     */
    public static int aspectMask$get(MemorySegment seg) {
        return (int)constants$66.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageAspectFlags aspectMask;
     * }
     */
    public static void aspectMask$set(MemorySegment seg, int x) {
        constants$66.const$3.set(seg, x);
    }
    public static int aspectMask$get(MemorySegment seg, long index) {
        return (int)constants$66.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void aspectMask$set(MemorySegment seg, long index, int x) {
        constants$66.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment imageGranularity$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static VarHandle flags$VH() {
        return constants$66.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSparseImageFormatFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$66.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSparseImageFormatFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$66.const$4.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$66.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$66.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


