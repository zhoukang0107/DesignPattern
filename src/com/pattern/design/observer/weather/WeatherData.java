package com.pattern.design.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temp;
    private float huidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index != -1){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temp,huidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float huidity, float pressure){
        this.temp = temp;
        this.huidity = huidity;
        this.pressure = pressure;
        measurementsChanged();

    }
}
