// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDescriptorBufferBindingInfoEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDeviceAddress address;
 *     VkBufferUsageFlags usage;
 * };
 * }
 */
public class VkDescriptorBufferBindingInfoEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$865.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$865.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$865.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$865.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$865.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$865.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$866.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$866.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$866.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$866.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$866.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle address$VH() {
        return constants$866.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceAddress address;
     * }
     */
    public static long address$get(MemorySegment seg) {
        return (long)constants$866.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceAddress address;
     * }
     */
    public static void address$set(MemorySegment seg, long x) {
        constants$866.const$1.set(seg, x);
    }
    public static long address$get(MemorySegment seg, long index) {
        return (long)constants$866.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void address$set(MemorySegment seg, long index, long x) {
        constants$866.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle usage$VH() {
        return constants$866.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBufferUsageFlags usage;
     * }
     */
    public static int usage$get(MemorySegment seg) {
        return (int)constants$866.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBufferUsageFlags usage;
     * }
     */
    public static void usage$set(MemorySegment seg, int x) {
        constants$866.const$2.set(seg, x);
    }
    public static int usage$get(MemorySegment seg, long index) {
        return (int)constants$866.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void usage$set(MemorySegment seg, long index, int x) {
        constants$866.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


