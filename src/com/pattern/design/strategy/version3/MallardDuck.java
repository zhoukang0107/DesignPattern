package com.pattern.design.strategy.version3;

import com.pattern.design.strategy.version3.behavior.FlyWithWings;
import com.pattern.design.strategy.version3.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        //针对实现编程XXX
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("i am MallardDuck~");
    }
}
