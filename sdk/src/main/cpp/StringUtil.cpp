//
// Created by rikson on 2019/7/11.
//

#include <jni.h>
#include <stdlib.h>
#include <iostream>

using namespace std;

extern "C"
JNIEXPORT jstring
JNICALL
Java_com_zu_sdk_MyStringUtil_getStringNDK(JNIEnv *env, jobject instance)
{
    string result = "Hello from NDK";
    return env->NewStringUTF(result.c_str());
}
