// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkGraphicsPipelineCreateInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     const VkPipelineShaderStageCreateInfo* pStages;
 *     const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
 *     const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState;
 *     const VkPipelineTessellationStateCreateInfo* pTessellationState;
 *     const VkPipelineViewportStateCreateInfo* pViewportState;
 *     const VkPipelineRasterizationStateCreateInfo* pRasterizationState;
 *     const VkPipelineMultisampleStateCreateInfo* pMultisampleState;
 *     const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState;
 *     const VkPipelineColorBlendStateCreateInfo* pColorBlendState;
 *     const VkPipelineDynamicStateCreateInfo* pDynamicState;
 *     VkPipelineLayout layout;
 *     VkRenderPass renderPass;
 *     uint32_t subpass;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * };
 * }
 */
public class VkGraphicsPipelineCreateInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$103.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$103.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$103.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$103.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$103.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$103.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$103.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$103.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$103.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$103.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$103.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$103.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineCreateFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$103.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineCreateFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$103.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$103.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$103.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stageCount$VH() {
        return constants$104.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t stageCount;
     * }
     */
    public static int stageCount$get(MemorySegment seg) {
        return (int)constants$104.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t stageCount;
     * }
     */
    public static void stageCount$set(MemorySegment seg, int x) {
        constants$104.const$0.set(seg, x);
    }
    public static int stageCount$get(MemorySegment seg, long index) {
        return (int)constants$104.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void stageCount$set(MemorySegment seg, long index, int x) {
        constants$104.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStages$VH() {
        return constants$104.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineShaderStageCreateInfo* pStages;
     * }
     */
    public static MemorySegment pStages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineShaderStageCreateInfo* pStages;
     * }
     */
    public static void pStages$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$1.set(seg, x);
    }
    public static MemorySegment pStages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pStages$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pVertexInputState$VH() {
        return constants$104.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
     * }
     */
    public static MemorySegment pVertexInputState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineVertexInputStateCreateInfo* pVertexInputState;
     * }
     */
    public static void pVertexInputState$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$2.set(seg, x);
    }
    public static MemorySegment pVertexInputState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pVertexInputState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pInputAssemblyState$VH() {
        return constants$104.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState;
     * }
     */
    public static MemorySegment pInputAssemblyState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState;
     * }
     */
    public static void pInputAssemblyState$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$3.set(seg, x);
    }
    public static MemorySegment pInputAssemblyState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pInputAssemblyState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pTessellationState$VH() {
        return constants$104.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineTessellationStateCreateInfo* pTessellationState;
     * }
     */
    public static MemorySegment pTessellationState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineTessellationStateCreateInfo* pTessellationState;
     * }
     */
    public static void pTessellationState$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$4.set(seg, x);
    }
    public static MemorySegment pTessellationState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pTessellationState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pViewportState$VH() {
        return constants$104.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineViewportStateCreateInfo* pViewportState;
     * }
     */
    public static MemorySegment pViewportState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$104.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineViewportStateCreateInfo* pViewportState;
     * }
     */
    public static void pViewportState$set(MemorySegment seg, MemorySegment x) {
        constants$104.const$5.set(seg, x);
    }
    public static MemorySegment pViewportState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$104.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pViewportState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$104.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pRasterizationState$VH() {
        return constants$105.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineRasterizationStateCreateInfo* pRasterizationState;
     * }
     */
    public static MemorySegment pRasterizationState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$105.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineRasterizationStateCreateInfo* pRasterizationState;
     * }
     */
    public static void pRasterizationState$set(MemorySegment seg, MemorySegment x) {
        constants$105.const$0.set(seg, x);
    }
    public static MemorySegment pRasterizationState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$105.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pRasterizationState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$105.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pMultisampleState$VH() {
        return constants$105.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineMultisampleStateCreateInfo* pMultisampleState;
     * }
     */
    public static MemorySegment pMultisampleState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$105.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineMultisampleStateCreateInfo* pMultisampleState;
     * }
     */
    public static void pMultisampleState$set(MemorySegment seg, MemorySegment x) {
        constants$105.const$1.set(seg, x);
    }
    public static MemorySegment pMultisampleState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$105.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pMultisampleState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$105.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDepthStencilState$VH() {
        return constants$105.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState;
     * }
     */
    public static MemorySegment pDepthStencilState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$105.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState;
     * }
     */
    public static void pDepthStencilState$set(MemorySegment seg, MemorySegment x) {
        constants$105.const$2.set(seg, x);
    }
    public static MemorySegment pDepthStencilState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$105.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pDepthStencilState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$105.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pColorBlendState$VH() {
        return constants$105.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineColorBlendStateCreateInfo* pColorBlendState;
     * }
     */
    public static MemorySegment pColorBlendState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$105.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineColorBlendStateCreateInfo* pColorBlendState;
     * }
     */
    public static void pColorBlendState$set(MemorySegment seg, MemorySegment x) {
        constants$105.const$3.set(seg, x);
    }
    public static MemorySegment pColorBlendState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$105.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pColorBlendState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$105.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDynamicState$VH() {
        return constants$105.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineDynamicStateCreateInfo* pDynamicState;
     * }
     */
    public static MemorySegment pDynamicState$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$105.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineDynamicStateCreateInfo* pDynamicState;
     * }
     */
    public static void pDynamicState$set(MemorySegment seg, MemorySegment x) {
        constants$105.const$4.set(seg, x);
    }
    public static MemorySegment pDynamicState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$105.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pDynamicState$set(MemorySegment seg, long index, MemorySegment x) {
        constants$105.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle layout$VH() {
        return constants$105.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineLayout layout;
     * }
     */
    public static MemorySegment layout$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$105.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineLayout layout;
     * }
     */
    public static void layout$set(MemorySegment seg, MemorySegment x) {
        constants$105.const$5.set(seg, x);
    }
    public static MemorySegment layout$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$105.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void layout$set(MemorySegment seg, long index, MemorySegment x) {
        constants$105.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle renderPass$VH() {
        return constants$106.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkRenderPass renderPass;
     * }
     */
    public static MemorySegment renderPass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$106.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkRenderPass renderPass;
     * }
     */
    public static void renderPass$set(MemorySegment seg, MemorySegment x) {
        constants$106.const$0.set(seg, x);
    }
    public static MemorySegment renderPass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$106.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void renderPass$set(MemorySegment seg, long index, MemorySegment x) {
        constants$106.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subpass$VH() {
        return constants$106.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t subpass;
     * }
     */
    public static int subpass$get(MemorySegment seg) {
        return (int)constants$106.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t subpass;
     * }
     */
    public static void subpass$set(MemorySegment seg, int x) {
        constants$106.const$1.set(seg, x);
    }
    public static int subpass$get(MemorySegment seg, long index) {
        return (int)constants$106.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void subpass$set(MemorySegment seg, long index, int x) {
        constants$106.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle basePipelineHandle$VH() {
        return constants$106.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipeline basePipelineHandle;
     * }
     */
    public static MemorySegment basePipelineHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$106.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipeline basePipelineHandle;
     * }
     */
    public static void basePipelineHandle$set(MemorySegment seg, MemorySegment x) {
        constants$106.const$2.set(seg, x);
    }
    public static MemorySegment basePipelineHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$106.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void basePipelineHandle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$106.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle basePipelineIndex$VH() {
        return constants$106.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t basePipelineIndex;
     * }
     */
    public static int basePipelineIndex$get(MemorySegment seg) {
        return (int)constants$106.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t basePipelineIndex;
     * }
     */
    public static void basePipelineIndex$set(MemorySegment seg, int x) {
        constants$106.const$3.set(seg, x);
    }
    public static int basePipelineIndex$get(MemorySegment seg, long index) {
        return (int)constants$106.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void basePipelineIndex$set(MemorySegment seg, long index, int x) {
        constants$106.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


