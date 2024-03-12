// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 accelerationStructure;
 *     VkBool32 accelerationStructureCaptureReplay;
 *     VkBool32 accelerationStructureIndirectBuild;
 *     VkBool32 accelerationStructureHostCommands;
 *     VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
 * };
 * }
 */
public class VkPhysicalDeviceAccelerationStructureFeaturesKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$1046.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$1046.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$1046.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$1046.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$1046.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$1046.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$1047.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1047.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$1047.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1047.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1047.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructure$VH() {
        return constants$1047.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 accelerationStructure;
     * }
     */
    public static int accelerationStructure$get(MemorySegment seg) {
        return (int)constants$1047.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 accelerationStructure;
     * }
     */
    public static void accelerationStructure$set(MemorySegment seg, int x) {
        constants$1047.const$1.set(seg, x);
    }
    public static int accelerationStructure$get(MemorySegment seg, long index) {
        return (int)constants$1047.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructure$set(MemorySegment seg, long index, int x) {
        constants$1047.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructureCaptureReplay$VH() {
        return constants$1047.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 accelerationStructureCaptureReplay;
     * }
     */
    public static int accelerationStructureCaptureReplay$get(MemorySegment seg) {
        return (int)constants$1047.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 accelerationStructureCaptureReplay;
     * }
     */
    public static void accelerationStructureCaptureReplay$set(MemorySegment seg, int x) {
        constants$1047.const$2.set(seg, x);
    }
    public static int accelerationStructureCaptureReplay$get(MemorySegment seg, long index) {
        return (int)constants$1047.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructureCaptureReplay$set(MemorySegment seg, long index, int x) {
        constants$1047.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructureIndirectBuild$VH() {
        return constants$1047.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 accelerationStructureIndirectBuild;
     * }
     */
    public static int accelerationStructureIndirectBuild$get(MemorySegment seg) {
        return (int)constants$1047.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 accelerationStructureIndirectBuild;
     * }
     */
    public static void accelerationStructureIndirectBuild$set(MemorySegment seg, int x) {
        constants$1047.const$3.set(seg, x);
    }
    public static int accelerationStructureIndirectBuild$get(MemorySegment seg, long index) {
        return (int)constants$1047.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructureIndirectBuild$set(MemorySegment seg, long index, int x) {
        constants$1047.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructureHostCommands$VH() {
        return constants$1047.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 accelerationStructureHostCommands;
     * }
     */
    public static int accelerationStructureHostCommands$get(MemorySegment seg) {
        return (int)constants$1047.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 accelerationStructureHostCommands;
     * }
     */
    public static void accelerationStructureHostCommands$set(MemorySegment seg, int x) {
        constants$1047.const$4.set(seg, x);
    }
    public static int accelerationStructureHostCommands$get(MemorySegment seg, long index) {
        return (int)constants$1047.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructureHostCommands$set(MemorySegment seg, long index, int x) {
        constants$1047.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorBindingAccelerationStructureUpdateAfterBind$VH() {
        return constants$1047.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
     * }
     */
    public static int descriptorBindingAccelerationStructureUpdateAfterBind$get(MemorySegment seg) {
        return (int)constants$1047.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
     * }
     */
    public static void descriptorBindingAccelerationStructureUpdateAfterBind$set(MemorySegment seg, int x) {
        constants$1047.const$5.set(seg, x);
    }
    public static int descriptorBindingAccelerationStructureUpdateAfterBind$get(MemorySegment seg, long index) {
        return (int)constants$1047.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorBindingAccelerationStructureUpdateAfterBind$set(MemorySegment seg, long index, int x) {
        constants$1047.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


