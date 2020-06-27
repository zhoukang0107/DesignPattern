package com.pattern.design.compound; /***********************************************************************
 * Module:  GooseAdapter.java
 * Author:  Zack
 * Purpose: Defines the Class GooseAdapter
 ***********************************************************************/

import java.util.*;

public class GooseAdapter implements Quackable {

   private Goose goose;

   public GooseAdapter(Goose goose) {
      this.goose = goose;
   }

   @Override
   public void quack() {
      goose.honk();
   }

   @Override
   public void register(Observer observer) {

   }

   @Override
   public void notifyObservers() {

   }
}