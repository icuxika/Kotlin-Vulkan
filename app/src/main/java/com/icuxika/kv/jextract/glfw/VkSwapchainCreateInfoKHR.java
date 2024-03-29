// Generated by jextract

package com.icuxika.kv.jextract.glfw;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct VkSwapchainCreateInfoKHR {
 *     VkStructureType sType;
 *     void* pNext;
 *     VkSwapchainCreateFlagsKHR flags;
 *     VkSurfaceKHR surface;
 *     uint32_t minImageCount;
 *     VkFormat imageFormat;
 *     VkColorSpaceKHR imageColorSpace;
 *     VkExtent2D imageExtent;
 *     uint32_t imageArrayLayers;
 *     VkImageUsageFlags imageUsage;
 *     VkSharingMode imageSharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     const uint32_t* pQueueFamilyIndices;
 *     VkSurfaceTransformFlagBitsKHR preTransform;
 *     VkCompositeAlphaFlagBitsKHR compositeAlpha;
 *     VkPresentModeKHR presentMode;
 *     VkBool32 clipped;
 *     VkSwapchainKHR oldSwapchain;
 * };
 * }
 */
public class VkSwapchainCreateInfoKHR {

    public static MemoryLayout $LAYOUT() {
        return constants$431.const$4;
    }
    public static VarHandle sType$VH() {
        return constants$431.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static int sType$get(MemorySegment seg) {
        return (int)constants$431.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkStructureType sType;
     * }
     */
    public static void sType$set(MemorySegment seg, int x) {
        constants$431.const$5.set(seg, x);
    }
    public static int sType$get(MemorySegment seg, long index) {
        return (int)constants$431.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void sType$set(MemorySegment seg, long index, int x) {
        constants$431.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pNext$VH() {
        return constants$432.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static MemorySegment pNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$432.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pNext;
     * }
     */
    public static void pNext$set(MemorySegment seg, MemorySegment x) {
        constants$432.const$0.set(seg, x);
    }
    public static MemorySegment pNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$432.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pNext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$432.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$432.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSwapchainCreateFlagsKHR flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$432.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSwapchainCreateFlagsKHR flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$432.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$432.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$432.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle surface$VH() {
        return constants$432.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSurfaceKHR surface;
     * }
     */
    public static MemorySegment surface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$432.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSurfaceKHR surface;
     * }
     */
    public static void surface$set(MemorySegment seg, MemorySegment x) {
        constants$432.const$2.set(seg, x);
    }
    public static MemorySegment surface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$432.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void surface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$432.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle minImageCount$VH() {
        return constants$432.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t minImageCount;
     * }
     */
    public static int minImageCount$get(MemorySegment seg) {
        return (int)constants$432.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t minImageCount;
     * }
     */
    public static void minImageCount$set(MemorySegment seg, int x) {
        constants$432.const$3.set(seg, x);
    }
    public static int minImageCount$get(MemorySegment seg, long index) {
        return (int)constants$432.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void minImageCount$set(MemorySegment seg, long index, int x) {
        constants$432.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageFormat$VH() {
        return constants$432.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkFormat imageFormat;
     * }
     */
    public static int imageFormat$get(MemorySegment seg) {
        return (int)constants$432.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkFormat imageFormat;
     * }
     */
    public static void imageFormat$set(MemorySegment seg, int x) {
        constants$432.const$4.set(seg, x);
    }
    public static int imageFormat$get(MemorySegment seg, long index) {
        return (int)constants$432.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void imageFormat$set(MemorySegment seg, long index, int x) {
        constants$432.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageColorSpace$VH() {
        return constants$432.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkColorSpaceKHR imageColorSpace;
     * }
     */
    public static int imageColorSpace$get(MemorySegment seg) {
        return (int)constants$432.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkColorSpaceKHR imageColorSpace;
     * }
     */
    public static void imageColorSpace$set(MemorySegment seg, int x) {
        constants$432.const$5.set(seg, x);
    }
    public static int imageColorSpace$get(MemorySegment seg, long index) {
        return (int)constants$432.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void imageColorSpace$set(MemorySegment seg, long index, int x) {
        constants$432.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment imageExtent$slice(MemorySegment seg) {
        return seg.asSlice(44, 8);
    }
    public static VarHandle imageArrayLayers$VH() {
        return constants$433.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t imageArrayLayers;
     * }
     */
    public static int imageArrayLayers$get(MemorySegment seg) {
        return (int)constants$433.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t imageArrayLayers;
     * }
     */
    public static void imageArrayLayers$set(MemorySegment seg, int x) {
        constants$433.const$0.set(seg, x);
    }
    public static int imageArrayLayers$get(MemorySegment seg, long index) {
        return (int)constants$433.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void imageArrayLayers$set(MemorySegment seg, long index, int x) {
        constants$433.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageUsage$VH() {
        return constants$433.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkImageUsageFlags imageUsage;
     * }
     */
    public static int imageUsage$get(MemorySegment seg) {
        return (int)constants$433.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkImageUsageFlags imageUsage;
     * }
     */
    public static void imageUsage$set(MemorySegment seg, int x) {
        constants$433.const$1.set(seg, x);
    }
    public static int imageUsage$get(MemorySegment seg, long index) {
        return (int)constants$433.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void imageUsage$set(MemorySegment seg, long index, int x) {
        constants$433.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle imageSharingMode$VH() {
        return constants$433.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSharingMode imageSharingMode;
     * }
     */
    public static int imageSharingMode$get(MemorySegment seg) {
        return (int)constants$433.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSharingMode imageSharingMode;
     * }
     */
    public static void imageSharingMode$set(MemorySegment seg, int x) {
        constants$433.const$2.set(seg, x);
    }
    public static int imageSharingMode$get(MemorySegment seg, long index) {
        return (int)constants$433.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void imageSharingMode$set(MemorySegment seg, long index, int x) {
        constants$433.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle queueFamilyIndexCount$VH() {
        return constants$433.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t queueFamilyIndexCount;
     * }
     */
    public static int queueFamilyIndexCount$get(MemorySegment seg) {
        return (int)constants$433.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t queueFamilyIndexCount;
     * }
     */
    public static void queueFamilyIndexCount$set(MemorySegment seg, int x) {
        constants$433.const$3.set(seg, x);
    }
    public static int queueFamilyIndexCount$get(MemorySegment seg, long index) {
        return (int)constants$433.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void queueFamilyIndexCount$set(MemorySegment seg, long index, int x) {
        constants$433.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pQueueFamilyIndices$VH() {
        return constants$433.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const uint32_t* pQueueFamilyIndices;
     * }
     */
    public static MemorySegment pQueueFamilyIndices$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$433.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const uint32_t* pQueueFamilyIndices;
     * }
     */
    public static void pQueueFamilyIndices$set(MemorySegment seg, MemorySegment x) {
        constants$433.const$4.set(seg, x);
    }
    public static MemorySegment pQueueFamilyIndices$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$433.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pQueueFamilyIndices$set(MemorySegment seg, long index, MemorySegment x) {
        constants$433.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle preTransform$VH() {
        return constants$433.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSurfaceTransformFlagBitsKHR preTransform;
     * }
     */
    public static int preTransform$get(MemorySegment seg) {
        return (int)constants$433.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSurfaceTransformFlagBitsKHR preTransform;
     * }
     */
    public static void preTransform$set(MemorySegment seg, int x) {
        constants$433.const$5.set(seg, x);
    }
    public static int preTransform$get(MemorySegment seg, long index) {
        return (int)constants$433.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void preTransform$set(MemorySegment seg, long index, int x) {
        constants$433.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle compositeAlpha$VH() {
        return constants$434.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkCompositeAlphaFlagBitsKHR compositeAlpha;
     * }
     */
    public static int compositeAlpha$get(MemorySegment seg) {
        return (int)constants$434.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkCompositeAlphaFlagBitsKHR compositeAlpha;
     * }
     */
    public static void compositeAlpha$set(MemorySegment seg, int x) {
        constants$434.const$0.set(seg, x);
    }
    public static int compositeAlpha$get(MemorySegment seg, long index) {
        return (int)constants$434.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void compositeAlpha$set(MemorySegment seg, long index, int x) {
        constants$434.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle presentMode$VH() {
        return constants$434.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkPresentModeKHR presentMode;
     * }
     */
    public static int presentMode$get(MemorySegment seg) {
        return (int)constants$434.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkPresentModeKHR presentMode;
     * }
     */
    public static void presentMode$set(MemorySegment seg, int x) {
        constants$434.const$1.set(seg, x);
    }
    public static int presentMode$get(MemorySegment seg, long index) {
        return (int)constants$434.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void presentMode$set(MemorySegment seg, long index, int x) {
        constants$434.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle clipped$VH() {
        return constants$434.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkBool32 clipped;
     * }
     */
    public static int clipped$get(MemorySegment seg) {
        return (int)constants$434.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkBool32 clipped;
     * }
     */
    public static void clipped$set(MemorySegment seg, int x) {
        constants$434.const$2.set(seg, x);
    }
    public static int clipped$get(MemorySegment seg, long index) {
        return (int)constants$434.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void clipped$set(MemorySegment seg, long index, int x) {
        constants$434.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle oldSwapchain$VH() {
        return constants$434.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VkSwapchainKHR oldSwapchain;
     * }
     */
    public static MemorySegment oldSwapchain$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$434.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VkSwapchainKHR oldSwapchain;
     * }
     */
    public static void oldSwapchain$set(MemorySegment seg, MemorySegment x) {
        constants$434.const$3.set(seg, x);
    }
    public static MemorySegment oldSwapchain$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$434.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void oldSwapchain$set(MemorySegment seg, long index, MemorySegment x) {
        constants$434.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


