// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkTraceRaysIndirectCommandKHR {
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t depth;
 * };
 * }
 */
public class VkTraceRaysIndirectCommandKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$1069.const$5;
    }
    public static VarHandle width$VH() {
        return constants$1070.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$1070.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$1070.const$0.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$1070.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$1070.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$1070.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$1070.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$1070.const$1.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$1070.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$1070.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle depth$VH() {
        return constants$1070.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t depth;
     * }
     */
    public static int depth$get(MemorySegment seg) {
        return (int)constants$1070.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t depth;
     * }
     */
    public static void depth$set(MemorySegment seg, int x) {
        constants$1070.const$2.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)constants$1070.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        constants$1070.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

