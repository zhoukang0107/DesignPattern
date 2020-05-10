package com.pattern.design.strategy.version3.behavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("火箭动力飞行~");
    }
}
