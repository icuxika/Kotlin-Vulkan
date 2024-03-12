// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkCopyDescriptorSet {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDescriptorSet srcSet;
 *     uint32_t srcBinding;
 *     uint32_t srcArrayElement;
 *     VkDescriptorSet dstSet;
 *     uint32_t dstBinding;
 *     uint32_t dstArrayElement;
 *     uint32_t descriptorCount;
 * };
 * }
 */
public class VkCopyDescriptorSet {

    public static MemoryLayout $LAYOUT() {
        return constants$111.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$112.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$112.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$112.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$112.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$112.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$112.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$112.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$112.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$112.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$112.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle srcSet$VH() {
        return constants$112.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDescriptorSet srcSet;
     * }
     */
    public static MemorySegment srcSet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$112.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDescriptorSet srcSet;
     * }
     */
    public static void srcSet$set(MemorySegment seg, MemorySegment x) {
        constants$112.const$2.set(seg, x);
    }
    public static MemorySegment srcSet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$112.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void srcSet$set(MemorySegment seg, long index, MemorySegment x) {
        constants$112.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle srcBinding$VH() {
        return constants$112.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t srcBinding;
     * }
     */
    public static int srcBinding$get(MemorySegment seg) {
        return (int)constants$112.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t srcBinding;
     * }
     */
    public static void srcBinding$set(MemorySegment seg, int x) {
        constants$112.const$3.set(seg, x);
    }
    public static int srcBinding$get(MemorySegment seg, long index) {
        return (int)constants$112.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void srcBinding$set(MemorySegment seg, long index, int x) {
        constants$112.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle srcArrayElement$VH() {
        return constants$112.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t srcArrayElement;
     * }
     */
    public static int srcArrayElement$get(MemorySegment seg) {
        return (int)constants$112.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t srcArrayElement;
     * }
     */
    public static void srcArrayElement$set(MemorySegment seg, int x) {
        constants$112.const$4.set(seg, x);
    }
    public static int srcArrayElement$get(MemorySegment seg, long index) {
        return (int)constants$112.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void srcArrayElement$set(MemorySegment seg, long index, int x) {
        constants$112.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstSet$VH() {
        return constants$112.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDescriptorSet dstSet;
     * }
     */
    public static MemorySegment dstSet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$112.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDescriptorSet dstSet;
     * }
     */
    public static void dstSet$set(MemorySegment seg, MemorySegment x) {
        constants$112.const$5.set(seg, x);
    }
    public static MemorySegment dstSet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$112.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dstSet$set(MemorySegment seg, long index, MemorySegment x) {
        constants$112.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstBinding$VH() {
        return constants$113.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t dstBinding;
     * }
     */
    public static int dstBinding$get(MemorySegment seg) {
        return (int)constants$113.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t dstBinding;
     * }
     */
    public static void dstBinding$set(MemorySegment seg, int x) {
        constants$113.const$0.set(seg, x);
    }
    public static int dstBinding$get(MemorySegment seg, long index) {
        return (int)constants$113.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dstBinding$set(MemorySegment seg, long index, int x) {
        constants$113.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstArrayElement$VH() {
        return constants$113.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t dstArrayElement;
     * }
     */
    public static int dstArrayElement$get(MemorySegment seg) {
        return (int)constants$113.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t dstArrayElement;
     * }
     */
    public static void dstArrayElement$set(MemorySegment seg, int x) {
        constants$113.const$1.set(seg, x);
    }
    public static int dstArrayElement$get(MemorySegment seg, long index) {
        return (int)constants$113.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dstArrayElement$set(MemorySegment seg, long index, int x) {
        constants$113.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorCount$VH() {
        return constants$113.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t descriptorCount;
     * }
     */
    public static int descriptorCount$get(MemorySegment seg) {
        return (int)constants$113.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t descriptorCount;
     * }
     */
    public static void descriptorCount$set(MemorySegment seg, int x) {
        constants$113.const$2.set(seg, x);
    }
    public static int descriptorCount$get(MemorySegment seg, long index) {
        return (int)constants$113.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorCount$set(MemorySegment seg, long index, int x) {
        constants$113.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

