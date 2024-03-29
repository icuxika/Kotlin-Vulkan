// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDisplayPropertiesKHR {
 *     VkDisplayKHR display;
 *     char* displayName;
 *     VkExtent2D physicalDimensions;
 *     VkExtent2D physicalResolution;
 *     VkSurfaceTransformFlagsKHR supportedTransforms;
 *     VkBool32 planeReorderPossible;
 *     VkBool32 persistentContent;
 * };
 * }
 */
public class VkDisplayPropertiesKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$446.const$5;
    }
    public static VarHandle display$VH() {
        return constants$447.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDisplayKHR display;
     * }
     */
    public static MemorySegment display$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$447.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDisplayKHR display;
     * }
     */
    public static void display$set(MemorySegment seg, MemorySegment x) {
        constants$447.const$0.set(seg, x);
    }
    public static MemorySegment display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$447.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemorySegment x) {
        constants$447.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle displayName$VH() {
        return constants$447.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* displayName;
     * }
     */
    public static MemorySegment displayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$447.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* displayName;
     * }
     */
    public static void displayName$set(MemorySegment seg, MemorySegment x) {
        constants$447.const$1.set(seg, x);
    }
    public static MemorySegment displayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$447.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void displayName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$447.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment physicalDimensions$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment physicalResolution$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static VarHandle supportedTransforms$VH() {
        return constants$447.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSurfaceTransformFlagsKHR supportedTransforms;
     * }
     */
    public static int supportedTransforms$get(MemorySegment seg) {
        return (int)constants$447.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSurfaceTransformFlagsKHR supportedTransforms;
     * }
     */
    public static void supportedTransforms$set(MemorySegment seg, int x) {
        constants$447.const$2.set(seg, x);
    }
    public static int supportedTransforms$get(MemorySegment seg, long index) {
        return (int)constants$447.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void supportedTransforms$set(MemorySegment seg, long index, int x) {
        constants$447.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle planeReorderPossible$VH() {
        return constants$447.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 planeReorderPossible;
     * }
     */
    public static int planeReorderPossible$get(MemorySegment seg) {
        return (int)constants$447.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 planeReorderPossible;
     * }
     */
    public static void planeReorderPossible$set(MemorySegment seg, int x) {
        constants$447.const$3.set(seg, x);
    }
    public static int planeReorderPossible$get(MemorySegment seg, long index) {
        return (int)constants$447.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void planeReorderPossible$set(MemorySegment seg, long index, int x) {
        constants$447.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle persistentContent$VH() {
        return constants$447.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 persistentContent;
     * }
     */
    public static int persistentContent$get(MemorySegment seg) {
        return (int)constants$447.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 persistentContent;
     * }
     */
    public static void persistentContent$set(MemorySegment seg, int x) {
        constants$447.const$4.set(seg, x);
    }
    public static int persistentContent$get(MemorySegment seg, long index) {
        return (int)constants$447.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void persistentContent$set(MemorySegment seg, long index, int x) {
        constants$447.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


