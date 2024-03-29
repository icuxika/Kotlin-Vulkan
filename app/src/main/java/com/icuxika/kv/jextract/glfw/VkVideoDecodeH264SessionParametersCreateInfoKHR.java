// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkVideoDecodeH264SessionParametersCreateInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t maxStdSPSCount;
 *     uint32_t maxStdPPSCount;
 *     const VkVideoDecodeH264SessionParametersAddInfoKHR* pParametersAddInfo;
 * };
 * }
 */
public class VkVideoDecodeH264SessionParametersCreateInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$493.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$493.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$493.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$493.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$493.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$493.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$493.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$493.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$493.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$493.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$493.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxStdSPSCount$VH() {
        return constants$493.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxStdSPSCount;
     * }
     */
    public static int maxStdSPSCount$get(MemorySegment seg) {
        return (int)constants$493.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxStdSPSCount;
     * }
     */
    public static void maxStdSPSCount$set(MemorySegment seg, int x) {
        constants$493.const$3.set(seg, x);
    }
    public static int maxStdSPSCount$get(MemorySegment seg, long index) {
        return (int)constants$493.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxStdSPSCount$set(MemorySegment seg, long index, int x) {
        constants$493.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxStdPPSCount$VH() {
        return constants$493.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxStdPPSCount;
     * }
     */
    public static int maxStdPPSCount$get(MemorySegment seg) {
        return (int)constants$493.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxStdPPSCount;
     * }
     */
    public static void maxStdPPSCount$set(MemorySegment seg, int x) {
        constants$493.const$4.set(seg, x);
    }
    public static int maxStdPPSCount$get(MemorySegment seg, long index) {
        return (int)constants$493.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void maxStdPPSCount$set(MemorySegment seg, long index, int x) {
        constants$493.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pParametersAddInfo$VH() {
        return constants$493.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkVideoDecodeH264SessionParametersAddInfoKHR* pParametersAddInfo;
     * }
     */
    public static MemorySegment pParametersAddInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$493.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkVideoDecodeH264SessionParametersAddInfoKHR* pParametersAddInfo;
     * }
     */
    public static void pParametersAddInfo$set(MemorySegment seg, MemorySegment x) {
        constants$493.const$5.set(seg, x);
    }
    public static MemorySegment pParametersAddInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$493.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pParametersAddInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$493.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


