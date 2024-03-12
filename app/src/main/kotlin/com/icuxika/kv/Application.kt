package com.icuxika.kv

import com.icuxika.kv.graphics.Context
import com.icuxika.kv.jextract.glfw.jextract_h.*
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

class Application {

    fun launch() {
        Arena.ofConfined().use { arena ->
            glfwInit()
            glfwWindowHint(GLFW_CLIENT_API(), GLFW_NO_API())

            val title = arena.allocateUtf8String("Vulkan Wrapper")
            val window = glfwCreateWindow(1280, 720, title, MemorySegment.NULL, MemorySegment.NULL)
            println("glfwVulkanSupported: ${glfwVulkanSupported()}")

            // vulkan api 测试
            Context(arena).createInstance()

            val callbackFunc = arena.createWindowKeyCallback()
            glfwSetKeyCallback(window, callbackFunc)

            while (glfwWindowShouldClose(window) == GLFW_FALSE()) {
                glfwPollEvents()
            }
            glfwDestroyWindow(window)
            glfwTerminate()
        }
    }

    private fun Arena.createWindowKeyCallback(): MemorySegment {
        val methodHandle = MethodHandles.lookup()
            .findStatic(
                Application::class.java, "callback", MethodType.methodType(
                    Void.TYPE, MemorySegment::class.java, Integer.TYPE, Integer.TYPE,
                    Integer.TYPE,
                    Integer.TYPE,
                )
            )
        val functionDescriptor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
        )
        return createFunc(methodHandle, functionDescriptor)
    }

    companion object {
        private val linker: Linker = Linker.nativeLinker()

        fun Arena.createFunc(target: MethodHandle, function: FunctionDescriptor): MemorySegment {
            return linker.upcallStub(target, function, this)
        }

        /**
         * 窗口键盘事件监听
         */
        @JvmStatic
        fun callback(window: MemorySegment, key: Int, scancode: Int, action: Int, mods: Int) {
            if (key == GLFW_KEY_ESCAPE() && action == GLFW_PRESS()) {
                glfwSetWindowShouldClose(window, GLFW_TRUE())
            }
        }
    }
}