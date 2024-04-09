package com.icuxika.kv.graphics

import com.icuxika.kv.jextract.glfw.*
import com.icuxika.kv.jextract.glfw.jextract_h.*
import java.lang.RuntimeException
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

class Context(val arena: Arena) {

    // VkInstance
    lateinit var instance: MemorySegment

    // VkPhysicalDevice
    lateinit var physicalDevice: MemorySegment

    // VkDevice
    lateinit var device: MemorySegment

    // VkQueue
    lateinit var graphicsQueue: MemorySegment

    fun cleanup() {
        println("${javaClass.typeName} cleanup")
        // 异常退出，暂不知原因
//        vkDestroyInstance(instance, MemorySegment.NULL)
    }

    fun createInstance() {
        val vkApplicationInfo = VkApplicationInfo.allocate(arena)
        VkApplicationInfo.`sType$set`(vkApplicationInfo, VK_STRUCTURE_TYPE_APPLICATION_INFO())
        VkApplicationInfo.`pApplicationName$set`(vkApplicationInfo, arena.allocateUtf8String("Vulkan Wrapper"))
        VkApplicationInfo.`applicationVersion$set`(vkApplicationInfo, 0x010000)
        VkApplicationInfo.`pEngineName$set`(vkApplicationInfo, arena.allocateUtf8String("No Engine"))
        VkApplicationInfo.`apiVersion$set`(vkApplicationInfo, VK_API_VERSION_1_0())

        val vkInstanceCreateInfo = VkInstanceCreateInfo.allocate(arena)
        VkInstanceCreateInfo.`sType$set`(vkInstanceCreateInfo, VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO())
        VkInstanceCreateInfo.`pApplicationInfo$set`(vkInstanceCreateInfo, vkApplicationInfo)

        val extensions = getRequiredExtensions()
        val pPpEnabledExtensionNames = arena.allocateArray(C_POINTER, extensions.size.toLong())
        extensions.forEachIndexed { index, s ->
            pPpEnabledExtensionNames.set(C_POINTER, index * C_POINTER.byteSize(), arena.allocateUtf8String(s))
        }
        VkInstanceCreateInfo.`enabledExtensionCount$set`(vkInstanceCreateInfo, extensions.size)
        VkInstanceCreateInfo.`ppEnabledExtensionNames$set`(vkInstanceCreateInfo, pPpEnabledExtensionNames)

        val debugCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena)
        if (GlobalConfig.enableValidationLayers) {
            val validationLayersMemorySegment = arena.allocateArray(ValueLayout.ADDRESS, validationLayers.size.toLong())
            validationLayers.forEachIndexed { index, s ->
                validationLayersMemorySegment.set(C_POINTER, index * C_POINTER.byteSize(), arena.allocateUtf8String(s))
            }
            VkInstanceCreateInfo.`enabledLayerCount$set`(vkInstanceCreateInfo, validationLayers.size)
            VkInstanceCreateInfo.`ppEnabledLayerNames$set`(vkInstanceCreateInfo, validationLayersMemorySegment)

            populateDebugMessengerCreateInfo(debugCreateInfo)
            VkInstanceCreateInfo.`pNext$set`(vkInstanceCreateInfo, debugCreateInfo)
        } else {
            VkInstanceCreateInfo.`enabledLayerCount$set`(vkInstanceCreateInfo, 0)
            VkInstanceCreateInfo.`pNext$set`(vkInstanceCreateInfo, MemorySegment.NULL)
        }

        instance = arena.allocate(VkInstance)
        val result = vkCreateInstance(vkInstanceCreateInfo, MemorySegment.NULL, instance)
        if (result == VK_SUCCESS()) {
            println("vk instance created")
//            vkDestroyInstance(vkInstance, MemorySegment.NULL)
        } else {
            throw RuntimeException("vk instance creation failed: $result")
        }
    }

    fun pickPhysicalDevice() {
        val pDeviceCount = arena.allocate(ValueLayout.JAVA_INT, 0)
        vkEnumeratePhysicalDevices(instance, pDeviceCount, MemorySegment.NULL)
        val deviceCount = pDeviceCount.get(ValueLayout.JAVA_INT, 0)
        if (deviceCount == 0) {
            throw RuntimeException("failed to find GPUs with Vulkan support!")
        }
        val pDevices = arena.allocateArray(ValueLayout.ADDRESS, deviceCount.toLong())
        vkEnumeratePhysicalDevices(instance, pDeviceCount, pDevices)


        val pQueueFamilyCount = arena.allocate(ValueLayout.JAVA_INT, 0)
        vkGetPhysicalDeviceQueueFamilyProperties(
            pDevices.getAtIndex(ValueLayout.ADDRESS, 0),
            pQueueFamilyCount,
            MemorySegment.NULL
        )
        println("pQueueFamilyCount: $pQueueFamilyCount")
    }

    fun createLogicalDevice() {}

    private fun populateDebugMessengerCreateInfo(debugCreateInfo: MemorySegment) {
        VkDebugUtilsMessengerCreateInfoEXT.`sType$set`(
            debugCreateInfo,
            VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT()
        )
        VkDebugUtilsMessengerCreateInfoEXT.`messageSeverity$set`(
            debugCreateInfo,
            VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT() or VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT() or VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT()
        )
        VkDebugUtilsMessengerCreateInfoEXT.`messageType$set`(
            debugCreateInfo,
            VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT() or VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT() or VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT()
        )
        VkDebugUtilsMessengerCreateInfoEXT.`pfnUserCallback$set`(
            debugCreateInfo,
            PFN_vkDebugUtilsMessengerCallbackEXT.allocate({ _, _, pCallbackData, _ ->
                println(
                    "validation layer: " + VkDebugUtilsMessengerCallbackDataEXT.`pMessage$get`(pCallbackData)
                        .getUtf8String(0)
                )
                VK_FALSE()
            }, arena)
        )
    }

    private fun getRequiredExtensions(): Array<String> {
        val pGlfwExtensionCount = arena.allocate(ValueLayout.JAVA_INT, 0)
        val pGlfwExtensions = glfwGetRequiredInstanceExtensions(pGlfwExtensionCount)
        val glfwExtensionCount = pGlfwExtensionCount.get(ValueLayout.JAVA_INT, 0)
        val extensions = Array(glfwExtensionCount) { "" }
        for (i in 0 until glfwExtensionCount) {
            extensions[i] = pGlfwExtensions.getAtIndex(C_POINTER, i.toLong()).getUtf8String(0)
        }
        return extensions
    }

    companion object {
        val validationLayers = arrayOf("VK_LAYER_KHRONOS_validation")
    }
}