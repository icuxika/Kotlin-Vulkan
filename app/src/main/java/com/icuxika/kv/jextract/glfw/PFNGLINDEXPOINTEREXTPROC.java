// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFNGLINDEXPOINTEREXTPROC)(unsigned int type,int stride,int count,void* pointer);
 * }
 */
public interface PFNGLINDEXPOINTEREXTPROC {

    void apply(int type, int stride, int count, java.lang.foreign.MemorySegment pointer);
    static MemorySegment allocate(PFNGLINDEXPOINTEREXTPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1146.const$3, fi, constants$1093.const$2, scope);
    }
    static PFNGLINDEXPOINTEREXTPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _type, int _stride, int _count, java.lang.foreign.MemorySegment _pointer) -> {
            try {
                constants$1146.const$1.invokeExact(symbol, _type, _stride, _count, _pointer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


