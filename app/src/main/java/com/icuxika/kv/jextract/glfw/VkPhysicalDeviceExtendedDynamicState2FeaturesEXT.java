// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 extendedDynamicState2;
 *     VkBool32 extendedDynamicState2LogicOp;
 *     VkBool32 extendedDynamicState2PatchControlPoints;
 * };
 * }
 */
public class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$927.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$927.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$927.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$927.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$927.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$927.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$927.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$927.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$927.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$927.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$927.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle extendedDynamicState2$VH() {
        return constants$927.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 extendedDynamicState2;
     * }
     */
    public static int extendedDynamicState2$get(MemorySegment seg) {
        return (int)constants$927.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 extendedDynamicState2;
     * }
     */
    public static void extendedDynamicState2$set(MemorySegment seg, int x) {
        constants$927.const$4.set(seg, x);
    }
    public static int extendedDynamicState2$get(MemorySegment seg, long index) {
        return (int)constants$927.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void extendedDynamicState2$set(MemorySegment seg, long index, int x) {
        constants$927.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle extendedDynamicState2LogicOp$VH() {
        return constants$927.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 extendedDynamicState2LogicOp;
     * }
     */
    public static int extendedDynamicState2LogicOp$get(MemorySegment seg) {
        return (int)constants$927.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 extendedDynamicState2LogicOp;
     * }
     */
    public static void extendedDynamicState2LogicOp$set(MemorySegment seg, int x) {
        constants$927.const$5.set(seg, x);
    }
    public static int extendedDynamicState2LogicOp$get(MemorySegment seg, long index) {
        return (int)constants$927.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void extendedDynamicState2LogicOp$set(MemorySegment seg, long index, int x) {
        constants$927.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle extendedDynamicState2PatchControlPoints$VH() {
        return constants$928.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 extendedDynamicState2PatchControlPoints;
     * }
     */
    public static int extendedDynamicState2PatchControlPoints$get(MemorySegment seg) {
        return (int)constants$928.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 extendedDynamicState2PatchControlPoints;
     * }
     */
    public static void extendedDynamicState2PatchControlPoints$set(MemorySegment seg, int x) {
        constants$928.const$0.set(seg, x);
    }
    public static int extendedDynamicState2PatchControlPoints$get(MemorySegment seg, long index) {
        return (int)constants$928.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void extendedDynamicState2PatchControlPoints$set(MemorySegment seg, long index, int x) {
        constants$928.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


