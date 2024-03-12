package com.icuxika.kv.graphics

import com.icuxika.kv.jextract.glfw.VkApplicationInfo
import com.icuxika.kv.jextract.glfw.VkInstanceCreateInfo
import com.icuxika.kv.jextract.glfw.jextract_h.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment

class Context(val arena: Arena) {
    fun createInstance() {
        val vkApplicationInfo = VkApplicationInfo.allocate(arena)
        VkApplicationInfo.`sType$set`(vkApplicationInfo, VK_STRUCTURE_TYPE_APPLICATION_INFO())
        VkApplicationInfo.`pApplicationName$set`(vkApplicationInfo, arena.allocateUtf8String("Vulkan Wrapper"))
        VkApplicationInfo.`applicationVersion$set`(vkApplicationInfo, 0x010000)
        VkApplicationInfo.`pEngineName$set`(vkApplicationInfo, arena.allocateUtf8String("No Engine"))
        VkApplicationInfo.`apiVersion$set`(vkApplicationInfo, VK_API_VERSION_1_0())

        val vkInstanceCreateInfo = VkInstanceCreateInfo.allocate(arena)
        VkInstanceCreateInfo.`pApplicationInfo$set`(vkInstanceCreateInfo, vkApplicationInfo)

        val vkInstance = arena.allocate(VkInstance)
        val result = vkCreateInstance(vkInstanceCreateInfo, MemorySegment.NULL, vkInstance)
        if (result == VK_SUCCESS()) {
            println("vk instance created")
//            vkDestroyInstance(vkInstance, MemorySegment.NULL)
        } else {
            println("vk instance creation failed: $result")
        }
    }
}