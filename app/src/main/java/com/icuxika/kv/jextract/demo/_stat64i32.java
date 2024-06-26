// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _stat64i32 {
 *     _dev_t st_dev;
 *     _ino_t st_ino;
 *     unsigned short st_mode;
 *     short st_nlink;
 *     short st_uid;
 *     short st_gid;
 *     _dev_t st_rdev;
 *     _off_t st_size;
 *     __time64_t st_atime;
 *     __time64_t st_mtime;
 *     __time64_t st_ctime;
 * };
 * }
 */
public class _stat64i32 {

    public static MemoryLayout $LAYOUT() {
        return constants$69.const$4;
    }
    public static VarHandle st_dev$VH() {
        return constants$69.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _dev_t st_dev;
     * }
     */
    public static int st_dev$get(MemorySegment seg) {
        return (int)constants$69.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _dev_t st_dev;
     * }
     */
    public static void st_dev$set(MemorySegment seg, int x) {
        constants$69.const$5.set(seg, x);
    }
    public static int st_dev$get(MemorySegment seg, long index) {
        return (int)constants$69.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void st_dev$set(MemorySegment seg, long index, int x) {
        constants$69.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_ino$VH() {
        return constants$70.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _ino_t st_ino;
     * }
     */
    public static short st_ino$get(MemorySegment seg) {
        return (short)constants$70.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _ino_t st_ino;
     * }
     */
    public static void st_ino$set(MemorySegment seg, short x) {
        constants$70.const$0.set(seg, x);
    }
    public static short st_ino$get(MemorySegment seg, long index) {
        return (short)constants$70.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void st_ino$set(MemorySegment seg, long index, short x) {
        constants$70.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_mode$VH() {
        return constants$70.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short st_mode;
     * }
     */
    public static short st_mode$get(MemorySegment seg) {
        return (short)constants$70.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short st_mode;
     * }
     */
    public static void st_mode$set(MemorySegment seg, short x) {
        constants$70.const$1.set(seg, x);
    }
    public static short st_mode$get(MemorySegment seg, long index) {
        return (short)constants$70.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void st_mode$set(MemorySegment seg, long index, short x) {
        constants$70.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_nlink$VH() {
        return constants$70.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short st_nlink;
     * }
     */
    public static short st_nlink$get(MemorySegment seg) {
        return (short)constants$70.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short st_nlink;
     * }
     */
    public static void st_nlink$set(MemorySegment seg, short x) {
        constants$70.const$2.set(seg, x);
    }
    public static short st_nlink$get(MemorySegment seg, long index) {
        return (short)constants$70.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void st_nlink$set(MemorySegment seg, long index, short x) {
        constants$70.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_uid$VH() {
        return constants$70.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short st_uid;
     * }
     */
    public static short st_uid$get(MemorySegment seg) {
        return (short)constants$70.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short st_uid;
     * }
     */
    public static void st_uid$set(MemorySegment seg, short x) {
        constants$70.const$3.set(seg, x);
    }
    public static short st_uid$get(MemorySegment seg, long index) {
        return (short)constants$70.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void st_uid$set(MemorySegment seg, long index, short x) {
        constants$70.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_gid$VH() {
        return constants$70.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short st_gid;
     * }
     */
    public static short st_gid$get(MemorySegment seg) {
        return (short)constants$70.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short st_gid;
     * }
     */
    public static void st_gid$set(MemorySegment seg, short x) {
        constants$70.const$4.set(seg, x);
    }
    public static short st_gid$get(MemorySegment seg, long index) {
        return (short)constants$70.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void st_gid$set(MemorySegment seg, long index, short x) {
        constants$70.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_rdev$VH() {
        return constants$70.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _dev_t st_rdev;
     * }
     */
    public static int st_rdev$get(MemorySegment seg) {
        return (int)constants$70.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _dev_t st_rdev;
     * }
     */
    public static void st_rdev$set(MemorySegment seg, int x) {
        constants$70.const$5.set(seg, x);
    }
    public static int st_rdev$get(MemorySegment seg, long index) {
        return (int)constants$70.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void st_rdev$set(MemorySegment seg, long index, int x) {
        constants$70.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_size$VH() {
        return constants$71.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * _off_t st_size;
     * }
     */
    public static int st_size$get(MemorySegment seg) {
        return (int)constants$71.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * _off_t st_size;
     * }
     */
    public static void st_size$set(MemorySegment seg, int x) {
        constants$71.const$0.set(seg, x);
    }
    public static int st_size$get(MemorySegment seg, long index) {
        return (int)constants$71.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void st_size$set(MemorySegment seg, long index, int x) {
        constants$71.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_atime$VH() {
        return constants$71.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time64_t st_atime;
     * }
     */
    public static long st_atime$get(MemorySegment seg) {
        return (long)constants$71.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time64_t st_atime;
     * }
     */
    public static void st_atime$set(MemorySegment seg, long x) {
        constants$71.const$1.set(seg, x);
    }
    public static long st_atime$get(MemorySegment seg, long index) {
        return (long)constants$71.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void st_atime$set(MemorySegment seg, long index, long x) {
        constants$71.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_mtime$VH() {
        return constants$71.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time64_t st_mtime;
     * }
     */
    public static long st_mtime$get(MemorySegment seg) {
        return (long)constants$71.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time64_t st_mtime;
     * }
     */
    public static void st_mtime$set(MemorySegment seg, long x) {
        constants$71.const$2.set(seg, x);
    }
    public static long st_mtime$get(MemorySegment seg, long index) {
        return (long)constants$71.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void st_mtime$set(MemorySegment seg, long index, long x) {
        constants$71.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle st_ctime$VH() {
        return constants$71.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time64_t st_ctime;
     * }
     */
    public static long st_ctime$get(MemorySegment seg) {
        return (long)constants$71.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time64_t st_ctime;
     * }
     */
    public static void st_ctime$set(MemorySegment seg, long x) {
        constants$71.const$3.set(seg, x);
    }
    public static long st_ctime$get(MemorySegment seg, long index) {
        return (long)constants$71.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void st_ctime$set(MemorySegment seg, long index, long x) {
        constants$71.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


