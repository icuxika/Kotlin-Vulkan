// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceInlineUniformBlockProperties {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t maxInlineUniformBlockSize;
 *     uint32_t maxPerStageDescriptorInlineUniformBlocks;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
 *     uint32_t maxDescriptorSetInlineUniformBlocks;
 *     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
 * };
 * }
 */
public class VkPhysicalDeviceInlineUniformBlockProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$392.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$392.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$392.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$392.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$392.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$392.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$392.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$392.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$392.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$392.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$392.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxInlineUniformBlockSize$VH() {
        return constants$393.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxInlineUniformBlockSize;
     * }
     */
    public static int maxInlineUniformBlockSize$get(MemorySegment seg) {
        return (int)constants$393.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxInlineUniformBlockSize;
     * }
     */
    public static void maxInlineUniformBlockSize$set(MemorySegment seg, int x) {
        constants$393.const$0.set(seg, x);
    }
    public static int maxInlineUniformBlockSize$get(MemorySegment seg, long index) {
        return (int)constants$393.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxInlineUniformBlockSize$set(MemorySegment seg, long index, int x) {
        constants$393.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorInlineUniformBlocks$VH() {
        return constants$393.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorInlineUniformBlocks;
     * }
     */
    public static int maxPerStageDescriptorInlineUniformBlocks$get(MemorySegment seg) {
        return (int)constants$393.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorInlineUniformBlocks;
     * }
     */
    public static void maxPerStageDescriptorInlineUniformBlocks$set(MemorySegment seg, int x) {
        constants$393.const$1.set(seg, x);
    }
    public static int maxPerStageDescriptorInlineUniformBlocks$get(MemorySegment seg, long index) {
        return (int)constants$393.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorInlineUniformBlocks$set(MemorySegment seg, long index, int x) {
        constants$393.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks$VH() {
        return constants$393.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks$get(MemorySegment seg) {
        return (int)constants$393.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks$set(MemorySegment seg, int x) {
        constants$393.const$2.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks$get(MemorySegment seg, long index) {
        return (int)constants$393.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks$set(MemorySegment seg, long index, int x) {
        constants$393.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetInlineUniformBlocks$VH() {
        return constants$393.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetInlineUniformBlocks;
     * }
     */
    public static int maxDescriptorSetInlineUniformBlocks$get(MemorySegment seg) {
        return (int)constants$393.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetInlineUniformBlocks;
     * }
     */
    public static void maxDescriptorSetInlineUniformBlocks$set(MemorySegment seg, int x) {
        constants$393.const$3.set(seg, x);
    }
    public static int maxDescriptorSetInlineUniformBlocks$get(MemorySegment seg, long index) {
        return (int)constants$393.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetInlineUniformBlocks$set(MemorySegment seg, long index, int x) {
        constants$393.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindInlineUniformBlocks$VH() {
        return constants$393.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindInlineUniformBlocks$get(MemorySegment seg) {
        return (int)constants$393.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindInlineUniformBlocks$set(MemorySegment seg, int x) {
        constants$393.const$4.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindInlineUniformBlocks$get(MemorySegment seg, long index) {
        return (int)constants$393.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindInlineUniformBlocks$set(MemorySegment seg, long index, int x) {
        constants$393.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


