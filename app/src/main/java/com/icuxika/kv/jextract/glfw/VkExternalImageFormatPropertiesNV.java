// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkExternalImageFormatPropertiesNV {
 *     VkImageFormatProperties imageFormatProperties;
 *     VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
 *     VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
 *     VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
 * };
 * }
 */
public class VkExternalImageFormatPropertiesNV {

    public static MemoryLayout $LAYOUT() {
        return constants$642.const$4;
    }
    public static MemorySegment imageFormatProperties$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static VarHandle externalMemoryFeatures$VH() {
        return constants$642.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
     * }
     */
    public static int externalMemoryFeatures$get(MemorySegment seg) {
        return (int)constants$642.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
     * }
     */
    public static void externalMemoryFeatures$set(MemorySegment seg, int x) {
        constants$642.const$5.set(seg, x);
    }
    public static int externalMemoryFeatures$get(MemorySegment seg, long index) {
        return (int)constants$642.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void externalMemoryFeatures$set(MemorySegment seg, long index, int x) {
        constants$642.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle exportFromImportedHandleTypes$VH() {
        return constants$643.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
     * }
     */
    public static int exportFromImportedHandleTypes$get(MemorySegment seg) {
        return (int)constants$643.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
     * }
     */
    public static void exportFromImportedHandleTypes$set(MemorySegment seg, int x) {
        constants$643.const$0.set(seg, x);
    }
    public static int exportFromImportedHandleTypes$get(MemorySegment seg, long index) {
        return (int)constants$643.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void exportFromImportedHandleTypes$set(MemorySegment seg, long index, int x) {
        constants$643.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle compatibleHandleTypes$VH() {
        return constants$643.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
     * }
     */
    public static int compatibleHandleTypes$get(MemorySegment seg) {
        return (int)constants$643.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
     * }
     */
    public static void compatibleHandleTypes$set(MemorySegment seg, int x) {
        constants$643.const$1.set(seg, x);
    }
    public static int compatibleHandleTypes$get(MemorySegment seg, long index) {
        return (int)constants$643.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void compatibleHandleTypes$set(MemorySegment seg, long index, int x) {
        constants$643.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

