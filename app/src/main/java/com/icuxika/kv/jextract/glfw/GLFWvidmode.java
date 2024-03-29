// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct GLFWvidmode {
 *     int width;
 *     int height;
 *     int redBits;
 *     int greenBits;
 *     int blueBits;
 *     int refreshRate;
 * };
 * }
 */
public class GLFWvidmode {

    public static MemoryLayout $LAYOUT() {
        return constants$1154.const$4;
    }
    public static VarHandle width$VH() {
        return constants$1154.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$1154.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$1154.const$5.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$1154.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$1154.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$1155.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$1155.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$1155.const$0.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$1155.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$1155.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle redBits$VH() {
        return constants$1155.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int redBits;
     * }
     */
    public static int redBits$get(MemorySegment seg) {
        return (int)constants$1155.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int redBits;
     * }
     */
    public static void redBits$set(MemorySegment seg, int x) {
        constants$1155.const$1.set(seg, x);
    }
    public static int redBits$get(MemorySegment seg, long index) {
        return (int)constants$1155.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void redBits$set(MemorySegment seg, long index, int x) {
        constants$1155.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle greenBits$VH() {
        return constants$1155.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int greenBits;
     * }
     */
    public static int greenBits$get(MemorySegment seg) {
        return (int)constants$1155.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int greenBits;
     * }
     */
    public static void greenBits$set(MemorySegment seg, int x) {
        constants$1155.const$2.set(seg, x);
    }
    public static int greenBits$get(MemorySegment seg, long index) {
        return (int)constants$1155.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void greenBits$set(MemorySegment seg, long index, int x) {
        constants$1155.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle blueBits$VH() {
        return constants$1155.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int blueBits;
     * }
     */
    public static int blueBits$get(MemorySegment seg) {
        return (int)constants$1155.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int blueBits;
     * }
     */
    public static void blueBits$set(MemorySegment seg, int x) {
        constants$1155.const$3.set(seg, x);
    }
    public static int blueBits$get(MemorySegment seg, long index) {
        return (int)constants$1155.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void blueBits$set(MemorySegment seg, long index, int x) {
        constants$1155.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle refreshRate$VH() {
        return constants$1155.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int refreshRate;
     * }
     */
    public static int refreshRate$get(MemorySegment seg) {
        return (int)constants$1155.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int refreshRate;
     * }
     */
    public static void refreshRate$set(MemorySegment seg, int x) {
        constants$1155.const$4.set(seg, x);
    }
    public static int refreshRate$get(MemorySegment seg, long index) {
        return (int)constants$1155.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void refreshRate$set(MemorySegment seg, long index, int x) {
        constants$1155.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


