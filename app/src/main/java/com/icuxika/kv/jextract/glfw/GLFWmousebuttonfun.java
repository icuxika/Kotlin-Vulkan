// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GLFWmousebuttonfun)(struct GLFWwindow* window,int button,int action,int mods);
 * }
 */
public interface GLFWmousebuttonfun {

    void apply(java.lang.foreign.MemorySegment window, int button, int action, int mods);
    static MemorySegment allocate(GLFWmousebuttonfun fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1152.const$3, fi, constants$169.const$1, scope);
    }
    static GLFWmousebuttonfun ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _window, int _button, int _action, int _mods) -> {
            try {
                constants$169.const$3.invokeExact(symbol, _window, _button, _action, _mods);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


