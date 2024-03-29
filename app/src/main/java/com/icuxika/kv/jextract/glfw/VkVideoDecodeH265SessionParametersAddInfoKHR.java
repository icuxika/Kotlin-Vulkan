// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkVideoDecodeH265SessionParametersAddInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t stdVPSCount;
 *     const StdVideoH265VideoParameterSet* pStdVPSs;
 *     uint32_t stdSPSCount;
 *     const StdVideoH265SequenceParameterSet* pStdSPSs;
 *     uint32_t stdPPSCount;
 *     const StdVideoH265PictureParameterSet* pStdPPSs;
 * };
 * }
 */
public class VkVideoDecodeH265SessionParametersAddInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$567.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$567.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$567.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$567.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$567.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$567.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$567.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$567.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$567.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$567.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$567.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stdVPSCount$VH() {
        return constants$567.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t stdVPSCount;
     * }
     */
    public static int stdVPSCount$get(MemorySegment seg) {
        return (int)constants$567.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t stdVPSCount;
     * }
     */
    public static void stdVPSCount$set(MemorySegment seg, int x) {
        constants$567.const$5.set(seg, x);
    }
    public static int stdVPSCount$get(MemorySegment seg, long index) {
        return (int)constants$567.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void stdVPSCount$set(MemorySegment seg, long index, int x) {
        constants$567.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStdVPSs$VH() {
        return constants$568.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const StdVideoH265VideoParameterSet* pStdVPSs;
     * }
     */
    public static MemorySegment pStdVPSs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$568.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const StdVideoH265VideoParameterSet* pStdVPSs;
     * }
     */
    public static void pStdVPSs$set(MemorySegment seg, MemorySegment x) {
        constants$568.const$0.set(seg, x);
    }
    public static MemorySegment pStdVPSs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$568.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pStdVPSs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$568.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stdSPSCount$VH() {
        return constants$568.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t stdSPSCount;
     * }
     */
    public static int stdSPSCount$get(MemorySegment seg) {
        return (int)constants$568.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t stdSPSCount;
     * }
     */
    public static void stdSPSCount$set(MemorySegment seg, int x) {
        constants$568.const$1.set(seg, x);
    }
    public static int stdSPSCount$get(MemorySegment seg, long index) {
        return (int)constants$568.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void stdSPSCount$set(MemorySegment seg, long index, int x) {
        constants$568.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStdSPSs$VH() {
        return constants$568.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const StdVideoH265SequenceParameterSet* pStdSPSs;
     * }
     */
    public static MemorySegment pStdSPSs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$568.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const StdVideoH265SequenceParameterSet* pStdSPSs;
     * }
     */
    public static void pStdSPSs$set(MemorySegment seg, MemorySegment x) {
        constants$568.const$2.set(seg, x);
    }
    public static MemorySegment pStdSPSs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$568.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pStdSPSs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$568.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stdPPSCount$VH() {
        return constants$568.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t stdPPSCount;
     * }
     */
    public static int stdPPSCount$get(MemorySegment seg) {
        return (int)constants$568.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t stdPPSCount;
     * }
     */
    public static void stdPPSCount$set(MemorySegment seg, int x) {
        constants$568.const$3.set(seg, x);
    }
    public static int stdPPSCount$get(MemorySegment seg, long index) {
        return (int)constants$568.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void stdPPSCount$set(MemorySegment seg, long index, int x) {
        constants$568.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStdPPSs$VH() {
        return constants$568.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const StdVideoH265PictureParameterSet* pStdPPSs;
     * }
     */
    public static MemorySegment pStdPPSs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$568.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const StdVideoH265PictureParameterSet* pStdPPSs;
     * }
     */
    public static void pStdPPSs$set(MemorySegment seg, MemorySegment x) {
        constants$568.const$4.set(seg, x);
    }
    public static MemorySegment pStdPPSs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$568.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pStdPPSs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$568.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


