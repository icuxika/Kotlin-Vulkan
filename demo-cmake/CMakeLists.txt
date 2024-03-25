cmake_minimum_required(VERSION 3.15)
project(demo)
set(CMAKE_CXX_STANDARD 20)

add_executable(ffm_main main.c src/ffm.c)
target_include_directories(ffm_main PUBLIC include)

add_library(ffm_library SHARED src/ffm.c)
target_include_directories(ffm_library PUBLIC include)
