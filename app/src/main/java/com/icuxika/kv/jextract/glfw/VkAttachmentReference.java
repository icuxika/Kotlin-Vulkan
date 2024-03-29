// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkAttachmentReference {
 *     uint32_t attachment;
 *     VkImageLayout layout;
 * };
 * }
 */
public class VkAttachmentReference {

    public static MemoryLayout $LAYOUT() {
        return constants$123.const$0;
    }
    public static VarHandle attachment$VH() {
        return constants$123.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t attachment;
     * }
     */
    public static int attachment$get(MemorySegment seg) {
        return (int)constants$123.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t attachment;
     * }
     */
    public static void attachment$set(MemorySegment seg, int x) {
        constants$123.const$1.set(seg, x);
    }
    public static int attachment$get(MemorySegment seg, long index) {
        return (int)constants$123.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void attachment$set(MemorySegment seg, long index, int x) {
        constants$123.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle layout$VH() {
        return constants$123.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageLayout layout;
     * }
     */
    public static int layout$get(MemorySegment seg) {
        return (int)constants$123.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageLayout layout;
     * }
     */
    public static void layout$set(MemorySegment seg, int x) {
        constants$123.const$2.set(seg, x);
    }
    public static int layout$get(MemorySegment seg, long index) {
        return (int)constants$123.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void layout$set(MemorySegment seg, long index, int x) {
        constants$123.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


