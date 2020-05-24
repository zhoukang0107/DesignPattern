package com.pattern.design.factory.abstractfactory;

public class DefaultFactory01 {
    public Car createCar(){
        return new Car();
    }

    public Apple createApple(){
        return new Apple();
    }

    public AK47 createAk47(){
        return new AK47();
    }
}
