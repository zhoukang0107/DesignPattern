package com.pattern.design.singleton;

/**
 * 使用静态内置类实现单例模式
 */
public class Singleton05 {
    private Singleton05() {
    }

    /**
     * @return
     */
    public static Singleton05 getsInstance() {
        return SingleHolder.sInstance;
    }

    private static class SingleHolder{
        private static final Singleton05 sInstance = new Singleton05();
    }
}
