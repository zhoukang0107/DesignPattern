package com.pattern.design.compound; /***********************************************************************
 * Module:  RedheadQuack.java
 * Author:  Zack
 * Purpose: Defines the Class RedheadQuack
 ***********************************************************************/

import java.util.*;

/** @pdOid ae201470-a78e-4311-9101-17236d694281 */
public class RedheadQuack implements Quackable {


   @Override
   public void quack() {
      System.out.println("quack redhead duck");
   }

   @Override
   public void register(Observer observer) {

   }

   @Override
   public void notifyObservers() {

   }
}