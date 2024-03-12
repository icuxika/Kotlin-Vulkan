// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkBindVideoSessionMemoryInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t memoryBindIndex;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkDeviceSize memorySize;
 * };
 * }
 */
public class VkBindVideoSessionMemoryInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$462.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$462.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$462.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$462.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$462.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$462.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$462.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$462.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$462.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$462.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$462.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle memoryBindIndex$VH() {
        return constants$463.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t memoryBindIndex;
     * }
     */
    public static int memoryBindIndex$get(MemorySegment seg) {
        return (int)constants$463.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t memoryBindIndex;
     * }
     */
    public static void memoryBindIndex$set(MemorySegment seg, int x) {
        constants$463.const$0.set(seg, x);
    }
    public static int memoryBindIndex$get(MemorySegment seg, long index) {
        return (int)constants$463.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void memoryBindIndex$set(MemorySegment seg, long index, int x) {
        constants$463.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle memory$VH() {
        return constants$463.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceMemory memory;
     * }
     */
    public static MemorySegment memory$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$463.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceMemory memory;
     * }
     */
    public static void memory$set(MemorySegment seg, MemorySegment x) {
        constants$463.const$1.set(seg, x);
    }
    public static MemorySegment memory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$463.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void memory$set(MemorySegment seg, long index, MemorySegment x) {
        constants$463.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle memoryOffset$VH() {
        return constants$463.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize memoryOffset;
     * }
     */
    public static long memoryOffset$get(MemorySegment seg) {
        return (long)constants$463.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize memoryOffset;
     * }
     */
    public static void memoryOffset$set(MemorySegment seg, long x) {
        constants$463.const$2.set(seg, x);
    }
    public static long memoryOffset$get(MemorySegment seg, long index) {
        return (long)constants$463.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void memoryOffset$set(MemorySegment seg, long index, long x) {
        constants$463.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle memorySize$VH() {
        return constants$463.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize memorySize;
     * }
     */
    public static long memorySize$get(MemorySegment seg) {
        return (long)constants$463.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize memorySize;
     * }
     */
    public static void memorySize$set(MemorySegment seg, long x) {
        constants$463.const$3.set(seg, x);
    }
    public static long memorySize$get(MemorySegment seg, long index) {
        return (long)constants$463.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void memorySize$set(MemorySegment seg, long index, long x) {
        constants$463.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

