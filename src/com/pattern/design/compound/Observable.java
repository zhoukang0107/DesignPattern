package com.pattern.design.compound; /***********************************************************************
 * Module:  Observable.java
 * Author:  Zack
 * Purpose: Defines the Class Observable
 ***********************************************************************/

import java.util.*;

/** @pdOid a6647d46-297e-4613-9a4a-cbded19272f5 */
public class Observable implements QuackObservable {
   /** @pdOid d644774c-5db2-4d20-8465-ef2ef8b277df */
   private List<Observer> observers = new ArrayList<>();
   private Quackable duck;

   public Observable(Quackable duck) {
      this.duck = duck;
   }

   @Override
   public void register(Observer observer) {
      observers.add(observer);
   }

   @Override
   public void notifyObservers() {
      for (Observer observer: observers) {
         observer.update(duck);
      }
   }
}