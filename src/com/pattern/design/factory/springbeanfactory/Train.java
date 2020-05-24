package com.pattern.design.factory.springbeanfactory;

public class Train implements Moveable{
    @Override
    public void run() {
        System.out.println("火车咔咔咔~");
    }
}
