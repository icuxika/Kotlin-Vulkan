// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkVideoPictureResourceInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkOffset2D codedOffset;
 *     VkExtent2D codedExtent;
 *     uint32_t baseArrayLayer;
 *     VkImageView imageViewBinding;
 * };
 * }
 */
public class VkVideoPictureResourceInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$460.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$460.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$460.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$460.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$460.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$460.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$460.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$460.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$460.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$460.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$460.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment codedOffset$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment codedExtent$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static VarHandle baseArrayLayer$VH() {
        return constants$460.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t baseArrayLayer;
     * }
     */
    public static int baseArrayLayer$get(MemorySegment seg) {
        return (int)constants$460.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t baseArrayLayer;
     * }
     */
    public static void baseArrayLayer$set(MemorySegment seg, int x) {
        constants$460.const$4.set(seg, x);
    }
    public static int baseArrayLayer$get(MemorySegment seg, long index) {
        return (int)constants$460.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void baseArrayLayer$set(MemorySegment seg, long index, int x) {
        constants$460.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageViewBinding$VH() {
        return constants$460.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageView imageViewBinding;
     * }
     */
    public static MemorySegment imageViewBinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$460.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageView imageViewBinding;
     * }
     */
    public static void imageViewBinding$set(MemorySegment seg, MemorySegment x) {
        constants$460.const$5.set(seg, x);
    }
    public static MemorySegment imageViewBinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$460.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void imageViewBinding$set(MemorySegment seg, long index, MemorySegment x) {
        constants$460.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

