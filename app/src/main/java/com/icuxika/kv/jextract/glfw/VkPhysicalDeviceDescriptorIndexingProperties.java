// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceDescriptorIndexingProperties {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t maxUpdateAfterBindDescriptorsInAllPools;
 *     VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
 *     VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
 *     VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
 *     VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
 *     VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
 *     VkBool32 robustBufferAccessUpdateAfterBind;
 *     VkBool32 quadDivergentImplicitLod;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
 *     uint32_t maxPerStageUpdateAfterBindResources;
 *     uint32_t maxDescriptorSetUpdateAfterBindSamplers;
 *     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
 *     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
 *     uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
 * };
 * }
 */
public class VkPhysicalDeviceDescriptorIndexingProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$313.const$0;
    }
    public static VarHandle sType$VH() {
        return constants$313.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$313.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$313.const$1.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$313.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$313.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$313.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$313.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$313.const$2.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$313.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$313.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxUpdateAfterBindDescriptorsInAllPools$VH() {
        return constants$313.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxUpdateAfterBindDescriptorsInAllPools;
     * }
     */
    public static int maxUpdateAfterBindDescriptorsInAllPools$get(MemorySegment seg) {
        return (int)constants$313.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxUpdateAfterBindDescriptorsInAllPools;
     * }
     */
    public static void maxUpdateAfterBindDescriptorsInAllPools$set(MemorySegment seg, int x) {
        constants$313.const$3.set(seg, x);
    }
    public static int maxUpdateAfterBindDescriptorsInAllPools$get(MemorySegment seg, long index) {
        return (int)constants$313.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxUpdateAfterBindDescriptorsInAllPools$set(MemorySegment seg, long index, int x) {
        constants$313.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderUniformBufferArrayNonUniformIndexingNative$VH() {
        return constants$313.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
     * }
     */
    public static int shaderUniformBufferArrayNonUniformIndexingNative$get(MemorySegment seg) {
        return (int)constants$313.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
     * }
     */
    public static void shaderUniformBufferArrayNonUniformIndexingNative$set(MemorySegment seg, int x) {
        constants$313.const$4.set(seg, x);
    }
    public static int shaderUniformBufferArrayNonUniformIndexingNative$get(MemorySegment seg, long index) {
        return (int)constants$313.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderUniformBufferArrayNonUniformIndexingNative$set(MemorySegment seg, long index, int x) {
        constants$313.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderSampledImageArrayNonUniformIndexingNative$VH() {
        return constants$313.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
     * }
     */
    public static int shaderSampledImageArrayNonUniformIndexingNative$get(MemorySegment seg) {
        return (int)constants$313.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
     * }
     */
    public static void shaderSampledImageArrayNonUniformIndexingNative$set(MemorySegment seg, int x) {
        constants$313.const$5.set(seg, x);
    }
    public static int shaderSampledImageArrayNonUniformIndexingNative$get(MemorySegment seg, long index) {
        return (int)constants$313.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderSampledImageArrayNonUniformIndexingNative$set(MemorySegment seg, long index, int x) {
        constants$313.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderStorageBufferArrayNonUniformIndexingNative$VH() {
        return constants$314.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
     * }
     */
    public static int shaderStorageBufferArrayNonUniformIndexingNative$get(MemorySegment seg) {
        return (int)constants$314.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
     * }
     */
    public static void shaderStorageBufferArrayNonUniformIndexingNative$set(MemorySegment seg, int x) {
        constants$314.const$0.set(seg, x);
    }
    public static int shaderStorageBufferArrayNonUniformIndexingNative$get(MemorySegment seg, long index) {
        return (int)constants$314.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderStorageBufferArrayNonUniformIndexingNative$set(MemorySegment seg, long index, int x) {
        constants$314.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderStorageImageArrayNonUniformIndexingNative$VH() {
        return constants$314.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
     * }
     */
    public static int shaderStorageImageArrayNonUniformIndexingNative$get(MemorySegment seg) {
        return (int)constants$314.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
     * }
     */
    public static void shaderStorageImageArrayNonUniformIndexingNative$set(MemorySegment seg, int x) {
        constants$314.const$1.set(seg, x);
    }
    public static int shaderStorageImageArrayNonUniformIndexingNative$get(MemorySegment seg, long index) {
        return (int)constants$314.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderStorageImageArrayNonUniformIndexingNative$set(MemorySegment seg, long index, int x) {
        constants$314.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderInputAttachmentArrayNonUniformIndexingNative$VH() {
        return constants$314.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
     * }
     */
    public static int shaderInputAttachmentArrayNonUniformIndexingNative$get(MemorySegment seg) {
        return (int)constants$314.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
     * }
     */
    public static void shaderInputAttachmentArrayNonUniformIndexingNative$set(MemorySegment seg, int x) {
        constants$314.const$2.set(seg, x);
    }
    public static int shaderInputAttachmentArrayNonUniformIndexingNative$get(MemorySegment seg, long index) {
        return (int)constants$314.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderInputAttachmentArrayNonUniformIndexingNative$set(MemorySegment seg, long index, int x) {
        constants$314.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle robustBufferAccessUpdateAfterBind$VH() {
        return constants$314.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 robustBufferAccessUpdateAfterBind;
     * }
     */
    public static int robustBufferAccessUpdateAfterBind$get(MemorySegment seg) {
        return (int)constants$314.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 robustBufferAccessUpdateAfterBind;
     * }
     */
    public static void robustBufferAccessUpdateAfterBind$set(MemorySegment seg, int x) {
        constants$314.const$3.set(seg, x);
    }
    public static int robustBufferAccessUpdateAfterBind$get(MemorySegment seg, long index) {
        return (int)constants$314.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void robustBufferAccessUpdateAfterBind$set(MemorySegment seg, long index, int x) {
        constants$314.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle quadDivergentImplicitLod$VH() {
        return constants$314.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 quadDivergentImplicitLod;
     * }
     */
    public static int quadDivergentImplicitLod$get(MemorySegment seg) {
        return (int)constants$314.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 quadDivergentImplicitLod;
     * }
     */
    public static void quadDivergentImplicitLod$set(MemorySegment seg, int x) {
        constants$314.const$4.set(seg, x);
    }
    public static int quadDivergentImplicitLod$get(MemorySegment seg, long index) {
        return (int)constants$314.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void quadDivergentImplicitLod$set(MemorySegment seg, long index, int x) {
        constants$314.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindSamplers$VH() {
        return constants$314.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindSamplers$get(MemorySegment seg) {
        return (int)constants$314.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindSamplers$set(MemorySegment seg, int x) {
        constants$314.const$5.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindSamplers$get(MemorySegment seg, long index) {
        return (int)constants$314.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindSamplers$set(MemorySegment seg, long index, int x) {
        constants$314.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindUniformBuffers$VH() {
        return constants$315.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindUniformBuffers$get(MemorySegment seg) {
        return (int)constants$315.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindUniformBuffers$set(MemorySegment seg, int x) {
        constants$315.const$0.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindUniformBuffers$get(MemorySegment seg, long index) {
        return (int)constants$315.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindUniformBuffers$set(MemorySegment seg, long index, int x) {
        constants$315.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindStorageBuffers$VH() {
        return constants$315.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindStorageBuffers$get(MemorySegment seg) {
        return (int)constants$315.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindStorageBuffers$set(MemorySegment seg, int x) {
        constants$315.const$1.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindStorageBuffers$get(MemorySegment seg, long index) {
        return (int)constants$315.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindStorageBuffers$set(MemorySegment seg, long index, int x) {
        constants$315.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindSampledImages$VH() {
        return constants$315.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindSampledImages$get(MemorySegment seg) {
        return (int)constants$315.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindSampledImages$set(MemorySegment seg, int x) {
        constants$315.const$2.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindSampledImages$get(MemorySegment seg, long index) {
        return (int)constants$315.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindSampledImages$set(MemorySegment seg, long index, int x) {
        constants$315.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindStorageImages$VH() {
        return constants$315.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindStorageImages$get(MemorySegment seg) {
        return (int)constants$315.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindStorageImages$set(MemorySegment seg, int x) {
        constants$315.const$3.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindStorageImages$get(MemorySegment seg, long index) {
        return (int)constants$315.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindStorageImages$set(MemorySegment seg, long index, int x) {
        constants$315.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageDescriptorUpdateAfterBindInputAttachments$VH() {
        return constants$315.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
     * }
     */
    public static int maxPerStageDescriptorUpdateAfterBindInputAttachments$get(MemorySegment seg) {
        return (int)constants$315.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
     * }
     */
    public static void maxPerStageDescriptorUpdateAfterBindInputAttachments$set(MemorySegment seg, int x) {
        constants$315.const$4.set(seg, x);
    }
    public static int maxPerStageDescriptorUpdateAfterBindInputAttachments$get(MemorySegment seg, long index) {
        return (int)constants$315.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageDescriptorUpdateAfterBindInputAttachments$set(MemorySegment seg, long index, int x) {
        constants$315.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxPerStageUpdateAfterBindResources$VH() {
        return constants$315.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxPerStageUpdateAfterBindResources;
     * }
     */
    public static int maxPerStageUpdateAfterBindResources$get(MemorySegment seg) {
        return (int)constants$315.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxPerStageUpdateAfterBindResources;
     * }
     */
    public static void maxPerStageUpdateAfterBindResources$set(MemorySegment seg, int x) {
        constants$315.const$5.set(seg, x);
    }
    public static int maxPerStageUpdateAfterBindResources$get(MemorySegment seg, long index) {
        return (int)constants$315.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void maxPerStageUpdateAfterBindResources$set(MemorySegment seg, long index, int x) {
        constants$315.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindSamplers$VH() {
        return constants$316.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindSamplers;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindSamplers$get(MemorySegment seg) {
        return (int)constants$316.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindSamplers;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindSamplers$set(MemorySegment seg, int x) {
        constants$316.const$0.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindSamplers$get(MemorySegment seg, long index) {
        return (int)constants$316.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindSamplers$set(MemorySegment seg, long index, int x) {
        constants$316.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindUniformBuffers$VH() {
        return constants$316.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindUniformBuffers$get(MemorySegment seg) {
        return (int)constants$316.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindUniformBuffers$set(MemorySegment seg, int x) {
        constants$316.const$1.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindUniformBuffers$get(MemorySegment seg, long index) {
        return (int)constants$316.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindUniformBuffers$set(MemorySegment seg, long index, int x) {
        constants$316.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindUniformBuffersDynamic$VH() {
        return constants$316.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic$get(MemorySegment seg) {
        return (int)constants$316.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic$set(MemorySegment seg, int x) {
        constants$316.const$2.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic$get(MemorySegment seg, long index) {
        return (int)constants$316.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic$set(MemorySegment seg, long index, int x) {
        constants$316.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindStorageBuffers$VH() {
        return constants$316.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindStorageBuffers$get(MemorySegment seg) {
        return (int)constants$316.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindStorageBuffers$set(MemorySegment seg, int x) {
        constants$316.const$3.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindStorageBuffers$get(MemorySegment seg, long index) {
        return (int)constants$316.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindStorageBuffers$set(MemorySegment seg, long index, int x) {
        constants$316.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindStorageBuffersDynamic$VH() {
        return constants$316.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic$get(MemorySegment seg) {
        return (int)constants$316.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic$set(MemorySegment seg, int x) {
        constants$316.const$4.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic$get(MemorySegment seg, long index) {
        return (int)constants$316.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic$set(MemorySegment seg, long index, int x) {
        constants$316.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindSampledImages$VH() {
        return constants$316.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindSampledImages$get(MemorySegment seg) {
        return (int)constants$316.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindSampledImages$set(MemorySegment seg, int x) {
        constants$316.const$5.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindSampledImages$get(MemorySegment seg, long index) {
        return (int)constants$316.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindSampledImages$set(MemorySegment seg, long index, int x) {
        constants$316.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindStorageImages$VH() {
        return constants$317.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindStorageImages$get(MemorySegment seg) {
        return (int)constants$317.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindStorageImages$set(MemorySegment seg, int x) {
        constants$317.const$0.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindStorageImages$get(MemorySegment seg, long index) {
        return (int)constants$317.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindStorageImages$set(MemorySegment seg, long index, int x) {
        constants$317.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDescriptorSetUpdateAfterBindInputAttachments$VH() {
        return constants$317.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
     * }
     */
    public static int maxDescriptorSetUpdateAfterBindInputAttachments$get(MemorySegment seg) {
        return (int)constants$317.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
     * }
     */
    public static void maxDescriptorSetUpdateAfterBindInputAttachments$set(MemorySegment seg, int x) {
        constants$317.const$1.set(seg, x);
    }
    public static int maxDescriptorSetUpdateAfterBindInputAttachments$get(MemorySegment seg, long index) {
        return (int)constants$317.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDescriptorSetUpdateAfterBindInputAttachments$set(MemorySegment seg, long index, int x) {
        constants$317.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

