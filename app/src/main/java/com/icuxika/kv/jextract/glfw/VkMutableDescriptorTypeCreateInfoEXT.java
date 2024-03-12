// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkMutableDescriptorTypeCreateInfoEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t mutableDescriptorTypeListCount;
 *     const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
 * };
 * }
 */
public class VkMutableDescriptorTypeCreateInfoEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$908.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$908.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$908.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$908.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$908.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$908.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$908.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$908.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$908.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$908.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$908.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mutableDescriptorTypeListCount$VH() {
        return constants$908.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t mutableDescriptorTypeListCount;
     * }
     */
    public static int mutableDescriptorTypeListCount$get(MemorySegment seg) {
        return (int)constants$908.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t mutableDescriptorTypeListCount;
     * }
     */
    public static void mutableDescriptorTypeListCount$set(MemorySegment seg, int x) {
        constants$908.const$4.set(seg, x);
    }
    public static int mutableDescriptorTypeListCount$get(MemorySegment seg, long index) {
        return (int)constants$908.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void mutableDescriptorTypeListCount$set(MemorySegment seg, long index, int x) {
        constants$908.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pMutableDescriptorTypeLists$VH() {
        return constants$908.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
     * }
     */
    public static MemorySegment pMutableDescriptorTypeLists$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$908.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkMutableDescriptorTypeListEXT* pMutableDescriptorTypeLists;
     * }
     */
    public static void pMutableDescriptorTypeLists$set(MemorySegment seg, MemorySegment x) {
        constants$908.const$5.set(seg, x);
    }
    public static MemorySegment pMutableDescriptorTypeLists$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$908.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pMutableDescriptorTypeLists$set(MemorySegment seg, long index, MemorySegment x) {
        constants$908.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

