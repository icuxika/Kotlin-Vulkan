if ((Test-Path -Path build)) {
    Remove-Item -Recurse -Force .\build\
}

cmake -S . -B build
cmake --build .\build\ --config Release

Remove-Item ..\library\ffm_library.dll
Copy-Item .\build\Release\ffm_library.dll ..\library\