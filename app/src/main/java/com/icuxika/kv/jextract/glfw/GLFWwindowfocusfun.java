// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GLFWwindowfocusfun)(struct GLFWwindow* window,int focused);
 * }
 */
public interface GLFWwindowfocusfun {

    void apply(java.lang.foreign.MemorySegment monitor, int event);
    static MemorySegment allocate(GLFWwindowfocusfun fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1151.const$4, fi, constants$178.const$3, scope);
    }
    static GLFWwindowfocusfun ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _monitor, int _event) -> {
            try {
                constants$178.const$5.invokeExact(symbol, _monitor, _event);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

