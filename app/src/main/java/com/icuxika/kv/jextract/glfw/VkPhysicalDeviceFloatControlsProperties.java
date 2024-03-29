// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceFloatControlsProperties {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkShaderFloatControlsIndependence denormBehaviorIndependence;
 *     VkShaderFloatControlsIndependence roundingModeIndependence;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat16;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat32;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat64;
 *     VkBool32 shaderDenormPreserveFloat16;
 *     VkBool32 shaderDenormPreserveFloat32;
 *     VkBool32 shaderDenormPreserveFloat64;
 *     VkBool32 shaderDenormFlushToZeroFloat16;
 *     VkBool32 shaderDenormFlushToZeroFloat32;
 *     VkBool32 shaderDenormFlushToZeroFloat64;
 *     VkBool32 shaderRoundingModeRTEFloat16;
 *     VkBool32 shaderRoundingModeRTEFloat32;
 *     VkBool32 shaderRoundingModeRTEFloat64;
 *     VkBool32 shaderRoundingModeRTZFloat16;
 *     VkBool32 shaderRoundingModeRTZFloat32;
 *     VkBool32 shaderRoundingModeRTZFloat64;
 * };
 * }
 */
public class VkPhysicalDeviceFloatControlsProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$305.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$305.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$305.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$305.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$305.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$305.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$305.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$305.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$305.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$305.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$305.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle denormBehaviorIndependence$VH() {
        return constants$305.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkShaderFloatControlsIndependence denormBehaviorIndependence;
     * }
     */
    public static int denormBehaviorIndependence$get(MemorySegment seg) {
        return (int)constants$305.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkShaderFloatControlsIndependence denormBehaviorIndependence;
     * }
     */
    public static void denormBehaviorIndependence$set(MemorySegment seg, int x) {
        constants$305.const$3.set(seg, x);
    }
    public static int denormBehaviorIndependence$get(MemorySegment seg, long index) {
        return (int)constants$305.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void denormBehaviorIndependence$set(MemorySegment seg, long index, int x) {
        constants$305.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle roundingModeIndependence$VH() {
        return constants$305.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkShaderFloatControlsIndependence roundingModeIndependence;
     * }
     */
    public static int roundingModeIndependence$get(MemorySegment seg) {
        return (int)constants$305.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkShaderFloatControlsIndependence roundingModeIndependence;
     * }
     */
    public static void roundingModeIndependence$set(MemorySegment seg, int x) {
        constants$305.const$4.set(seg, x);
    }
    public static int roundingModeIndependence$get(MemorySegment seg, long index) {
        return (int)constants$305.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void roundingModeIndependence$set(MemorySegment seg, long index, int x) {
        constants$305.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSignedZeroInfNanPreserveFloat16$VH() {
        return constants$305.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat16;
     * }
     */
    public static int shaderSignedZeroInfNanPreserveFloat16$get(MemorySegment seg) {
        return (int)constants$305.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat16;
     * }
     */
    public static void shaderSignedZeroInfNanPreserveFloat16$set(MemorySegment seg, int x) {
        constants$305.const$5.set(seg, x);
    }
    public static int shaderSignedZeroInfNanPreserveFloat16$get(MemorySegment seg, long index) {
        return (int)constants$305.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSignedZeroInfNanPreserveFloat16$set(MemorySegment seg, long index, int x) {
        constants$305.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSignedZeroInfNanPreserveFloat32$VH() {
        return constants$306.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat32;
     * }
     */
    public static int shaderSignedZeroInfNanPreserveFloat32$get(MemorySegment seg) {
        return (int)constants$306.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat32;
     * }
     */
    public static void shaderSignedZeroInfNanPreserveFloat32$set(MemorySegment seg, int x) {
        constants$306.const$0.set(seg, x);
    }
    public static int shaderSignedZeroInfNanPreserveFloat32$get(MemorySegment seg, long index) {
        return (int)constants$306.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSignedZeroInfNanPreserveFloat32$set(MemorySegment seg, long index, int x) {
        constants$306.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSignedZeroInfNanPreserveFloat64$VH() {
        return constants$306.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat64;
     * }
     */
    public static int shaderSignedZeroInfNanPreserveFloat64$get(MemorySegment seg) {
        return (int)constants$306.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSignedZeroInfNanPreserveFloat64;
     * }
     */
    public static void shaderSignedZeroInfNanPreserveFloat64$set(MemorySegment seg, int x) {
        constants$306.const$1.set(seg, x);
    }
    public static int shaderSignedZeroInfNanPreserveFloat64$get(MemorySegment seg, long index) {
        return (int)constants$306.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSignedZeroInfNanPreserveFloat64$set(MemorySegment seg, long index, int x) {
        constants$306.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDenormPreserveFloat16$VH() {
        return constants$306.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDenormPreserveFloat16;
     * }
     */
    public static int shaderDenormPreserveFloat16$get(MemorySegment seg) {
        return (int)constants$306.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDenormPreserveFloat16;
     * }
     */
    public static void shaderDenormPreserveFloat16$set(MemorySegment seg, int x) {
        constants$306.const$2.set(seg, x);
    }
    public static int shaderDenormPreserveFloat16$get(MemorySegment seg, long index) {
        return (int)constants$306.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDenormPreserveFloat16$set(MemorySegment seg, long index, int x) {
        constants$306.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDenormPreserveFloat32$VH() {
        return constants$306.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDenormPreserveFloat32;
     * }
     */
    public static int shaderDenormPreserveFloat32$get(MemorySegment seg) {
        return (int)constants$306.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDenormPreserveFloat32;
     * }
     */
    public static void shaderDenormPreserveFloat32$set(MemorySegment seg, int x) {
        constants$306.const$3.set(seg, x);
    }
    public static int shaderDenormPreserveFloat32$get(MemorySegment seg, long index) {
        return (int)constants$306.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDenormPreserveFloat32$set(MemorySegment seg, long index, int x) {
        constants$306.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDenormPreserveFloat64$VH() {
        return constants$306.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDenormPreserveFloat64;
     * }
     */
    public static int shaderDenormPreserveFloat64$get(MemorySegment seg) {
        return (int)constants$306.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDenormPreserveFloat64;
     * }
     */
    public static void shaderDenormPreserveFloat64$set(MemorySegment seg, int x) {
        constants$306.const$4.set(seg, x);
    }
    public static int shaderDenormPreserveFloat64$get(MemorySegment seg, long index) {
        return (int)constants$306.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDenormPreserveFloat64$set(MemorySegment seg, long index, int x) {
        constants$306.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDenormFlushToZeroFloat16$VH() {
        return constants$306.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDenormFlushToZeroFloat16;
     * }
     */
    public static int shaderDenormFlushToZeroFloat16$get(MemorySegment seg) {
        return (int)constants$306.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDenormFlushToZeroFloat16;
     * }
     */
    public static void shaderDenormFlushToZeroFloat16$set(MemorySegment seg, int x) {
        constants$306.const$5.set(seg, x);
    }
    public static int shaderDenormFlushToZeroFloat16$get(MemorySegment seg, long index) {
        return (int)constants$306.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDenormFlushToZeroFloat16$set(MemorySegment seg, long index, int x) {
        constants$306.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDenormFlushToZeroFloat32$VH() {
        return constants$307.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDenormFlushToZeroFloat32;
     * }
     */
    public static int shaderDenormFlushToZeroFloat32$get(MemorySegment seg) {
        return (int)constants$307.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDenormFlushToZeroFloat32;
     * }
     */
    public static void shaderDenormFlushToZeroFloat32$set(MemorySegment seg, int x) {
        constants$307.const$0.set(seg, x);
    }
    public static int shaderDenormFlushToZeroFloat32$get(MemorySegment seg, long index) {
        return (int)constants$307.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDenormFlushToZeroFloat32$set(MemorySegment seg, long index, int x) {
        constants$307.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDenormFlushToZeroFloat64$VH() {
        return constants$307.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDenormFlushToZeroFloat64;
     * }
     */
    public static int shaderDenormFlushToZeroFloat64$get(MemorySegment seg) {
        return (int)constants$307.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDenormFlushToZeroFloat64;
     * }
     */
    public static void shaderDenormFlushToZeroFloat64$set(MemorySegment seg, int x) {
        constants$307.const$1.set(seg, x);
    }
    public static int shaderDenormFlushToZeroFloat64$get(MemorySegment seg, long index) {
        return (int)constants$307.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDenormFlushToZeroFloat64$set(MemorySegment seg, long index, int x) {
        constants$307.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderRoundingModeRTEFloat16$VH() {
        return constants$307.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTEFloat16;
     * }
     */
    public static int shaderRoundingModeRTEFloat16$get(MemorySegment seg) {
        return (int)constants$307.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTEFloat16;
     * }
     */
    public static void shaderRoundingModeRTEFloat16$set(MemorySegment seg, int x) {
        constants$307.const$2.set(seg, x);
    }
    public static int shaderRoundingModeRTEFloat16$get(MemorySegment seg, long index) {
        return (int)constants$307.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderRoundingModeRTEFloat16$set(MemorySegment seg, long index, int x) {
        constants$307.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderRoundingModeRTEFloat32$VH() {
        return constants$307.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTEFloat32;
     * }
     */
    public static int shaderRoundingModeRTEFloat32$get(MemorySegment seg) {
        return (int)constants$307.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTEFloat32;
     * }
     */
    public static void shaderRoundingModeRTEFloat32$set(MemorySegment seg, int x) {
        constants$307.const$3.set(seg, x);
    }
    public static int shaderRoundingModeRTEFloat32$get(MemorySegment seg, long index) {
        return (int)constants$307.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderRoundingModeRTEFloat32$set(MemorySegment seg, long index, int x) {
        constants$307.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderRoundingModeRTEFloat64$VH() {
        return constants$307.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTEFloat64;
     * }
     */
    public static int shaderRoundingModeRTEFloat64$get(MemorySegment seg) {
        return (int)constants$307.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTEFloat64;
     * }
     */
    public static void shaderRoundingModeRTEFloat64$set(MemorySegment seg, int x) {
        constants$307.const$4.set(seg, x);
    }
    public static int shaderRoundingModeRTEFloat64$get(MemorySegment seg, long index) {
        return (int)constants$307.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderRoundingModeRTEFloat64$set(MemorySegment seg, long index, int x) {
        constants$307.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderRoundingModeRTZFloat16$VH() {
        return constants$307.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTZFloat16;
     * }
     */
    public static int shaderRoundingModeRTZFloat16$get(MemorySegment seg) {
        return (int)constants$307.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTZFloat16;
     * }
     */
    public static void shaderRoundingModeRTZFloat16$set(MemorySegment seg, int x) {
        constants$307.const$5.set(seg, x);
    }
    public static int shaderRoundingModeRTZFloat16$get(MemorySegment seg, long index) {
        return (int)constants$307.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderRoundingModeRTZFloat16$set(MemorySegment seg, long index, int x) {
        constants$307.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderRoundingModeRTZFloat32$VH() {
        return constants$308.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTZFloat32;
     * }
     */
    public static int shaderRoundingModeRTZFloat32$get(MemorySegment seg) {
        return (int)constants$308.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTZFloat32;
     * }
     */
    public static void shaderRoundingModeRTZFloat32$set(MemorySegment seg, int x) {
        constants$308.const$0.set(seg, x);
    }
    public static int shaderRoundingModeRTZFloat32$get(MemorySegment seg, long index) {
        return (int)constants$308.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderRoundingModeRTZFloat32$set(MemorySegment seg, long index, int x) {
        constants$308.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderRoundingModeRTZFloat64$VH() {
        return constants$308.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTZFloat64;
     * }
     */
    public static int shaderRoundingModeRTZFloat64$get(MemorySegment seg) {
        return (int)constants$308.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderRoundingModeRTZFloat64;
     * }
     */
    public static void shaderRoundingModeRTZFloat64$set(MemorySegment seg, int x) {
        constants$308.const$1.set(seg, x);
    }
    public static int shaderRoundingModeRTZFloat64$get(MemorySegment seg, long index) {
        return (int)constants$308.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderRoundingModeRTZFloat64$set(MemorySegment seg, long index, int x) {
        constants$308.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


