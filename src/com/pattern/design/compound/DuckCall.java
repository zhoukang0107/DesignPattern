package com.pattern.design.compound; /***********************************************************************
 * Module:  DuckCall.java
 * Author:  Zack
 * Purpose: Defines the Class DuckCall
 ***********************************************************************/

import java.util.*;

/** @pdOid 3793a9e3-5066-4920-989c-af1eff1a99d3 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack duck call");

    }

    @Override
    public void register(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}