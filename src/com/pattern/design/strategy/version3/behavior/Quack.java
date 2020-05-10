package com.pattern.design.strategy.version3.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("呱呱叫~");
    }
}
