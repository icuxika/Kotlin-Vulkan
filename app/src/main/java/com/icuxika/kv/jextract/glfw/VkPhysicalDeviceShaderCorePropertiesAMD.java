// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceShaderCorePropertiesAMD {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t shaderEngineCount;
 *     uint32_t shaderArraysPerEngineCount;
 *     uint32_t computeUnitsPerShaderArray;
 *     uint32_t simdPerComputeUnit;
 *     uint32_t wavefrontsPerSimd;
 *     uint32_t wavefrontSize;
 *     uint32_t sgprsPerSimd;
 *     uint32_t minSgprAllocation;
 *     uint32_t maxSgprAllocation;
 *     uint32_t sgprAllocationGranularity;
 *     uint32_t vgprsPerSimd;
 *     uint32_t minVgprAllocation;
 *     uint32_t maxVgprAllocation;
 *     uint32_t vgprAllocationGranularity;
 * };
 * }
 */
public class VkPhysicalDeviceShaderCorePropertiesAMD {

    public static MemoryLayout $LAYOUT() {
        return constants$748.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$748.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$748.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$748.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$748.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$748.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$748.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$748.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$748.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$748.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$748.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderEngineCount$VH() {
        return constants$748.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t shaderEngineCount;
     * }
     */
    public static int shaderEngineCount$get(MemorySegment seg) {
        return (int)constants$748.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t shaderEngineCount;
     * }
     */
    public static void shaderEngineCount$set(MemorySegment seg, int x) {
        constants$748.const$5.set(seg, x);
    }
    public static int shaderEngineCount$get(MemorySegment seg, long index) {
        return (int)constants$748.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderEngineCount$set(MemorySegment seg, long index, int x) {
        constants$748.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderArraysPerEngineCount$VH() {
        return constants$749.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t shaderArraysPerEngineCount;
     * }
     */
    public static int shaderArraysPerEngineCount$get(MemorySegment seg) {
        return (int)constants$749.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t shaderArraysPerEngineCount;
     * }
     */
    public static void shaderArraysPerEngineCount$set(MemorySegment seg, int x) {
        constants$749.const$0.set(seg, x);
    }
    public static int shaderArraysPerEngineCount$get(MemorySegment seg, long index) {
        return (int)constants$749.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderArraysPerEngineCount$set(MemorySegment seg, long index, int x) {
        constants$749.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle computeUnitsPerShaderArray$VH() {
        return constants$749.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t computeUnitsPerShaderArray;
     * }
     */
    public static int computeUnitsPerShaderArray$get(MemorySegment seg) {
        return (int)constants$749.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t computeUnitsPerShaderArray;
     * }
     */
    public static void computeUnitsPerShaderArray$set(MemorySegment seg, int x) {
        constants$749.const$1.set(seg, x);
    }
    public static int computeUnitsPerShaderArray$get(MemorySegment seg, long index) {
        return (int)constants$749.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void computeUnitsPerShaderArray$set(MemorySegment seg, long index, int x) {
        constants$749.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle simdPerComputeUnit$VH() {
        return constants$749.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t simdPerComputeUnit;
     * }
     */
    public static int simdPerComputeUnit$get(MemorySegment seg) {
        return (int)constants$749.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t simdPerComputeUnit;
     * }
     */
    public static void simdPerComputeUnit$set(MemorySegment seg, int x) {
        constants$749.const$2.set(seg, x);
    }
    public static int simdPerComputeUnit$get(MemorySegment seg, long index) {
        return (int)constants$749.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void simdPerComputeUnit$set(MemorySegment seg, long index, int x) {
        constants$749.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wavefrontsPerSimd$VH() {
        return constants$749.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t wavefrontsPerSimd;
     * }
     */
    public static int wavefrontsPerSimd$get(MemorySegment seg) {
        return (int)constants$749.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t wavefrontsPerSimd;
     * }
     */
    public static void wavefrontsPerSimd$set(MemorySegment seg, int x) {
        constants$749.const$3.set(seg, x);
    }
    public static int wavefrontsPerSimd$get(MemorySegment seg, long index) {
        return (int)constants$749.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wavefrontsPerSimd$set(MemorySegment seg, long index, int x) {
        constants$749.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wavefrontSize$VH() {
        return constants$749.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t wavefrontSize;
     * }
     */
    public static int wavefrontSize$get(MemorySegment seg) {
        return (int)constants$749.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t wavefrontSize;
     * }
     */
    public static void wavefrontSize$set(MemorySegment seg, int x) {
        constants$749.const$4.set(seg, x);
    }
    public static int wavefrontSize$get(MemorySegment seg, long index) {
        return (int)constants$749.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wavefrontSize$set(MemorySegment seg, long index, int x) {
        constants$749.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sgprsPerSimd$VH() {
        return constants$749.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t sgprsPerSimd;
     * }
     */
    public static int sgprsPerSimd$get(MemorySegment seg) {
        return (int)constants$749.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t sgprsPerSimd;
     * }
     */
    public static void sgprsPerSimd$set(MemorySegment seg, int x) {
        constants$749.const$5.set(seg, x);
    }
    public static int sgprsPerSimd$get(MemorySegment seg, long index) {
        return (int)constants$749.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sgprsPerSimd$set(MemorySegment seg, long index, int x) {
        constants$749.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minSgprAllocation$VH() {
        return constants$750.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t minSgprAllocation;
     * }
     */
    public static int minSgprAllocation$get(MemorySegment seg) {
        return (int)constants$750.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t minSgprAllocation;
     * }
     */
    public static void minSgprAllocation$set(MemorySegment seg, int x) {
        constants$750.const$0.set(seg, x);
    }
    public static int minSgprAllocation$get(MemorySegment seg, long index) {
        return (int)constants$750.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void minSgprAllocation$set(MemorySegment seg, long index, int x) {
        constants$750.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxSgprAllocation$VH() {
        return constants$750.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxSgprAllocation;
     * }
     */
    public static int maxSgprAllocation$get(MemorySegment seg) {
        return (int)constants$750.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxSgprAllocation;
     * }
     */
    public static void maxSgprAllocation$set(MemorySegment seg, int x) {
        constants$750.const$1.set(seg, x);
    }
    public static int maxSgprAllocation$get(MemorySegment seg, long index) {
        return (int)constants$750.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxSgprAllocation$set(MemorySegment seg, long index, int x) {
        constants$750.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sgprAllocationGranularity$VH() {
        return constants$750.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t sgprAllocationGranularity;
     * }
     */
    public static int sgprAllocationGranularity$get(MemorySegment seg) {
        return (int)constants$750.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t sgprAllocationGranularity;
     * }
     */
    public static void sgprAllocationGranularity$set(MemorySegment seg, int x) {
        constants$750.const$2.set(seg, x);
    }
    public static int sgprAllocationGranularity$get(MemorySegment seg, long index) {
        return (int)constants$750.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void sgprAllocationGranularity$set(MemorySegment seg, long index, int x) {
        constants$750.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vgprsPerSimd$VH() {
        return constants$750.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t vgprsPerSimd;
     * }
     */
    public static int vgprsPerSimd$get(MemorySegment seg) {
        return (int)constants$750.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t vgprsPerSimd;
     * }
     */
    public static void vgprsPerSimd$set(MemorySegment seg, int x) {
        constants$750.const$3.set(seg, x);
    }
    public static int vgprsPerSimd$get(MemorySegment seg, long index) {
        return (int)constants$750.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void vgprsPerSimd$set(MemorySegment seg, long index, int x) {
        constants$750.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minVgprAllocation$VH() {
        return constants$750.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t minVgprAllocation;
     * }
     */
    public static int minVgprAllocation$get(MemorySegment seg) {
        return (int)constants$750.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t minVgprAllocation;
     * }
     */
    public static void minVgprAllocation$set(MemorySegment seg, int x) {
        constants$750.const$4.set(seg, x);
    }
    public static int minVgprAllocation$get(MemorySegment seg, long index) {
        return (int)constants$750.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void minVgprAllocation$set(MemorySegment seg, long index, int x) {
        constants$750.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxVgprAllocation$VH() {
        return constants$750.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxVgprAllocation;
     * }
     */
    public static int maxVgprAllocation$get(MemorySegment seg) {
        return (int)constants$750.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxVgprAllocation;
     * }
     */
    public static void maxVgprAllocation$set(MemorySegment seg, int x) {
        constants$750.const$5.set(seg, x);
    }
    public static int maxVgprAllocation$get(MemorySegment seg, long index) {
        return (int)constants$750.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void maxVgprAllocation$set(MemorySegment seg, long index, int x) {
        constants$750.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vgprAllocationGranularity$VH() {
        return constants$751.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t vgprAllocationGranularity;
     * }
     */
    public static int vgprAllocationGranularity$get(MemorySegment seg) {
        return (int)constants$751.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t vgprAllocationGranularity;
     * }
     */
    public static void vgprAllocationGranularity$set(MemorySegment seg, int x) {
        constants$751.const$0.set(seg, x);
    }
    public static int vgprAllocationGranularity$get(MemorySegment seg, long index) {
        return (int)constants$751.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void vgprAllocationGranularity$set(MemorySegment seg, long index, int x) {
        constants$751.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


