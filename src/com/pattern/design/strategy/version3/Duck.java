package com.pattern.design.strategy.version3;

import com.pattern.design.strategy.version3.behavior.FlyBehavior;
import com.pattern.design.strategy.version3.behavior.QuackBehavior;

public abstract class Duck {

    /**
     * 面向接口编程：行为变量声明为接口类型，实例对象具有特定行为的引用
     */
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 动态设定行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){

    }

    /**
     * 鸭子的飞行行为委托给FlyBehavior接口的对象，而不再定义在Duck中
     */
    public void performFlay(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void performQuack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }

    }

    public abstract void display();

}
