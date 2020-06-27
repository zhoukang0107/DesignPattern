package com.pattern.design.compound; /***********************************************************************
 * Module:  QuackCounter.java
 * Author:  Zack
 * Purpose: Defines the Class QuackCounter
 ***********************************************************************/

import java.util.*;

/** @pdOid b061c579-8f90-4875-b9a5-a019aa303613 */
public class QuackCounter implements Quackable {

   private Quackable quack;
   private static int quackNumbers = 0;

   public QuackCounter(Quackable quack) {
      this.quack = quack;
   }

   public static int getQuacks() {
      return quackNumbers;
   }

   @Override
   public void quack() {
      quack.quack();
      quackNumbers++;
   }

   @Override
   public void register(Observer observer) {

   }

   @Override
   public void notifyObservers() {

   }
}