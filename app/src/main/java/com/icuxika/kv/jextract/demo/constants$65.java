// Generated by jextract

package com.icuxika.kv.jextract.demo;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "_wstrdate_s",
        constants$24.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_wstrdate",
        constants$25.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_wstrtime_s",
        constants$24.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_wstrtime",
        constants$25.const$0
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("st_dev"),
        JAVA_SHORT.withName("st_ino"),
        JAVA_SHORT.withName("st_mode"),
        JAVA_SHORT.withName("st_nlink"),
        JAVA_SHORT.withName("st_uid"),
        JAVA_SHORT.withName("st_gid"),
        MemoryLayout.paddingLayout(2),
        JAVA_INT.withName("st_rdev"),
        JAVA_INT.withName("st_size"),
        JAVA_INT.withName("st_atime"),
        JAVA_INT.withName("st_mtime"),
        JAVA_INT.withName("st_ctime")
    ).withName("_stat32");
    static final VarHandle const$5 = constants$65.const$4.varHandle(MemoryLayout.PathElement.groupElement("st_dev"));
}

