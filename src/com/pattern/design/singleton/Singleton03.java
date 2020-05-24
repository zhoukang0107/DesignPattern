package com.pattern.design.singleton;

/**
 * 改造过的延时加载/懒汉模式:在第一次调用getsInstance方法时单例对象才被创建
 */
public class Singleton03 {
    private static Singleton03 sInstance = null;
    private Singleton03() {
    }

    /**
     * 线程安全：但同步方法效率较低
     * @return
     */
    public static synchronized Singleton03 getsInstance() {
        if (sInstance == null){
            sInstance = new Singleton03();
        }
        return sInstance;
    }

//    public static Singleton03 getsInstance() {
//        synchronized (Singleton03.class){
//            if (sInstance==null){
//                sInstance = new Singleton03();
//            }
//            return sInstance;
//        }
//    }
}
