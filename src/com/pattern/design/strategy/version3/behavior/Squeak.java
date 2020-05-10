package com.pattern.design.strategy.version3.behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫~");
    }
}
