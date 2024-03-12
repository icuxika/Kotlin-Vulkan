// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkInstanceCreateInfo {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkInstanceCreateFlags flags;
 *     const VkApplicationInfo* pApplicationInfo;
 *     uint32_t enabledLayerCount;
 *     char** ppEnabledLayerNames;
 *     uint32_t enabledExtensionCount;
 *     char** ppEnabledExtensionNames;
 * };
 * }
 */
public class VkInstanceCreateInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$20.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$20.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$20.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$20.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$20.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$20.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$20.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$20.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$20.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$20.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$20.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$20.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkInstanceCreateFlags flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$20.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkInstanceCreateFlags flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$20.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$20.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$20.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pApplicationInfo$VH() {
        return constants$20.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkApplicationInfo* pApplicationInfo;
     * }
     */
    public static MemorySegment pApplicationInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$20.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkApplicationInfo* pApplicationInfo;
     * }
     */
    public static void pApplicationInfo$set(MemorySegment seg, MemorySegment x) {
        constants$20.const$4.set(seg, x);
    }
    public static MemorySegment pApplicationInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$20.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pApplicationInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$20.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle enabledLayerCount$VH() {
        return constants$20.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t enabledLayerCount;
     * }
     */
    public static int enabledLayerCount$get(MemorySegment seg) {
        return (int)constants$20.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t enabledLayerCount;
     * }
     */
    public static void enabledLayerCount$set(MemorySegment seg, int x) {
        constants$20.const$5.set(seg, x);
    }
    public static int enabledLayerCount$get(MemorySegment seg, long index) {
        return (int)constants$20.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void enabledLayerCount$set(MemorySegment seg, long index, int x) {
        constants$20.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ppEnabledLayerNames$VH() {
        return constants$21.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** ppEnabledLayerNames;
     * }
     */
    public static MemorySegment ppEnabledLayerNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$21.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** ppEnabledLayerNames;
     * }
     */
    public static void ppEnabledLayerNames$set(MemorySegment seg, MemorySegment x) {
        constants$21.const$0.set(seg, x);
    }
    public static MemorySegment ppEnabledLayerNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$21.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ppEnabledLayerNames$set(MemorySegment seg, long index, MemorySegment x) {
        constants$21.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle enabledExtensionCount$VH() {
        return constants$21.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t enabledExtensionCount;
     * }
     */
    public static int enabledExtensionCount$get(MemorySegment seg) {
        return (int)constants$21.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t enabledExtensionCount;
     * }
     */
    public static void enabledExtensionCount$set(MemorySegment seg, int x) {
        constants$21.const$1.set(seg, x);
    }
    public static int enabledExtensionCount$get(MemorySegment seg, long index) {
        return (int)constants$21.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void enabledExtensionCount$set(MemorySegment seg, long index, int x) {
        constants$21.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ppEnabledExtensionNames$VH() {
        return constants$21.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** ppEnabledExtensionNames;
     * }
     */
    public static MemorySegment ppEnabledExtensionNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$21.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** ppEnabledExtensionNames;
     * }
     */
    public static void ppEnabledExtensionNames$set(MemorySegment seg, MemorySegment x) {
        constants$21.const$2.set(seg, x);
    }
    public static MemorySegment ppEnabledExtensionNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$21.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ppEnabledExtensionNames$set(MemorySegment seg, long index, MemorySegment x) {
        constants$21.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


