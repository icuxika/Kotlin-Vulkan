// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFNGLGETCOLORTABLEPARAMETERIVEXTPROC)(unsigned int target,unsigned int pname,int* params);
 * }
 */
public interface PFNGLGETCOLORTABLEPARAMETERIVEXTPROC {

    void apply(int target, int pname, java.lang.foreign.MemorySegment params);
    static MemorySegment allocate(PFNGLGETCOLORTABLEPARAMETERIVEXTPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1149.const$0, fi, constants$1084.const$1, scope);
    }
    static PFNGLGETCOLORTABLEPARAMETERIVEXTPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _target, int _pname, java.lang.foreign.MemorySegment _params) -> {
            try {
                constants$1147.const$0.invokeExact(symbol, _target, _pname, _params);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


