// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoDecodeH264ReferenceInfoFlags {
 *      *     uint32_t top_field_flag;
 *     uint32_t bottom_field_flag;
 *     uint32_t used_for_long_term_reference;
 *     uint32_t is_non_existing;
 * };
 * }
 */
public class StdVideoDecodeH264ReferenceInfoFlags {

    public static MemoryLayout $LAYOUT() {
        return constants$489.const$4;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


