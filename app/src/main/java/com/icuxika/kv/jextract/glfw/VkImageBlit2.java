// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkImageBlit2 {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkImageSubresourceLayers srcSubresource;
 *     VkOffset3D srcOffsets[2];
 *     VkImageSubresourceLayers dstSubresource;
 *     VkOffset3D dstOffsets[2];
 * };
 * }
 */
public class VkImageBlit2 {

    public static MemoryLayout $LAYOUT() {
        return constants$384.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$385.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$385.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$385.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$385.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$385.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$385.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$385.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$385.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$385.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$385.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment srcSubresource$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment srcOffsets$slice(MemorySegment seg) {
        return seg.asSlice(32, 24);
    }
    public static MemorySegment dstSubresource$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static MemorySegment dstOffsets$slice(MemorySegment seg) {
        return seg.asSlice(72, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


