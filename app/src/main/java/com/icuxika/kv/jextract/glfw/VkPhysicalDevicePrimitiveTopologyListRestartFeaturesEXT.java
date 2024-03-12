// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 primitiveTopologyListRestart;
 *     VkBool32 primitiveTopologyPatchListRestart;
 * };
 * }
 */
public class VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$917.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$917.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$917.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$917.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$917.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$917.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$917.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$917.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$917.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$917.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$917.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle primitiveTopologyListRestart$VH() {
        return constants$917.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 primitiveTopologyListRestart;
     * }
     */
    public static int primitiveTopologyListRestart$get(MemorySegment seg) {
        return (int)constants$917.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 primitiveTopologyListRestart;
     * }
     */
    public static void primitiveTopologyListRestart$set(MemorySegment seg, int x) {
        constants$917.const$3.set(seg, x);
    }
    public static int primitiveTopologyListRestart$get(MemorySegment seg, long index) {
        return (int)constants$917.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void primitiveTopologyListRestart$set(MemorySegment seg, long index, int x) {
        constants$917.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle primitiveTopologyPatchListRestart$VH() {
        return constants$917.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 primitiveTopologyPatchListRestart;
     * }
     */
    public static int primitiveTopologyPatchListRestart$get(MemorySegment seg) {
        return (int)constants$917.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 primitiveTopologyPatchListRestart;
     * }
     */
    public static void primitiveTopologyPatchListRestart$set(MemorySegment seg, int x) {
        constants$917.const$4.set(seg, x);
    }
    public static int primitiveTopologyPatchListRestart$get(MemorySegment seg, long index) {
        return (int)constants$917.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void primitiveTopologyPatchListRestart$set(MemorySegment seg, long index, int x) {
        constants$917.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


