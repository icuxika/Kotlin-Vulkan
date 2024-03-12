// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkSparseBufferMemoryBindInfo {
 *     VkBuffer buffer;
 *     uint32_t bindCount;
 *     const VkSparseMemoryBind* pBinds;
 * };
 * }
 */
public class VkSparseBufferMemoryBindInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$60.const$5;
    }
    public static VarHandle buffer$VH() {
        return constants$61.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuffer buffer;
     * }
     */
    public static MemorySegment buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$61.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuffer buffer;
     * }
     */
    public static void buffer$set(MemorySegment seg, MemorySegment x) {
        constants$61.const$0.set(seg, x);
    }
    public static MemorySegment buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$61.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$61.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bindCount$VH() {
        return constants$61.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t bindCount;
     * }
     */
    public static int bindCount$get(MemorySegment seg) {
        return (int)constants$61.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t bindCount;
     * }
     */
    public static void bindCount$set(MemorySegment seg, int x) {
        constants$61.const$1.set(seg, x);
    }
    public static int bindCount$get(MemorySegment seg, long index) {
        return (int)constants$61.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bindCount$set(MemorySegment seg, long index, int x) {
        constants$61.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pBinds$VH() {
        return constants$61.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSparseMemoryBind* pBinds;
     * }
     */
    public static MemorySegment pBinds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$61.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSparseMemoryBind* pBinds;
     * }
     */
    public static void pBinds$set(MemorySegment seg, MemorySegment x) {
        constants$61.const$2.set(seg, x);
    }
    public static MemorySegment pBinds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$61.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pBinds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$61.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


