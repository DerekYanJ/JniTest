package com.yqy.jnitest;

/**
 * Created by DerekYan on 2017/7/19.
 */

public class TestJni {
    private static String a;

    static {
        System.loadLibrary("Test");//匹配lib下so文件libTest.so
    }

    public static String a() {
        if (a == null)
            a = getStr();
        return a;
    }

    public static native String getStr();//so文件中的方法

}

