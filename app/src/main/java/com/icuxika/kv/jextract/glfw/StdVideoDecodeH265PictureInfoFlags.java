// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoDecodeH265PictureInfoFlags {
 *      *     uint32_t IrapPicFlag;
 *     uint32_t IdrPicFlag;
 *     uint32_t IsReference;
 *     uint32_t short_term_ref_pic_set_sps_flag;
 * };
 * }
 */
public class StdVideoDecodeH265PictureInfoFlags {

    public static MemoryLayout $LAYOUT() {
        return constants$564.const$0;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


