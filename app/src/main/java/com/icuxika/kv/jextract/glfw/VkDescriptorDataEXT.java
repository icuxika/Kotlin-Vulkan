// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union VkDescriptorDataEXT {
 *     const VkSampler* pSampler;
 *     const VkDescriptorImageInfo* pCombinedImageSampler;
 *     const VkDescriptorImageInfo* pInputAttachmentImage;
 *     const VkDescriptorImageInfo* pSampledImage;
 *     const VkDescriptorImageInfo* pStorageImage;
 *     const VkDescriptorAddressInfoEXT* pUniformTexelBuffer;
 *     const VkDescriptorAddressInfoEXT* pStorageTexelBuffer;
 *     const VkDescriptorAddressInfoEXT* pUniformBuffer;
 *     const VkDescriptorAddressInfoEXT* pStorageBuffer;
 *     VkDeviceAddress accelerationStructure;
 * };
 * }
 */
public class VkDescriptorDataEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$867.const$1;
    }
    public static VarHandle pSampler$VH() {
        return constants$867.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkSampler* pSampler;
     * }
     */
    public static MemorySegment pSampler$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$867.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkSampler* pSampler;
     * }
     */
    public static void pSampler$set(MemorySegment seg, MemorySegment x) {
        constants$867.const$2.set(seg, x);
    }
    public static MemorySegment pSampler$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$867.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pSampler$set(MemorySegment seg, long index, MemorySegment x) {
        constants$867.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pCombinedImageSampler$VH() {
        return constants$867.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pCombinedImageSampler;
     * }
     */
    public static MemorySegment pCombinedImageSampler$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$867.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pCombinedImageSampler;
     * }
     */
    public static void pCombinedImageSampler$set(MemorySegment seg, MemorySegment x) {
        constants$867.const$3.set(seg, x);
    }
    public static MemorySegment pCombinedImageSampler$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$867.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pCombinedImageSampler$set(MemorySegment seg, long index, MemorySegment x) {
        constants$867.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pInputAttachmentImage$VH() {
        return constants$867.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pInputAttachmentImage;
     * }
     */
    public static MemorySegment pInputAttachmentImage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$867.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pInputAttachmentImage;
     * }
     */
    public static void pInputAttachmentImage$set(MemorySegment seg, MemorySegment x) {
        constants$867.const$4.set(seg, x);
    }
    public static MemorySegment pInputAttachmentImage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$867.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pInputAttachmentImage$set(MemorySegment seg, long index, MemorySegment x) {
        constants$867.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pSampledImage$VH() {
        return constants$867.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pSampledImage;
     * }
     */
    public static MemorySegment pSampledImage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$867.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pSampledImage;
     * }
     */
    public static void pSampledImage$set(MemorySegment seg, MemorySegment x) {
        constants$867.const$5.set(seg, x);
    }
    public static MemorySegment pSampledImage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$867.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pSampledImage$set(MemorySegment seg, long index, MemorySegment x) {
        constants$867.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStorageImage$VH() {
        return constants$868.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pStorageImage;
     * }
     */
    public static MemorySegment pStorageImage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$868.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorImageInfo* pStorageImage;
     * }
     */
    public static void pStorageImage$set(MemorySegment seg, MemorySegment x) {
        constants$868.const$0.set(seg, x);
    }
    public static MemorySegment pStorageImage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$868.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pStorageImage$set(MemorySegment seg, long index, MemorySegment x) {
        constants$868.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pUniformTexelBuffer$VH() {
        return constants$868.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pUniformTexelBuffer;
     * }
     */
    public static MemorySegment pUniformTexelBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$868.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pUniformTexelBuffer;
     * }
     */
    public static void pUniformTexelBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$868.const$1.set(seg, x);
    }
    public static MemorySegment pUniformTexelBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$868.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pUniformTexelBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$868.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStorageTexelBuffer$VH() {
        return constants$868.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pStorageTexelBuffer;
     * }
     */
    public static MemorySegment pStorageTexelBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$868.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pStorageTexelBuffer;
     * }
     */
    public static void pStorageTexelBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$868.const$2.set(seg, x);
    }
    public static MemorySegment pStorageTexelBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$868.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pStorageTexelBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$868.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pUniformBuffer$VH() {
        return constants$868.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pUniformBuffer;
     * }
     */
    public static MemorySegment pUniformBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$868.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pUniformBuffer;
     * }
     */
    public static void pUniformBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$868.const$3.set(seg, x);
    }
    public static MemorySegment pUniformBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$868.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pUniformBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$868.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStorageBuffer$VH() {
        return constants$868.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pStorageBuffer;
     * }
     */
    public static MemorySegment pStorageBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$868.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkDescriptorAddressInfoEXT* pStorageBuffer;
     * }
     */
    public static void pStorageBuffer$set(MemorySegment seg, MemorySegment x) {
        constants$868.const$4.set(seg, x);
    }
    public static MemorySegment pStorageBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$868.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pStorageBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$868.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructure$VH() {
        return constants$868.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceAddress accelerationStructure;
     * }
     */
    public static long accelerationStructure$get(MemorySegment seg) {
        return (long)constants$868.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceAddress accelerationStructure;
     * }
     */
    public static void accelerationStructure$set(MemorySegment seg, long x) {
        constants$868.const$5.set(seg, x);
    }
    public static long accelerationStructure$get(MemorySegment seg, long index) {
        return (long)constants$868.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructure$set(MemorySegment seg, long index, long x) {
        constants$868.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

