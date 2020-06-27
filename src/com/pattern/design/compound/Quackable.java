package com.pattern.design.compound;
/***********************************************************************
 * Module:  Quackable.java
 * Author:  Zack
 * Purpose: Defines the Interface Quackable
 ***********************************************************************/

import java.util.*;

/** @pdOid 36659929-3b8c-4215-af75-fb8efd92cba9 */
public interface Quackable extends QuackObservable {
   /** @pdOid 53f28a32-230c-4e29-b693-2dbe93b14825 */
   void quack();

}