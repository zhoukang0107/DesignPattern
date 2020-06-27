package com.pattern.design.compound; /***********************************************************************
 * Module:  Flock.java
 * Author:  Zack
 * Purpose: Defines the Class Flock
 ***********************************************************************/

import java.util.*;


public class Flock implements Quackable {
   private List<Quackable> ducks = new ArrayList<>();
   Observable observable = new Observable(this);

   public void add(Quackable quackablec){
      ducks.add(quackablec);
   }

   @Override
   public void quack() {
      for (Quackable quackable : ducks) {
         quackable.quack();
      }
      notifyObservers();
   }

   @Override
   public void register(Observer observer) {
      observable.register(observer);
   }

   @Override
   public void notifyObservers() {
      observable.notifyObservers();
   }
}