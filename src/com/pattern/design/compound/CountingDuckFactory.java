package com.pattern.design.compound; /***********************************************************************
 * Module:  CountingDuckFactory.java
 * Author:  Zack
 * Purpose: Defines the Class CountingDuckFactory
 ***********************************************************************/

import java.util.*;

public class CountingDuckFactory implements AbstractDuckFactory {


   @Override
   public Quackable createMallardDuck() {
      return new QuackCounter(new MallardDuck());
   }

   @Override
   public Quackable createRedheadDuck() {
      return new QuackCounter(new RedheadQuack());
   }

   @Override
   public Quackable createDuckCall() {
      return new QuackCounter(new DuckCall());
   }

   @Override
   public Quackable createRubberDuck() {
      return new QuackCounter(new RubberDuck());
   }
}