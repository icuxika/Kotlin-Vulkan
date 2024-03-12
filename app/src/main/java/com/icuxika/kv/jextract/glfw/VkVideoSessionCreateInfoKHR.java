// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkVideoSessionCreateInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     uint32_t queueFamilyIndex;
 *     VkVideoSessionCreateFlagsKHR flags;
 *     const VkVideoProfileInfoKHR* pVideoProfile;
 *     VkFormat pictureFormat;
 *     VkExtent2D maxCodedExtent;
 *     VkFormat referencePictureFormat;
 *     uint32_t maxDpbSlots;
 *     uint32_t maxActiveReferencePictures;
 *     const VkExtensionProperties* pStdHeaderVersion;
 * };
 * }
 */
public class VkVideoSessionCreateInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$463.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$463.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$463.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$463.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$463.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$463.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$464.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$464.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$464.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$464.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$464.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle queueFamilyIndex$VH() {
        return constants$464.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t queueFamilyIndex;
     * }
     */
    public static int queueFamilyIndex$get(MemorySegment seg) {
        return (int)constants$464.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t queueFamilyIndex;
     * }
     */
    public static void queueFamilyIndex$set(MemorySegment seg, int x) {
        constants$464.const$1.set(seg, x);
    }
    public static int queueFamilyIndex$get(MemorySegment seg, long index) {
        return (int)constants$464.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void queueFamilyIndex$set(MemorySegment seg, long index, int x) {
        constants$464.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$464.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkVideoSessionCreateFlagsKHR flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$464.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkVideoSessionCreateFlagsKHR flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$464.const$2.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$464.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$464.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pVideoProfile$VH() {
        return constants$464.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkVideoProfileInfoKHR* pVideoProfile;
     * }
     */
    public static MemorySegment pVideoProfile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$464.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkVideoProfileInfoKHR* pVideoProfile;
     * }
     */
    public static void pVideoProfile$set(MemorySegment seg, MemorySegment x) {
        constants$464.const$3.set(seg, x);
    }
    public static MemorySegment pVideoProfile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$464.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pVideoProfile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$464.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pictureFormat$VH() {
        return constants$464.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkFormat pictureFormat;
     * }
     */
    public static int pictureFormat$get(MemorySegment seg) {
        return (int)constants$464.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkFormat pictureFormat;
     * }
     */
    public static void pictureFormat$set(MemorySegment seg, int x) {
        constants$464.const$4.set(seg, x);
    }
    public static int pictureFormat$get(MemorySegment seg, long index) {
        return (int)constants$464.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pictureFormat$set(MemorySegment seg, long index, int x) {
        constants$464.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment maxCodedExtent$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
    }
    public static VarHandle referencePictureFormat$VH() {
        return constants$464.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkFormat referencePictureFormat;
     * }
     */
    public static int referencePictureFormat$get(MemorySegment seg) {
        return (int)constants$464.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkFormat referencePictureFormat;
     * }
     */
    public static void referencePictureFormat$set(MemorySegment seg, int x) {
        constants$464.const$5.set(seg, x);
    }
    public static int referencePictureFormat$get(MemorySegment seg, long index) {
        return (int)constants$464.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void referencePictureFormat$set(MemorySegment seg, long index, int x) {
        constants$464.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxDpbSlots$VH() {
        return constants$465.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxDpbSlots;
     * }
     */
    public static int maxDpbSlots$get(MemorySegment seg) {
        return (int)constants$465.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxDpbSlots;
     * }
     */
    public static void maxDpbSlots$set(MemorySegment seg, int x) {
        constants$465.const$0.set(seg, x);
    }
    public static int maxDpbSlots$get(MemorySegment seg, long index) {
        return (int)constants$465.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maxDpbSlots$set(MemorySegment seg, long index, int x) {
        constants$465.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maxActiveReferencePictures$VH() {
        return constants$465.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t maxActiveReferencePictures;
     * }
     */
    public static int maxActiveReferencePictures$get(MemorySegment seg) {
        return (int)constants$465.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t maxActiveReferencePictures;
     * }
     */
    public static void maxActiveReferencePictures$set(MemorySegment seg, int x) {
        constants$465.const$1.set(seg, x);
    }
    public static int maxActiveReferencePictures$get(MemorySegment seg, long index) {
        return (int)constants$465.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void maxActiveReferencePictures$set(MemorySegment seg, long index, int x) {
        constants$465.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pStdHeaderVersion$VH() {
        return constants$465.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const VkExtensionProperties* pStdHeaderVersion;
     * }
     */
    public static MemorySegment pStdHeaderVersion$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$465.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const VkExtensionProperties* pStdHeaderVersion;
     * }
     */
    public static void pStdHeaderVersion$set(MemorySegment seg, MemorySegment x) {
        constants$465.const$2.set(seg, x);
    }
    public static MemorySegment pStdHeaderVersion$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$465.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pStdHeaderVersion$set(MemorySegment seg, long index, MemorySegment x) {
        constants$465.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

