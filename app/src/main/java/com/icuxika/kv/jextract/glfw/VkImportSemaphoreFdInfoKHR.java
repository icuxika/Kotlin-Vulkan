// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkImportSemaphoreFdInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkSemaphore semaphore;
 *     VkSemaphoreImportFlags flags;
 *     VkExternalSemaphoreHandleTypeFlagBits handleType;
 *     int fd;
 * };
 * }
 */
public class VkImportSemaphoreFdInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$507.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$508.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$508.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$508.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$508.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$508.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$508.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$508.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$508.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$508.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$508.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle semaphore$VH() {
        return constants$508.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSemaphore semaphore;
     * }
     */
    public static MemorySegment semaphore$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$508.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSemaphore semaphore;
     * }
     */
    public static void semaphore$set(MemorySegment seg, MemorySegment x) {
        constants$508.const$2.set(seg, x);
    }
    public static MemorySegment semaphore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$508.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void semaphore$set(MemorySegment seg, long index, MemorySegment x) {
        constants$508.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$508.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSemaphoreImportFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$508.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSemaphoreImportFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$508.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$508.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$508.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle handleType$VH() {
        return constants$508.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkExternalSemaphoreHandleTypeFlagBits handleType;
     * }
     */
    public static int handleType$get(MemorySegment seg) {
        return (int)constants$508.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkExternalSemaphoreHandleTypeFlagBits handleType;
     * }
     */
    public static void handleType$set(MemorySegment seg, int x) {
        constants$508.const$4.set(seg, x);
    }
    public static int handleType$get(MemorySegment seg, long index) {
        return (int)constants$508.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void handleType$set(MemorySegment seg, long index, int x) {
        constants$508.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fd$VH() {
        return constants$508.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int fd;
     * }
     */
    public static int fd$get(MemorySegment seg) {
        return (int)constants$508.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int fd;
     * }
     */
    public static void fd$set(MemorySegment seg, int x) {
        constants$508.const$5.set(seg, x);
    }
    public static int fd$get(MemorySegment seg, long index) {
        return (int)constants$508.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void fd$set(MemorySegment seg, long index, int x) {
        constants$508.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


