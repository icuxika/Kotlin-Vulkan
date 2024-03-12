// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPresentRegionsKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t swapchainCount;
 *     const VkPresentRegionKHR* pRegions;
 * };
 * }
 */
public class VkPresentRegionsKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$513.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$513.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$513.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$513.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$513.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$513.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$513.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$513.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$513.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$513.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$513.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle swapchainCount$VH() {
        return constants$513.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t swapchainCount;
     * }
     */
    public static int swapchainCount$get(MemorySegment seg) {
        return (int)constants$513.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t swapchainCount;
     * }
     */
    public static void swapchainCount$set(MemorySegment seg, int x) {
        constants$513.const$3.set(seg, x);
    }
    public static int swapchainCount$get(MemorySegment seg, long index) {
        return (int)constants$513.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void swapchainCount$set(MemorySegment seg, long index, int x) {
        constants$513.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pRegions$VH() {
        return constants$513.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPresentRegionKHR* pRegions;
     * }
     */
    public static MemorySegment pRegions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$513.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPresentRegionKHR* pRegions;
     * }
     */
    public static void pRegions$set(MemorySegment seg, MemorySegment x) {
        constants$513.const$4.set(seg, x);
    }
    public static MemorySegment pRegions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$513.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pRegions$set(MemorySegment seg, long index, MemorySegment x) {
        constants$513.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


