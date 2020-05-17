package com.pattern.design.decorator;

/**
 * 具体原始类
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 12;
    }
}
