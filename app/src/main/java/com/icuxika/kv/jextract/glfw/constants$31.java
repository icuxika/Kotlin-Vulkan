// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$31 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$31() {}
    static final VarHandle const$0 = constants$22.const$3.varHandle(MemoryLayout.PathElement.groupElement("sparseResidency8Samples"));
    static final VarHandle const$1 = constants$22.const$3.varHandle(MemoryLayout.PathElement.groupElement("sparseResidency16Samples"));
    static final VarHandle const$2 = constants$22.const$3.varHandle(MemoryLayout.PathElement.groupElement("sparseResidencyAliased"));
    static final VarHandle const$3 = constants$22.const$3.varHandle(MemoryLayout.PathElement.groupElement("variableMultisampleRate"));
    static final VarHandle const$4 = constants$22.const$3.varHandle(MemoryLayout.PathElement.groupElement("inheritedQueries"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("maxImageDimension1D"),
        JAVA_INT.withName("maxImageDimension2D"),
        JAVA_INT.withName("maxImageDimension3D"),
        JAVA_INT.withName("maxImageDimensionCube"),
        JAVA_INT.withName("maxImageArrayLayers"),
        JAVA_INT.withName("maxTexelBufferElements"),
        JAVA_INT.withName("maxUniformBufferRange"),
        JAVA_INT.withName("maxStorageBufferRange"),
        JAVA_INT.withName("maxPushConstantsSize"),
        JAVA_INT.withName("maxMemoryAllocationCount"),
        JAVA_INT.withName("maxSamplerAllocationCount"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("bufferImageGranularity"),
        JAVA_LONG.withName("sparseAddressSpaceSize"),
        JAVA_INT.withName("maxBoundDescriptorSets"),
        JAVA_INT.withName("maxPerStageDescriptorSamplers"),
        JAVA_INT.withName("maxPerStageDescriptorUniformBuffers"),
        JAVA_INT.withName("maxPerStageDescriptorStorageBuffers"),
        JAVA_INT.withName("maxPerStageDescriptorSampledImages"),
        JAVA_INT.withName("maxPerStageDescriptorStorageImages"),
        JAVA_INT.withName("maxPerStageDescriptorInputAttachments"),
        JAVA_INT.withName("maxPerStageResources"),
        JAVA_INT.withName("maxDescriptorSetSamplers"),
        JAVA_INT.withName("maxDescriptorSetUniformBuffers"),
        JAVA_INT.withName("maxDescriptorSetUniformBuffersDynamic"),
        JAVA_INT.withName("maxDescriptorSetStorageBuffers"),
        JAVA_INT.withName("maxDescriptorSetStorageBuffersDynamic"),
        JAVA_INT.withName("maxDescriptorSetSampledImages"),
        JAVA_INT.withName("maxDescriptorSetStorageImages"),
        JAVA_INT.withName("maxDescriptorSetInputAttachments"),
        JAVA_INT.withName("maxVertexInputAttributes"),
        JAVA_INT.withName("maxVertexInputBindings"),
        JAVA_INT.withName("maxVertexInputAttributeOffset"),
        JAVA_INT.withName("maxVertexInputBindingStride"),
        JAVA_INT.withName("maxVertexOutputComponents"),
        JAVA_INT.withName("maxTessellationGenerationLevel"),
        JAVA_INT.withName("maxTessellationPatchSize"),
        JAVA_INT.withName("maxTessellationControlPerVertexInputComponents"),
        JAVA_INT.withName("maxTessellationControlPerVertexOutputComponents"),
        JAVA_INT.withName("maxTessellationControlPerPatchOutputComponents"),
        JAVA_INT.withName("maxTessellationControlTotalOutputComponents"),
        JAVA_INT.withName("maxTessellationEvaluationInputComponents"),
        JAVA_INT.withName("maxTessellationEvaluationOutputComponents"),
        JAVA_INT.withName("maxGeometryShaderInvocations"),
        JAVA_INT.withName("maxGeometryInputComponents"),
        JAVA_INT.withName("maxGeometryOutputComponents"),
        JAVA_INT.withName("maxGeometryOutputVertices"),
        JAVA_INT.withName("maxGeometryTotalOutputComponents"),
        JAVA_INT.withName("maxFragmentInputComponents"),
        JAVA_INT.withName("maxFragmentOutputAttachments"),
        JAVA_INT.withName("maxFragmentDualSrcAttachments"),
        JAVA_INT.withName("maxFragmentCombinedOutputResources"),
        JAVA_INT.withName("maxComputeSharedMemorySize"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxComputeWorkGroupCount"),
        JAVA_INT.withName("maxComputeWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxComputeWorkGroupSize"),
        JAVA_INT.withName("subPixelPrecisionBits"),
        JAVA_INT.withName("subTexelPrecisionBits"),
        JAVA_INT.withName("mipmapPrecisionBits"),
        JAVA_INT.withName("maxDrawIndexedIndexValue"),
        JAVA_INT.withName("maxDrawIndirectCount"),
        JAVA_FLOAT.withName("maxSamplerLodBias"),
        JAVA_FLOAT.withName("maxSamplerAnisotropy"),
        JAVA_INT.withName("maxViewports"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("maxViewportDimensions"),
        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("viewportBoundsRange"),
        JAVA_INT.withName("viewportSubPixelBits"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("minMemoryMapAlignment"),
        JAVA_LONG.withName("minTexelBufferOffsetAlignment"),
        JAVA_LONG.withName("minUniformBufferOffsetAlignment"),
        JAVA_LONG.withName("minStorageBufferOffsetAlignment"),
        JAVA_INT.withName("minTexelOffset"),
        JAVA_INT.withName("maxTexelOffset"),
        JAVA_INT.withName("minTexelGatherOffset"),
        JAVA_INT.withName("maxTexelGatherOffset"),
        JAVA_FLOAT.withName("minInterpolationOffset"),
        JAVA_FLOAT.withName("maxInterpolationOffset"),
        JAVA_INT.withName("subPixelInterpolationOffsetBits"),
        JAVA_INT.withName("maxFramebufferWidth"),
        JAVA_INT.withName("maxFramebufferHeight"),
        JAVA_INT.withName("maxFramebufferLayers"),
        JAVA_INT.withName("framebufferColorSampleCounts"),
        JAVA_INT.withName("framebufferDepthSampleCounts"),
        JAVA_INT.withName("framebufferStencilSampleCounts"),
        JAVA_INT.withName("framebufferNoAttachmentsSampleCounts"),
        JAVA_INT.withName("maxColorAttachments"),
        JAVA_INT.withName("sampledImageColorSampleCounts"),
        JAVA_INT.withName("sampledImageIntegerSampleCounts"),
        JAVA_INT.withName("sampledImageDepthSampleCounts"),
        JAVA_INT.withName("sampledImageStencilSampleCounts"),
        JAVA_INT.withName("storageImageSampleCounts"),
        JAVA_INT.withName("maxSampleMaskWords"),
        JAVA_INT.withName("timestampComputeAndGraphics"),
        JAVA_FLOAT.withName("timestampPeriod"),
        JAVA_INT.withName("maxClipDistances"),
        JAVA_INT.withName("maxCullDistances"),
        JAVA_INT.withName("maxCombinedClipAndCullDistances"),
        JAVA_INT.withName("discreteQueuePriorities"),
        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("pointSizeRange"),
        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("lineWidthRange"),
        JAVA_FLOAT.withName("pointSizeGranularity"),
        JAVA_FLOAT.withName("lineWidthGranularity"),
        JAVA_INT.withName("strictLines"),
        JAVA_INT.withName("standardSampleLocations"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("optimalBufferCopyOffsetAlignment"),
        JAVA_LONG.withName("optimalBufferCopyRowPitchAlignment"),
        JAVA_LONG.withName("nonCoherentAtomSize")
    ).withName("VkPhysicalDeviceLimits");
}

