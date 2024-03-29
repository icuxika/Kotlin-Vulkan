// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t maxGraphicsShaderGroupCount;
 *     uint32_t maxIndirectSequenceCount;
 *     uint32_t maxIndirectCommandsTokenCount;
 *     uint32_t maxIndirectCommandsStreamCount;
 *     uint32_t maxIndirectCommandsTokenOffset;
 *     uint32_t maxIndirectCommandsStreamStride;
 *     uint32_t minSequencesCountBufferOffsetAlignment;
 *     uint32_t minSequencesIndexBufferOffsetAlignment;
 *     uint32_t minIndirectCommandsBufferOffsetAlignment;
 * };
 * }
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {

    public static MemoryLayout $LAYOUT() {
        return constants$822.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$822.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$822.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$822.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$822.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$822.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$822.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$822.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$822.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$822.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$822.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxGraphicsShaderGroupCount$VH() {
        return constants$822.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxGraphicsShaderGroupCount;
     * }
     */
    public static int maxGraphicsShaderGroupCount$get(MemorySegment seg) {
        return (int)constants$822.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxGraphicsShaderGroupCount;
     * }
     */
    public static void maxGraphicsShaderGroupCount$set(MemorySegment seg, int x) {
        constants$822.const$4.set(seg, x);
    }
    public static int maxGraphicsShaderGroupCount$get(MemorySegment seg, long index) {
        return (int)constants$822.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void maxGraphicsShaderGroupCount$set(MemorySegment seg, long index, int x) {
        constants$822.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxIndirectSequenceCount$VH() {
        return constants$822.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxIndirectSequenceCount;
     * }
     */
    public static int maxIndirectSequenceCount$get(MemorySegment seg) {
        return (int)constants$822.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxIndirectSequenceCount;
     * }
     */
    public static void maxIndirectSequenceCount$set(MemorySegment seg, int x) {
        constants$822.const$5.set(seg, x);
    }
    public static int maxIndirectSequenceCount$get(MemorySegment seg, long index) {
        return (int)constants$822.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void maxIndirectSequenceCount$set(MemorySegment seg, long index, int x) {
        constants$822.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxIndirectCommandsTokenCount$VH() {
        return constants$823.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsTokenCount;
     * }
     */
    public static int maxIndirectCommandsTokenCount$get(MemorySegment seg) {
        return (int)constants$823.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsTokenCount;
     * }
     */
    public static void maxIndirectCommandsTokenCount$set(MemorySegment seg, int x) {
        constants$823.const$0.set(seg, x);
    }
    public static int maxIndirectCommandsTokenCount$get(MemorySegment seg, long index) {
        return (int)constants$823.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxIndirectCommandsTokenCount$set(MemorySegment seg, long index, int x) {
        constants$823.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxIndirectCommandsStreamCount$VH() {
        return constants$823.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsStreamCount;
     * }
     */
    public static int maxIndirectCommandsStreamCount$get(MemorySegment seg) {
        return (int)constants$823.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsStreamCount;
     * }
     */
    public static void maxIndirectCommandsStreamCount$set(MemorySegment seg, int x) {
        constants$823.const$1.set(seg, x);
    }
    public static int maxIndirectCommandsStreamCount$get(MemorySegment seg, long index) {
        return (int)constants$823.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxIndirectCommandsStreamCount$set(MemorySegment seg, long index, int x) {
        constants$823.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxIndirectCommandsTokenOffset$VH() {
        return constants$823.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsTokenOffset;
     * }
     */
    public static int maxIndirectCommandsTokenOffset$get(MemorySegment seg) {
        return (int)constants$823.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsTokenOffset;
     * }
     */
    public static void maxIndirectCommandsTokenOffset$set(MemorySegment seg, int x) {
        constants$823.const$2.set(seg, x);
    }
    public static int maxIndirectCommandsTokenOffset$get(MemorySegment seg, long index) {
        return (int)constants$823.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxIndirectCommandsTokenOffset$set(MemorySegment seg, long index, int x) {
        constants$823.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxIndirectCommandsStreamStride$VH() {
        return constants$823.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsStreamStride;
     * }
     */
    public static int maxIndirectCommandsStreamStride$get(MemorySegment seg) {
        return (int)constants$823.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxIndirectCommandsStreamStride;
     * }
     */
    public static void maxIndirectCommandsStreamStride$set(MemorySegment seg, int x) {
        constants$823.const$3.set(seg, x);
    }
    public static int maxIndirectCommandsStreamStride$get(MemorySegment seg, long index) {
        return (int)constants$823.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxIndirectCommandsStreamStride$set(MemorySegment seg, long index, int x) {
        constants$823.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minSequencesCountBufferOffsetAlignment$VH() {
        return constants$823.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t minSequencesCountBufferOffsetAlignment;
     * }
     */
    public static int minSequencesCountBufferOffsetAlignment$get(MemorySegment seg) {
        return (int)constants$823.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t minSequencesCountBufferOffsetAlignment;
     * }
     */
    public static void minSequencesCountBufferOffsetAlignment$set(MemorySegment seg, int x) {
        constants$823.const$4.set(seg, x);
    }
    public static int minSequencesCountBufferOffsetAlignment$get(MemorySegment seg, long index) {
        return (int)constants$823.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void minSequencesCountBufferOffsetAlignment$set(MemorySegment seg, long index, int x) {
        constants$823.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minSequencesIndexBufferOffsetAlignment$VH() {
        return constants$823.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t minSequencesIndexBufferOffsetAlignment;
     * }
     */
    public static int minSequencesIndexBufferOffsetAlignment$get(MemorySegment seg) {
        return (int)constants$823.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t minSequencesIndexBufferOffsetAlignment;
     * }
     */
    public static void minSequencesIndexBufferOffsetAlignment$set(MemorySegment seg, int x) {
        constants$823.const$5.set(seg, x);
    }
    public static int minSequencesIndexBufferOffsetAlignment$get(MemorySegment seg, long index) {
        return (int)constants$823.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void minSequencesIndexBufferOffsetAlignment$set(MemorySegment seg, long index, int x) {
        constants$823.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minIndirectCommandsBufferOffsetAlignment$VH() {
        return constants$824.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t minIndirectCommandsBufferOffsetAlignment;
     * }
     */
    public static int minIndirectCommandsBufferOffsetAlignment$get(MemorySegment seg) {
        return (int)constants$824.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t minIndirectCommandsBufferOffsetAlignment;
     * }
     */
    public static void minIndirectCommandsBufferOffsetAlignment$set(MemorySegment seg, int x) {
        constants$824.const$0.set(seg, x);
    }
    public static int minIndirectCommandsBufferOffsetAlignment$get(MemorySegment seg, long index) {
        return (int)constants$824.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void minIndirectCommandsBufferOffsetAlignment$set(MemorySegment seg, long index, int x) {
        constants$824.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


