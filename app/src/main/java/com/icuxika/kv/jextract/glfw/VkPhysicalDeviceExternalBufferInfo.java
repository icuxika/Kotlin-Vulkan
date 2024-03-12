// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceExternalBufferInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBufferCreateFlags flags;
 *     VkBufferUsageFlags usage;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 * };
 * }
 */
public class VkPhysicalDeviceExternalBufferInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$246.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$246.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$246.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$246.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$246.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$246.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$246.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$246.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$246.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$246.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$246.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$247.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBufferCreateFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$247.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBufferCreateFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$247.const$0.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$247.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$247.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle usage$VH() {
        return constants$247.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBufferUsageFlags usage;
     * }
     */
    public static int usage$get(MemorySegment seg) {
        return (int)constants$247.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBufferUsageFlags usage;
     * }
     */
    public static void usage$set(MemorySegment seg, int x) {
        constants$247.const$1.set(seg, x);
    }
    public static int usage$get(MemorySegment seg, long index) {
        return (int)constants$247.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void usage$set(MemorySegment seg, long index, int x) {
        constants$247.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle handleType$VH() {
        return constants$247.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkExternalMemoryHandleTypeFlagBits handleType;
     * }
     */
    public static int handleType$get(MemorySegment seg) {
        return (int)constants$247.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkExternalMemoryHandleTypeFlagBits handleType;
     * }
     */
    public static void handleType$set(MemorySegment seg, int x) {
        constants$247.const$2.set(seg, x);
    }
    public static int handleType$get(MemorySegment seg, long index) {
        return (int)constants$247.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void handleType$set(MemorySegment seg, long index, int x) {
        constants$247.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

