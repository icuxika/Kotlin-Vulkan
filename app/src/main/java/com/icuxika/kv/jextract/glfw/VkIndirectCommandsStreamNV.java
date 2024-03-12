// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkIndirectCommandsStreamNV {
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 * };
 * }
 */
public class VkIndirectCommandsStreamNV {

    public static MemoryLayout $LAYOUT() {
        return constants$829.const$1;
    }
    public static VarHandle buffer$VH() {
        return constants$829.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuffer buffer;
     * }
     */
    public static MemorySegment buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$829.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuffer buffer;
     * }
     */
    public static void buffer$set(MemorySegment seg, MemorySegment x) {
        constants$829.const$2.set(seg, x);
    }
    public static MemorySegment buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$829.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$829.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$829.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize offset;
     * }
     */
    public static long offset$get(MemorySegment seg) {
        return (long)constants$829.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize offset;
     * }
     */
    public static void offset$set(MemorySegment seg, long x) {
        constants$829.const$3.set(seg, x);
    }
    public static long offset$get(MemorySegment seg, long index) {
        return (long)constants$829.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, long x) {
        constants$829.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


