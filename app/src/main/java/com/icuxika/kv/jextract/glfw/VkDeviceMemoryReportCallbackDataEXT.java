// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDeviceMemoryReportCallbackDataEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDeviceMemoryReportFlagsEXT flags;
 *     VkDeviceMemoryReportEventTypeEXT type;
 *     uint64_t memoryObjectId;
 *     VkDeviceSize size;
 *     VkObjectType objectType;
 *     uint64_t objectHandle;
 *     uint32_t heapIndex;
 * };
 * }
 */
public class VkDeviceMemoryReportCallbackDataEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$844.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$844.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$844.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$844.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$844.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$844.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$844.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$844.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$844.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$844.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$844.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$844.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceMemoryReportFlagsEXT flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$844.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceMemoryReportFlagsEXT flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$844.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$844.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$844.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$844.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceMemoryReportEventTypeEXT type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$844.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceMemoryReportEventTypeEXT type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$844.const$4.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$844.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$844.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle memoryObjectId$VH() {
        return constants$844.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t memoryObjectId;
     * }
     */
    public static long memoryObjectId$get(MemorySegment seg) {
        return (long)constants$844.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t memoryObjectId;
     * }
     */
    public static void memoryObjectId$set(MemorySegment seg, long x) {
        constants$844.const$5.set(seg, x);
    }
    public static long memoryObjectId$get(MemorySegment seg, long index) {
        return (long)constants$844.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void memoryObjectId$set(MemorySegment seg, long index, long x) {
        constants$844.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$845.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static long size$get(MemorySegment seg) {
        return (long)constants$845.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static void size$set(MemorySegment seg, long x) {
        constants$845.const$0.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)constants$845.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        constants$845.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle objectType$VH() {
        return constants$845.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkObjectType objectType;
     * }
     */
    public static int objectType$get(MemorySegment seg) {
        return (int)constants$845.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkObjectType objectType;
     * }
     */
    public static void objectType$set(MemorySegment seg, int x) {
        constants$845.const$1.set(seg, x);
    }
    public static int objectType$get(MemorySegment seg, long index) {
        return (int)constants$845.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void objectType$set(MemorySegment seg, long index, int x) {
        constants$845.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle objectHandle$VH() {
        return constants$845.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t objectHandle;
     * }
     */
    public static long objectHandle$get(MemorySegment seg) {
        return (long)constants$845.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t objectHandle;
     * }
     */
    public static void objectHandle$set(MemorySegment seg, long x) {
        constants$845.const$2.set(seg, x);
    }
    public static long objectHandle$get(MemorySegment seg, long index) {
        return (long)constants$845.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void objectHandle$set(MemorySegment seg, long index, long x) {
        constants$845.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle heapIndex$VH() {
        return constants$845.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t heapIndex;
     * }
     */
    public static int heapIndex$get(MemorySegment seg) {
        return (int)constants$845.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t heapIndex;
     * }
     */
    public static void heapIndex$set(MemorySegment seg, int x) {
        constants$845.const$3.set(seg, x);
    }
    public static int heapIndex$get(MemorySegment seg, long index) {
        return (int)constants$845.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void heapIndex$set(MemorySegment seg, long index, int x) {
        constants$845.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

