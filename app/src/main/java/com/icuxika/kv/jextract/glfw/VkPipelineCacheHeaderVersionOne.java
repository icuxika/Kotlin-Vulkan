// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPipelineCacheHeaderVersionOne {
 *     uint32_t headerSize;
 *     VkPipelineCacheHeaderVersion headerVersion;
 *     uint32_t vendorID;
 *     uint32_t deviceID;
 *     uint8_t pipelineCacheUUID[16];
 * };
 * }
 */
public class VkPipelineCacheHeaderVersionOne {

    public static MemoryLayout $LAYOUT() {
        return constants$12.const$4;
    }
    public static VarHandle headerSize$VH() {
        return constants$12.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t headerSize;
     * }
     */
    public static int headerSize$get(MemorySegment seg) {
        return (int)constants$12.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t headerSize;
     * }
     */
    public static void headerSize$set(MemorySegment seg, int x) {
        constants$12.const$5.set(seg, x);
    }
    public static int headerSize$get(MemorySegment seg, long index) {
        return (int)constants$12.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void headerSize$set(MemorySegment seg, long index, int x) {
        constants$12.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle headerVersion$VH() {
        return constants$13.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPipelineCacheHeaderVersion headerVersion;
     * }
     */
    public static int headerVersion$get(MemorySegment seg) {
        return (int)constants$13.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPipelineCacheHeaderVersion headerVersion;
     * }
     */
    public static void headerVersion$set(MemorySegment seg, int x) {
        constants$13.const$0.set(seg, x);
    }
    public static int headerVersion$get(MemorySegment seg, long index) {
        return (int)constants$13.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void headerVersion$set(MemorySegment seg, long index, int x) {
        constants$13.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vendorID$VH() {
        return constants$13.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t vendorID;
     * }
     */
    public static int vendorID$get(MemorySegment seg) {
        return (int)constants$13.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t vendorID;
     * }
     */
    public static void vendorID$set(MemorySegment seg, int x) {
        constants$13.const$1.set(seg, x);
    }
    public static int vendorID$get(MemorySegment seg, long index) {
        return (int)constants$13.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void vendorID$set(MemorySegment seg, long index, int x) {
        constants$13.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle deviceID$VH() {
        return constants$13.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t deviceID;
     * }
     */
    public static int deviceID$get(MemorySegment seg) {
        return (int)constants$13.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t deviceID;
     * }
     */
    public static void deviceID$set(MemorySegment seg, int x) {
        constants$13.const$2.set(seg, x);
    }
    public static int deviceID$get(MemorySegment seg, long index) {
        return (int)constants$13.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void deviceID$set(MemorySegment seg, long index, int x) {
        constants$13.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pipelineCacheUUID$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


