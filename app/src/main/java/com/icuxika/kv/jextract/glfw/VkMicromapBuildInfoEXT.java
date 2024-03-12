// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkMicromapBuildInfoEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkMicromapTypeEXT type;
 *     VkBuildMicromapFlagsEXT flags;
 *     VkBuildMicromapModeEXT mode;
 *     VkMicromapEXT dstMicromap;
 *     uint32_t usageCountsCount;
 *     const VkMicromapUsageEXT* pUsageCounts;
 *     const VkMicromapUsageEXT** ppUsageCounts;
 *     VkDeviceOrHostAddressConstKHR data;
 *     VkDeviceOrHostAddressKHR scratchData;
 *     VkDeviceOrHostAddressConstKHR triangleArray;
 *     VkDeviceSize triangleArrayStride;
 * };
 * }
 */
public class VkMicromapBuildInfoEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$941.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$942.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$942.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$942.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$942.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$942.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$942.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$942.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$942.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$942.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$942.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$942.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkMicromapTypeEXT type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$942.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkMicromapTypeEXT type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$942.const$2.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$942.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$942.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$942.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuildMicromapFlagsEXT flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$942.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuildMicromapFlagsEXT flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$942.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$942.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$942.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mode$VH() {
        return constants$942.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBuildMicromapModeEXT mode;
     * }
     */
    public static int mode$get(MemorySegment seg) {
        return (int)constants$942.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBuildMicromapModeEXT mode;
     * }
     */
    public static void mode$set(MemorySegment seg, int x) {
        constants$942.const$4.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)constants$942.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        constants$942.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dstMicromap$VH() {
        return constants$942.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkMicromapEXT dstMicromap;
     * }
     */
    public static MemorySegment dstMicromap$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$942.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkMicromapEXT dstMicromap;
     * }
     */
    public static void dstMicromap$set(MemorySegment seg, MemorySegment x) {
        constants$942.const$5.set(seg, x);
    }
    public static MemorySegment dstMicromap$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$942.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dstMicromap$set(MemorySegment seg, long index, MemorySegment x) {
        constants$942.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle usageCountsCount$VH() {
        return constants$943.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t usageCountsCount;
     * }
     */
    public static int usageCountsCount$get(MemorySegment seg) {
        return (int)constants$943.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t usageCountsCount;
     * }
     */
    public static void usageCountsCount$set(MemorySegment seg, int x) {
        constants$943.const$0.set(seg, x);
    }
    public static int usageCountsCount$get(MemorySegment seg, long index) {
        return (int)constants$943.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void usageCountsCount$set(MemorySegment seg, long index, int x) {
        constants$943.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pUsageCounts$VH() {
        return constants$943.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkMicromapUsageEXT* pUsageCounts;
     * }
     */
    public static MemorySegment pUsageCounts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$943.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkMicromapUsageEXT* pUsageCounts;
     * }
     */
    public static void pUsageCounts$set(MemorySegment seg, MemorySegment x) {
        constants$943.const$1.set(seg, x);
    }
    public static MemorySegment pUsageCounts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$943.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pUsageCounts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$943.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ppUsageCounts$VH() {
        return constants$943.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkMicromapUsageEXT** ppUsageCounts;
     * }
     */
    public static MemorySegment ppUsageCounts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$943.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkMicromapUsageEXT** ppUsageCounts;
     * }
     */
    public static void ppUsageCounts$set(MemorySegment seg, MemorySegment x) {
        constants$943.const$2.set(seg, x);
    }
    public static MemorySegment ppUsageCounts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$943.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ppUsageCounts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$943.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(64, 8);
    }
    public static MemorySegment scratchData$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    public static MemorySegment triangleArray$slice(MemorySegment seg) {
        return seg.asSlice(80, 8);
    }
    public static VarHandle triangleArrayStride$VH() {
        return constants$943.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize triangleArrayStride;
     * }
     */
    public static long triangleArrayStride$get(MemorySegment seg) {
        return (long)constants$943.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize triangleArrayStride;
     * }
     */
    public static void triangleArrayStride$set(MemorySegment seg, long x) {
        constants$943.const$3.set(seg, x);
    }
    public static long triangleArrayStride$get(MemorySegment seg, long index) {
        return (long)constants$943.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void triangleArrayStride$set(MemorySegment seg, long index, long x) {
        constants$943.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

