```shell
rm -Recurse -Force .\app\src\main\java\com\icuxika\kv\jextract\win32\

jextract --source --output .\app\src\main\java\ -t com.icuxika.kv.jextract.win32 -luser32 -lkernel32 .\win32\ffm.h "@.\win32\includes.txt"
```