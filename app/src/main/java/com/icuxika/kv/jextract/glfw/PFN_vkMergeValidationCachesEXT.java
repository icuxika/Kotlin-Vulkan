// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkMergeValidationCachesEXT)(struct VkDevice_T* device,struct VkValidationCacheEXT_T* dstCache,unsigned int srcCacheCount,struct VkValidationCacheEXT_T** pSrcCaches);
 * }
 */
public interface PFN_vkMergeValidationCachesEXT {

    int apply(java.lang.foreign.MemorySegment device, java.lang.foreign.MemorySegment deferredOperation, int infoCount, java.lang.foreign.MemorySegment pInfos);
    static MemorySegment allocate(PFN_vkMergeValidationCachesEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$710.const$0, fi, constants$156.const$1, scope);
    }
    static PFN_vkMergeValidationCachesEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _device, java.lang.foreign.MemorySegment _deferredOperation, int _infoCount, java.lang.foreign.MemorySegment _pInfos) -> {
            try {
                return (int)constants$156.const$3.invokeExact(symbol, _device, _deferredOperation, _infoCount, _pInfos);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

