package com.pattern.design.factory.simplefactory;

public class PlaneFactory implements VehicleFactory {
    public Moveable create(){
        return new Plane();
    }
}
