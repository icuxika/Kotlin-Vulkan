// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t inputAttachmentCount;
 *     const VkAttachmentReference* pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     const VkAttachmentReference* pColorAttachments;
 *     const VkAttachmentReference* pResolveAttachments;
 *     const VkAttachmentReference* pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     const uint32_t* pPreserveAttachments;
 * };
 * }
 */
public class VkSubpassDescription {

    public static MemoryLayout $LAYOUT() {
        return constants$125.const$1;
    }
    public static VarHandle flags$VH() {
        return constants$125.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSubpassDescriptionFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$125.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSubpassDescriptionFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$125.const$2.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$125.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$125.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pipelineBindPoint$VH() {
        return constants$125.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineBindPoint pipelineBindPoint;
     * }
     */
    public static int pipelineBindPoint$get(MemorySegment seg) {
        return (int)constants$125.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineBindPoint pipelineBindPoint;
     * }
     */
    public static void pipelineBindPoint$set(MemorySegment seg, int x) {
        constants$125.const$3.set(seg, x);
    }
    public static int pipelineBindPoint$get(MemorySegment seg, long index) {
        return (int)constants$125.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pipelineBindPoint$set(MemorySegment seg, long index, int x) {
        constants$125.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle inputAttachmentCount$VH() {
        return constants$125.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t inputAttachmentCount;
     * }
     */
    public static int inputAttachmentCount$get(MemorySegment seg) {
        return (int)constants$125.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t inputAttachmentCount;
     * }
     */
    public static void inputAttachmentCount$set(MemorySegment seg, int x) {
        constants$125.const$4.set(seg, x);
    }
    public static int inputAttachmentCount$get(MemorySegment seg, long index) {
        return (int)constants$125.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void inputAttachmentCount$set(MemorySegment seg, long index, int x) {
        constants$125.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pInputAttachments$VH() {
        return constants$125.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkAttachmentReference* pInputAttachments;
     * }
     */
    public static MemorySegment pInputAttachments$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkAttachmentReference* pInputAttachments;
     * }
     */
    public static void pInputAttachments$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$5.set(seg, x);
    }
    public static MemorySegment pInputAttachments$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pInputAttachments$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle colorAttachmentCount$VH() {
        return constants$126.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t colorAttachmentCount;
     * }
     */
    public static int colorAttachmentCount$get(MemorySegment seg) {
        return (int)constants$126.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t colorAttachmentCount;
     * }
     */
    public static void colorAttachmentCount$set(MemorySegment seg, int x) {
        constants$126.const$0.set(seg, x);
    }
    public static int colorAttachmentCount$get(MemorySegment seg, long index) {
        return (int)constants$126.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void colorAttachmentCount$set(MemorySegment seg, long index, int x) {
        constants$126.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pColorAttachments$VH() {
        return constants$126.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkAttachmentReference* pColorAttachments;
     * }
     */
    public static MemorySegment pColorAttachments$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkAttachmentReference* pColorAttachments;
     * }
     */
    public static void pColorAttachments$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$1.set(seg, x);
    }
    public static MemorySegment pColorAttachments$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pColorAttachments$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pResolveAttachments$VH() {
        return constants$126.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkAttachmentReference* pResolveAttachments;
     * }
     */
    public static MemorySegment pResolveAttachments$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkAttachmentReference* pResolveAttachments;
     * }
     */
    public static void pResolveAttachments$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$2.set(seg, x);
    }
    public static MemorySegment pResolveAttachments$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pResolveAttachments$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDepthStencilAttachment$VH() {
        return constants$126.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkAttachmentReference* pDepthStencilAttachment;
     * }
     */
    public static MemorySegment pDepthStencilAttachment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkAttachmentReference* pDepthStencilAttachment;
     * }
     */
    public static void pDepthStencilAttachment$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$3.set(seg, x);
    }
    public static MemorySegment pDepthStencilAttachment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pDepthStencilAttachment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle preserveAttachmentCount$VH() {
        return constants$126.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t preserveAttachmentCount;
     * }
     */
    public static int preserveAttachmentCount$get(MemorySegment seg) {
        return (int)constants$126.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t preserveAttachmentCount;
     * }
     */
    public static void preserveAttachmentCount$set(MemorySegment seg, int x) {
        constants$126.const$4.set(seg, x);
    }
    public static int preserveAttachmentCount$get(MemorySegment seg, long index) {
        return (int)constants$126.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void preserveAttachmentCount$set(MemorySegment seg, long index, int x) {
        constants$126.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pPreserveAttachments$VH() {
        return constants$126.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const uint32_t* pPreserveAttachments;
     * }
     */
    public static MemorySegment pPreserveAttachments$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const uint32_t* pPreserveAttachments;
     * }
     */
    public static void pPreserveAttachments$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$5.set(seg, x);
    }
    public static MemorySegment pPreserveAttachments$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pPreserveAttachments$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

