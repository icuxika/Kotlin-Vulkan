// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkOpticalFlowExecuteInfoNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkOpticalFlowExecuteFlagsNV flags;
 *     uint32_t regionCount;
 *     const VkRect2D* pRegions;
 * };
 * }
 */
public class VkOpticalFlowExecuteInfoNV {

    public static MemoryLayout $LAYOUT() {
        return constants$1018.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$1018.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$1018.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$1018.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$1018.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$1018.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$1018.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1018.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$1018.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1018.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1018.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$1019.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkOpticalFlowExecuteFlagsNV flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$1019.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkOpticalFlowExecuteFlagsNV flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$1019.const$0.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$1019.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$1019.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle regionCount$VH() {
        return constants$1019.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t regionCount;
     * }
     */
    public static int regionCount$get(MemorySegment seg) {
        return (int)constants$1019.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t regionCount;
     * }
     */
    public static void regionCount$set(MemorySegment seg, int x) {
        constants$1019.const$1.set(seg, x);
    }
    public static int regionCount$get(MemorySegment seg, long index) {
        return (int)constants$1019.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void regionCount$set(MemorySegment seg, long index, int x) {
        constants$1019.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pRegions$VH() {
        return constants$1019.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkRect2D* pRegions;
     * }
     */
    public static MemorySegment pRegions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1019.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkRect2D* pRegions;
     * }
     */
    public static void pRegions$set(MemorySegment seg, MemorySegment x) {
        constants$1019.const$2.set(seg, x);
    }
    public static MemorySegment pRegions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1019.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pRegions$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1019.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


