// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkVertexInputBindingDescription {
 *     uint32_t binding;
 *     uint32_t stride;
 *     VkVertexInputRate inputRate;
 * };
 * }
 */
public class VkVertexInputBindingDescription {

    public static MemoryLayout $LAYOUT() {
        return constants$85.const$1;
    }
    public static VarHandle binding$VH() {
        return constants$85.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t binding;
     * }
     */
    public static int binding$get(MemorySegment seg) {
        return (int)constants$85.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t binding;
     * }
     */
    public static void binding$set(MemorySegment seg, int x) {
        constants$85.const$2.set(seg, x);
    }
    public static int binding$get(MemorySegment seg, long index) {
        return (int)constants$85.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void binding$set(MemorySegment seg, long index, int x) {
        constants$85.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stride$VH() {
        return constants$85.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t stride;
     * }
     */
    public static int stride$get(MemorySegment seg) {
        return (int)constants$85.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t stride;
     * }
     */
    public static void stride$set(MemorySegment seg, int x) {
        constants$85.const$3.set(seg, x);
    }
    public static int stride$get(MemorySegment seg, long index) {
        return (int)constants$85.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void stride$set(MemorySegment seg, long index, int x) {
        constants$85.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle inputRate$VH() {
        return constants$85.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkVertexInputRate inputRate;
     * }
     */
    public static int inputRate$get(MemorySegment seg) {
        return (int)constants$85.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkVertexInputRate inputRate;
     * }
     */
    public static void inputRate$set(MemorySegment seg, int x) {
        constants$85.const$4.set(seg, x);
    }
    public static int inputRate$get(MemorySegment seg, long index) {
        return (int)constants$85.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void inputRate$set(MemorySegment seg, long index, int x) {
        constants$85.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

