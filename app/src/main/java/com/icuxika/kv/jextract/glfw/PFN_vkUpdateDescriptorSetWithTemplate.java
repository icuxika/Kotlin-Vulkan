// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_vkUpdateDescriptorSetWithTemplate)(struct VkDevice_T* device,struct VkDescriptorSet_T* descriptorSet,struct VkDescriptorUpdateTemplate_T* descriptorUpdateTemplate,void* pData);
 * }
 */
public interface PFN_vkUpdateDescriptorSetWithTemplate {

    void apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment image, java.lang.foreign.MemorySegment pSubresource, java.lang.foreign.MemorySegment pLayout);
    static MemorySegment allocate(PFN_vkUpdateDescriptorSetWithTemplate fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$262.const$1, fi, constants$149.const$3, scope);
    }
    static PFN_vkUpdateDescriptorSetWithTemplate ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _image, java.lang.foreign.MemorySegment _pSubresource, java.lang.foreign.MemorySegment _pLayout) -> {
            try {
                constants$149.const$5.invokeExact(symbol, _device, _image, _pSubresource, _pLayout);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


