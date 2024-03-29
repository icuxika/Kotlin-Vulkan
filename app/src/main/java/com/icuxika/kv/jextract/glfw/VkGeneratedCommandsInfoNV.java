// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkGeneratedCommandsInfoNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipeline pipeline;
 *     VkIndirectCommandsLayoutNV indirectCommandsLayout;
 *     uint32_t streamCount;
 *     const VkIndirectCommandsStreamNV* pStreams;
 *     uint32_t sequencesCount;
 *     VkBuffer preprocessBuffer;
 *     VkDeviceSize preprocessOffset;
 *     VkDeviceSize preprocessSize;
 *     VkBuffer sequencesCountBuffer;
 *     VkDeviceSize sequencesCountOffset;
 *     VkBuffer sequencesIndexBuffer;
 *     VkDeviceSize sequencesIndexOffset;
 * };
 * }
 */
public class VkGeneratedCommandsInfoNV {

    public static MemoryLayout $LAYOUT() {
        return constants$833.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$834.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$834.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$834.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$834.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$834.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$834.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$834.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$834.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$834.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$834.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pipelineBindPoint$VH() {
        return constants$834.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineBindPoint pipelineBindPoint;
     * }
     */
    public static int pipelineBindPoint$get(MemorySegment seg) {
        return (int)constants$834.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineBindPoint pipelineBindPoint;
     * }
     */
    public static void pipelineBindPoint$set(MemorySegment seg, int x) {
        constants$834.const$2.set(seg, x);
    }
    public static int pipelineBindPoint$get(MemorySegment seg, long index) {
        return (int)constants$834.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pipelineBindPoint$set(MemorySegment seg, long index, int x) {
        constants$834.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pipeline$VH() {
        return constants$834.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipeline pipeline;
     * }
     */
    public static MemorySegment pipeline$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$834.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipeline pipeline;
     * }
     */
    public static void pipeline$set(MemorySegment seg, MemorySegment x) {
        constants$834.const$3.set(seg, x);
    }
    public static MemorySegment pipeline$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$834.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pipeline$set(MemorySegment seg, long index, MemorySegment x) {
        constants$834.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle indirectCommandsLayout$VH() {
        return constants$834.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkIndirectCommandsLayoutNV indirectCommandsLayout;
     * }
     */
    public static MemorySegment indirectCommandsLayout$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$834.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkIndirectCommandsLayoutNV indirectCommandsLayout;
     * }
     */
    public static void indirectCommandsLayout$set(MemorySegment seg, MemorySegment x) {
        constants$834.const$4.set(seg, x);
    }
    public static MemorySegment indirectCommandsLayout$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$834.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void indirectCommandsLayout$set(MemorySegment seg, long index, MemorySegment x) {
        constants$834.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle streamCount$VH() {
        return constants$834.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t streamCount;
     * }
     */
    public static int streamCount$get(MemorySegment seg) {
        return (int)constants$834.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t streamCount;
     * }
     */
    public static void streamCount$set(MemorySegment seg, int x) {
        constants$834.const$5.set(seg, x);
    }
    public static int streamCount$get(MemorySegment seg, long index) {
        return (int)constants$834.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void streamCount$set(MemorySegment seg, long index, int x) {
        constants$834.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStreams$VH() {
        return constants$835.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkIndirectCommandsStreamNV* pStreams;
     * }
     */
    public static MemorySegment pStreams$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$835.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkIndirectCommandsStreamNV* pStreams;
     * }
     */
    public static void pStreams$set(MemorySegment seg, MemorySegment x) {
        constants$835.const$0.set(seg, x);
    }
    public static MemorySegment pStreams$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$835.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pStreams$set(MemorySegment seg, long index, MemorySegment x) {
        constants$835.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sequencesCount$VH() {
        return constants$835.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t sequencesCount;
     * }
     */
    public static int sequencesCount$get(MemorySegment seg) {
        return (int)constants$835.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t sequencesCount;
     * }
     */
    public static void sequencesCount$set(MemorySegment seg, int x) {
        constants$835.const$1.set(seg, x);
    }
    public static int sequencesCount$get(MemorySegment seg, long index) {
        return (int)constants$835.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sequencesCount$set(MemorySegment seg, long index, int x) {
        constants$835.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle preprocessBuffer$VH() {
        return constants$835.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuffer preprocessBuffer;
     * }
     */
    public static MemorySegment preprocessBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$835.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuffer preprocessBuffer;
     * }
     */
    public static void preprocessBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$835.const$2.set(seg, x);
    }
    public static MemorySegment preprocessBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$835.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void preprocessBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$835.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle preprocessOffset$VH() {
        return constants$835.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize preprocessOffset;
     * }
     */
    public static long preprocessOffset$get(MemorySegment seg) {
        return (long)constants$835.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize preprocessOffset;
     * }
     */
    public static void preprocessOffset$set(MemorySegment seg, long x) {
        constants$835.const$3.set(seg, x);
    }
    public static long preprocessOffset$get(MemorySegment seg, long index) {
        return (long)constants$835.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void preprocessOffset$set(MemorySegment seg, long index, long x) {
        constants$835.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle preprocessSize$VH() {
        return constants$835.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize preprocessSize;
     * }
     */
    public static long preprocessSize$get(MemorySegment seg) {
        return (long)constants$835.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize preprocessSize;
     * }
     */
    public static void preprocessSize$set(MemorySegment seg, long x) {
        constants$835.const$4.set(seg, x);
    }
    public static long preprocessSize$get(MemorySegment seg, long index) {
        return (long)constants$835.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void preprocessSize$set(MemorySegment seg, long index, long x) {
        constants$835.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sequencesCountBuffer$VH() {
        return constants$835.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuffer sequencesCountBuffer;
     * }
     */
    public static MemorySegment sequencesCountBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$835.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuffer sequencesCountBuffer;
     * }
     */
    public static void sequencesCountBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$835.const$5.set(seg, x);
    }
    public static MemorySegment sequencesCountBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$835.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sequencesCountBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$835.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sequencesCountOffset$VH() {
        return constants$836.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize sequencesCountOffset;
     * }
     */
    public static long sequencesCountOffset$get(MemorySegment seg) {
        return (long)constants$836.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize sequencesCountOffset;
     * }
     */
    public static void sequencesCountOffset$set(MemorySegment seg, long x) {
        constants$836.const$0.set(seg, x);
    }
    public static long sequencesCountOffset$get(MemorySegment seg, long index) {
        return (long)constants$836.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sequencesCountOffset$set(MemorySegment seg, long index, long x) {
        constants$836.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sequencesIndexBuffer$VH() {
        return constants$836.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuffer sequencesIndexBuffer;
     * }
     */
    public static MemorySegment sequencesIndexBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$836.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuffer sequencesIndexBuffer;
     * }
     */
    public static void sequencesIndexBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$836.const$1.set(seg, x);
    }
    public static MemorySegment sequencesIndexBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$836.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sequencesIndexBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$836.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sequencesIndexOffset$VH() {
        return constants$836.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize sequencesIndexOffset;
     * }
     */
    public static long sequencesIndexOffset$get(MemorySegment seg) {
        return (long)constants$836.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize sequencesIndexOffset;
     * }
     */
    public static void sequencesIndexOffset$set(MemorySegment seg, long x) {
        constants$836.const$2.set(seg, x);
    }
    public static long sequencesIndexOffset$get(MemorySegment seg, long index) {
        return (long)constants$836.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sequencesIndexOffset$set(MemorySegment seg, long index, long x) {
        constants$836.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


