// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkGetShaderInfoAMD)(struct VkDevice_T* device,struct VkPipeline_T* pipeline,enum VkShaderStageFlagBits shaderStage,enum VkShaderInfoTypeAMD infoType,unsigned long long* pInfoSize,void* pInfo);
 * }
 */
public interface PFN_vkGetShaderInfoAMD {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment pipeline, int shaderStage, int infoType, java.lang.foreign.MemorySegment pInfoSize, java.lang.foreign.MemorySegment pInfo);
    static MemorySegment allocate(PFN_vkGetShaderInfoAMD fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$641.const$3, fi, constants$641.const$2, scope);
    }
    static PFN_vkGetShaderInfoAMD ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _pipeline, int _shaderStage, int _infoType, java.lang.foreign.MemorySegment _pInfoSize, java.lang.foreign.MemorySegment _pInfo) -> {
            try {
                return (int)constants$641.const$4.invokeExact(symbol, _device, _pipeline, _shaderStage, _infoType, _pInfoSize, _pInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


