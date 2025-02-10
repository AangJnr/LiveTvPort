cmake_minimum_required(VERSION 3.10)

# Define the main shared library
add_library(
        tunertvinput_jni
        SHARED
        tunertvinput_jni.cpp
        DvbManager.cpp
)

# Include directories
target_include_directories(
        tunertvinput_jni
        PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}   # Include the root-level jni directory
        ${CMAKE_CURRENT_SOURCE_DIR}/minijail  # Include the minijail subfolder
)

# Add compile options
target_compile_options(
        tunertvinput_jni
        PRIVATE
        -Wall
        -Werror
)

# Link the required libraries
target_link_libraries(
        tunertvinput_jni
        log  # Links to liblog.so
#libminijail_jni  # Links the minijail library
)

# Add the minijail library
#add_subdirectory(minijail)
