// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFNGLARRAYELEMENTARRAYEXTPROC)(unsigned int mode,int count,void* pi);
 * }
 */
public interface PFNGLARRAYELEMENTARRAYEXTPROC {

    void apply(int mode, int count, java.lang.foreign.MemorySegment pi);
    static MemorySegment allocate(PFNGLARRAYELEMENTARRAYEXTPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1147.const$3, fi, constants$1084.const$1, scope);
    }
    static PFNGLARRAYELEMENTARRAYEXTPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _mode, int _count, java.lang.foreign.MemorySegment _pi) -> {
            try {
                constants$1147.const$0.invokeExact(symbol, _mode, _count, _pi);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


