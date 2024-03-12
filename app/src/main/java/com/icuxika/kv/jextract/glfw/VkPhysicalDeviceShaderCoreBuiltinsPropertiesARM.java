// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint64_t shaderCoreMask;
 *     uint32_t shaderCoreCount;
 *     uint32_t shaderWarpsPerCore;
 * };
 * }
 */
public class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {

    public static MemoryLayout $LAYOUT() {
        return constants$1034.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$1034.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$1034.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$1034.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$1034.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$1034.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$1034.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1034.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$1034.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1034.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1034.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderCoreMask$VH() {
        return constants$1034.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t shaderCoreMask;
     * }
     */
    public static long shaderCoreMask$get(MemorySegment seg) {
        return (long)constants$1034.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t shaderCoreMask;
     * }
     */
    public static void shaderCoreMask$set(MemorySegment seg, long x) {
        constants$1034.const$3.set(seg, x);
    }
    public static long shaderCoreMask$get(MemorySegment seg, long index) {
        return (long)constants$1034.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderCoreMask$set(MemorySegment seg, long index, long x) {
        constants$1034.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderCoreCount$VH() {
        return constants$1034.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t shaderCoreCount;
     * }
     */
    public static int shaderCoreCount$get(MemorySegment seg) {
        return (int)constants$1034.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t shaderCoreCount;
     * }
     */
    public static void shaderCoreCount$set(MemorySegment seg, int x) {
        constants$1034.const$4.set(seg, x);
    }
    public static int shaderCoreCount$get(MemorySegment seg, long index) {
        return (int)constants$1034.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderCoreCount$set(MemorySegment seg, long index, int x) {
        constants$1034.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderWarpsPerCore$VH() {
        return constants$1034.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t shaderWarpsPerCore;
     * }
     */
    public static int shaderWarpsPerCore$get(MemorySegment seg) {
        return (int)constants$1034.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t shaderWarpsPerCore;
     * }
     */
    public static void shaderWarpsPerCore$set(MemorySegment seg, int x) {
        constants$1034.const$5.set(seg, x);
    }
    public static int shaderWarpsPerCore$get(MemorySegment seg, long index) {
        return (int)constants$1034.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderWarpsPerCore$set(MemorySegment seg, long index, int x) {
        constants$1034.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


