// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkRenderingInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkRenderingFlags flags;
 *     VkRect2D renderArea;
 *     uint32_t layerCount;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     const VkRenderingAttachmentInfo* pColorAttachments;
 *     const VkRenderingAttachmentInfo* pDepthAttachment;
 *     const VkRenderingAttachmentInfo* pStencilAttachment;
 * };
 * }
 */
public class VkRenderingInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$397.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$397.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$397.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$397.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$397.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$397.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$398.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$398.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$398.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$398.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$398.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$398.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkRenderingFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$398.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkRenderingFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$398.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$398.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$398.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment renderArea$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    public static VarHandle layerCount$VH() {
        return constants$398.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t layerCount;
     * }
     */
    public static int layerCount$get(MemorySegment seg) {
        return (int)constants$398.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t layerCount;
     * }
     */
    public static void layerCount$set(MemorySegment seg, int x) {
        constants$398.const$2.set(seg, x);
    }
    public static int layerCount$get(MemorySegment seg, long index) {
        return (int)constants$398.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void layerCount$set(MemorySegment seg, long index, int x) {
        constants$398.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle viewMask$VH() {
        return constants$398.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t viewMask;
     * }
     */
    public static int viewMask$get(MemorySegment seg) {
        return (int)constants$398.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t viewMask;
     * }
     */
    public static void viewMask$set(MemorySegment seg, int x) {
        constants$398.const$3.set(seg, x);
    }
    public static int viewMask$get(MemorySegment seg, long index) {
        return (int)constants$398.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void viewMask$set(MemorySegment seg, long index, int x) {
        constants$398.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle colorAttachmentCount$VH() {
        return constants$398.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t colorAttachmentCount;
     * }
     */
    public static int colorAttachmentCount$get(MemorySegment seg) {
        return (int)constants$398.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t colorAttachmentCount;
     * }
     */
    public static void colorAttachmentCount$set(MemorySegment seg, int x) {
        constants$398.const$4.set(seg, x);
    }
    public static int colorAttachmentCount$get(MemorySegment seg, long index) {
        return (int)constants$398.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void colorAttachmentCount$set(MemorySegment seg, long index, int x) {
        constants$398.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pColorAttachments$VH() {
        return constants$398.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkRenderingAttachmentInfo* pColorAttachments;
     * }
     */
    public static MemorySegment pColorAttachments$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$398.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkRenderingAttachmentInfo* pColorAttachments;
     * }
     */
    public static void pColorAttachments$set(MemorySegment seg, MemorySegment x) {
        constants$398.const$5.set(seg, x);
    }
    public static MemorySegment pColorAttachments$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$398.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pColorAttachments$set(MemorySegment seg, long index, MemorySegment x) {
        constants$398.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDepthAttachment$VH() {
        return constants$399.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkRenderingAttachmentInfo* pDepthAttachment;
     * }
     */
    public static MemorySegment pDepthAttachment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$399.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkRenderingAttachmentInfo* pDepthAttachment;
     * }
     */
    public static void pDepthAttachment$set(MemorySegment seg, MemorySegment x) {
        constants$399.const$0.set(seg, x);
    }
    public static MemorySegment pDepthAttachment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$399.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pDepthAttachment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$399.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStencilAttachment$VH() {
        return constants$399.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkRenderingAttachmentInfo* pStencilAttachment;
     * }
     */
    public static MemorySegment pStencilAttachment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$399.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkRenderingAttachmentInfo* pStencilAttachment;
     * }
     */
    public static void pStencilAttachment$set(MemorySegment seg, MemorySegment x) {
        constants$399.const$1.set(seg, x);
    }
    public static MemorySegment pStencilAttachment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$399.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pStencilAttachment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$399.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

