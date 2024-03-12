// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFNGLTEXCOORDPOINTEREXTPROC)(int size,unsigned int type,int stride,int count,void* pointer);
 * }
 */
public interface PFNGLTEXCOORDPOINTEREXTPROC {

    void apply(int size, int type, int stride, int count, java.lang.foreign.MemorySegment pointer);
    static MemorySegment allocate(PFNGLTEXCOORDPOINTEREXTPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1146.const$4, fi, constants$1097.const$1, scope);
    }
    static PFNGLTEXCOORDPOINTEREXTPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _size, int _type, int _stride, int _count, java.lang.foreign.MemorySegment _pointer) -> {
            try {
                constants$1145.const$5.invokeExact(symbol, _size, _type, _stride, _count, _pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

