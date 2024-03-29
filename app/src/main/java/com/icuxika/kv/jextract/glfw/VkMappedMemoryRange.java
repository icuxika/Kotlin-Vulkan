// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkMappedMemoryRange {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDeviceMemory memory;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * };
 * }
 */
public class VkMappedMemoryRange {

    public static MemoryLayout $LAYOUT() {
        return constants$57.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$57.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$57.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$57.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$57.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$57.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$57.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$57.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$57.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$57.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$57.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle memory$VH() {
        return constants$57.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceMemory memory;
     * }
     */
    public static MemorySegment memory$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$57.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceMemory memory;
     * }
     */
    public static void memory$set(MemorySegment seg, MemorySegment x) {
        constants$57.const$5.set(seg, x);
    }
    public static MemorySegment memory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$57.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void memory$set(MemorySegment seg, long index, MemorySegment x) {
        constants$57.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$58.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize offset;
     * }
     */
    public static long offset$get(MemorySegment seg) {
        return (long)constants$58.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize offset;
     * }
     */
    public static void offset$set(MemorySegment seg, long x) {
        constants$58.const$0.set(seg, x);
    }
    public static long offset$get(MemorySegment seg, long index) {
        return (long)constants$58.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, long x) {
        constants$58.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$58.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static long size$get(MemorySegment seg) {
        return (long)constants$58.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static void size$set(MemorySegment seg, long x) {
        constants$58.const$1.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)constants$58.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        constants$58.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


