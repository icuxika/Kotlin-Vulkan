// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkAccelerationStructureInfoNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkAccelerationStructureTypeNV type;
 *     VkBuildAccelerationStructureFlagsNV flags;
 *     uint32_t instanceCount;
 *     uint32_t geometryCount;
 *     const VkGeometryNV* pGeometries;
 * };
 * }
 */
public class VkAccelerationStructureInfoNV {

    public static MemoryLayout $LAYOUT() {
        return constants$725.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$725.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$725.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$725.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$725.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$725.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$725.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$725.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$725.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$725.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$725.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$726.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkAccelerationStructureTypeNV type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$726.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkAccelerationStructureTypeNV type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$726.const$0.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$726.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$726.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$726.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuildAccelerationStructureFlagsNV flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$726.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuildAccelerationStructureFlagsNV flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$726.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$726.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$726.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle instanceCount$VH() {
        return constants$726.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t instanceCount;
     * }
     */
    public static int instanceCount$get(MemorySegment seg) {
        return (int)constants$726.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t instanceCount;
     * }
     */
    public static void instanceCount$set(MemorySegment seg, int x) {
        constants$726.const$2.set(seg, x);
    }
    public static int instanceCount$get(MemorySegment seg, long index) {
        return (int)constants$726.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void instanceCount$set(MemorySegment seg, long index, int x) {
        constants$726.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle geometryCount$VH() {
        return constants$726.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t geometryCount;
     * }
     */
    public static int geometryCount$get(MemorySegment seg) {
        return (int)constants$726.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t geometryCount;
     * }
     */
    public static void geometryCount$set(MemorySegment seg, int x) {
        constants$726.const$3.set(seg, x);
    }
    public static int geometryCount$get(MemorySegment seg, long index) {
        return (int)constants$726.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void geometryCount$set(MemorySegment seg, long index, int x) {
        constants$726.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pGeometries$VH() {
        return constants$726.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkGeometryNV* pGeometries;
     * }
     */
    public static MemorySegment pGeometries$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$726.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkGeometryNV* pGeometries;
     * }
     */
    public static void pGeometries$set(MemorySegment seg, MemorySegment x) {
        constants$726.const$4.set(seg, x);
    }
    public static MemorySegment pGeometries$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$726.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pGeometries$set(MemorySegment seg, long index, MemorySegment x) {
        constants$726.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


