package com.pattern.design.factory.abstractfactory;

public class DefaultFactory extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }
}
