// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDisplaySurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDisplaySurfaceCreateFlagsKHR flags;
 *     VkDisplayModeKHR displayMode;
 *     uint32_t planeIndex;
 *     uint32_t planeStackIndex;
 *     VkSurfaceTransformFlagBitsKHR transform;
 *     float globalAlpha;
 *     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
 *     VkExtent2D imageExtent;
 * };
 * }
 */
public class VkDisplaySurfaceCreateInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$447.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$448.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$448.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$448.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$448.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$448.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$448.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$448.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$448.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$448.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$448.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$448.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDisplaySurfaceCreateFlagsKHR flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$448.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDisplaySurfaceCreateFlagsKHR flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$448.const$2.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$448.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$448.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle displayMode$VH() {
        return constants$448.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDisplayModeKHR displayMode;
     * }
     */
    public static MemorySegment displayMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$448.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDisplayModeKHR displayMode;
     * }
     */
    public static void displayMode$set(MemorySegment seg, MemorySegment x) {
        constants$448.const$3.set(seg, x);
    }
    public static MemorySegment displayMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$448.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void displayMode$set(MemorySegment seg, long index, MemorySegment x) {
        constants$448.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle planeIndex$VH() {
        return constants$448.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t planeIndex;
     * }
     */
    public static int planeIndex$get(MemorySegment seg) {
        return (int)constants$448.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t planeIndex;
     * }
     */
    public static void planeIndex$set(MemorySegment seg, int x) {
        constants$448.const$4.set(seg, x);
    }
    public static int planeIndex$get(MemorySegment seg, long index) {
        return (int)constants$448.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void planeIndex$set(MemorySegment seg, long index, int x) {
        constants$448.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle planeStackIndex$VH() {
        return constants$448.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t planeStackIndex;
     * }
     */
    public static int planeStackIndex$get(MemorySegment seg) {
        return (int)constants$448.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t planeStackIndex;
     * }
     */
    public static void planeStackIndex$set(MemorySegment seg, int x) {
        constants$448.const$5.set(seg, x);
    }
    public static int planeStackIndex$get(MemorySegment seg, long index) {
        return (int)constants$448.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void planeStackIndex$set(MemorySegment seg, long index, int x) {
        constants$448.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle transform$VH() {
        return constants$449.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSurfaceTransformFlagBitsKHR transform;
     * }
     */
    public static int transform$get(MemorySegment seg) {
        return (int)constants$449.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSurfaceTransformFlagBitsKHR transform;
     * }
     */
    public static void transform$set(MemorySegment seg, int x) {
        constants$449.const$0.set(seg, x);
    }
    public static int transform$get(MemorySegment seg, long index) {
        return (int)constants$449.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void transform$set(MemorySegment seg, long index, int x) {
        constants$449.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle globalAlpha$VH() {
        return constants$449.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float globalAlpha;
     * }
     */
    public static float globalAlpha$get(MemorySegment seg) {
        return (float)constants$449.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float globalAlpha;
     * }
     */
    public static void globalAlpha$set(MemorySegment seg, float x) {
        constants$449.const$1.set(seg, x);
    }
    public static float globalAlpha$get(MemorySegment seg, long index) {
        return (float)constants$449.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void globalAlpha$set(MemorySegment seg, long index, float x) {
        constants$449.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle alphaMode$VH() {
        return constants$449.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
     * }
     */
    public static int alphaMode$get(MemorySegment seg) {
        return (int)constants$449.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
     * }
     */
    public static void alphaMode$set(MemorySegment seg, int x) {
        constants$449.const$2.set(seg, x);
    }
    public static int alphaMode$get(MemorySegment seg, long index) {
        return (int)constants$449.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void alphaMode$set(MemorySegment seg, long index, int x) {
        constants$449.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment imageExtent$slice(MemorySegment seg) {
        return seg.asSlice(52, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

