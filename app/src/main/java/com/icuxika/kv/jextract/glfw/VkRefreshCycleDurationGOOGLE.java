// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkRefreshCycleDurationGOOGLE {
 *     uint64_t refreshDuration;
 * };
 * }
 */
public class VkRefreshCycleDurationGOOGLE {

    public static MemoryLayout $LAYOUT() {
        return constants$662.const$0;
    }
    public static VarHandle refreshDuration$VH() {
        return constants$662.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t refreshDuration;
     * }
     */
    public static long refreshDuration$get(MemorySegment seg) {
        return (long)constants$662.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t refreshDuration;
     * }
     */
    public static void refreshDuration$set(MemorySegment seg, long x) {
        constants$662.const$1.set(seg, x);
    }
    public static long refreshDuration$get(MemorySegment seg, long index) {
        return (long)constants$662.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void refreshDuration$set(MemorySegment seg, long index, long x) {
        constants$662.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


