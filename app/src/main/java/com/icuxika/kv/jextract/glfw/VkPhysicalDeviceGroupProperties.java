// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceGroupProperties {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t physicalDeviceCount;
 *     VkPhysicalDevice physicalDevices[32];
 *     VkBool32 subsetAllocation;
 * };
 * }
 */
public class VkPhysicalDeviceGroupProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$215.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$215.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$215.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$215.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$215.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$215.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$215.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$215.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$215.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$215.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$215.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle physicalDeviceCount$VH() {
        return constants$215.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t physicalDeviceCount;
     * }
     */
    public static int physicalDeviceCount$get(MemorySegment seg) {
        return (int)constants$215.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t physicalDeviceCount;
     * }
     */
    public static void physicalDeviceCount$set(MemorySegment seg, int x) {
        constants$215.const$4.set(seg, x);
    }
    public static int physicalDeviceCount$get(MemorySegment seg, long index) {
        return (int)constants$215.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void physicalDeviceCount$set(MemorySegment seg, long index, int x) {
        constants$215.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment physicalDevices$slice(MemorySegment seg) {
        return seg.asSlice(24, 256);
    }
    public static VarHandle subsetAllocation$VH() {
        return constants$215.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 subsetAllocation;
     * }
     */
    public static int subsetAllocation$get(MemorySegment seg) {
        return (int)constants$215.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 subsetAllocation;
     * }
     */
    public static void subsetAllocation$set(MemorySegment seg, int x) {
        constants$215.const$5.set(seg, x);
    }
    public static int subsetAllocation$get(MemorySegment seg, long index) {
        return (int)constants$215.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void subsetAllocation$set(MemorySegment seg, long index, int x) {
        constants$215.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


