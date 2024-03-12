// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkClearRect {
 *     VkRect2D rect;
 *     uint32_t baseArrayLayer;
 *     uint32_t layerCount;
 * };
 * }
 */
public class VkClearRect {

    public static MemoryLayout $LAYOUT() {
        return constants$137.const$4;
    }
    public static MemorySegment rect$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle baseArrayLayer$VH() {
        return constants$137.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t baseArrayLayer;
     * }
     */
    public static int baseArrayLayer$get(MemorySegment seg) {
        return (int)constants$137.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t baseArrayLayer;
     * }
     */
    public static void baseArrayLayer$set(MemorySegment seg, int x) {
        constants$137.const$5.set(seg, x);
    }
    public static int baseArrayLayer$get(MemorySegment seg, long index) {
        return (int)constants$137.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void baseArrayLayer$set(MemorySegment seg, long index, int x) {
        constants$137.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle layerCount$VH() {
        return constants$138.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t layerCount;
     * }
     */
    public static int layerCount$get(MemorySegment seg) {
        return (int)constants$138.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t layerCount;
     * }
     */
    public static void layerCount$set(MemorySegment seg, int x) {
        constants$138.const$0.set(seg, x);
    }
    public static int layerCount$get(MemorySegment seg, long index) {
        return (int)constants$138.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void layerCount$set(MemorySegment seg, long index, int x) {
        constants$138.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


