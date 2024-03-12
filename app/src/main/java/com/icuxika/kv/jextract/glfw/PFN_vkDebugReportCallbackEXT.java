// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*PFN_vkDebugReportCallbackEXT)(unsigned int flags,enum VkDebugReportObjectTypeEXT objectType,unsigned long long object,unsigned long long location,int messageCode,char* pLayerPrefix,char* pMessage,void* pUserData);
 * }
 */
public interface PFN_vkDebugReportCallbackEXT {

    int apply(int flags, int objectType, long object, long location, int messageCode, java.lang.foreign.MemorySegment pLayerPrefix, java.lang.foreign.MemorySegment pMessage, java.lang.foreign.MemorySegment pUserData);
    static MemorySegment allocate(PFN_vkDebugReportCallbackEXT fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$612.const$4, fi, constants$612.const$3, scope);
    }
    static PFN_vkDebugReportCallbackEXT ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _flags, int _objectType, long _object, long _location, int _messageCode, java.lang.foreign.MemorySegment _pLayerPrefix, java.lang.foreign.MemorySegment _pMessage, java.lang.foreign.MemorySegment _pUserData) -> {
            try {
                return (int)constants$612.const$5.invokeExact(symbol, _flags, _objectType, _object, _location, _messageCode, _pLayerPrefix, _pMessage, _pUserData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

