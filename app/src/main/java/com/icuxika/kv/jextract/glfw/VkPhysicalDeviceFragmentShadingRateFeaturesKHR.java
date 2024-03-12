// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 pipelineFragmentShadingRate;
 *     VkBool32 primitiveFragmentShadingRate;
 *     VkBool32 attachmentFragmentShadingRate;
 * };
 * }
 */
public class VkPhysicalDeviceFragmentShadingRateFeaturesKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$575.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$576.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$576.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$576.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$576.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$576.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$576.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$576.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$576.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$576.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$576.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pipelineFragmentShadingRate$VH() {
        return constants$576.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 pipelineFragmentShadingRate;
     * }
     */
    public static int pipelineFragmentShadingRate$get(MemorySegment seg) {
        return (int)constants$576.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 pipelineFragmentShadingRate;
     * }
     */
    public static void pipelineFragmentShadingRate$set(MemorySegment seg, int x) {
        constants$576.const$2.set(seg, x);
    }
    public static int pipelineFragmentShadingRate$get(MemorySegment seg, long index) {
        return (int)constants$576.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pipelineFragmentShadingRate$set(MemorySegment seg, long index, int x) {
        constants$576.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle primitiveFragmentShadingRate$VH() {
        return constants$576.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 primitiveFragmentShadingRate;
     * }
     */
    public static int primitiveFragmentShadingRate$get(MemorySegment seg) {
        return (int)constants$576.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 primitiveFragmentShadingRate;
     * }
     */
    public static void primitiveFragmentShadingRate$set(MemorySegment seg, int x) {
        constants$576.const$3.set(seg, x);
    }
    public static int primitiveFragmentShadingRate$get(MemorySegment seg, long index) {
        return (int)constants$576.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void primitiveFragmentShadingRate$set(MemorySegment seg, long index, int x) {
        constants$576.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle attachmentFragmentShadingRate$VH() {
        return constants$576.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 attachmentFragmentShadingRate;
     * }
     */
    public static int attachmentFragmentShadingRate$get(MemorySegment seg) {
        return (int)constants$576.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 attachmentFragmentShadingRate;
     * }
     */
    public static void attachmentFragmentShadingRate$set(MemorySegment seg, int x) {
        constants$576.const$4.set(seg, x);
    }
    public static int attachmentFragmentShadingRate$get(MemorySegment seg, long index) {
        return (int)constants$576.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void attachmentFragmentShadingRate$set(MemorySegment seg, long index, int x) {
        constants$576.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


