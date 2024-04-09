package com.icuxika.kv

import com.icuxika.kv.graphics.Context
import com.icuxika.kv.jextract.glfw.GLFWkeyfun
import com.icuxika.kv.jextract.glfw.jextract_h.*
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment

class Application {

    fun launch() {
        Arena.ofConfined().use { arena ->
            glfwInit()
            glfwWindowHint(GLFW_CLIENT_API(), GLFW_NO_API())

            val title = arena.allocateUtf8String("Vulkan Wrapper")
            val window = glfwCreateWindow(1280, 720, title, MemorySegment.NULL, MemorySegment.NULL)
            println("glfwVulkanSupported: ${glfwVulkanSupported()}")

            val context = Context(arena)
            context.createInstance()
            context.pickPhysicalDevice()

            glfwSetKeyCallback(window, arena.createWindowKeyCallback())

            while (glfwWindowShouldClose(window) == GLFW_FALSE()) {
                glfwPollEvents()
            }

            context.cleanup()

            glfwDestroyWindow(window)
            glfwTerminate()
        }
    }

    /**
     * 窗口键盘事件监听
     */
    private fun Arena.createWindowKeyCallback(): MemorySegment = GLFWkeyfun.allocate({ window, key, _, action, _ ->
        if (key == GLFW_KEY_ESCAPE() && action == GLFW_PRESS()) {
            glfwSetWindowShouldClose(window, GLFW_TRUE())
        }
    }, this)
}