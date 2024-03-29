// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkRenderPassCreateInfo2 {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     const VkAttachmentDescription2* pAttachments;
 *     uint32_t subpassCount;
 *     const VkSubpassDescription2* pSubpasses;
 *     uint32_t dependencyCount;
 *     const VkSubpassDependency2* pDependencies;
 *     uint32_t correlatedViewMaskCount;
 *     const uint32_t* pCorrelatedViewMasks;
 * };
 * }
 */
public class VkRenderPassCreateInfo2 {

    public static MemoryLayout $LAYOUT() {
        return constants$298.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$298.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$298.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$298.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$298.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$298.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$298.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$298.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$298.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$298.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$298.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$299.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkRenderPassCreateFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$299.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkRenderPassCreateFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$299.const$0.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$299.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$299.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle attachmentCount$VH() {
        return constants$299.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t attachmentCount;
     * }
     */
    public static int attachmentCount$get(MemorySegment seg) {
        return (int)constants$299.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t attachmentCount;
     * }
     */
    public static void attachmentCount$set(MemorySegment seg, int x) {
        constants$299.const$1.set(seg, x);
    }
    public static int attachmentCount$get(MemorySegment seg, long index) {
        return (int)constants$299.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void attachmentCount$set(MemorySegment seg, long index, int x) {
        constants$299.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pAttachments$VH() {
        return constants$299.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkAttachmentDescription2* pAttachments;
     * }
     */
    public static MemorySegment pAttachments$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkAttachmentDescription2* pAttachments;
     * }
     */
    public static void pAttachments$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$2.set(seg, x);
    }
    public static MemorySegment pAttachments$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pAttachments$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subpassCount$VH() {
        return constants$299.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t subpassCount;
     * }
     */
    public static int subpassCount$get(MemorySegment seg) {
        return (int)constants$299.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t subpassCount;
     * }
     */
    public static void subpassCount$set(MemorySegment seg, int x) {
        constants$299.const$3.set(seg, x);
    }
    public static int subpassCount$get(MemorySegment seg, long index) {
        return (int)constants$299.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void subpassCount$set(MemorySegment seg, long index, int x) {
        constants$299.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSubpasses$VH() {
        return constants$299.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSubpassDescription2* pSubpasses;
     * }
     */
    public static MemorySegment pSubpasses$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSubpassDescription2* pSubpasses;
     * }
     */
    public static void pSubpasses$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$4.set(seg, x);
    }
    public static MemorySegment pSubpasses$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pSubpasses$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dependencyCount$VH() {
        return constants$299.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t dependencyCount;
     * }
     */
    public static int dependencyCount$get(MemorySegment seg) {
        return (int)constants$299.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t dependencyCount;
     * }
     */
    public static void dependencyCount$set(MemorySegment seg, int x) {
        constants$299.const$5.set(seg, x);
    }
    public static int dependencyCount$get(MemorySegment seg, long index) {
        return (int)constants$299.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dependencyCount$set(MemorySegment seg, long index, int x) {
        constants$299.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDependencies$VH() {
        return constants$300.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSubpassDependency2* pDependencies;
     * }
     */
    public static MemorySegment pDependencies$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$300.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSubpassDependency2* pDependencies;
     * }
     */
    public static void pDependencies$set(MemorySegment seg, MemorySegment x) {
        constants$300.const$0.set(seg, x);
    }
    public static MemorySegment pDependencies$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$300.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pDependencies$set(MemorySegment seg, long index, MemorySegment x) {
        constants$300.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle correlatedViewMaskCount$VH() {
        return constants$300.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t correlatedViewMaskCount;
     * }
     */
    public static int correlatedViewMaskCount$get(MemorySegment seg) {
        return (int)constants$300.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t correlatedViewMaskCount;
     * }
     */
    public static void correlatedViewMaskCount$set(MemorySegment seg, int x) {
        constants$300.const$1.set(seg, x);
    }
    public static int correlatedViewMaskCount$get(MemorySegment seg, long index) {
        return (int)constants$300.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void correlatedViewMaskCount$set(MemorySegment seg, long index, int x) {
        constants$300.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pCorrelatedViewMasks$VH() {
        return constants$300.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const uint32_t* pCorrelatedViewMasks;
     * }
     */
    public static MemorySegment pCorrelatedViewMasks$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$300.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const uint32_t* pCorrelatedViewMasks;
     * }
     */
    public static void pCorrelatedViewMasks$set(MemorySegment seg, MemorySegment x) {
        constants$300.const$2.set(seg, x);
    }
    public static MemorySegment pCorrelatedViewMasks$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$300.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pCorrelatedViewMasks$set(MemorySegment seg, long index, MemorySegment x) {
        constants$300.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


