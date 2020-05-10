package com.pattern.design.strategy.version3.behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("用翅膀飞~");
    }
}
