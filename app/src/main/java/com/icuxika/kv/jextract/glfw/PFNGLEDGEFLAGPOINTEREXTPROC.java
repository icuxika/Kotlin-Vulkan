// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFNGLEDGEFLAGPOINTEREXTPROC)(int stride,int count,unsigned char* pointer);
 * }
 */
public interface PFNGLEDGEFLAGPOINTEREXTPROC {

    void apply(int stride, int count, java.lang.foreign.MemorySegment pointer);
    static MemorySegment allocate(PFNGLEDGEFLAGPOINTEREXTPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1146.const$5, fi, constants$1084.const$1, scope);
    }
    static PFNGLEDGEFLAGPOINTEREXTPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _stride, int _count, java.lang.foreign.MemorySegment _pointer) -> {
            try {
                constants$1147.const$0.invokeExact(symbol, _stride, _count, _pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


