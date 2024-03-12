// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*GLFWallocatefun)(unsigned long long size,void* user);
 * }
 */
public interface GLFWallocatefun {

    java.lang.foreign.MemorySegment apply(long size, java.lang.foreign.MemorySegment user);
    static MemorySegment allocate(GLFWallocatefun fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1149.const$5, fi, constants$1149.const$4, scope);
    }
    static GLFWallocatefun ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _size, java.lang.foreign.MemorySegment _user) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$1150.const$0.invokeExact(symbol, _size, _user);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


