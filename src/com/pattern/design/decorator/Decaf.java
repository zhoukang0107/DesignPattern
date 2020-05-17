package com.pattern.design.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 12.99;
    }
}
