package com.pattern.design.compound; /***********************************************************************
 * Module:  QuackObservable.java
 * Author:  Zack
 * Purpose: Defines the Interface QuackObservable
 ***********************************************************************/

import java.util.*;

/** @pdOid 16f1aee4-c2c9-4a13-95f7-9d533bbc78d2 */
public interface QuackObservable {
   /** @pdOid ae0b6bc3-1223-485a-a946-b78b6b1f5ef3 */
   void register(Observer observer);
   /** @pdOid bf883e22-3e9c-4f54-bc18-6ce114cdd8f6 */
   void notifyObservers();

}