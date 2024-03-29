// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t advancedBlendMaxColorAttachments;
 *     VkBool32 advancedBlendIndependentBlend;
 *     VkBool32 advancedBlendNonPremultipliedSrcColor;
 *     VkBool32 advancedBlendNonPremultipliedDstColor;
 *     VkBool32 advancedBlendCorrelatedOverlap;
 *     VkBool32 advancedBlendAllOperations;
 * };
 * }
 */
public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$694.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$694.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$694.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$694.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$694.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$694.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$695.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$695.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$695.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$695.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$695.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle advancedBlendMaxColorAttachments$VH() {
        return constants$695.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t advancedBlendMaxColorAttachments;
     * }
     */
    public static int advancedBlendMaxColorAttachments$get(MemorySegment seg) {
        return (int)constants$695.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t advancedBlendMaxColorAttachments;
     * }
     */
    public static void advancedBlendMaxColorAttachments$set(MemorySegment seg, int x) {
        constants$695.const$1.set(seg, x);
    }
    public static int advancedBlendMaxColorAttachments$get(MemorySegment seg, long index) {
        return (int)constants$695.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void advancedBlendMaxColorAttachments$set(MemorySegment seg, long index, int x) {
        constants$695.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle advancedBlendIndependentBlend$VH() {
        return constants$695.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 advancedBlendIndependentBlend;
     * }
     */
    public static int advancedBlendIndependentBlend$get(MemorySegment seg) {
        return (int)constants$695.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 advancedBlendIndependentBlend;
     * }
     */
    public static void advancedBlendIndependentBlend$set(MemorySegment seg, int x) {
        constants$695.const$2.set(seg, x);
    }
    public static int advancedBlendIndependentBlend$get(MemorySegment seg, long index) {
        return (int)constants$695.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void advancedBlendIndependentBlend$set(MemorySegment seg, long index, int x) {
        constants$695.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle advancedBlendNonPremultipliedSrcColor$VH() {
        return constants$695.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 advancedBlendNonPremultipliedSrcColor;
     * }
     */
    public static int advancedBlendNonPremultipliedSrcColor$get(MemorySegment seg) {
        return (int)constants$695.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 advancedBlendNonPremultipliedSrcColor;
     * }
     */
    public static void advancedBlendNonPremultipliedSrcColor$set(MemorySegment seg, int x) {
        constants$695.const$3.set(seg, x);
    }
    public static int advancedBlendNonPremultipliedSrcColor$get(MemorySegment seg, long index) {
        return (int)constants$695.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void advancedBlendNonPremultipliedSrcColor$set(MemorySegment seg, long index, int x) {
        constants$695.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle advancedBlendNonPremultipliedDstColor$VH() {
        return constants$695.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 advancedBlendNonPremultipliedDstColor;
     * }
     */
    public static int advancedBlendNonPremultipliedDstColor$get(MemorySegment seg) {
        return (int)constants$695.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 advancedBlendNonPremultipliedDstColor;
     * }
     */
    public static void advancedBlendNonPremultipliedDstColor$set(MemorySegment seg, int x) {
        constants$695.const$4.set(seg, x);
    }
    public static int advancedBlendNonPremultipliedDstColor$get(MemorySegment seg, long index) {
        return (int)constants$695.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void advancedBlendNonPremultipliedDstColor$set(MemorySegment seg, long index, int x) {
        constants$695.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle advancedBlendCorrelatedOverlap$VH() {
        return constants$695.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 advancedBlendCorrelatedOverlap;
     * }
     */
    public static int advancedBlendCorrelatedOverlap$get(MemorySegment seg) {
        return (int)constants$695.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 advancedBlendCorrelatedOverlap;
     * }
     */
    public static void advancedBlendCorrelatedOverlap$set(MemorySegment seg, int x) {
        constants$695.const$5.set(seg, x);
    }
    public static int advancedBlendCorrelatedOverlap$get(MemorySegment seg, long index) {
        return (int)constants$695.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void advancedBlendCorrelatedOverlap$set(MemorySegment seg, long index, int x) {
        constants$695.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle advancedBlendAllOperations$VH() {
        return constants$696.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 advancedBlendAllOperations;
     * }
     */
    public static int advancedBlendAllOperations$get(MemorySegment seg) {
        return (int)constants$696.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 advancedBlendAllOperations;
     * }
     */
    public static void advancedBlendAllOperations$set(MemorySegment seg, int x) {
        constants$696.const$0.set(seg, x);
    }
    public static int advancedBlendAllOperations$get(MemorySegment seg, long index) {
        return (int)constants$696.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void advancedBlendAllOperations$set(MemorySegment seg, long index, int x) {
        constants$696.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


