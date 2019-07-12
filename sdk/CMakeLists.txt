cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/jniLibs/${ANDROID_ABI})

include_directories(src/main/cpp)

file(GLOB CPP_FILES "src/main/cpp/*.cpp")

add_library(
    native-lib
	SHARED
	${CPP_FILES}
)
