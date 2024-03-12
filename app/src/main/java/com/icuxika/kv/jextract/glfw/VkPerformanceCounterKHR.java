// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPerformanceCounterKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkPerformanceCounterUnitKHR unit;
 *     VkPerformanceCounterScopeKHR scope;
 *     VkPerformanceCounterStorageKHR storage;
 *     uint8_t uuid[16];
 * };
 * }
 */
public class VkPerformanceCounterKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$521.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$521.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$521.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$521.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$521.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$521.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$522.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$522.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$522.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$522.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$522.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle unit$VH() {
        return constants$522.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPerformanceCounterUnitKHR unit;
     * }
     */
    public static int unit$get(MemorySegment seg) {
        return (int)constants$522.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPerformanceCounterUnitKHR unit;
     * }
     */
    public static void unit$set(MemorySegment seg, int x) {
        constants$522.const$1.set(seg, x);
    }
    public static int unit$get(MemorySegment seg, long index) {
        return (int)constants$522.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void unit$set(MemorySegment seg, long index, int x) {
        constants$522.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle scope$VH() {
        return constants$522.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPerformanceCounterScopeKHR scope;
     * }
     */
    public static int scope$get(MemorySegment seg) {
        return (int)constants$522.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPerformanceCounterScopeKHR scope;
     * }
     */
    public static void scope$set(MemorySegment seg, int x) {
        constants$522.const$2.set(seg, x);
    }
    public static int scope$get(MemorySegment seg, long index) {
        return (int)constants$522.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void scope$set(MemorySegment seg, long index, int x) {
        constants$522.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle storage$VH() {
        return constants$522.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPerformanceCounterStorageKHR storage;
     * }
     */
    public static int storage$get(MemorySegment seg) {
        return (int)constants$522.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPerformanceCounterStorageKHR storage;
     * }
     */
    public static void storage$set(MemorySegment seg, int x) {
        constants$522.const$3.set(seg, x);
    }
    public static int storage$get(MemorySegment seg, long index) {
        return (int)constants$522.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void storage$set(MemorySegment seg, long index, int x) {
        constants$522.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment uuid$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


