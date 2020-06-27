package com.pattern.design.compound; /***********************************************************************
 * Module:  DuckFactory.java
 * Author:  Zack
 * Purpose: Defines the Class DuckFactory
 ***********************************************************************/

import java.util.*;

/** @pdOid 3a57213c-86b0-44bf-b849-3fe56d03fdc6 */
public class DuckFactory implements AbstractDuckFactory {


   @Override
   public Quackable createMallardDuck() {
      return new MallardDuck();
   }

   @Override
   public Quackable createRedheadDuck() {
      return new RedheadQuack();
   }

   @Override
   public Quackable createDuckCall() {
      return new DuckCall();
   }

   @Override
   public Quackable createRubberDuck() {
      return new RubberDuck();
   }
}