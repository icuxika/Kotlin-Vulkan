// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GLFWglproc)();
 * }
 */
public interface GLFWglproc {

    void apply();
    static MemorySegment allocate(GLFWglproc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1149.const$2, fi, constants$0.const$2, scope);
    }
    static GLFWglproc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$15.const$5.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

