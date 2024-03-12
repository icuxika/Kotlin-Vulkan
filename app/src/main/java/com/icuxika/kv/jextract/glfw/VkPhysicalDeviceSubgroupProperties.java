// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceSubgroupProperties {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t subgroupSize;
 *     VkShaderStageFlags supportedStages;
 *     VkSubgroupFeatureFlags supportedOperations;
 *     VkBool32 quadOperationsInAllStages;
 * };
 * }
 */
public class VkPhysicalDeviceSubgroupProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$202.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$202.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$202.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$202.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$202.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$202.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$202.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$202.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$202.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$202.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$202.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subgroupSize$VH() {
        return constants$202.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t subgroupSize;
     * }
     */
    public static int subgroupSize$get(MemorySegment seg) {
        return (int)constants$202.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t subgroupSize;
     * }
     */
    public static void subgroupSize$set(MemorySegment seg, int x) {
        constants$202.const$5.set(seg, x);
    }
    public static int subgroupSize$get(MemorySegment seg, long index) {
        return (int)constants$202.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void subgroupSize$set(MemorySegment seg, long index, int x) {
        constants$202.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle supportedStages$VH() {
        return constants$203.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkShaderStageFlags supportedStages;
     * }
     */
    public static int supportedStages$get(MemorySegment seg) {
        return (int)constants$203.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkShaderStageFlags supportedStages;
     * }
     */
    public static void supportedStages$set(MemorySegment seg, int x) {
        constants$203.const$0.set(seg, x);
    }
    public static int supportedStages$get(MemorySegment seg, long index) {
        return (int)constants$203.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void supportedStages$set(MemorySegment seg, long index, int x) {
        constants$203.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle supportedOperations$VH() {
        return constants$203.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSubgroupFeatureFlags supportedOperations;
     * }
     */
    public static int supportedOperations$get(MemorySegment seg) {
        return (int)constants$203.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSubgroupFeatureFlags supportedOperations;
     * }
     */
    public static void supportedOperations$set(MemorySegment seg, int x) {
        constants$203.const$1.set(seg, x);
    }
    public static int supportedOperations$get(MemorySegment seg, long index) {
        return (int)constants$203.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void supportedOperations$set(MemorySegment seg, long index, int x) {
        constants$203.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle quadOperationsInAllStages$VH() {
        return constants$203.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 quadOperationsInAllStages;
     * }
     */
    public static int quadOperationsInAllStages$get(MemorySegment seg) {
        return (int)constants$203.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 quadOperationsInAllStages;
     * }
     */
    public static void quadOperationsInAllStages$set(MemorySegment seg, int x) {
        constants$203.const$2.set(seg, x);
    }
    public static int quadOperationsInAllStages$get(MemorySegment seg, long index) {
        return (int)constants$203.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void quadOperationsInAllStages$set(MemorySegment seg, long index, int x) {
        constants$203.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


