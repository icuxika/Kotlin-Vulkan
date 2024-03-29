// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkVertexInputAttributeDescription {
 *     uint32_t location;
 *     uint32_t binding;
 *     VkFormat format;
 *     uint32_t offset;
 * };
 * }
 */
public class VkVertexInputAttributeDescription {

    public static MemoryLayout $LAYOUT() {
        return constants$85.const$5;
    }
    public static VarHandle location$VH() {
        return constants$86.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t location;
     * }
     */
    public static int location$get(MemorySegment seg) {
        return (int)constants$86.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t location;
     * }
     */
    public static void location$set(MemorySegment seg, int x) {
        constants$86.const$0.set(seg, x);
    }
    public static int location$get(MemorySegment seg, long index) {
        return (int)constants$86.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void location$set(MemorySegment seg, long index, int x) {
        constants$86.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle binding$VH() {
        return constants$86.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t binding;
     * }
     */
    public static int binding$get(MemorySegment seg) {
        return (int)constants$86.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t binding;
     * }
     */
    public static void binding$set(MemorySegment seg, int x) {
        constants$86.const$1.set(seg, x);
    }
    public static int binding$get(MemorySegment seg, long index) {
        return (int)constants$86.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void binding$set(MemorySegment seg, long index, int x) {
        constants$86.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$86.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkFormat format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$86.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkFormat format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$86.const$2.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$86.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$86.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$86.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t offset;
     * }
     */
    public static int offset$get(MemorySegment seg) {
        return (int)constants$86.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t offset;
     * }
     */
    public static void offset$set(MemorySegment seg, int x) {
        constants$86.const$3.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)constants$86.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        constants$86.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


