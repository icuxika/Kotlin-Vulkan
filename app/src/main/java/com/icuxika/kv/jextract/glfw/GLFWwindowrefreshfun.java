// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GLFWwindowrefreshfun)(struct GLFWwindow* window);
 * }
 */
public interface GLFWwindowrefreshfun {

    void apply(java.lang.foreign.MemorySegment window);
    static MemorySegment allocate(GLFWwindowrefreshfun fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1151.const$3, fi, constants$0.const$0, scope);
    }
    static GLFWwindowrefreshfun ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _window) -> {
            try {
                constants$179.const$1.invokeExact(symbol, _window);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

