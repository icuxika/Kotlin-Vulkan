// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1075 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1075() {}
    static final VarHandle const$0 = constants$1074.const$3.varHandle(MemoryLayout.PathElement.groupElement("taskShader"));
    static final VarHandle const$1 = constants$1074.const$3.varHandle(MemoryLayout.PathElement.groupElement("meshShader"));
    static final VarHandle const$2 = constants$1074.const$3.varHandle(MemoryLayout.PathElement.groupElement("multiviewMeshShader"));
    static final VarHandle const$3 = constants$1074.const$3.varHandle(MemoryLayout.PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    static final VarHandle const$4 = constants$1074.const$3.varHandle(MemoryLayout.PathElement.groupElement("meshShaderQueries"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pNext"),
        JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxTaskWorkGroupCount"),
        JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxTaskWorkGroupSize"),
        JAVA_INT.withName("maxTaskPayloadSize"),
        JAVA_INT.withName("maxTaskSharedMemorySize"),
        JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxMeshWorkGroupCount"),
        JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxMeshWorkGroupSize"),
        JAVA_INT.withName("maxMeshSharedMemorySize"),
        JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize"),
        JAVA_INT.withName("maxMeshOutputMemorySize"),
        JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize"),
        JAVA_INT.withName("maxMeshOutputComponents"),
        JAVA_INT.withName("maxMeshOutputVertices"),
        JAVA_INT.withName("maxMeshOutputPrimitives"),
        JAVA_INT.withName("maxMeshOutputLayers"),
        JAVA_INT.withName("maxMeshMultiviewViewCount"),
        JAVA_INT.withName("meshOutputPerVertexGranularity"),
        JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
        JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations"),
        JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations"),
        JAVA_INT.withName("prefersLocalInvocationVertexOutput"),
        JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput"),
        JAVA_INT.withName("prefersCompactVertexOutput"),
        JAVA_INT.withName("prefersCompactPrimitiveOutput")
    ).withName("VkPhysicalDeviceMeshShaderPropertiesEXT");
}


