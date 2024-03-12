// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkStencilOpState {
 *     VkStencilOp failOp;
 *     VkStencilOp passOp;
 *     VkStencilOp depthFailOp;
 *     VkCompareOp compareOp;
 *     uint32_t compareMask;
 *     uint32_t writeMask;
 *     uint32_t reference;
 * };
 * }
 */
public class VkStencilOpState {

    public static MemoryLayout $LAYOUT() {
        return constants$96.const$2;
    }
    public static VarHandle failOp$VH() {
        return constants$96.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStencilOp failOp;
     * }
     */
    public static int failOp$get(MemorySegment seg) {
        return (int)constants$96.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStencilOp failOp;
     * }
     */
    public static void failOp$set(MemorySegment seg, int x) {
        constants$96.const$3.set(seg, x);
    }
    public static int failOp$get(MemorySegment seg, long index) {
        return (int)constants$96.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void failOp$set(MemorySegment seg, long index, int x) {
        constants$96.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle passOp$VH() {
        return constants$96.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStencilOp passOp;
     * }
     */
    public static int passOp$get(MemorySegment seg) {
        return (int)constants$96.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStencilOp passOp;
     * }
     */
    public static void passOp$set(MemorySegment seg, int x) {
        constants$96.const$4.set(seg, x);
    }
    public static int passOp$get(MemorySegment seg, long index) {
        return (int)constants$96.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void passOp$set(MemorySegment seg, long index, int x) {
        constants$96.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle depthFailOp$VH() {
        return constants$96.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStencilOp depthFailOp;
     * }
     */
    public static int depthFailOp$get(MemorySegment seg) {
        return (int)constants$96.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStencilOp depthFailOp;
     * }
     */
    public static void depthFailOp$set(MemorySegment seg, int x) {
        constants$96.const$5.set(seg, x);
    }
    public static int depthFailOp$get(MemorySegment seg, long index) {
        return (int)constants$96.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void depthFailOp$set(MemorySegment seg, long index, int x) {
        constants$96.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle compareOp$VH() {
        return constants$97.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkCompareOp compareOp;
     * }
     */
    public static int compareOp$get(MemorySegment seg) {
        return (int)constants$97.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkCompareOp compareOp;
     * }
     */
    public static void compareOp$set(MemorySegment seg, int x) {
        constants$97.const$0.set(seg, x);
    }
    public static int compareOp$get(MemorySegment seg, long index) {
        return (int)constants$97.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void compareOp$set(MemorySegment seg, long index, int x) {
        constants$97.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle compareMask$VH() {
        return constants$97.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t compareMask;
     * }
     */
    public static int compareMask$get(MemorySegment seg) {
        return (int)constants$97.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t compareMask;
     * }
     */
    public static void compareMask$set(MemorySegment seg, int x) {
        constants$97.const$1.set(seg, x);
    }
    public static int compareMask$get(MemorySegment seg, long index) {
        return (int)constants$97.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void compareMask$set(MemorySegment seg, long index, int x) {
        constants$97.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle writeMask$VH() {
        return constants$97.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t writeMask;
     * }
     */
    public static int writeMask$get(MemorySegment seg) {
        return (int)constants$97.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t writeMask;
     * }
     */
    public static void writeMask$set(MemorySegment seg, int x) {
        constants$97.const$2.set(seg, x);
    }
    public static int writeMask$get(MemorySegment seg, long index) {
        return (int)constants$97.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void writeMask$set(MemorySegment seg, long index, int x) {
        constants$97.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reference$VH() {
        return constants$97.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t reference;
     * }
     */
    public static int reference$get(MemorySegment seg) {
        return (int)constants$97.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t reference;
     * }
     */
    public static void reference$set(MemorySegment seg, int x) {
        constants$97.const$3.set(seg, x);
    }
    public static int reference$get(MemorySegment seg, long index) {
        return (int)constants$97.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reference$set(MemorySegment seg, long index, int x) {
        constants$97.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


