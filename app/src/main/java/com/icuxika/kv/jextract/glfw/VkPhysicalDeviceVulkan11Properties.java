// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceVulkan11Properties {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint8_t deviceUUID[16];
 *     uint8_t driverUUID[16];
 *     uint8_t deviceLUID[8];
 *     uint32_t deviceNodeMask;
 *     VkBool32 deviceLUIDValid;
 *     uint32_t subgroupSize;
 *     VkShaderStageFlags subgroupSupportedStages;
 *     VkSubgroupFeatureFlags subgroupSupportedOperations;
 *     VkBool32 subgroupQuadOperationsInAllStages;
 *     VkPointClippingBehavior pointClippingBehavior;
 *     uint32_t maxMultiviewViewCount;
 *     uint32_t maxMultiviewInstanceIndex;
 *     VkBool32 protectedNoFault;
 *     uint32_t maxPerSetDescriptors;
 *     VkDeviceSize maxMemoryAllocationSize;
 * };
 * }
 */
public class VkPhysicalDeviceVulkan11Properties {

    public static MemoryLayout $LAYOUT() {
        return constants$270.const$1;
    }
    public static VarHandle sType$VH() {
        return constants$270.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$270.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$270.const$2.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$270.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$270.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$270.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$270.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$270.const$3.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$270.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$270.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment deviceUUID$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment driverUUID$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment deviceLUID$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static VarHandle deviceNodeMask$VH() {
        return constants$270.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t deviceNodeMask;
     * }
     */
    public static int deviceNodeMask$get(MemorySegment seg) {
        return (int)constants$270.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t deviceNodeMask;
     * }
     */
    public static void deviceNodeMask$set(MemorySegment seg, int x) {
        constants$270.const$4.set(seg, x);
    }
    public static int deviceNodeMask$get(MemorySegment seg, long index) {
        return (int)constants$270.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void deviceNodeMask$set(MemorySegment seg, long index, int x) {
        constants$270.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle deviceLUIDValid$VH() {
        return constants$270.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 deviceLUIDValid;
     * }
     */
    public static int deviceLUIDValid$get(MemorySegment seg) {
        return (int)constants$270.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 deviceLUIDValid;
     * }
     */
    public static void deviceLUIDValid$set(MemorySegment seg, int x) {
        constants$270.const$5.set(seg, x);
    }
    public static int deviceLUIDValid$get(MemorySegment seg, long index) {
        return (int)constants$270.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void deviceLUIDValid$set(MemorySegment seg, long index, int x) {
        constants$270.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subgroupSize$VH() {
        return constants$271.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t subgroupSize;
     * }
     */
    public static int subgroupSize$get(MemorySegment seg) {
        return (int)constants$271.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t subgroupSize;
     * }
     */
    public static void subgroupSize$set(MemorySegment seg, int x) {
        constants$271.const$0.set(seg, x);
    }
    public static int subgroupSize$get(MemorySegment seg, long index) {
        return (int)constants$271.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void subgroupSize$set(MemorySegment seg, long index, int x) {
        constants$271.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subgroupSupportedStages$VH() {
        return constants$271.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkShaderStageFlags subgroupSupportedStages;
     * }
     */
    public static int subgroupSupportedStages$get(MemorySegment seg) {
        return (int)constants$271.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkShaderStageFlags subgroupSupportedStages;
     * }
     */
    public static void subgroupSupportedStages$set(MemorySegment seg, int x) {
        constants$271.const$1.set(seg, x);
    }
    public static int subgroupSupportedStages$get(MemorySegment seg, long index) {
        return (int)constants$271.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void subgroupSupportedStages$set(MemorySegment seg, long index, int x) {
        constants$271.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subgroupSupportedOperations$VH() {
        return constants$271.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSubgroupFeatureFlags subgroupSupportedOperations;
     * }
     */
    public static int subgroupSupportedOperations$get(MemorySegment seg) {
        return (int)constants$271.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSubgroupFeatureFlags subgroupSupportedOperations;
     * }
     */
    public static void subgroupSupportedOperations$set(MemorySegment seg, int x) {
        constants$271.const$2.set(seg, x);
    }
    public static int subgroupSupportedOperations$get(MemorySegment seg, long index) {
        return (int)constants$271.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void subgroupSupportedOperations$set(MemorySegment seg, long index, int x) {
        constants$271.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subgroupQuadOperationsInAllStages$VH() {
        return constants$271.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 subgroupQuadOperationsInAllStages;
     * }
     */
    public static int subgroupQuadOperationsInAllStages$get(MemorySegment seg) {
        return (int)constants$271.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 subgroupQuadOperationsInAllStages;
     * }
     */
    public static void subgroupQuadOperationsInAllStages$set(MemorySegment seg, int x) {
        constants$271.const$3.set(seg, x);
    }
    public static int subgroupQuadOperationsInAllStages$get(MemorySegment seg, long index) {
        return (int)constants$271.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void subgroupQuadOperationsInAllStages$set(MemorySegment seg, long index, int x) {
        constants$271.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pointClippingBehavior$VH() {
        return constants$271.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPointClippingBehavior pointClippingBehavior;
     * }
     */
    public static int pointClippingBehavior$get(MemorySegment seg) {
        return (int)constants$271.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPointClippingBehavior pointClippingBehavior;
     * }
     */
    public static void pointClippingBehavior$set(MemorySegment seg, int x) {
        constants$271.const$4.set(seg, x);
    }
    public static int pointClippingBehavior$get(MemorySegment seg, long index) {
        return (int)constants$271.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pointClippingBehavior$set(MemorySegment seg, long index, int x) {
        constants$271.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxMultiviewViewCount$VH() {
        return constants$271.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxMultiviewViewCount;
     * }
     */
    public static int maxMultiviewViewCount$get(MemorySegment seg) {
        return (int)constants$271.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxMultiviewViewCount;
     * }
     */
    public static void maxMultiviewViewCount$set(MemorySegment seg, int x) {
        constants$271.const$5.set(seg, x);
    }
    public static int maxMultiviewViewCount$get(MemorySegment seg, long index) {
        return (int)constants$271.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void maxMultiviewViewCount$set(MemorySegment seg, long index, int x) {
        constants$271.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxMultiviewInstanceIndex$VH() {
        return constants$272.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxMultiviewInstanceIndex;
     * }
     */
    public static int maxMultiviewInstanceIndex$get(MemorySegment seg) {
        return (int)constants$272.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxMultiviewInstanceIndex;
     * }
     */
    public static void maxMultiviewInstanceIndex$set(MemorySegment seg, int x) {
        constants$272.const$0.set(seg, x);
    }
    public static int maxMultiviewInstanceIndex$get(MemorySegment seg, long index) {
        return (int)constants$272.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxMultiviewInstanceIndex$set(MemorySegment seg, long index, int x) {
        constants$272.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle protectedNoFault$VH() {
        return constants$272.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 protectedNoFault;
     * }
     */
    public static int protectedNoFault$get(MemorySegment seg) {
        return (int)constants$272.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 protectedNoFault;
     * }
     */
    public static void protectedNoFault$set(MemorySegment seg, int x) {
        constants$272.const$1.set(seg, x);
    }
    public static int protectedNoFault$get(MemorySegment seg, long index) {
        return (int)constants$272.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void protectedNoFault$set(MemorySegment seg, long index, int x) {
        constants$272.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerSetDescriptors$VH() {
        return constants$272.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerSetDescriptors;
     * }
     */
    public static int maxPerSetDescriptors$get(MemorySegment seg) {
        return (int)constants$272.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerSetDescriptors;
     * }
     */
    public static void maxPerSetDescriptors$set(MemorySegment seg, int x) {
        constants$272.const$2.set(seg, x);
    }
    public static int maxPerSetDescriptors$get(MemorySegment seg, long index) {
        return (int)constants$272.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerSetDescriptors$set(MemorySegment seg, long index, int x) {
        constants$272.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxMemoryAllocationSize$VH() {
        return constants$272.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize maxMemoryAllocationSize;
     * }
     */
    public static long maxMemoryAllocationSize$get(MemorySegment seg) {
        return (long)constants$272.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize maxMemoryAllocationSize;
     * }
     */
    public static void maxMemoryAllocationSize$set(MemorySegment seg, long x) {
        constants$272.const$3.set(seg, x);
    }
    public static long maxMemoryAllocationSize$get(MemorySegment seg, long index) {
        return (long)constants$272.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxMemoryAllocationSize$set(MemorySegment seg, long index, long x) {
        constants$272.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


