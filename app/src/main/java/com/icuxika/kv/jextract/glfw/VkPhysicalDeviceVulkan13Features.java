// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkPhysicalDeviceVulkan13Features {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkBool32 robustImageAccess;
 *     VkBool32 inlineUniformBlock;
 *     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
 *     VkBool32 pipelineCreationCacheControl;
 *     VkBool32 privateData;
 *     VkBool32 shaderDemoteToHelperInvocation;
 *     VkBool32 shaderTerminateInvocation;
 *     VkBool32 subgroupSizeControl;
 *     VkBool32 computeFullSubgroups;
 *     VkBool32 synchronization2;
 *     VkBool32 textureCompressionASTC_HDR;
 *     VkBool32 shaderZeroInitializeWorkgroupMemory;
 *     VkBool32 dynamicRendering;
 *     VkBool32 shaderIntegerDotProduct;
 *     VkBool32 maintenance4;
 * };
 * }
 */
public class VkPhysicalDeviceVulkan13Features {

    public static MemoryLayout $LAYOUT() {
        return constants$347.const$2;
    }
    public static VarHandle sType$VH() {
        return constants$347.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$347.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$347.const$3.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$347.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$347.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$347.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$347.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$347.const$4.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$347.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$347.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle robustImageAccess$VH() {
        return constants$347.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 robustImageAccess;
     * }
     */
    public static int robustImageAccess$get(MemorySegment seg) {
        return (int)constants$347.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 robustImageAccess;
     * }
     */
    public static void robustImageAccess$set(MemorySegment seg, int x) {
        constants$347.const$5.set(seg, x);
    }
    public static int robustImageAccess$get(MemorySegment seg, long index) {
        return (int)constants$347.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void robustImageAccess$set(MemorySegment seg, long index, int x) {
        constants$347.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle inlineUniformBlock$VH() {
        return constants$348.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 inlineUniformBlock;
     * }
     */
    public static int inlineUniformBlock$get(MemorySegment seg) {
        return (int)constants$348.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 inlineUniformBlock;
     * }
     */
    public static void inlineUniformBlock$set(MemorySegment seg, int x) {
        constants$348.const$0.set(seg, x);
    }
    public static int inlineUniformBlock$get(MemorySegment seg, long index) {
        return (int)constants$348.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void inlineUniformBlock$set(MemorySegment seg, long index, int x) {
        constants$348.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle descriptorBindingInlineUniformBlockUpdateAfterBind$VH() {
        return constants$348.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
     * }
     */
    public static int descriptorBindingInlineUniformBlockUpdateAfterBind$get(MemorySegment seg) {
        return (int)constants$348.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
     * }
     */
    public static void descriptorBindingInlineUniformBlockUpdateAfterBind$set(MemorySegment seg, int x) {
        constants$348.const$1.set(seg, x);
    }
    public static int descriptorBindingInlineUniformBlockUpdateAfterBind$get(MemorySegment seg, long index) {
        return (int)constants$348.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void descriptorBindingInlineUniformBlockUpdateAfterBind$set(MemorySegment seg, long index, int x) {
        constants$348.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pipelineCreationCacheControl$VH() {
        return constants$348.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 pipelineCreationCacheControl;
     * }
     */
    public static int pipelineCreationCacheControl$get(MemorySegment seg) {
        return (int)constants$348.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 pipelineCreationCacheControl;
     * }
     */
    public static void pipelineCreationCacheControl$set(MemorySegment seg, int x) {
        constants$348.const$2.set(seg, x);
    }
    public static int pipelineCreationCacheControl$get(MemorySegment seg, long index) {
        return (int)constants$348.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pipelineCreationCacheControl$set(MemorySegment seg, long index, int x) {
        constants$348.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle privateData$VH() {
        return constants$348.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 privateData;
     * }
     */
    public static int privateData$get(MemorySegment seg) {
        return (int)constants$348.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 privateData;
     * }
     */
    public static void privateData$set(MemorySegment seg, int x) {
        constants$348.const$3.set(seg, x);
    }
    public static int privateData$get(MemorySegment seg, long index) {
        return (int)constants$348.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void privateData$set(MemorySegment seg, long index, int x) {
        constants$348.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderDemoteToHelperInvocation$VH() {
        return constants$348.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderDemoteToHelperInvocation;
     * }
     */
    public static int shaderDemoteToHelperInvocation$get(MemorySegment seg) {
        return (int)constants$348.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderDemoteToHelperInvocation;
     * }
     */
    public static void shaderDemoteToHelperInvocation$set(MemorySegment seg, int x) {
        constants$348.const$4.set(seg, x);
    }
    public static int shaderDemoteToHelperInvocation$get(MemorySegment seg, long index) {
        return (int)constants$348.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderDemoteToHelperInvocation$set(MemorySegment seg, long index, int x) {
        constants$348.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderTerminateInvocation$VH() {
        return constants$348.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderTerminateInvocation;
     * }
     */
    public static int shaderTerminateInvocation$get(MemorySegment seg) {
        return (int)constants$348.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderTerminateInvocation;
     * }
     */
    public static void shaderTerminateInvocation$set(MemorySegment seg, int x) {
        constants$348.const$5.set(seg, x);
    }
    public static int shaderTerminateInvocation$get(MemorySegment seg, long index) {
        return (int)constants$348.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderTerminateInvocation$set(MemorySegment seg, long index, int x) {
        constants$348.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subgroupSizeControl$VH() {
        return constants$349.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 subgroupSizeControl;
     * }
     */
    public static int subgroupSizeControl$get(MemorySegment seg) {
        return (int)constants$349.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 subgroupSizeControl;
     * }
     */
    public static void subgroupSizeControl$set(MemorySegment seg, int x) {
        constants$349.const$0.set(seg, x);
    }
    public static int subgroupSizeControl$get(MemorySegment seg, long index) {
        return (int)constants$349.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void subgroupSizeControl$set(MemorySegment seg, long index, int x) {
        constants$349.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle computeFullSubgroups$VH() {
        return constants$349.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 computeFullSubgroups;
     * }
     */
    public static int computeFullSubgroups$get(MemorySegment seg) {
        return (int)constants$349.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 computeFullSubgroups;
     * }
     */
    public static void computeFullSubgroups$set(MemorySegment seg, int x) {
        constants$349.const$1.set(seg, x);
    }
    public static int computeFullSubgroups$get(MemorySegment seg, long index) {
        return (int)constants$349.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void computeFullSubgroups$set(MemorySegment seg, long index, int x) {
        constants$349.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle synchronization2$VH() {
        return constants$349.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 synchronization2;
     * }
     */
    public static int synchronization2$get(MemorySegment seg) {
        return (int)constants$349.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 synchronization2;
     * }
     */
    public static void synchronization2$set(MemorySegment seg, int x) {
        constants$349.const$2.set(seg, x);
    }
    public static int synchronization2$get(MemorySegment seg, long index) {
        return (int)constants$349.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void synchronization2$set(MemorySegment seg, long index, int x) {
        constants$349.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle textureCompressionASTC_HDR$VH() {
        return constants$349.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 textureCompressionASTC_HDR;
     * }
     */
    public static int textureCompressionASTC_HDR$get(MemorySegment seg) {
        return (int)constants$349.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 textureCompressionASTC_HDR;
     * }
     */
    public static void textureCompressionASTC_HDR$set(MemorySegment seg, int x) {
        constants$349.const$3.set(seg, x);
    }
    public static int textureCompressionASTC_HDR$get(MemorySegment seg, long index) {
        return (int)constants$349.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void textureCompressionASTC_HDR$set(MemorySegment seg, long index, int x) {
        constants$349.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderZeroInitializeWorkgroupMemory$VH() {
        return constants$349.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderZeroInitializeWorkgroupMemory;
     * }
     */
    public static int shaderZeroInitializeWorkgroupMemory$get(MemorySegment seg) {
        return (int)constants$349.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderZeroInitializeWorkgroupMemory;
     * }
     */
    public static void shaderZeroInitializeWorkgroupMemory$set(MemorySegment seg, int x) {
        constants$349.const$4.set(seg, x);
    }
    public static int shaderZeroInitializeWorkgroupMemory$get(MemorySegment seg, long index) {
        return (int)constants$349.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderZeroInitializeWorkgroupMemory$set(MemorySegment seg, long index, int x) {
        constants$349.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dynamicRendering$VH() {
        return constants$349.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 dynamicRendering;
     * }
     */
    public static int dynamicRendering$get(MemorySegment seg) {
        return (int)constants$349.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 dynamicRendering;
     * }
     */
    public static void dynamicRendering$set(MemorySegment seg, int x) {
        constants$349.const$5.set(seg, x);
    }
    public static int dynamicRendering$get(MemorySegment seg, long index) {
        return (int)constants$349.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dynamicRendering$set(MemorySegment seg, long index, int x) {
        constants$349.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shaderIntegerDotProduct$VH() {
        return constants$350.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 shaderIntegerDotProduct;
     * }
     */
    public static int shaderIntegerDotProduct$get(MemorySegment seg) {
        return (int)constants$350.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 shaderIntegerDotProduct;
     * }
     */
    public static void shaderIntegerDotProduct$set(MemorySegment seg, int x) {
        constants$350.const$0.set(seg, x);
    }
    public static int shaderIntegerDotProduct$get(MemorySegment seg, long index) {
        return (int)constants$350.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void shaderIntegerDotProduct$set(MemorySegment seg, long index, int x) {
        constants$350.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maintenance4$VH() {
        return constants$350.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 maintenance4;
     * }
     */
    public static int maintenance4$get(MemorySegment seg) {
        return (int)constants$350.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 maintenance4;
     * }
     */
    public static void maintenance4$set(MemorySegment seg, int x) {
        constants$350.const$1.set(seg, x);
    }
    public static int maintenance4$get(MemorySegment seg, long index) {
        return (int)constants$350.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maintenance4$set(MemorySegment seg, long index, int x) {
        constants$350.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


