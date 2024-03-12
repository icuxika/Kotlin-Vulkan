// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDescriptorSetAllocateInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDescriptorPool descriptorPool;
 *     uint32_t descriptorSetCount;
 *     const VkDescriptorSetLayout* pSetLayouts;
 * };
 * }
 */
public class VkDescriptorSetAllocateInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$116.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$116.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$116.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$116.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$116.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$116.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$116.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$116.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$116.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$116.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$116.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorPool$VH() {
        return constants$117.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDescriptorPool descriptorPool;
     * }
     */
    public static MemorySegment descriptorPool$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$117.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDescriptorPool descriptorPool;
     * }
     */
    public static void descriptorPool$set(MemorySegment seg, MemorySegment x) {
        constants$117.const$0.set(seg, x);
    }
    public static MemorySegment descriptorPool$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$117.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorPool$set(MemorySegment seg, long index, MemorySegment x) {
        constants$117.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorSetCount$VH() {
        return constants$117.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t descriptorSetCount;
     * }
     */
    public static int descriptorSetCount$get(MemorySegment seg) {
        return (int)constants$117.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t descriptorSetCount;
     * }
     */
    public static void descriptorSetCount$set(MemorySegment seg, int x) {
        constants$117.const$1.set(seg, x);
    }
    public static int descriptorSetCount$get(MemorySegment seg, long index) {
        return (int)constants$117.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorSetCount$set(MemorySegment seg, long index, int x) {
        constants$117.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSetLayouts$VH() {
        return constants$117.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorSetLayout* pSetLayouts;
     * }
     */
    public static MemorySegment pSetLayouts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$117.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorSetLayout* pSetLayouts;
     * }
     */
    public static void pSetLayouts$set(MemorySegment seg, MemorySegment x) {
        constants$117.const$2.set(seg, x);
    }
    public static MemorySegment pSetLayouts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$117.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pSetLayouts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$117.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


