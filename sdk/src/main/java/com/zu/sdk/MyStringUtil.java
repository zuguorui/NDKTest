package com.zu.sdk;

public class MyStringUtil {

    public static String ndkString()
    {
        return getStringNDK();
    }

    private static native String getStringNDK();

    static{
        System.loadLibrary("native-lib");
    }
}
