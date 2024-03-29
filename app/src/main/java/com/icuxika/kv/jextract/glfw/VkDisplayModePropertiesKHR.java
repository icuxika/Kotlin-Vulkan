// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkDisplayModePropertiesKHR {
 *     VkDisplayModeKHR displayMode;
 *     VkDisplayModeParametersKHR parameters;
 * };
 * }
 */
public class VkDisplayModePropertiesKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$445.const$4;
    }
    public static VarHandle displayMode$VH() {
        return constants$445.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkDisplayModeKHR displayMode;
     * }
     */
    public static MemorySegment displayMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$445.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkDisplayModeKHR displayMode;
     * }
     */
    public static void displayMode$set(MemorySegment seg, MemorySegment x) {
        constants$445.const$5.set(seg, x);
    }
    public static MemorySegment displayMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$445.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void displayMode$set(MemorySegment seg, long index, MemorySegment x) {
        constants$445.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment parameters$slice(MemorySegment seg) {
        return seg.asSlice(8, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


