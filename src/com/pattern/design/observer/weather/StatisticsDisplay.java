package com.pattern.design.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    //反注册时需要
    private Subject subject;
    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float huidity, float pressure) {
        this.temperature = temp;
        this.humidity = huidity;
        display();
    }
}
