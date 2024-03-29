// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkSubmitInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t waitSemaphoreCount;
 *     const VkSemaphore* pWaitSemaphores;
 *     const VkPipelineStageFlags* pWaitDstStageMask;
 *     uint32_t commandBufferCount;
 *     const VkCommandBuffer* pCommandBuffers;
 *     uint32_t signalSemaphoreCount;
 *     const VkSemaphore* pSignalSemaphores;
 * };
 * }
 */
public class VkSubmitInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$55.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$55.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$55.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$55.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$55.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$55.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$56.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$56.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$56.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$56.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$56.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle waitSemaphoreCount$VH() {
        return constants$56.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t waitSemaphoreCount;
     * }
     */
    public static int waitSemaphoreCount$get(MemorySegment seg) {
        return (int)constants$56.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t waitSemaphoreCount;
     * }
     */
    public static void waitSemaphoreCount$set(MemorySegment seg, int x) {
        constants$56.const$1.set(seg, x);
    }
    public static int waitSemaphoreCount$get(MemorySegment seg, long index) {
        return (int)constants$56.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void waitSemaphoreCount$set(MemorySegment seg, long index, int x) {
        constants$56.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pWaitSemaphores$VH() {
        return constants$56.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSemaphore* pWaitSemaphores;
     * }
     */
    public static MemorySegment pWaitSemaphores$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$56.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSemaphore* pWaitSemaphores;
     * }
     */
    public static void pWaitSemaphores$set(MemorySegment seg, MemorySegment x) {
        constants$56.const$2.set(seg, x);
    }
    public static MemorySegment pWaitSemaphores$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$56.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pWaitSemaphores$set(MemorySegment seg, long index, MemorySegment x) {
        constants$56.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pWaitDstStageMask$VH() {
        return constants$56.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkPipelineStageFlags* pWaitDstStageMask;
     * }
     */
    public static MemorySegment pWaitDstStageMask$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$56.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkPipelineStageFlags* pWaitDstStageMask;
     * }
     */
    public static void pWaitDstStageMask$set(MemorySegment seg, MemorySegment x) {
        constants$56.const$3.set(seg, x);
    }
    public static MemorySegment pWaitDstStageMask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$56.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pWaitDstStageMask$set(MemorySegment seg, long index, MemorySegment x) {
        constants$56.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle commandBufferCount$VH() {
        return constants$56.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t commandBufferCount;
     * }
     */
    public static int commandBufferCount$get(MemorySegment seg) {
        return (int)constants$56.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t commandBufferCount;
     * }
     */
    public static void commandBufferCount$set(MemorySegment seg, int x) {
        constants$56.const$4.set(seg, x);
    }
    public static int commandBufferCount$get(MemorySegment seg, long index) {
        return (int)constants$56.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void commandBufferCount$set(MemorySegment seg, long index, int x) {
        constants$56.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pCommandBuffers$VH() {
        return constants$56.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkCommandBuffer* pCommandBuffers;
     * }
     */
    public static MemorySegment pCommandBuffers$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$56.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkCommandBuffer* pCommandBuffers;
     * }
     */
    public static void pCommandBuffers$set(MemorySegment seg, MemorySegment x) {
        constants$56.const$5.set(seg, x);
    }
    public static MemorySegment pCommandBuffers$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$56.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pCommandBuffers$set(MemorySegment seg, long index, MemorySegment x) {
        constants$56.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle signalSemaphoreCount$VH() {
        return constants$57.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t signalSemaphoreCount;
     * }
     */
    public static int signalSemaphoreCount$get(MemorySegment seg) {
        return (int)constants$57.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t signalSemaphoreCount;
     * }
     */
    public static void signalSemaphoreCount$set(MemorySegment seg, int x) {
        constants$57.const$0.set(seg, x);
    }
    public static int signalSemaphoreCount$get(MemorySegment seg, long index) {
        return (int)constants$57.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void signalSemaphoreCount$set(MemorySegment seg, long index, int x) {
        constants$57.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSignalSemaphores$VH() {
        return constants$57.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSemaphore* pSignalSemaphores;
     * }
     */
    public static MemorySegment pSignalSemaphores$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$57.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSemaphore* pSignalSemaphores;
     * }
     */
    public static void pSignalSemaphores$set(MemorySegment seg, MemorySegment x) {
        constants$57.const$1.set(seg, x);
    }
    public static MemorySegment pSignalSemaphores$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$57.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pSignalSemaphores$set(MemorySegment seg, long index, MemorySegment x) {
        constants$57.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


