// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDrawIndexedIndirectCommand {
 *     uint32_t indexCount;
 *     uint32_t instanceCount;
 *     uint32_t firstIndex;
 *     int32_t vertexOffset;
 *     uint32_t firstInstance;
 * };
 * }
 */
public class VkDrawIndexedIndirectCommand {

    public static MemoryLayout $LAYOUT() {
        return constants$7.const$2;
    }
    public static VarHandle indexCount$VH() {
        return constants$7.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t indexCount;
     * }
     */
    public static int indexCount$get(MemorySegment seg) {
        return (int)constants$7.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t indexCount;
     * }
     */
    public static void indexCount$set(MemorySegment seg, int x) {
        constants$7.const$3.set(seg, x);
    }
    public static int indexCount$get(MemorySegment seg, long index) {
        return (int)constants$7.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void indexCount$set(MemorySegment seg, long index, int x) {
        constants$7.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle instanceCount$VH() {
        return constants$7.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t instanceCount;
     * }
     */
    public static int instanceCount$get(MemorySegment seg) {
        return (int)constants$7.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t instanceCount;
     * }
     */
    public static void instanceCount$set(MemorySegment seg, int x) {
        constants$7.const$4.set(seg, x);
    }
    public static int instanceCount$get(MemorySegment seg, long index) {
        return (int)constants$7.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void instanceCount$set(MemorySegment seg, long index, int x) {
        constants$7.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle firstIndex$VH() {
        return constants$7.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t firstIndex;
     * }
     */
    public static int firstIndex$get(MemorySegment seg) {
        return (int)constants$7.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t firstIndex;
     * }
     */
    public static void firstIndex$set(MemorySegment seg, int x) {
        constants$7.const$5.set(seg, x);
    }
    public static int firstIndex$get(MemorySegment seg, long index) {
        return (int)constants$7.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void firstIndex$set(MemorySegment seg, long index, int x) {
        constants$7.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vertexOffset$VH() {
        return constants$8.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t vertexOffset;
     * }
     */
    public static int vertexOffset$get(MemorySegment seg) {
        return (int)constants$8.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t vertexOffset;
     * }
     */
    public static void vertexOffset$set(MemorySegment seg, int x) {
        constants$8.const$0.set(seg, x);
    }
    public static int vertexOffset$get(MemorySegment seg, long index) {
        return (int)constants$8.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void vertexOffset$set(MemorySegment seg, long index, int x) {
        constants$8.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle firstInstance$VH() {
        return constants$8.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t firstInstance;
     * }
     */
    public static int firstInstance$get(MemorySegment seg) {
        return (int)constants$8.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t firstInstance;
     * }
     */
    public static void firstInstance$set(MemorySegment seg, int x) {
        constants$8.const$1.set(seg, x);
    }
    public static int firstInstance$get(MemorySegment seg, long index) {
        return (int)constants$8.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void firstInstance$set(MemorySegment seg, long index, int x) {
        constants$8.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


