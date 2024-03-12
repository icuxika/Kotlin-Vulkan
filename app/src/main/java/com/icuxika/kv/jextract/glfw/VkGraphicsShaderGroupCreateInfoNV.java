// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkGraphicsShaderGroupCreateInfoNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t stageCount;
 *     const VkPipelineShaderStageCreateInfo* pStages;
 *     const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
 *     const VkPipelineTessellationStateCreateInfo* pTessellationState;
 * };
 * }
 */
public class VkGraphicsShaderGroupCreateInfoNV {

    public static MemoryLayout $LAYOUT() {
        return constants$824.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$825.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$825.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$825.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$825.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$825.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$825.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$825.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$825.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$825.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$825.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stageCount$VH() {
        return constants$825.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t stageCount;
     * }
     */
    public static int stageCount$get(MemorySegment seg) {
        return (int)constants$825.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t stageCount;
     * }
     */
    public static void stageCount$set(MemorySegment seg, int x) {
        constants$825.const$2.set(seg, x);
    }
    public static int stageCount$get(MemorySegment seg, long index) {
        return (int)constants$825.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void stageCount$set(MemorySegment seg, long index, int x) {
        constants$825.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStages$VH() {
        return constants$825.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineShaderStageCreateInfo* pStages;
     * }
     */
    public static MemorySegment pStages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$825.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineShaderStageCreateInfo* pStages;
     * }
     */
    public static void pStages$set(MemorySegment seg, MemorySegment x) {
        constants$825.const$3.set(seg, x);
    }
    public static MemorySegment pStages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$825.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pStages$set(MemorySegment seg, long index, MemorySegment x) {
        constants$825.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pVertexInputState$VH() {
        return constants$825.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
     * }
     */
    public static MemorySegment pVertexInputState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$825.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
     * }
     */
    public static void pVertexInputState$set(MemorySegment seg, MemorySegment x) {
        constants$825.const$4.set(seg, x);
    }
    public static MemorySegment pVertexInputState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$825.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pVertexInputState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$825.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pTessellationState$VH() {
        return constants$825.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineTessellationStateCreateInfo* pTessellationState;
     * }
     */
    public static MemorySegment pTessellationState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$825.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineTessellationStateCreateInfo* pTessellationState;
     * }
     */
    public static void pTessellationState$set(MemorySegment seg, MemorySegment x) {
        constants$825.const$5.set(seg, x);
    }
    public static MemorySegment pTessellationState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$825.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pTessellationState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$825.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

