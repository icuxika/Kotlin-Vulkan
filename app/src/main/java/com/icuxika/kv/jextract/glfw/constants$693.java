// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$693 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$693() {}
    static final VarHandle const$0 = constants$692.const$5.varHandle(MemoryLayout.PathElement.groupElement("sType"));
    static final VarHandle const$1 = constants$692.const$5.varHandle(MemoryLayout.PathElement.groupElement("pNext"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(PFN_vkCmdSetSampleLocationsEXT.class, "apply", constants$14.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(PFN_vkGetPhysicalDeviceMultisamplePropertiesEXT.class, "apply", constants$140.const$5);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vkCmdSetSampleLocationsEXT",
        constants$14.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "vkGetPhysicalDeviceMultisamplePropertiesEXT",
        constants$140.const$5
    );
}


