package com.pattern.design.strategy.version3.test;

import com.pattern.design.strategy.version3.Duck;
import com.pattern.design.strategy.version3.MallardDuck;
import com.pattern.design.strategy.version3.ModelDuck;
import com.pattern.design.strategy.version3.behavior.FlyRocketPowered;

public class NibiDuckSimulator {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFlay();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFlay();
        modelDuck.setFlyBehavior(new FlyRocketPowered());   //在运行时想改变鸭子行为，只需要调用鸭子的setter方法即可
        modelDuck.performFlay();
    }
}
