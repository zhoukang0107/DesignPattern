package com.pattern.design.observer.weather;

public interface Observer {
    /**
     * 把观测值之间传入观察者中？是否具有可扩展性？？？如果要增加监测信息，比如酷热指数？？？
     * @param temp
     * @param huidity
     * @param pressure
     */
    void update(float temp, float huidity, float pressure);
}
