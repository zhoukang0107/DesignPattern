package com.pattern.design.factory.simplefactory;

public class BroomFactory implements VehicleFactory {
    @Override
    public Moveable create() {
        return new Broom();
    }
}
