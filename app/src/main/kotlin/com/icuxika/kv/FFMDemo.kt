package com.icuxika.kv

import com.icuxika.kv.jextract.demo.ffm_h.*
import java.lang.foreign.*
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

/**
 * 相关代码生成
 */
class FFMDemo {
    fun launch() {
        Arena.ofConfined().use { arena ->
            val originalArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            val array = arena.allocate(4 * 10)
            array.copyFrom(MemorySegment.ofArray(originalArray))
            forEach(array, originalArray.size, arena.createOnEach())

            val personLayout = MemoryLayout.structLayout(
                ValueLayout.JAVA_LONG.withName("Id"),
                MemoryLayout.sequenceLayout(10, ValueLayout.JAVA_BYTE).withName("Name"),
                MemoryLayout.paddingLayout(2),
                ValueLayout.JAVA_INT.withName("Age"),
            )
            val person = arena.allocate(personLayout)
            personLayout.varHandle(MemoryLayout.PathElement.groupElement("Id")).set(person, 100000)
            val nameHandle = personLayout.varHandle(
                MemoryLayout.PathElement.groupElement("Name"),
                MemoryLayout.PathElement.sequenceElement()
            )
            val name = "icuxika"
            name.toByteArray().forEachIndexed { index, byte ->
                nameHandle.set(person, index, byte)
            }
            nameHandle.set(person, name.length, 0.toByte())
            personLayout.varHandle(MemoryLayout.PathElement.groupElement("Age")).set(person, 28)
            dumpPerson(person)

            val pName = getName()
            println(pName.getUtf8String(0))

            val pNames = getNames()
            println(pNames.getAtIndex(C_POINTER, 0).getUtf8String(0))
            println(pNames.getAtIndex(C_POINTER, 1).getUtf8String(0))
        }
    }

    private fun Arena.createOnEach(): MemorySegment {
        val methodHandle = MethodHandles.lookup()
            .findStatic(
                FFMDemo::class.java, "onEach", MethodType.methodType(Void.TYPE, Integer.TYPE)
            )
        val functionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
        return createFunc(methodHandle, functionDescriptor)
    }

    companion object {
        private val linker: Linker = Linker.nativeLinker()

        fun Arena.createFunc(target: MethodHandle, function: FunctionDescriptor): MemorySegment {
            return linker.upcallStub(target, function, this)
        }

        @JvmStatic
        fun onEach(element: Int) {
            println(element)
        }
    }
}