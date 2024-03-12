// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkAllocationCallbacks {
 *     void* pUserData;
 *     PFN_vkAllocationFunction pfnAllocation;
 *     PFN_vkReallocationFunction pfnReallocation;
 *     PFN_vkFreeFunction pfnFree;
 *     PFN_vkInternalAllocationNotification pfnInternalAllocation;
 *     PFN_vkInternalFreeNotification pfnInternalFree;
 * };
 * }
 */
public class VkAllocationCallbacks {

    public static MemoryLayout $LAYOUT() {
        return constants$16.const$0;
    }
    public static VarHandle pUserData$VH() {
        return constants$16.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pUserData;
     * }
     */
    public static MemorySegment pUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$16.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pUserData;
     * }
     */
    public static void pUserData$set(MemorySegment seg, MemorySegment x) {
        constants$16.const$1.set(seg, x);
    }
    public static MemorySegment pUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$16.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$16.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pfnAllocation$VH() {
        return constants$16.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_vkAllocationFunction pfnAllocation;
     * }
     */
    public static MemorySegment pfnAllocation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$16.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_vkAllocationFunction pfnAllocation;
     * }
     */
    public static void pfnAllocation$set(MemorySegment seg, MemorySegment x) {
        constants$16.const$2.set(seg, x);
    }
    public static MemorySegment pfnAllocation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$16.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAllocation$set(MemorySegment seg, long index, MemorySegment x) {
        constants$16.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_vkAllocationFunction pfnAllocation(MemorySegment segment, Arena scope) {
        return PFN_vkAllocationFunction.ofAddress(pfnAllocation$get(segment), scope);
    }
    public static VarHandle pfnReallocation$VH() {
        return constants$16.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_vkReallocationFunction pfnReallocation;
     * }
     */
    public static MemorySegment pfnReallocation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$16.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_vkReallocationFunction pfnReallocation;
     * }
     */
    public static void pfnReallocation$set(MemorySegment seg, MemorySegment x) {
        constants$16.const$3.set(seg, x);
    }
    public static MemorySegment pfnReallocation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$16.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnReallocation$set(MemorySegment seg, long index, MemorySegment x) {
        constants$16.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_vkReallocationFunction pfnReallocation(MemorySegment segment, Arena scope) {
        return PFN_vkReallocationFunction.ofAddress(pfnReallocation$get(segment), scope);
    }
    public static VarHandle pfnFree$VH() {
        return constants$16.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_vkFreeFunction pfnFree;
     * }
     */
    public static MemorySegment pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$16.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_vkFreeFunction pfnFree;
     * }
     */
    public static void pfnFree$set(MemorySegment seg, MemorySegment x) {
        constants$16.const$4.set(seg, x);
    }
    public static MemorySegment pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$16.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemorySegment x) {
        constants$16.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_vkFreeFunction pfnFree(MemorySegment segment, Arena scope) {
        return PFN_vkFreeFunction.ofAddress(pfnFree$get(segment), scope);
    }
    public static VarHandle pfnInternalAllocation$VH() {
        return constants$16.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_vkInternalAllocationNotification pfnInternalAllocation;
     * }
     */
    public static MemorySegment pfnInternalAllocation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$16.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_vkInternalAllocationNotification pfnInternalAllocation;
     * }
     */
    public static void pfnInternalAllocation$set(MemorySegment seg, MemorySegment x) {
        constants$16.const$5.set(seg, x);
    }
    public static MemorySegment pfnInternalAllocation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$16.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnInternalAllocation$set(MemorySegment seg, long index, MemorySegment x) {
        constants$16.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_vkInternalAllocationNotification pfnInternalAllocation(MemorySegment segment, Arena scope) {
        return PFN_vkInternalAllocationNotification.ofAddress(pfnInternalAllocation$get(segment), scope);
    }
    public static VarHandle pfnInternalFree$VH() {
        return constants$17.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_vkInternalFreeNotification pfnInternalFree;
     * }
     */
    public static MemorySegment pfnInternalFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$17.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_vkInternalFreeNotification pfnInternalFree;
     * }
     */
    public static void pfnInternalFree$set(MemorySegment seg, MemorySegment x) {
        constants$17.const$0.set(seg, x);
    }
    public static MemorySegment pfnInternalFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$17.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnInternalFree$set(MemorySegment seg, long index, MemorySegment x) {
        constants$17.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_vkInternalFreeNotification pfnInternalFree(MemorySegment segment, Arena scope) {
        return PFN_vkInternalFreeNotification.ofAddress(pfnInternalFree$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

