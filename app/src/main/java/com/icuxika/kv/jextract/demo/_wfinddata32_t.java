// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _wfinddata32_t {
 *     unsigned int attrib;
 *     __time32_t time_create;
 *     __time32_t time_access;
 *     __time32_t time_write;
 *     _fsize_t size;
 *     wchar_t name[260];
 * };
 * }
 */
public class _wfinddata32_t {

    public static MemoryLayout $LAYOUT() {
        return constants$19.const$0;
    }
    public static VarHandle attrib$VH() {
        return constants$19.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int attrib;
     * }
     */
    public static int attrib$get(MemorySegment seg) {
        return (int)constants$19.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int attrib;
     * }
     */
    public static void attrib$set(MemorySegment seg, int x) {
        constants$19.const$1.set(seg, x);
    }
    public static int attrib$get(MemorySegment seg, long index) {
        return (int)constants$19.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void attrib$set(MemorySegment seg, long index, int x) {
        constants$19.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time_create$VH() {
        return constants$19.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time32_t time_create;
     * }
     */
    public static int time_create$get(MemorySegment seg) {
        return (int)constants$19.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time32_t time_create;
     * }
     */
    public static void time_create$set(MemorySegment seg, int x) {
        constants$19.const$2.set(seg, x);
    }
    public static int time_create$get(MemorySegment seg, long index) {
        return (int)constants$19.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void time_create$set(MemorySegment seg, long index, int x) {
        constants$19.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time_access$VH() {
        return constants$19.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time32_t time_access;
     * }
     */
    public static int time_access$get(MemorySegment seg) {
        return (int)constants$19.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time32_t time_access;
     * }
     */
    public static void time_access$set(MemorySegment seg, int x) {
        constants$19.const$3.set(seg, x);
    }
    public static int time_access$get(MemorySegment seg, long index) {
        return (int)constants$19.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void time_access$set(MemorySegment seg, long index, int x) {
        constants$19.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time_write$VH() {
        return constants$19.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time32_t time_write;
     * }
     */
    public static int time_write$get(MemorySegment seg) {
        return (int)constants$19.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time32_t time_write;
     * }
     */
    public static void time_write$set(MemorySegment seg, int x) {
        constants$19.const$4.set(seg, x);
    }
    public static int time_write$get(MemorySegment seg, long index) {
        return (int)constants$19.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void time_write$set(MemorySegment seg, long index, int x) {
        constants$19.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$19.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _fsize_t size;
     * }
     */
    public static int size$get(MemorySegment seg) {
        return (int)constants$19.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _fsize_t size;
     * }
     */
    public static void size$set(MemorySegment seg, int x) {
        constants$19.const$5.set(seg, x);
    }
    public static int size$get(MemorySegment seg, long index) {
        return (int)constants$19.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, int x) {
        constants$19.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment name$slice(MemorySegment seg) {
        return seg.asSlice(20, 520);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


