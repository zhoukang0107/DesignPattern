package com.pattern.design.compound; /***********************************************************************
 * Module:  MallardDuck.java
 * Author:  Zack
 * Purpose: Defines the Class MallardDuck
 ***********************************************************************/

import java.util.*;

/** @pdOid 8ef5fabb-85db-445c-b43a-fe568208d7d4 */
public class MallardDuck implements Quackable {
   Observable observable = new Observable(this);

   @Override
   public void quack() {
      System.out.println("quack mallard duck");
      notifyObservers();
   }

   @Override
   public void register(Observer observer) {
      this.observable.register(observer);
   }

   @Override
   public void notifyObservers() {
      observable.notifyObservers();
   }
}