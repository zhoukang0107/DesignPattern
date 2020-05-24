package com.pattern.design.factory.abstractfactory;

/**
 * 两个系列产品：麻瓜系列产品、魔法世界系列产品
 * 一系列产品包含：食物，交通工具，武器
 * 魔法系列：蘑菇、飞行扫帚，魔法棒
 * 麻瓜系列：苹果、车、Ak7
 * 想要替换一系列产品只需要替换制造该系列产品的具体工厂即可
 *
 * 抽象工厂和普通工厂对比：
 * 普通工厂可以扩展具体产品种类的，可以产生新的产品，新的产品工厂，不适合产品系统，会造成工厂泛滥，产生一大堆工厂
 * 抽象工厂不适合扩展产品种类，比如果要产生一个衣服产品种类，就必须要修改工厂父类，所有子类都需要修改；
 *
 */

public class FactoryTest {
    public static void main(String[] args){
        //一系列产品
/*        DefaultFactory01 factory = new DefaultFactory01();
        Car car = factory.createCar();
        car.run();
        AK47 ak47 = factory.createAk47();
        ak47.shoot();
        Apple apple = factory.createApple();
        apple.printName();*/
        //替换所有产品
        DefaultFactory factory = new DefaultFactory();
        Vehicle v = factory.createVehicle();
        v.run();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();
        Food food = factory.createFood();
        food.printName();
    }
}
