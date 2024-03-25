# Kotlin Vulkan

使用[Project Panama](https://openjdk.org/projects/panama/)提供的功能实现通过[Kotlin](https://kotlinlang.org/)
编写[Vulkan](https://www.vulkan.org/)应用

## 代码生成

```shell
jextract --source --output .\app\src\main\java -t com.icuxika.kv.jextract.glfw -I C:\VulkanSDK\1.3.250.1\Include -I .\libdownload\glfw-3.4.bin.WIN64\include -l glfw3 -l "vulkan-1" .\app\src\main\resources\jextract.h
```

## 库

- [glfw-3.4.bin.WIN64.zip](https://github.com/glfw/glfw/releases/download/3.4/glfw-3.4.bin.WIN64.zip)

> 使用
> > 文件解压到`libdownload`，`dll`放到`library`
> - include
> - lib-static-ucrt/glfw3.dll -> library\glfw3.dll

- [VulkanRT-1.3.250.1-Components.zip](https://sdk.lunarg.com/sdk/download/1.3.250.1/windows/VulkanRT-1.3.250.1-Components.zip)
> 解压`vulkan-1.dll`到`library`目录下

## 文档

- [向上调用：将 Java 代码作为函数指针传递给外来函数](https://docs.oracle.com/en/java/javase/21/core/upcalls-passing-java-code-function-pointer-foreign-function.html#GUID-908061BA-DC97-4524-A390-8FCEF7C5978F)

## Demo
> 测试各种返回值的函数调用

### 生成动态库
> 默认使用的`MSVC`，其他编译器需要调整脚本
```shell
cd .\demo-cmake\
.\buildLibrary.ps1
```
### 生成Java代码
> `回到项目根目录`
```shell
jextract --source --output .\app\src\main\java -t com.icuxika.kv.jextract.demo -I .\demo-cmake\include\ -l "ffm_library" .\demo-cmake\include\ffm.h
```