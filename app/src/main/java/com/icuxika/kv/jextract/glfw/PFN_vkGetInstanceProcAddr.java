// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*)() (*PFN_vkGetInstanceProcAddr)(struct VkInstance_T* instance,char* pName);
 * }
 */
public interface PFN_vkGetInstanceProcAddr {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment instance, java.lang.foreign.MemorySegment pName);
    static MemorySegment allocate(PFN_vkGetInstanceProcAddr fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$142.const$5, fi, constants$142.const$4, scope);
    }
    static PFN_vkGetInstanceProcAddr ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _instance, java.lang.foreign.MemorySegment _pName) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$143.const$0.invokeExact(symbol, _instance, _pName);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


