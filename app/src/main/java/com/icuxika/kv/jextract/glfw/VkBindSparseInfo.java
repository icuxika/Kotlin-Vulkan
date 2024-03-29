// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkBindSparseInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t waitSemaphoreCount;
 *     const VkSemaphore* pWaitSemaphores;
 *     uint32_t bufferBindCount;
 *     const VkSparseBufferMemoryBindInfo* pBufferBinds;
 *     uint32_t imageOpaqueBindCount;
 *     const VkSparseImageOpaqueMemoryBindInfo* pImageOpaqueBinds;
 *     uint32_t imageBindCount;
 *     const VkSparseImageMemoryBindInfo* pImageBinds;
 *     uint32_t signalSemaphoreCount;
 *     const VkSemaphore* pSignalSemaphores;
 * };
 * }
 */
public class VkBindSparseInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$64.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$64.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$64.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$64.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$64.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$64.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$64.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$64.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$64.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$64.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$64.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle waitSemaphoreCount$VH() {
        return constants$64.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t waitSemaphoreCount;
     * }
     */
    public static int waitSemaphoreCount$get(MemorySegment seg) {
        return (int)constants$64.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t waitSemaphoreCount;
     * }
     */
    public static void waitSemaphoreCount$set(MemorySegment seg, int x) {
        constants$64.const$4.set(seg, x);
    }
    public static int waitSemaphoreCount$get(MemorySegment seg, long index) {
        return (int)constants$64.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void waitSemaphoreCount$set(MemorySegment seg, long index, int x) {
        constants$64.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pWaitSemaphores$VH() {
        return constants$64.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSemaphore* pWaitSemaphores;
     * }
     */
    public static MemorySegment pWaitSemaphores$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$64.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSemaphore* pWaitSemaphores;
     * }
     */
    public static void pWaitSemaphores$set(MemorySegment seg, MemorySegment x) {
        constants$64.const$5.set(seg, x);
    }
    public static MemorySegment pWaitSemaphores$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$64.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pWaitSemaphores$set(MemorySegment seg, long index, MemorySegment x) {
        constants$64.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bufferBindCount$VH() {
        return constants$65.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t bufferBindCount;
     * }
     */
    public static int bufferBindCount$get(MemorySegment seg) {
        return (int)constants$65.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t bufferBindCount;
     * }
     */
    public static void bufferBindCount$set(MemorySegment seg, int x) {
        constants$65.const$0.set(seg, x);
    }
    public static int bufferBindCount$get(MemorySegment seg, long index) {
        return (int)constants$65.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bufferBindCount$set(MemorySegment seg, long index, int x) {
        constants$65.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pBufferBinds$VH() {
        return constants$65.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSparseBufferMemoryBindInfo* pBufferBinds;
     * }
     */
    public static MemorySegment pBufferBinds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$65.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSparseBufferMemoryBindInfo* pBufferBinds;
     * }
     */
    public static void pBufferBinds$set(MemorySegment seg, MemorySegment x) {
        constants$65.const$1.set(seg, x);
    }
    public static MemorySegment pBufferBinds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$65.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pBufferBinds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$65.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageOpaqueBindCount$VH() {
        return constants$65.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t imageOpaqueBindCount;
     * }
     */
    public static int imageOpaqueBindCount$get(MemorySegment seg) {
        return (int)constants$65.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t imageOpaqueBindCount;
     * }
     */
    public static void imageOpaqueBindCount$set(MemorySegment seg, int x) {
        constants$65.const$2.set(seg, x);
    }
    public static int imageOpaqueBindCount$get(MemorySegment seg, long index) {
        return (int)constants$65.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void imageOpaqueBindCount$set(MemorySegment seg, long index, int x) {
        constants$65.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pImageOpaqueBinds$VH() {
        return constants$65.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSparseImageOpaqueMemoryBindInfo* pImageOpaqueBinds;
     * }
     */
    public static MemorySegment pImageOpaqueBinds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$65.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSparseImageOpaqueMemoryBindInfo* pImageOpaqueBinds;
     * }
     */
    public static void pImageOpaqueBinds$set(MemorySegment seg, MemorySegment x) {
        constants$65.const$3.set(seg, x);
    }
    public static MemorySegment pImageOpaqueBinds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$65.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pImageOpaqueBinds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$65.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageBindCount$VH() {
        return constants$65.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t imageBindCount;
     * }
     */
    public static int imageBindCount$get(MemorySegment seg) {
        return (int)constants$65.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t imageBindCount;
     * }
     */
    public static void imageBindCount$set(MemorySegment seg, int x) {
        constants$65.const$4.set(seg, x);
    }
    public static int imageBindCount$get(MemorySegment seg, long index) {
        return (int)constants$65.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void imageBindCount$set(MemorySegment seg, long index, int x) {
        constants$65.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pImageBinds$VH() {
        return constants$65.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSparseImageMemoryBindInfo* pImageBinds;
     * }
     */
    public static MemorySegment pImageBinds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$65.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSparseImageMemoryBindInfo* pImageBinds;
     * }
     */
    public static void pImageBinds$set(MemorySegment seg, MemorySegment x) {
        constants$65.const$5.set(seg, x);
    }
    public static MemorySegment pImageBinds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$65.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pImageBinds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$65.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle signalSemaphoreCount$VH() {
        return constants$66.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t signalSemaphoreCount;
     * }
     */
    public static int signalSemaphoreCount$get(MemorySegment seg) {
        return (int)constants$66.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t signalSemaphoreCount;
     * }
     */
    public static void signalSemaphoreCount$set(MemorySegment seg, int x) {
        constants$66.const$0.set(seg, x);
    }
    public static int signalSemaphoreCount$get(MemorySegment seg, long index) {
        return (int)constants$66.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void signalSemaphoreCount$set(MemorySegment seg, long index, int x) {
        constants$66.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSignalSemaphores$VH() {
        return constants$66.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSemaphore* pSignalSemaphores;
     * }
     */
    public static MemorySegment pSignalSemaphores$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$66.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSemaphore* pSignalSemaphores;
     * }
     */
    public static void pSignalSemaphores$set(MemorySegment seg, MemorySegment x) {
        constants$66.const$1.set(seg, x);
    }
    public static MemorySegment pSignalSemaphores$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$66.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pSignalSemaphores$set(MemorySegment seg, long index, MemorySegment x) {
        constants$66.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


