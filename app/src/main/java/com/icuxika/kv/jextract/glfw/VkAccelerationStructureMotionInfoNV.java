// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkAccelerationStructureMotionInfoNV {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t maxInstances;
 *     VkAccelerationStructureMotionInfoFlagsNV flags;
 * };
 * }
 */
public class VkAccelerationStructureMotionInfoNV {

    public static MemoryLayout $LAYOUT() {
        return constants$884.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$885.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$885.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$885.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$885.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$885.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$885.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$885.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$885.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$885.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$885.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxInstances$VH() {
        return constants$885.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxInstances;
     * }
     */
    public static int maxInstances$get(MemorySegment seg) {
        return (int)constants$885.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxInstances;
     * }
     */
    public static void maxInstances$set(MemorySegment seg, int x) {
        constants$885.const$2.set(seg, x);
    }
    public static int maxInstances$get(MemorySegment seg, long index) {
        return (int)constants$885.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxInstances$set(MemorySegment seg, long index, int x) {
        constants$885.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$885.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkAccelerationStructureMotionInfoFlagsNV flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$885.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkAccelerationStructureMotionInfoFlagsNV flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$885.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$885.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$885.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

