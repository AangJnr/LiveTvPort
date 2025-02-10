cmake_minimum_required(VERSION 3.10)

# Add the shared library for libminijail_jni
add_library(
        libminijail_jni
        SHARED
        minijail.cpp  # Add the main CPP file
)

# Include directories for header files
target_include_directories(
        libminijail_jni
        PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}  # Includes the jni/minijail directory for headers
)

# Add compile options
target_compile_options(
        libminijail_jni
        PRIVATE
        -Wall
        -Werror
)

# Link required libraries
target_link_libraries(
        libminijail_jni
        log          # Links to liblog.so for logging
        c++_static   # Links to the static C++ standard library
)
