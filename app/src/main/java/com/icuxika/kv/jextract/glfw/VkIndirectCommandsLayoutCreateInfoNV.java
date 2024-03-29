// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkIndirectCommandsLayoutCreateInfoNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkIndirectCommandsLayoutUsageFlagsNV flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t tokenCount;
 *     const VkIndirectCommandsLayoutTokenNV* pTokens;
 *     uint32_t streamCount;
 *     const uint32_t* pStreamStrides;
 * };
 * }
 */
public class VkIndirectCommandsLayoutCreateInfoNV {

    public static MemoryLayout $LAYOUT() {
        return constants$832.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$832.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$832.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$832.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$832.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$832.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$832.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$832.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$832.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$832.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$832.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$832.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkIndirectCommandsLayoutUsageFlagsNV flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$832.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkIndirectCommandsLayoutUsageFlagsNV flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$832.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$832.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$832.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pipelineBindPoint$VH() {
        return constants$833.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineBindPoint pipelineBindPoint;
     * }
     */
    public static int pipelineBindPoint$get(MemorySegment seg) {
        return (int)constants$833.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineBindPoint pipelineBindPoint;
     * }
     */
    public static void pipelineBindPoint$set(MemorySegment seg, int x) {
        constants$833.const$0.set(seg, x);
    }
    public static int pipelineBindPoint$get(MemorySegment seg, long index) {
        return (int)constants$833.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pipelineBindPoint$set(MemorySegment seg, long index, int x) {
        constants$833.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tokenCount$VH() {
        return constants$833.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t tokenCount;
     * }
     */
    public static int tokenCount$get(MemorySegment seg) {
        return (int)constants$833.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t tokenCount;
     * }
     */
    public static void tokenCount$set(MemorySegment seg, int x) {
        constants$833.const$1.set(seg, x);
    }
    public static int tokenCount$get(MemorySegment seg, long index) {
        return (int)constants$833.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void tokenCount$set(MemorySegment seg, long index, int x) {
        constants$833.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pTokens$VH() {
        return constants$833.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkIndirectCommandsLayoutTokenNV* pTokens;
     * }
     */
    public static MemorySegment pTokens$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$833.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkIndirectCommandsLayoutTokenNV* pTokens;
     * }
     */
    public static void pTokens$set(MemorySegment seg, MemorySegment x) {
        constants$833.const$2.set(seg, x);
    }
    public static MemorySegment pTokens$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$833.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pTokens$set(MemorySegment seg, long index, MemorySegment x) {
        constants$833.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle streamCount$VH() {
        return constants$833.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t streamCount;
     * }
     */
    public static int streamCount$get(MemorySegment seg) {
        return (int)constants$833.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t streamCount;
     * }
     */
    public static void streamCount$set(MemorySegment seg, int x) {
        constants$833.const$3.set(seg, x);
    }
    public static int streamCount$get(MemorySegment seg, long index) {
        return (int)constants$833.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void streamCount$set(MemorySegment seg, long index, int x) {
        constants$833.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStreamStrides$VH() {
        return constants$833.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const uint32_t* pStreamStrides;
     * }
     */
    public static MemorySegment pStreamStrides$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$833.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const uint32_t* pStreamStrides;
     * }
     */
    public static void pStreamStrides$set(MemorySegment seg, MemorySegment x) {
        constants$833.const$4.set(seg, x);
    }
    public static MemorySegment pStreamStrides$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$833.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pStreamStrides$set(MemorySegment seg, long index, MemorySegment x) {
        constants$833.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


