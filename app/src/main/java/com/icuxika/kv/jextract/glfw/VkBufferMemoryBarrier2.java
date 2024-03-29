// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkBufferMemoryBarrier2 {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * };
 * }
 */
public class VkBufferMemoryBarrier2 {

    public static MemoryLayout $LAYOUT() {
        return constants$365.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$365.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$365.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$365.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$365.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$365.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$366.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$366.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$366.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$366.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$366.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle srcStageMask$VH() {
        return constants$366.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineStageFlags2 srcStageMask;
     * }
     */
    public static long srcStageMask$get(MemorySegment seg) {
        return (long)constants$366.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineStageFlags2 srcStageMask;
     * }
     */
    public static void srcStageMask$set(MemorySegment seg, long x) {
        constants$366.const$1.set(seg, x);
    }
    public static long srcStageMask$get(MemorySegment seg, long index) {
        return (long)constants$366.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void srcStageMask$set(MemorySegment seg, long index, long x) {
        constants$366.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle srcAccessMask$VH() {
        return constants$366.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkAccessFlags2 srcAccessMask;
     * }
     */
    public static long srcAccessMask$get(MemorySegment seg) {
        return (long)constants$366.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkAccessFlags2 srcAccessMask;
     * }
     */
    public static void srcAccessMask$set(MemorySegment seg, long x) {
        constants$366.const$2.set(seg, x);
    }
    public static long srcAccessMask$get(MemorySegment seg, long index) {
        return (long)constants$366.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void srcAccessMask$set(MemorySegment seg, long index, long x) {
        constants$366.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstStageMask$VH() {
        return constants$366.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineStageFlags2 dstStageMask;
     * }
     */
    public static long dstStageMask$get(MemorySegment seg) {
        return (long)constants$366.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineStageFlags2 dstStageMask;
     * }
     */
    public static void dstStageMask$set(MemorySegment seg, long x) {
        constants$366.const$3.set(seg, x);
    }
    public static long dstStageMask$get(MemorySegment seg, long index) {
        return (long)constants$366.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dstStageMask$set(MemorySegment seg, long index, long x) {
        constants$366.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstAccessMask$VH() {
        return constants$366.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkAccessFlags2 dstAccessMask;
     * }
     */
    public static long dstAccessMask$get(MemorySegment seg) {
        return (long)constants$366.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkAccessFlags2 dstAccessMask;
     * }
     */
    public static void dstAccessMask$set(MemorySegment seg, long x) {
        constants$366.const$4.set(seg, x);
    }
    public static long dstAccessMask$get(MemorySegment seg, long index) {
        return (long)constants$366.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dstAccessMask$set(MemorySegment seg, long index, long x) {
        constants$366.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle srcQueueFamilyIndex$VH() {
        return constants$366.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t srcQueueFamilyIndex;
     * }
     */
    public static int srcQueueFamilyIndex$get(MemorySegment seg) {
        return (int)constants$366.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t srcQueueFamilyIndex;
     * }
     */
    public static void srcQueueFamilyIndex$set(MemorySegment seg, int x) {
        constants$366.const$5.set(seg, x);
    }
    public static int srcQueueFamilyIndex$get(MemorySegment seg, long index) {
        return (int)constants$366.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void srcQueueFamilyIndex$set(MemorySegment seg, long index, int x) {
        constants$366.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstQueueFamilyIndex$VH() {
        return constants$367.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t dstQueueFamilyIndex;
     * }
     */
    public static int dstQueueFamilyIndex$get(MemorySegment seg) {
        return (int)constants$367.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t dstQueueFamilyIndex;
     * }
     */
    public static void dstQueueFamilyIndex$set(MemorySegment seg, int x) {
        constants$367.const$0.set(seg, x);
    }
    public static int dstQueueFamilyIndex$get(MemorySegment seg, long index) {
        return (int)constants$367.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dstQueueFamilyIndex$set(MemorySegment seg, long index, int x) {
        constants$367.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buffer$VH() {
        return constants$367.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuffer buffer;
     * }
     */
    public static MemorySegment buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$367.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuffer buffer;
     * }
     */
    public static void buffer$set(MemorySegment seg, MemorySegment x) {
        constants$367.const$1.set(seg, x);
    }
    public static MemorySegment buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$367.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$367.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$367.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize offset;
     * }
     */
    public static long offset$get(MemorySegment seg) {
        return (long)constants$367.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize offset;
     * }
     */
    public static void offset$set(MemorySegment seg, long x) {
        constants$367.const$2.set(seg, x);
    }
    public static long offset$get(MemorySegment seg, long index) {
        return (long)constants$367.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, long x) {
        constants$367.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$367.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static long size$get(MemorySegment seg) {
        return (long)constants$367.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static void size$set(MemorySegment seg, long x) {
        constants$367.const$3.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)constants$367.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        constants$367.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


