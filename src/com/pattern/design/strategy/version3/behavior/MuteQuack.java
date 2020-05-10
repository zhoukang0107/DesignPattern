package com.pattern.design.strategy.version3.behavior;


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("这是个哑巴~");
    }
}
