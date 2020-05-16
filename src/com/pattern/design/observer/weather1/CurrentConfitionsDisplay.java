package com.pattern.design.observer.weather1;

import java.util.Observable;
import java.util.Observer;

public class CurrentConfitionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    //反注册时需要
    private Observable observable;
    public CurrentConfitionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHuidity();
            display();
        }
    }
}
