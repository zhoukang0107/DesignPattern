package com.pattern.design.factory.simplefactory;

public class Plane implements Moveable{
    @Override
    public void run() {
        System.out.println("飞机飞行");
    }
}
