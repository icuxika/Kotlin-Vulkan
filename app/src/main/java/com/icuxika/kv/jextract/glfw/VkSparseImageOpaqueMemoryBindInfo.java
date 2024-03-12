// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkSparseImageOpaqueMemoryBindInfo {
 *     VkImage image;
 *     uint32_t bindCount;
 *     const VkSparseMemoryBind* pBinds;
 * };
 * }
 */
public class VkSparseImageOpaqueMemoryBindInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$61.const$3;
    }
    public static VarHandle image$VH() {
        return constants$61.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImage image;
     * }
     */
    public static MemorySegment image$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$61.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImage image;
     * }
     */
    public static void image$set(MemorySegment seg, MemorySegment x) {
        constants$61.const$4.set(seg, x);
    }
    public static MemorySegment image$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$61.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void image$set(MemorySegment seg, long index, MemorySegment x) {
        constants$61.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bindCount$VH() {
        return constants$61.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t bindCount;
     * }
     */
    public static int bindCount$get(MemorySegment seg) {
        return (int)constants$61.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t bindCount;
     * }
     */
    public static void bindCount$set(MemorySegment seg, int x) {
        constants$61.const$5.set(seg, x);
    }
    public static int bindCount$get(MemorySegment seg, long index) {
        return (int)constants$61.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bindCount$set(MemorySegment seg, long index, int x) {
        constants$61.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pBinds$VH() {
        return constants$62.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSparseMemoryBind* pBinds;
     * }
     */
    public static MemorySegment pBinds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$62.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSparseMemoryBind* pBinds;
     * }
     */
    public static void pBinds$set(MemorySegment seg, MemorySegment x) {
        constants$62.const$0.set(seg, x);
    }
    public static MemorySegment pBinds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$62.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pBinds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$62.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


