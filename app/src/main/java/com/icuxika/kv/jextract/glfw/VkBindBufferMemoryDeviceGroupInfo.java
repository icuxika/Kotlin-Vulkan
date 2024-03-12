// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkBindBufferMemoryDeviceGroupInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t deviceIndexCount;
 *     const uint32_t* pDeviceIndices;
 * };
 * }
 */
public class VkBindBufferMemoryDeviceGroupInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$213.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$213.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$213.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$213.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$213.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$213.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$213.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$213.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$213.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$213.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$213.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle deviceIndexCount$VH() {
        return constants$213.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t deviceIndexCount;
     * }
     */
    public static int deviceIndexCount$get(MemorySegment seg) {
        return (int)constants$213.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t deviceIndexCount;
     * }
     */
    public static void deviceIndexCount$set(MemorySegment seg, int x) {
        constants$213.const$4.set(seg, x);
    }
    public static int deviceIndexCount$get(MemorySegment seg, long index) {
        return (int)constants$213.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void deviceIndexCount$set(MemorySegment seg, long index, int x) {
        constants$213.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDeviceIndices$VH() {
        return constants$213.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const uint32_t* pDeviceIndices;
     * }
     */
    public static MemorySegment pDeviceIndices$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$213.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const uint32_t* pDeviceIndices;
     * }
     */
    public static void pDeviceIndices$set(MemorySegment seg, MemorySegment x) {
        constants$213.const$5.set(seg, x);
    }
    public static MemorySegment pDeviceIndices$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$213.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pDeviceIndices$set(MemorySegment seg, long index, MemorySegment x) {
        constants$213.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


