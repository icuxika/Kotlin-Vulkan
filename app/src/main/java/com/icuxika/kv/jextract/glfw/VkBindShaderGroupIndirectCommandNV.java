// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkBindShaderGroupIndirectCommandNV {
 *     uint32_t groupIndex;
 * };
 * }
 */
public class VkBindShaderGroupIndirectCommandNV {

    public static MemoryLayout $LAYOUT() {
        return constants$827.const$1;
    }
    public static VarHandle groupIndex$VH() {
        return constants$827.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t groupIndex;
     * }
     */
    public static int groupIndex$get(MemorySegment seg) {
        return (int)constants$827.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t groupIndex;
     * }
     */
    public static void groupIndex$set(MemorySegment seg, int x) {
        constants$827.const$2.set(seg, x);
    }
    public static int groupIndex$get(MemorySegment seg, long index) {
        return (int)constants$827.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void groupIndex$set(MemorySegment seg, long index, int x) {
        constants$827.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


