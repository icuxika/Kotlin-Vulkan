// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum VkResult (*PFN_vkEnumerateInstanceVersion)(unsigned int* pApiVersion);
 * }
 */
public interface PFN_vkEnumerateInstanceVersion {

    int apply(java.lang.foreign.MemorySegment pApiVersion);
    static MemorySegment allocate(PFN_vkEnumerateInstanceVersion fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$257.const$4, fi, constants$146.const$0, scope);
    }
    static PFN_vkEnumerateInstanceVersion ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pApiVersion) -> {
            try {
                return (int)constants$146.const$2.invokeExact(symbol, _pApiVersion);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


