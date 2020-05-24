package com.pattern.design.singleton;

/**
 * 延时加载/懒汉模式:在第一次调用getsInstance方法时单例对象才被创建
 */
public class Singleton02 {
    private static Singleton02 sInstance = null;
    private Singleton02() {
    }

    /**
     * 线程不安全
     * @return
     */
    public static Singleton02 getsInstance() {
        if (sInstance == null){
            sInstance = new Singleton02();
        }
        return sInstance;
    }
}
