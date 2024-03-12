// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct StdVideoH265HrdFlags {
 *      *     uint32_t nal_hrd_parameters_present_flag;
 *     uint32_t vcl_hrd_parameters_present_flag;
 *     uint32_t sub_pic_hrd_params_present_flag;
 *     uint32_t sub_pic_cpb_params_in_pic_timing_sei_flag;
 *     uint32_t fixed_pic_rate_general_flag;
 *     uint32_t fixed_pic_rate_within_cvs_flag;
 *     uint32_t low_delay_hrd_flag;
 * };
 * }
 */
public class StdVideoH265HrdFlags {

    public static MemoryLayout $LAYOUT() {
        return constants$539.const$3;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


