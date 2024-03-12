// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPipelineMultisampleStateCreateInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkPipelineMultisampleStateCreateFlags flags;
 *     VkSampleCountFlagBits rasterizationSamples;
 *     VkBool32 sampleShadingEnable;
 *     float minSampleShading;
 *     const VkSampleMask* pSampleMask;
 *     VkBool32 alphaToCoverageEnable;
 *     VkBool32 alphaToOneEnable;
 * };
 * }
 */
public class VkPipelineMultisampleStateCreateInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$94.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$94.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$94.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$94.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$94.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$94.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$95.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$95.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$95.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$95.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$95.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$95.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineMultisampleStateCreateFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$95.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineMultisampleStateCreateFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$95.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$95.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$95.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rasterizationSamples$VH() {
        return constants$95.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSampleCountFlagBits rasterizationSamples;
     * }
     */
    public static int rasterizationSamples$get(MemorySegment seg) {
        return (int)constants$95.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSampleCountFlagBits rasterizationSamples;
     * }
     */
    public static void rasterizationSamples$set(MemorySegment seg, int x) {
        constants$95.const$2.set(seg, x);
    }
    public static int rasterizationSamples$get(MemorySegment seg, long index) {
        return (int)constants$95.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void rasterizationSamples$set(MemorySegment seg, long index, int x) {
        constants$95.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sampleShadingEnable$VH() {
        return constants$95.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 sampleShadingEnable;
     * }
     */
    public static int sampleShadingEnable$get(MemorySegment seg) {
        return (int)constants$95.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 sampleShadingEnable;
     * }
     */
    public static void sampleShadingEnable$set(MemorySegment seg, int x) {
        constants$95.const$3.set(seg, x);
    }
    public static int sampleShadingEnable$get(MemorySegment seg, long index) {
        return (int)constants$95.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sampleShadingEnable$set(MemorySegment seg, long index, int x) {
        constants$95.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minSampleShading$VH() {
        return constants$95.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float minSampleShading;
     * }
     */
    public static float minSampleShading$get(MemorySegment seg) {
        return (float)constants$95.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float minSampleShading;
     * }
     */
    public static void minSampleShading$set(MemorySegment seg, float x) {
        constants$95.const$4.set(seg, x);
    }
    public static float minSampleShading$get(MemorySegment seg, long index) {
        return (float)constants$95.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void minSampleShading$set(MemorySegment seg, long index, float x) {
        constants$95.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSampleMask$VH() {
        return constants$95.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSampleMask* pSampleMask;
     * }
     */
    public static MemorySegment pSampleMask$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$95.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSampleMask* pSampleMask;
     * }
     */
    public static void pSampleMask$set(MemorySegment seg, MemorySegment x) {
        constants$95.const$5.set(seg, x);
    }
    public static MemorySegment pSampleMask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$95.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pSampleMask$set(MemorySegment seg, long index, MemorySegment x) {
        constants$95.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle alphaToCoverageEnable$VH() {
        return constants$96.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 alphaToCoverageEnable;
     * }
     */
    public static int alphaToCoverageEnable$get(MemorySegment seg) {
        return (int)constants$96.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 alphaToCoverageEnable;
     * }
     */
    public static void alphaToCoverageEnable$set(MemorySegment seg, int x) {
        constants$96.const$0.set(seg, x);
    }
    public static int alphaToCoverageEnable$get(MemorySegment seg, long index) {
        return (int)constants$96.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void alphaToCoverageEnable$set(MemorySegment seg, long index, int x) {
        constants$96.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle alphaToOneEnable$VH() {
        return constants$96.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 alphaToOneEnable;
     * }
     */
    public static int alphaToOneEnable$get(MemorySegment seg) {
        return (int)constants$96.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 alphaToOneEnable;
     * }
     */
    public static void alphaToOneEnable$set(MemorySegment seg, int x) {
        constants$96.const$1.set(seg, x);
    }
    public static int alphaToOneEnable$get(MemorySegment seg, long index) {
        return (int)constants$96.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void alphaToOneEnable$set(MemorySegment seg, long index, int x) {
        constants$96.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


