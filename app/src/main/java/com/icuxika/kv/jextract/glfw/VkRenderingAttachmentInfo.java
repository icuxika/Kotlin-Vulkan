// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkRenderingAttachmentInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkImageView imageView;
 *     VkImageLayout imageLayout;
 *     VkResolveModeFlagBits resolveMode;
 *     VkImageView resolveImageView;
 *     VkImageLayout resolveImageLayout;
 *     VkAttachmentLoadOp loadOp;
 *     VkAttachmentStoreOp storeOp;
 *     VkClearValue clearValue;
 * };
 * }
 */
public class VkRenderingAttachmentInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$396.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$396.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$396.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$396.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$396.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$396.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$396.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$396.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$396.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$396.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$396.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageView$VH() {
        return constants$396.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageView imageView;
     * }
     */
    public static MemorySegment imageView$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$396.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageView imageView;
     * }
     */
    public static void imageView$set(MemorySegment seg, MemorySegment x) {
        constants$396.const$3.set(seg, x);
    }
    public static MemorySegment imageView$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$396.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void imageView$set(MemorySegment seg, long index, MemorySegment x) {
        constants$396.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageLayout$VH() {
        return constants$396.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageLayout imageLayout;
     * }
     */
    public static int imageLayout$get(MemorySegment seg) {
        return (int)constants$396.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageLayout imageLayout;
     * }
     */
    public static void imageLayout$set(MemorySegment seg, int x) {
        constants$396.const$4.set(seg, x);
    }
    public static int imageLayout$get(MemorySegment seg, long index) {
        return (int)constants$396.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void imageLayout$set(MemorySegment seg, long index, int x) {
        constants$396.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle resolveMode$VH() {
        return constants$396.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkResolveModeFlagBits resolveMode;
     * }
     */
    public static int resolveMode$get(MemorySegment seg) {
        return (int)constants$396.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkResolveModeFlagBits resolveMode;
     * }
     */
    public static void resolveMode$set(MemorySegment seg, int x) {
        constants$396.const$5.set(seg, x);
    }
    public static int resolveMode$get(MemorySegment seg, long index) {
        return (int)constants$396.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void resolveMode$set(MemorySegment seg, long index, int x) {
        constants$396.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle resolveImageView$VH() {
        return constants$397.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageView resolveImageView;
     * }
     */
    public static MemorySegment resolveImageView$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$397.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageView resolveImageView;
     * }
     */
    public static void resolveImageView$set(MemorySegment seg, MemorySegment x) {
        constants$397.const$0.set(seg, x);
    }
    public static MemorySegment resolveImageView$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$397.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void resolveImageView$set(MemorySegment seg, long index, MemorySegment x) {
        constants$397.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle resolveImageLayout$VH() {
        return constants$397.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageLayout resolveImageLayout;
     * }
     */
    public static int resolveImageLayout$get(MemorySegment seg) {
        return (int)constants$397.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageLayout resolveImageLayout;
     * }
     */
    public static void resolveImageLayout$set(MemorySegment seg, int x) {
        constants$397.const$1.set(seg, x);
    }
    public static int resolveImageLayout$get(MemorySegment seg, long index) {
        return (int)constants$397.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void resolveImageLayout$set(MemorySegment seg, long index, int x) {
        constants$397.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle loadOp$VH() {
        return constants$397.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkAttachmentLoadOp loadOp;
     * }
     */
    public static int loadOp$get(MemorySegment seg) {
        return (int)constants$397.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkAttachmentLoadOp loadOp;
     * }
     */
    public static void loadOp$set(MemorySegment seg, int x) {
        constants$397.const$2.set(seg, x);
    }
    public static int loadOp$get(MemorySegment seg, long index) {
        return (int)constants$397.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void loadOp$set(MemorySegment seg, long index, int x) {
        constants$397.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle storeOp$VH() {
        return constants$397.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkAttachmentStoreOp storeOp;
     * }
     */
    public static int storeOp$get(MemorySegment seg) {
        return (int)constants$397.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkAttachmentStoreOp storeOp;
     * }
     */
    public static void storeOp$set(MemorySegment seg, int x) {
        constants$397.const$3.set(seg, x);
    }
    public static int storeOp$get(MemorySegment seg, long index) {
        return (int)constants$397.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void storeOp$set(MemorySegment seg, long index, int x) {
        constants$397.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment clearValue$slice(MemorySegment seg) {
        return seg.asSlice(52, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


