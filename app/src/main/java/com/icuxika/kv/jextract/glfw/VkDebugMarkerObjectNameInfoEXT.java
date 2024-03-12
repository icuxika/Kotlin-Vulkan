// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDebugMarkerObjectNameInfoEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkDebugReportObjectTypeEXT objectType;
 *     uint64_t object;
 *     char* pObjectName;
 * };
 * }
 */
public class VkDebugMarkerObjectNameInfoEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$616.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$616.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$616.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$616.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$616.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$616.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$616.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$616.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$616.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$616.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$616.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle objectType$VH() {
        return constants$616.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDebugReportObjectTypeEXT objectType;
     * }
     */
    public static int objectType$get(MemorySegment seg) {
        return (int)constants$616.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDebugReportObjectTypeEXT objectType;
     * }
     */
    public static void objectType$set(MemorySegment seg, int x) {
        constants$616.const$3.set(seg, x);
    }
    public static int objectType$get(MemorySegment seg, long index) {
        return (int)constants$616.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void objectType$set(MemorySegment seg, long index, int x) {
        constants$616.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle object$VH() {
        return constants$616.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t object;
     * }
     */
    public static long object$get(MemorySegment seg) {
        return (long)constants$616.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t object;
     * }
     */
    public static void object$set(MemorySegment seg, long x) {
        constants$616.const$4.set(seg, x);
    }
    public static long object$get(MemorySegment seg, long index) {
        return (long)constants$616.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void object$set(MemorySegment seg, long index, long x) {
        constants$616.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pObjectName$VH() {
        return constants$616.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* pObjectName;
     * }
     */
    public static MemorySegment pObjectName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$616.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* pObjectName;
     * }
     */
    public static void pObjectName$set(MemorySegment seg, MemorySegment x) {
        constants$616.const$5.set(seg, x);
    }
    public static MemorySegment pObjectName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$616.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pObjectName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$616.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


