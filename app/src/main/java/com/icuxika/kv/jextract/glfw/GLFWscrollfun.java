// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GLFWscrollfun)(struct GLFWwindow* window,double xoffset,double yoffset);
 * }
 */
public interface GLFWscrollfun {

    void apply(java.lang.foreign.MemorySegment window, double xoffset, double yoffset);
    static MemorySegment allocate(GLFWscrollfun fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1153.const$2, fi, constants$1152.const$4, scope);
    }
    static GLFWscrollfun ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _window, double _xoffset, double _yoffset) -> {
            try {
                constants$1153.const$0.invokeExact(symbol, _window, _xoffset, _yoffset);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


