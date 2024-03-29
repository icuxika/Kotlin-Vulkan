// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct GLFWgamepadstate {
 *     unsigned char buttons[15];
 *     float axes[6];
 * };
 * }
 */
public class GLFWgamepadstate {

    public static MemoryLayout $LAYOUT() {
        return constants$1157.const$2;
    }
    public static MemorySegment buttons$slice(MemorySegment seg) {
        return seg.asSlice(0, 15);
    }
    public static MemorySegment axes$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


