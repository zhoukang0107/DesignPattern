package com.pattern.design.observer.weather1;

import java.util.Observable;

/**
 * 使用java内置观察者模式
*/
public class WeatherData extends Observable {
    private float temperature;
    private float huidity;
    private float pressure;

    public void measurementsChanged(){
        //注意，必须先执行setChanged后才能执行notifyObservers
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float huidity, float pressure){
        this.temperature = temperature;
        this.huidity = huidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHuidity() {
        return huidity;
    }

    public float getPressure() {
        return pressure;
    }
}
