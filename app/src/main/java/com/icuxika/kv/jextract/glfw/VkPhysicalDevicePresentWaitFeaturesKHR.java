// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDevicePresentWaitFeaturesKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 presentWait;
 * };
 * }
 */
public class VkPhysicalDevicePresentWaitFeaturesKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$581.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$581.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$581.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$581.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$581.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$581.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$582.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$582.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$582.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$582.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$582.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle presentWait$VH() {
        return constants$582.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 presentWait;
     * }
     */
    public static int presentWait$get(MemorySegment seg) {
        return (int)constants$582.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 presentWait;
     * }
     */
    public static void presentWait$set(MemorySegment seg, int x) {
        constants$582.const$1.set(seg, x);
    }
    public static int presentWait$get(MemorySegment seg, long index) {
        return (int)constants$582.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void presentWait$set(MemorySegment seg, long index, int x) {
        constants$582.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


