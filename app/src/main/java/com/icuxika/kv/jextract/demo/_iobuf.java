// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _iobuf {
 *     void* _Placeholder;
 * };
 * }
 */
public class _iobuf {

    public static MemoryLayout $LAYOUT() {
        return constants$30.const$5;
    }
    public static VarHandle _Placeholder$VH() {
        return constants$31.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* _Placeholder;
     * }
     */
    public static MemorySegment _Placeholder$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$31.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* _Placeholder;
     * }
     */
    public static void _Placeholder$set(MemorySegment seg, MemorySegment x) {
        constants$31.const$0.set(seg, x);
    }
    public static MemorySegment _Placeholder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$31.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _Placeholder$set(MemorySegment seg, long index, MemorySegment x) {
        constants$31.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


