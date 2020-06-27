package com.pattern.design.compound; /***********************************************************************
 * Module:  RubberDuck.java
 * Author:  Zack
 * Purpose: Defines the Class RubberDuck
 ***********************************************************************/

import java.util.*;

/** @pdOid 2a90fc2e-761e-4546-b382-167ecb66aa8a */
public class RubberDuck implements Quackable {

   @Override
   public void quack() {
      System.out.println("quack Rubber Duck");
   }

   @Override
   public void register(Observer observer) {

   }

   @Override
   public void notifyObservers() {

   }
}