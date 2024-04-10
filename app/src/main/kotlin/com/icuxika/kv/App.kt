package com.icuxika.kv

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

/**
 * https://docs.oracle.com/en/java/javase/21/core/upcalls-passing-java-code-function-pointer-foreign-function.html#GUID-908061BA-DC97-4524-A390-8FCEF7C5978F
 */

fun main(args: Array<String>) {
//    Application().launch()
//    FFMDemo().launch()
    Win32Demo().launch()
}
