package com.pattern.design.strategy.version3;

import com.pattern.design.strategy.version3.behavior.FlyNoWay;
import com.pattern.design.strategy.version3.behavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("这是一个模型鸭子~");
    }
}
