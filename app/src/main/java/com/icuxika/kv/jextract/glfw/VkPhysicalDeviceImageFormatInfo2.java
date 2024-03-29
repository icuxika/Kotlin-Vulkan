// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceImageFormatInfo2 {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkFormat format;
 *     VkImageType type;
 *     VkImageTiling tiling;
 *     VkImageUsageFlags usage;
 *     VkImageCreateFlags flags;
 * };
 * }
 */
public class VkPhysicalDeviceImageFormatInfo2 {

    public static MemoryLayout $LAYOUT() {
        return constants$221.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$222.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$222.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$222.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$222.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$222.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$222.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$222.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$222.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$222.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$222.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$222.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkFormat format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$222.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkFormat format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$222.const$2.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$222.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$222.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$222.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$222.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$222.const$3.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$222.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$222.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tiling$VH() {
        return constants$222.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageTiling tiling;
     * }
     */
    public static int tiling$get(MemorySegment seg) {
        return (int)constants$222.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageTiling tiling;
     * }
     */
    public static void tiling$set(MemorySegment seg, int x) {
        constants$222.const$4.set(seg, x);
    }
    public static int tiling$get(MemorySegment seg, long index) {
        return (int)constants$222.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void tiling$set(MemorySegment seg, long index, int x) {
        constants$222.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle usage$VH() {
        return constants$222.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageUsageFlags usage;
     * }
     */
    public static int usage$get(MemorySegment seg) {
        return (int)constants$222.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageUsageFlags usage;
     * }
     */
    public static void usage$set(MemorySegment seg, int x) {
        constants$222.const$5.set(seg, x);
    }
    public static int usage$get(MemorySegment seg, long index) {
        return (int)constants$222.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void usage$set(MemorySegment seg, long index, int x) {
        constants$222.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$223.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageCreateFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$223.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageCreateFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$223.const$0.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$223.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$223.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


