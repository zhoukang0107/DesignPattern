package com.pattern.design.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 10.99;
    }
}
