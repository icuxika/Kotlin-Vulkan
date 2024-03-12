// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceDescriptorBufferPropertiesEXT {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 combinedImageSamplerDescriptorSingleArray;
 *     VkBool32 bufferlessPushDescriptors;
 *     VkBool32 allowSamplerImageViewPostSubmitCreation;
 *     VkDeviceSize descriptorBufferOffsetAlignment;
 *     uint32_t maxDescriptorBufferBindings;
 *     uint32_t maxResourceDescriptorBufferBindings;
 *     uint32_t maxSamplerDescriptorBufferBindings;
 *     uint32_t maxEmbeddedImmutableSamplerBindings;
 *     uint32_t maxEmbeddedImmutableSamplers;
 *     size_t bufferCaptureReplayDescriptorDataSize;
 *     size_t imageCaptureReplayDescriptorDataSize;
 *     size_t imageViewCaptureReplayDescriptorDataSize;
 *     size_t samplerCaptureReplayDescriptorDataSize;
 *     size_t accelerationStructureCaptureReplayDescriptorDataSize;
 *     size_t samplerDescriptorSize;
 *     size_t combinedImageSamplerDescriptorSize;
 *     size_t sampledImageDescriptorSize;
 *     size_t storageImageDescriptorSize;
 *     size_t uniformTexelBufferDescriptorSize;
 *     size_t robustUniformTexelBufferDescriptorSize;
 *     size_t storageTexelBufferDescriptorSize;
 *     size_t robustStorageTexelBufferDescriptorSize;
 *     size_t uniformBufferDescriptorSize;
 *     size_t robustUniformBufferDescriptorSize;
 *     size_t storageBufferDescriptorSize;
 *     size_t robustStorageBufferDescriptorSize;
 *     size_t inputAttachmentDescriptorSize;
 *     size_t accelerationStructureDescriptorSize;
 *     VkDeviceSize maxSamplerDescriptorBufferRange;
 *     VkDeviceSize maxResourceDescriptorBufferRange;
 *     VkDeviceSize samplerDescriptorBufferAddressSpaceSize;
 *     VkDeviceSize resourceDescriptorBufferAddressSpaceSize;
 *     VkDeviceSize descriptorBufferAddressSpaceSize;
 * };
 * }
 */
public class VkPhysicalDeviceDescriptorBufferPropertiesEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$856.const$5;
    }
    public static VarHandle sType$VH() {
        return constants$857.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$857.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$857.const$0.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$857.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$857.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$857.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$857.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$857.const$1.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$857.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$857.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle combinedImageSamplerDescriptorSingleArray$VH() {
        return constants$857.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 combinedImageSamplerDescriptorSingleArray;
     * }
     */
    public static int combinedImageSamplerDescriptorSingleArray$get(MemorySegment seg) {
        return (int)constants$857.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 combinedImageSamplerDescriptorSingleArray;
     * }
     */
    public static void combinedImageSamplerDescriptorSingleArray$set(MemorySegment seg, int x) {
        constants$857.const$2.set(seg, x);
    }
    public static int combinedImageSamplerDescriptorSingleArray$get(MemorySegment seg, long index) {
        return (int)constants$857.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void combinedImageSamplerDescriptorSingleArray$set(MemorySegment seg, long index, int x) {
        constants$857.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bufferlessPushDescriptors$VH() {
        return constants$857.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 bufferlessPushDescriptors;
     * }
     */
    public static int bufferlessPushDescriptors$get(MemorySegment seg) {
        return (int)constants$857.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 bufferlessPushDescriptors;
     * }
     */
    public static void bufferlessPushDescriptors$set(MemorySegment seg, int x) {
        constants$857.const$3.set(seg, x);
    }
    public static int bufferlessPushDescriptors$get(MemorySegment seg, long index) {
        return (int)constants$857.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bufferlessPushDescriptors$set(MemorySegment seg, long index, int x) {
        constants$857.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle allowSamplerImageViewPostSubmitCreation$VH() {
        return constants$857.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 allowSamplerImageViewPostSubmitCreation;
     * }
     */
    public static int allowSamplerImageViewPostSubmitCreation$get(MemorySegment seg) {
        return (int)constants$857.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 allowSamplerImageViewPostSubmitCreation;
     * }
     */
    public static void allowSamplerImageViewPostSubmitCreation$set(MemorySegment seg, int x) {
        constants$857.const$4.set(seg, x);
    }
    public static int allowSamplerImageViewPostSubmitCreation$get(MemorySegment seg, long index) {
        return (int)constants$857.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void allowSamplerImageViewPostSubmitCreation$set(MemorySegment seg, long index, int x) {
        constants$857.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorBufferOffsetAlignment$VH() {
        return constants$857.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize descriptorBufferOffsetAlignment;
     * }
     */
    public static long descriptorBufferOffsetAlignment$get(MemorySegment seg) {
        return (long)constants$857.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize descriptorBufferOffsetAlignment;
     * }
     */
    public static void descriptorBufferOffsetAlignment$set(MemorySegment seg, long x) {
        constants$857.const$5.set(seg, x);
    }
    public static long descriptorBufferOffsetAlignment$get(MemorySegment seg, long index) {
        return (long)constants$857.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorBufferOffsetAlignment$set(MemorySegment seg, long index, long x) {
        constants$857.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorBufferBindings$VH() {
        return constants$858.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorBufferBindings;
     * }
     */
    public static int maxDescriptorBufferBindings$get(MemorySegment seg) {
        return (int)constants$858.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorBufferBindings;
     * }
     */
    public static void maxDescriptorBufferBindings$set(MemorySegment seg, int x) {
        constants$858.const$0.set(seg, x);
    }
    public static int maxDescriptorBufferBindings$get(MemorySegment seg, long index) {
        return (int)constants$858.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorBufferBindings$set(MemorySegment seg, long index, int x) {
        constants$858.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxResourceDescriptorBufferBindings$VH() {
        return constants$858.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxResourceDescriptorBufferBindings;
     * }
     */
    public static int maxResourceDescriptorBufferBindings$get(MemorySegment seg) {
        return (int)constants$858.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxResourceDescriptorBufferBindings;
     * }
     */
    public static void maxResourceDescriptorBufferBindings$set(MemorySegment seg, int x) {
        constants$858.const$1.set(seg, x);
    }
    public static int maxResourceDescriptorBufferBindings$get(MemorySegment seg, long index) {
        return (int)constants$858.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxResourceDescriptorBufferBindings$set(MemorySegment seg, long index, int x) {
        constants$858.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxSamplerDescriptorBufferBindings$VH() {
        return constants$858.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxSamplerDescriptorBufferBindings;
     * }
     */
    public static int maxSamplerDescriptorBufferBindings$get(MemorySegment seg) {
        return (int)constants$858.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxSamplerDescriptorBufferBindings;
     * }
     */
    public static void maxSamplerDescriptorBufferBindings$set(MemorySegment seg, int x) {
        constants$858.const$2.set(seg, x);
    }
    public static int maxSamplerDescriptorBufferBindings$get(MemorySegment seg, long index) {
        return (int)constants$858.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxSamplerDescriptorBufferBindings$set(MemorySegment seg, long index, int x) {
        constants$858.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxEmbeddedImmutableSamplerBindings$VH() {
        return constants$858.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxEmbeddedImmutableSamplerBindings;
     * }
     */
    public static int maxEmbeddedImmutableSamplerBindings$get(MemorySegment seg) {
        return (int)constants$858.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxEmbeddedImmutableSamplerBindings;
     * }
     */
    public static void maxEmbeddedImmutableSamplerBindings$set(MemorySegment seg, int x) {
        constants$858.const$3.set(seg, x);
    }
    public static int maxEmbeddedImmutableSamplerBindings$get(MemorySegment seg, long index) {
        return (int)constants$858.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxEmbeddedImmutableSamplerBindings$set(MemorySegment seg, long index, int x) {
        constants$858.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxEmbeddedImmutableSamplers$VH() {
        return constants$858.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxEmbeddedImmutableSamplers;
     * }
     */
    public static int maxEmbeddedImmutableSamplers$get(MemorySegment seg) {
        return (int)constants$858.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxEmbeddedImmutableSamplers;
     * }
     */
    public static void maxEmbeddedImmutableSamplers$set(MemorySegment seg, int x) {
        constants$858.const$4.set(seg, x);
    }
    public static int maxEmbeddedImmutableSamplers$get(MemorySegment seg, long index) {
        return (int)constants$858.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void maxEmbeddedImmutableSamplers$set(MemorySegment seg, long index, int x) {
        constants$858.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bufferCaptureReplayDescriptorDataSize$VH() {
        return constants$858.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t bufferCaptureReplayDescriptorDataSize;
     * }
     */
    public static long bufferCaptureReplayDescriptorDataSize$get(MemorySegment seg) {
        return (long)constants$858.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t bufferCaptureReplayDescriptorDataSize;
     * }
     */
    public static void bufferCaptureReplayDescriptorDataSize$set(MemorySegment seg, long x) {
        constants$858.const$5.set(seg, x);
    }
    public static long bufferCaptureReplayDescriptorDataSize$get(MemorySegment seg, long index) {
        return (long)constants$858.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bufferCaptureReplayDescriptorDataSize$set(MemorySegment seg, long index, long x) {
        constants$858.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageCaptureReplayDescriptorDataSize$VH() {
        return constants$859.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t imageCaptureReplayDescriptorDataSize;
     * }
     */
    public static long imageCaptureReplayDescriptorDataSize$get(MemorySegment seg) {
        return (long)constants$859.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t imageCaptureReplayDescriptorDataSize;
     * }
     */
    public static void imageCaptureReplayDescriptorDataSize$set(MemorySegment seg, long x) {
        constants$859.const$0.set(seg, x);
    }
    public static long imageCaptureReplayDescriptorDataSize$get(MemorySegment seg, long index) {
        return (long)constants$859.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void imageCaptureReplayDescriptorDataSize$set(MemorySegment seg, long index, long x) {
        constants$859.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageViewCaptureReplayDescriptorDataSize$VH() {
        return constants$859.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t imageViewCaptureReplayDescriptorDataSize;
     * }
     */
    public static long imageViewCaptureReplayDescriptorDataSize$get(MemorySegment seg) {
        return (long)constants$859.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t imageViewCaptureReplayDescriptorDataSize;
     * }
     */
    public static void imageViewCaptureReplayDescriptorDataSize$set(MemorySegment seg, long x) {
        constants$859.const$1.set(seg, x);
    }
    public static long imageViewCaptureReplayDescriptorDataSize$get(MemorySegment seg, long index) {
        return (long)constants$859.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void imageViewCaptureReplayDescriptorDataSize$set(MemorySegment seg, long index, long x) {
        constants$859.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle samplerCaptureReplayDescriptorDataSize$VH() {
        return constants$859.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t samplerCaptureReplayDescriptorDataSize;
     * }
     */
    public static long samplerCaptureReplayDescriptorDataSize$get(MemorySegment seg) {
        return (long)constants$859.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t samplerCaptureReplayDescriptorDataSize;
     * }
     */
    public static void samplerCaptureReplayDescriptorDataSize$set(MemorySegment seg, long x) {
        constants$859.const$2.set(seg, x);
    }
    public static long samplerCaptureReplayDescriptorDataSize$get(MemorySegment seg, long index) {
        return (long)constants$859.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void samplerCaptureReplayDescriptorDataSize$set(MemorySegment seg, long index, long x) {
        constants$859.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructureCaptureReplayDescriptorDataSize$VH() {
        return constants$859.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t accelerationStructureCaptureReplayDescriptorDataSize;
     * }
     */
    public static long accelerationStructureCaptureReplayDescriptorDataSize$get(MemorySegment seg) {
        return (long)constants$859.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t accelerationStructureCaptureReplayDescriptorDataSize;
     * }
     */
    public static void accelerationStructureCaptureReplayDescriptorDataSize$set(MemorySegment seg, long x) {
        constants$859.const$3.set(seg, x);
    }
    public static long accelerationStructureCaptureReplayDescriptorDataSize$get(MemorySegment seg, long index) {
        return (long)constants$859.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructureCaptureReplayDescriptorDataSize$set(MemorySegment seg, long index, long x) {
        constants$859.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle samplerDescriptorSize$VH() {
        return constants$859.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t samplerDescriptorSize;
     * }
     */
    public static long samplerDescriptorSize$get(MemorySegment seg) {
        return (long)constants$859.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t samplerDescriptorSize;
     * }
     */
    public static void samplerDescriptorSize$set(MemorySegment seg, long x) {
        constants$859.const$4.set(seg, x);
    }
    public static long samplerDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$859.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void samplerDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$859.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle combinedImageSamplerDescriptorSize$VH() {
        return constants$859.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t combinedImageSamplerDescriptorSize;
     * }
     */
    public static long combinedImageSamplerDescriptorSize$get(MemorySegment seg) {
        return (long)constants$859.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t combinedImageSamplerDescriptorSize;
     * }
     */
    public static void combinedImageSamplerDescriptorSize$set(MemorySegment seg, long x) {
        constants$859.const$5.set(seg, x);
    }
    public static long combinedImageSamplerDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$859.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void combinedImageSamplerDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$859.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sampledImageDescriptorSize$VH() {
        return constants$860.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t sampledImageDescriptorSize;
     * }
     */
    public static long sampledImageDescriptorSize$get(MemorySegment seg) {
        return (long)constants$860.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t sampledImageDescriptorSize;
     * }
     */
    public static void sampledImageDescriptorSize$set(MemorySegment seg, long x) {
        constants$860.const$0.set(seg, x);
    }
    public static long sampledImageDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$860.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sampledImageDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$860.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle storageImageDescriptorSize$VH() {
        return constants$860.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t storageImageDescriptorSize;
     * }
     */
    public static long storageImageDescriptorSize$get(MemorySegment seg) {
        return (long)constants$860.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t storageImageDescriptorSize;
     * }
     */
    public static void storageImageDescriptorSize$set(MemorySegment seg, long x) {
        constants$860.const$1.set(seg, x);
    }
    public static long storageImageDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$860.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void storageImageDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$860.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uniformTexelBufferDescriptorSize$VH() {
        return constants$860.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t uniformTexelBufferDescriptorSize;
     * }
     */
    public static long uniformTexelBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$860.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t uniformTexelBufferDescriptorSize;
     * }
     */
    public static void uniformTexelBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$860.const$2.set(seg, x);
    }
    public static long uniformTexelBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$860.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void uniformTexelBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$860.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle robustUniformTexelBufferDescriptorSize$VH() {
        return constants$860.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t robustUniformTexelBufferDescriptorSize;
     * }
     */
    public static long robustUniformTexelBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$860.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t robustUniformTexelBufferDescriptorSize;
     * }
     */
    public static void robustUniformTexelBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$860.const$3.set(seg, x);
    }
    public static long robustUniformTexelBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$860.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void robustUniformTexelBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$860.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle storageTexelBufferDescriptorSize$VH() {
        return constants$860.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t storageTexelBufferDescriptorSize;
     * }
     */
    public static long storageTexelBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$860.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t storageTexelBufferDescriptorSize;
     * }
     */
    public static void storageTexelBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$860.const$4.set(seg, x);
    }
    public static long storageTexelBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$860.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void storageTexelBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$860.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle robustStorageTexelBufferDescriptorSize$VH() {
        return constants$860.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t robustStorageTexelBufferDescriptorSize;
     * }
     */
    public static long robustStorageTexelBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$860.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t robustStorageTexelBufferDescriptorSize;
     * }
     */
    public static void robustStorageTexelBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$860.const$5.set(seg, x);
    }
    public static long robustStorageTexelBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$860.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void robustStorageTexelBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$860.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uniformBufferDescriptorSize$VH() {
        return constants$861.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t uniformBufferDescriptorSize;
     * }
     */
    public static long uniformBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$861.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t uniformBufferDescriptorSize;
     * }
     */
    public static void uniformBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$861.const$0.set(seg, x);
    }
    public static long uniformBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$861.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void uniformBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$861.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle robustUniformBufferDescriptorSize$VH() {
        return constants$861.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t robustUniformBufferDescriptorSize;
     * }
     */
    public static long robustUniformBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$861.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t robustUniformBufferDescriptorSize;
     * }
     */
    public static void robustUniformBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$861.const$1.set(seg, x);
    }
    public static long robustUniformBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$861.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void robustUniformBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$861.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle storageBufferDescriptorSize$VH() {
        return constants$861.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t storageBufferDescriptorSize;
     * }
     */
    public static long storageBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$861.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t storageBufferDescriptorSize;
     * }
     */
    public static void storageBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$861.const$2.set(seg, x);
    }
    public static long storageBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$861.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void storageBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$861.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle robustStorageBufferDescriptorSize$VH() {
        return constants$861.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t robustStorageBufferDescriptorSize;
     * }
     */
    public static long robustStorageBufferDescriptorSize$get(MemorySegment seg) {
        return (long)constants$861.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t robustStorageBufferDescriptorSize;
     * }
     */
    public static void robustStorageBufferDescriptorSize$set(MemorySegment seg, long x) {
        constants$861.const$3.set(seg, x);
    }
    public static long robustStorageBufferDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$861.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void robustStorageBufferDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$861.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle inputAttachmentDescriptorSize$VH() {
        return constants$861.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t inputAttachmentDescriptorSize;
     * }
     */
    public static long inputAttachmentDescriptorSize$get(MemorySegment seg) {
        return (long)constants$861.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t inputAttachmentDescriptorSize;
     * }
     */
    public static void inputAttachmentDescriptorSize$set(MemorySegment seg, long x) {
        constants$861.const$4.set(seg, x);
    }
    public static long inputAttachmentDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$861.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void inputAttachmentDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$861.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerationStructureDescriptorSize$VH() {
        return constants$861.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t accelerationStructureDescriptorSize;
     * }
     */
    public static long accelerationStructureDescriptorSize$get(MemorySegment seg) {
        return (long)constants$861.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t accelerationStructureDescriptorSize;
     * }
     */
    public static void accelerationStructureDescriptorSize$set(MemorySegment seg, long x) {
        constants$861.const$5.set(seg, x);
    }
    public static long accelerationStructureDescriptorSize$get(MemorySegment seg, long index) {
        return (long)constants$861.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerationStructureDescriptorSize$set(MemorySegment seg, long index, long x) {
        constants$861.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxSamplerDescriptorBufferRange$VH() {
        return constants$862.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize maxSamplerDescriptorBufferRange;
     * }
     */
    public static long maxSamplerDescriptorBufferRange$get(MemorySegment seg) {
        return (long)constants$862.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize maxSamplerDescriptorBufferRange;
     * }
     */
    public static void maxSamplerDescriptorBufferRange$set(MemorySegment seg, long x) {
        constants$862.const$0.set(seg, x);
    }
    public static long maxSamplerDescriptorBufferRange$get(MemorySegment seg, long index) {
        return (long)constants$862.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxSamplerDescriptorBufferRange$set(MemorySegment seg, long index, long x) {
        constants$862.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxResourceDescriptorBufferRange$VH() {
        return constants$862.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize maxResourceDescriptorBufferRange;
     * }
     */
    public static long maxResourceDescriptorBufferRange$get(MemorySegment seg) {
        return (long)constants$862.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize maxResourceDescriptorBufferRange;
     * }
     */
    public static void maxResourceDescriptorBufferRange$set(MemorySegment seg, long x) {
        constants$862.const$1.set(seg, x);
    }
    public static long maxResourceDescriptorBufferRange$get(MemorySegment seg, long index) {
        return (long)constants$862.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxResourceDescriptorBufferRange$set(MemorySegment seg, long index, long x) {
        constants$862.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle samplerDescriptorBufferAddressSpaceSize$VH() {
        return constants$862.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize samplerDescriptorBufferAddressSpaceSize;
     * }
     */
    public static long samplerDescriptorBufferAddressSpaceSize$get(MemorySegment seg) {
        return (long)constants$862.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize samplerDescriptorBufferAddressSpaceSize;
     * }
     */
    public static void samplerDescriptorBufferAddressSpaceSize$set(MemorySegment seg, long x) {
        constants$862.const$2.set(seg, x);
    }
    public static long samplerDescriptorBufferAddressSpaceSize$get(MemorySegment seg, long index) {
        return (long)constants$862.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void samplerDescriptorBufferAddressSpaceSize$set(MemorySegment seg, long index, long x) {
        constants$862.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle resourceDescriptorBufferAddressSpaceSize$VH() {
        return constants$862.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize resourceDescriptorBufferAddressSpaceSize;
     * }
     */
    public static long resourceDescriptorBufferAddressSpaceSize$get(MemorySegment seg) {
        return (long)constants$862.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize resourceDescriptorBufferAddressSpaceSize;
     * }
     */
    public static void resourceDescriptorBufferAddressSpaceSize$set(MemorySegment seg, long x) {
        constants$862.const$3.set(seg, x);
    }
    public static long resourceDescriptorBufferAddressSpaceSize$get(MemorySegment seg, long index) {
        return (long)constants$862.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void resourceDescriptorBufferAddressSpaceSize$set(MemorySegment seg, long index, long x) {
        constants$862.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorBufferAddressSpaceSize$VH() {
        return constants$862.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDeviceSize descriptorBufferAddressSpaceSize;
     * }
     */
    public static long descriptorBufferAddressSpaceSize$get(MemorySegment seg) {
        return (long)constants$862.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDeviceSize descriptorBufferAddressSpaceSize;
     * }
     */
    public static void descriptorBufferAddressSpaceSize$set(MemorySegment seg, long x) {
        constants$862.const$4.set(seg, x);
    }
    public static long descriptorBufferAddressSpaceSize$get(MemorySegment seg, long index) {
        return (long)constants$862.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorBufferAddressSpaceSize$set(MemorySegment seg, long index, long x) {
        constants$862.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

