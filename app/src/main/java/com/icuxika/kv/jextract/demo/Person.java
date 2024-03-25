// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct Person {
 *     long long Id;
 *     char Name[10];
 *     int Age;
 * };
 * }
 */
public class Person {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$0;
    }
    public static VarHandle Id$VH() {
        return constants$0.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long Id;
     * }
     */
    public static long Id$get(MemorySegment seg) {
        return (long)constants$0.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long Id;
     * }
     */
    public static void Id$set(MemorySegment seg, long x) {
        constants$0.const$1.set(seg, x);
    }
    public static long Id$get(MemorySegment seg, long index) {
        return (long)constants$0.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Id$set(MemorySegment seg, long index, long x) {
        constants$0.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(8, 10);
    }
    public static VarHandle Age$VH() {
        return constants$0.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int Age;
     * }
     */
    public static int Age$get(MemorySegment seg) {
        return (int)constants$0.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int Age;
     * }
     */
    public static void Age$set(MemorySegment seg, int x) {
        constants$0.const$2.set(seg, x);
    }
    public static int Age$get(MemorySegment seg, long index) {
        return (int)constants$0.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Age$set(MemorySegment seg, long index, int x) {
        constants$0.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

