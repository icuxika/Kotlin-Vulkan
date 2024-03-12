// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkCuFunctionCreateInfoNVX {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkCuModuleNVX module;
 *     char* pName;
 * };
 * }
 */
public class VkCuFunctionCreateInfoNVX {

    public static MemoryLayout $LAYOUT() {
        return constants$630.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$630.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$630.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$630.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$630.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$630.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$630.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$630.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$630.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$630.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$630.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle module$VH() {
        return constants$631.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkCuModuleNVX module;
     * }
     */
    public static MemorySegment module$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$631.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkCuModuleNVX module;
     * }
     */
    public static void module$set(MemorySegment seg, MemorySegment x) {
        constants$631.const$0.set(seg, x);
    }
    public static MemorySegment module$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$631.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void module$set(MemorySegment seg, long index, MemorySegment x) {
        constants$631.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pName$VH() {
        return constants$631.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* pName;
     * }
     */
    public static MemorySegment pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$631.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* pName;
     * }
     */
    public static void pName$set(MemorySegment seg, MemorySegment x) {
        constants$631.const$1.set(seg, x);
    }
    public static MemorySegment pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$631.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$631.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

