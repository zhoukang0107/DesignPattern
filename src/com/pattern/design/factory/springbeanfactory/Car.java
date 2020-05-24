package com.pattern.design.factory.springbeanfactory;

public class Car implements Moveable {
    @Override
    public void run() {
        System.out.println("汽车运行");
    }
}
