package com.pattern.design.compound; /***********************************************************************
 * Module:  Quackologist.java
 * Author:  Zack
 * Purpose: Defines the Class Quackologist
 ***********************************************************************/

import java.util.*;


/** @pdOid dd6f9dd5-935a-41fe-ba2c-78f50a619f0a */
public class Quackologist implements Observer {

    @Override
    public void update(Quackable quackable) {
        System.out.println("Quackologist " + quackable + " just quacked!");
    }
}