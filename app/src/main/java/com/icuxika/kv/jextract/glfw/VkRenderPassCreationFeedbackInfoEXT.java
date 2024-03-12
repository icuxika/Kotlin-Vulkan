// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkRenderPassCreationFeedbackInfoEXT {
 *     uint32_t postMergeSubpassCount;
 * };
 * }
 */
public class VkRenderPassCreationFeedbackInfoEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$1003.const$4;
    }
    public static VarHandle postMergeSubpassCount$VH() {
        return constants$1003.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t postMergeSubpassCount;
     * }
     */
    public static int postMergeSubpassCount$get(MemorySegment seg) {
        return (int)constants$1003.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t postMergeSubpassCount;
     * }
     */
    public static void postMergeSubpassCount$set(MemorySegment seg, int x) {
        constants$1003.const$5.set(seg, x);
    }
    public static int postMergeSubpassCount$get(MemorySegment seg, long index) {
        return (int)constants$1003.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void postMergeSubpassCount$set(MemorySegment seg, long index, int x) {
        constants$1003.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

