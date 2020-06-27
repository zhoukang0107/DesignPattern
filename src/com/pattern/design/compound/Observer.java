package com.pattern.design.compound; /***********************************************************************
 * Module:  Observer.java
 * Author:  Zack
 * Purpose: Defines the Interface Observer
 ***********************************************************************/

import java.util.*;

/** @pdOid b1f48ead-6f3c-472c-a71d-c1955bf8b50a */
public interface Observer {
   /** @pdOid 6ee23c58-d6ba-42af-ad74-907158492d8a */
   void update(Quackable quackable);

}