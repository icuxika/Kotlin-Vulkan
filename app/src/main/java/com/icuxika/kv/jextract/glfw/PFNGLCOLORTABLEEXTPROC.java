// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFNGLCOLORTABLEEXTPROC)(unsigned int target,unsigned int internalFormat,int width,unsigned int format,unsigned int type,void* data);
 * }
 */
public interface PFNGLCOLORTABLEEXTPROC {

    void apply(int target, int internalFormat, int width, int format, int type, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(PFNGLCOLORTABLEEXTPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1148.const$3, fi, constants$1147.const$4, scope);
    }
    static PFNGLCOLORTABLEEXTPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _target, int _internalFormat, int _width, int _format, int _type, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$1148.const$0.invokeExact(symbol, _target, _internalFormat, _width, _format, _type, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

