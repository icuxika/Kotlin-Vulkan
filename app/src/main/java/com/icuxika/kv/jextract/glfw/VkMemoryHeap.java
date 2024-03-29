// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkMemoryHeap {
 *     VkDeviceSize size;
 *     VkMemoryHeapFlags flags;
 * };
 * }
 */
public class VkMemoryHeap {

    public static MemoryLayout $LAYOUT() {
        return constants$21.const$3;
    }
    public static VarHandle size$VH() {
        return constants$21.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static long size$get(MemorySegment seg) {
        return (long)constants$21.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize size;
     * }
     */
    public static void size$set(MemorySegment seg, long x) {
        constants$21.const$4.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)constants$21.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        constants$21.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$21.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkMemoryHeapFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$21.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkMemoryHeapFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$21.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$21.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$21.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


