package com.pattern.design.strategy.version3.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞~");
    }
}
