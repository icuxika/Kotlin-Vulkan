// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceSparseProperties {
 *     VkBool32 residencyStandard2DBlockShape;
 *     VkBool32 residencyStandard2DMultisampleBlockShape;
 *     VkBool32 residencyStandard3DBlockShape;
 *     VkBool32 residencyAlignedMipSize;
 *     VkBool32 residencyNonResidentStrict;
 * };
 * }
 */
public class VkPhysicalDeviceSparseProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$49.const$1;
    }
    public static VarHandle residencyStandard2DBlockShape$VH() {
        return constants$49.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 residencyStandard2DBlockShape;
     * }
     */
    public static int residencyStandard2DBlockShape$get(MemorySegment seg) {
        return (int)constants$49.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 residencyStandard2DBlockShape;
     * }
     */
    public static void residencyStandard2DBlockShape$set(MemorySegment seg, int x) {
        constants$49.const$2.set(seg, x);
    }
    public static int residencyStandard2DBlockShape$get(MemorySegment seg, long index) {
        return (int)constants$49.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void residencyStandard2DBlockShape$set(MemorySegment seg, long index, int x) {
        constants$49.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle residencyStandard2DMultisampleBlockShape$VH() {
        return constants$49.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 residencyStandard2DMultisampleBlockShape;
     * }
     */
    public static int residencyStandard2DMultisampleBlockShape$get(MemorySegment seg) {
        return (int)constants$49.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 residencyStandard2DMultisampleBlockShape;
     * }
     */
    public static void residencyStandard2DMultisampleBlockShape$set(MemorySegment seg, int x) {
        constants$49.const$3.set(seg, x);
    }
    public static int residencyStandard2DMultisampleBlockShape$get(MemorySegment seg, long index) {
        return (int)constants$49.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void residencyStandard2DMultisampleBlockShape$set(MemorySegment seg, long index, int x) {
        constants$49.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle residencyStandard3DBlockShape$VH() {
        return constants$49.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 residencyStandard3DBlockShape;
     * }
     */
    public static int residencyStandard3DBlockShape$get(MemorySegment seg) {
        return (int)constants$49.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 residencyStandard3DBlockShape;
     * }
     */
    public static void residencyStandard3DBlockShape$set(MemorySegment seg, int x) {
        constants$49.const$4.set(seg, x);
    }
    public static int residencyStandard3DBlockShape$get(MemorySegment seg, long index) {
        return (int)constants$49.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void residencyStandard3DBlockShape$set(MemorySegment seg, long index, int x) {
        constants$49.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle residencyAlignedMipSize$VH() {
        return constants$49.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 residencyAlignedMipSize;
     * }
     */
    public static int residencyAlignedMipSize$get(MemorySegment seg) {
        return (int)constants$49.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 residencyAlignedMipSize;
     * }
     */
    public static void residencyAlignedMipSize$set(MemorySegment seg, int x) {
        constants$49.const$5.set(seg, x);
    }
    public static int residencyAlignedMipSize$get(MemorySegment seg, long index) {
        return (int)constants$49.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void residencyAlignedMipSize$set(MemorySegment seg, long index, int x) {
        constants$49.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle residencyNonResidentStrict$VH() {
        return constants$50.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 residencyNonResidentStrict;
     * }
     */
    public static int residencyNonResidentStrict$get(MemorySegment seg) {
        return (int)constants$50.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 residencyNonResidentStrict;
     * }
     */
    public static void residencyNonResidentStrict$set(MemorySegment seg, int x) {
        constants$50.const$0.set(seg, x);
    }
    public static int residencyNonResidentStrict$get(MemorySegment seg, long index) {
        return (int)constants$50.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void residencyNonResidentStrict$set(MemorySegment seg, long index, int x) {
        constants$50.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

