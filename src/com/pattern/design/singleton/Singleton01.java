package com.pattern.design.singleton;

/**
 * 立即加载/饿汉模式:在类加载时创建单例对象；在调用单例方法是对象已经被实例化
 */
public class Singleton01 {
    private static final Singleton01 sInstance = new Singleton01();
    private Singleton01() {
    }

    public static Singleton01 getsInstance() {
        return sInstance;
    }
}
