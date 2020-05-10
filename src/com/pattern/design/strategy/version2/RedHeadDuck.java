package com.pattern.design.strategy.version2;

public class RedHeadDuck extends Duck  implements Quackable, Flyable{
    @Override
    public void display() {

    }

    @Override
    public void flay() {

    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
