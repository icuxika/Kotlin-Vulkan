// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDeviceGroupPresentInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t swapchainCount;
 *     const uint32_t* pDeviceMasks;
 *     VkDeviceGroupPresentModeFlagBitsKHR mode;
 * };
 * }
 */
public class VkDeviceGroupPresentInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$439.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$439.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$439.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$439.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$439.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$439.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$440.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$440.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$440.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$440.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$440.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle swapchainCount$VH() {
        return constants$440.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t swapchainCount;
     * }
     */
    public static int swapchainCount$get(MemorySegment seg) {
        return (int)constants$440.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t swapchainCount;
     * }
     */
    public static void swapchainCount$set(MemorySegment seg, int x) {
        constants$440.const$1.set(seg, x);
    }
    public static int swapchainCount$get(MemorySegment seg, long index) {
        return (int)constants$440.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void swapchainCount$set(MemorySegment seg, long index, int x) {
        constants$440.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDeviceMasks$VH() {
        return constants$440.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const uint32_t* pDeviceMasks;
     * }
     */
    public static MemorySegment pDeviceMasks$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$440.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const uint32_t* pDeviceMasks;
     * }
     */
    public static void pDeviceMasks$set(MemorySegment seg, MemorySegment x) {
        constants$440.const$2.set(seg, x);
    }
    public static MemorySegment pDeviceMasks$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$440.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pDeviceMasks$set(MemorySegment seg, long index, MemorySegment x) {
        constants$440.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mode$VH() {
        return constants$440.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceGroupPresentModeFlagBitsKHR mode;
     * }
     */
    public static int mode$get(MemorySegment seg) {
        return (int)constants$440.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceGroupPresentModeFlagBitsKHR mode;
     * }
     */
    public static void mode$set(MemorySegment seg, int x) {
        constants$440.const$3.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)constants$440.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        constants$440.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


