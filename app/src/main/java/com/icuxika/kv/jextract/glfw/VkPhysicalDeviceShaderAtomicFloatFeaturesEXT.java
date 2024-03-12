// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 shaderBufferFloat32Atomics;
 *     VkBool32 shaderBufferFloat32AtomicAdd;
 *     VkBool32 shaderBufferFloat64Atomics;
 *     VkBool32 shaderBufferFloat64AtomicAdd;
 *     VkBool32 shaderSharedFloat32Atomics;
 *     VkBool32 shaderSharedFloat32AtomicAdd;
 *     VkBool32 shaderSharedFloat64Atomics;
 *     VkBool32 shaderSharedFloat64AtomicAdd;
 *     VkBool32 shaderImageFloat32Atomics;
 *     VkBool32 shaderImageFloat32AtomicAdd;
 *     VkBool32 sparseImageFloat32Atomics;
 *     VkBool32 sparseImageFloat32AtomicAdd;
 * };
 * }
 */
public class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$803.const$3;
    }
    public static VarHandle sType$VH() {
        return constants$803.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$803.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$803.const$4.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$803.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$803.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$803.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$803.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$803.const$5.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$803.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$803.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderBufferFloat32Atomics$VH() {
        return constants$804.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat32Atomics;
     * }
     */
    public static int shaderBufferFloat32Atomics$get(MemorySegment seg) {
        return (int)constants$804.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat32Atomics;
     * }
     */
    public static void shaderBufferFloat32Atomics$set(MemorySegment seg, int x) {
        constants$804.const$0.set(seg, x);
    }
    public static int shaderBufferFloat32Atomics$get(MemorySegment seg, long index) {
        return (int)constants$804.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderBufferFloat32Atomics$set(MemorySegment seg, long index, int x) {
        constants$804.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderBufferFloat32AtomicAdd$VH() {
        return constants$804.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat32AtomicAdd;
     * }
     */
    public static int shaderBufferFloat32AtomicAdd$get(MemorySegment seg) {
        return (int)constants$804.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat32AtomicAdd;
     * }
     */
    public static void shaderBufferFloat32AtomicAdd$set(MemorySegment seg, int x) {
        constants$804.const$1.set(seg, x);
    }
    public static int shaderBufferFloat32AtomicAdd$get(MemorySegment seg, long index) {
        return (int)constants$804.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderBufferFloat32AtomicAdd$set(MemorySegment seg, long index, int x) {
        constants$804.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderBufferFloat64Atomics$VH() {
        return constants$804.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat64Atomics;
     * }
     */
    public static int shaderBufferFloat64Atomics$get(MemorySegment seg) {
        return (int)constants$804.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat64Atomics;
     * }
     */
    public static void shaderBufferFloat64Atomics$set(MemorySegment seg, int x) {
        constants$804.const$2.set(seg, x);
    }
    public static int shaderBufferFloat64Atomics$get(MemorySegment seg, long index) {
        return (int)constants$804.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderBufferFloat64Atomics$set(MemorySegment seg, long index, int x) {
        constants$804.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderBufferFloat64AtomicAdd$VH() {
        return constants$804.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat64AtomicAdd;
     * }
     */
    public static int shaderBufferFloat64AtomicAdd$get(MemorySegment seg) {
        return (int)constants$804.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderBufferFloat64AtomicAdd;
     * }
     */
    public static void shaderBufferFloat64AtomicAdd$set(MemorySegment seg, int x) {
        constants$804.const$3.set(seg, x);
    }
    public static int shaderBufferFloat64AtomicAdd$get(MemorySegment seg, long index) {
        return (int)constants$804.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderBufferFloat64AtomicAdd$set(MemorySegment seg, long index, int x) {
        constants$804.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSharedFloat32Atomics$VH() {
        return constants$804.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat32Atomics;
     * }
     */
    public static int shaderSharedFloat32Atomics$get(MemorySegment seg) {
        return (int)constants$804.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat32Atomics;
     * }
     */
    public static void shaderSharedFloat32Atomics$set(MemorySegment seg, int x) {
        constants$804.const$4.set(seg, x);
    }
    public static int shaderSharedFloat32Atomics$get(MemorySegment seg, long index) {
        return (int)constants$804.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSharedFloat32Atomics$set(MemorySegment seg, long index, int x) {
        constants$804.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSharedFloat32AtomicAdd$VH() {
        return constants$804.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat32AtomicAdd;
     * }
     */
    public static int shaderSharedFloat32AtomicAdd$get(MemorySegment seg) {
        return (int)constants$804.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat32AtomicAdd;
     * }
     */
    public static void shaderSharedFloat32AtomicAdd$set(MemorySegment seg, int x) {
        constants$804.const$5.set(seg, x);
    }
    public static int shaderSharedFloat32AtomicAdd$get(MemorySegment seg, long index) {
        return (int)constants$804.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSharedFloat32AtomicAdd$set(MemorySegment seg, long index, int x) {
        constants$804.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSharedFloat64Atomics$VH() {
        return constants$805.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat64Atomics;
     * }
     */
    public static int shaderSharedFloat64Atomics$get(MemorySegment seg) {
        return (int)constants$805.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat64Atomics;
     * }
     */
    public static void shaderSharedFloat64Atomics$set(MemorySegment seg, int x) {
        constants$805.const$0.set(seg, x);
    }
    public static int shaderSharedFloat64Atomics$get(MemorySegment seg, long index) {
        return (int)constants$805.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSharedFloat64Atomics$set(MemorySegment seg, long index, int x) {
        constants$805.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSharedFloat64AtomicAdd$VH() {
        return constants$805.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat64AtomicAdd;
     * }
     */
    public static int shaderSharedFloat64AtomicAdd$get(MemorySegment seg) {
        return (int)constants$805.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSharedFloat64AtomicAdd;
     * }
     */
    public static void shaderSharedFloat64AtomicAdd$set(MemorySegment seg, int x) {
        constants$805.const$1.set(seg, x);
    }
    public static int shaderSharedFloat64AtomicAdd$get(MemorySegment seg, long index) {
        return (int)constants$805.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSharedFloat64AtomicAdd$set(MemorySegment seg, long index, int x) {
        constants$805.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderImageFloat32Atomics$VH() {
        return constants$805.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderImageFloat32Atomics;
     * }
     */
    public static int shaderImageFloat32Atomics$get(MemorySegment seg) {
        return (int)constants$805.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderImageFloat32Atomics;
     * }
     */
    public static void shaderImageFloat32Atomics$set(MemorySegment seg, int x) {
        constants$805.const$2.set(seg, x);
    }
    public static int shaderImageFloat32Atomics$get(MemorySegment seg, long index) {
        return (int)constants$805.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderImageFloat32Atomics$set(MemorySegment seg, long index, int x) {
        constants$805.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderImageFloat32AtomicAdd$VH() {
        return constants$805.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderImageFloat32AtomicAdd;
     * }
     */
    public static int shaderImageFloat32AtomicAdd$get(MemorySegment seg) {
        return (int)constants$805.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderImageFloat32AtomicAdd;
     * }
     */
    public static void shaderImageFloat32AtomicAdd$set(MemorySegment seg, int x) {
        constants$805.const$3.set(seg, x);
    }
    public static int shaderImageFloat32AtomicAdd$get(MemorySegment seg, long index) {
        return (int)constants$805.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderImageFloat32AtomicAdd$set(MemorySegment seg, long index, int x) {
        constants$805.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sparseImageFloat32Atomics$VH() {
        return constants$805.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 sparseImageFloat32Atomics;
     * }
     */
    public static int sparseImageFloat32Atomics$get(MemorySegment seg) {
        return (int)constants$805.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 sparseImageFloat32Atomics;
     * }
     */
    public static void sparseImageFloat32Atomics$set(MemorySegment seg, int x) {
        constants$805.const$4.set(seg, x);
    }
    public static int sparseImageFloat32Atomics$get(MemorySegment seg, long index) {
        return (int)constants$805.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sparseImageFloat32Atomics$set(MemorySegment seg, long index, int x) {
        constants$805.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sparseImageFloat32AtomicAdd$VH() {
        return constants$805.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 sparseImageFloat32AtomicAdd;
     * }
     */
    public static int sparseImageFloat32AtomicAdd$get(MemorySegment seg) {
        return (int)constants$805.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 sparseImageFloat32AtomicAdd;
     * }
     */
    public static void sparseImageFloat32AtomicAdd$set(MemorySegment seg, int x) {
        constants$805.const$5.set(seg, x);
    }
    public static int sparseImageFloat32AtomicAdd$get(MemorySegment seg, long index) {
        return (int)constants$805.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sparseImageFloat32AtomicAdd$set(MemorySegment seg, long index, int x) {
        constants$805.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


