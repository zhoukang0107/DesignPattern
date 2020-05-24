package com.pattern.design.singleton;

/**
 * dcl双检查锁机制
 */
public class Singleton04 {
    private static volatile Singleton04 sInstance = null;
    private Singleton04() {
    }

    public static Singleton04 getsInstance() {
        if (sInstance == null){
            synchronized (Singleton04.class){
                if (sInstance == null){
                    sInstance = new Singleton04();
                }
            }
        }
        return sInstance;
    }
}
