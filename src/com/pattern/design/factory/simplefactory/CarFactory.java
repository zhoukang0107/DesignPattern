package com.pattern.design.factory.simplefactory;

public class CarFactory implements VehicleFactory {
    public Moveable create(){
        return new Car();
    }
}
