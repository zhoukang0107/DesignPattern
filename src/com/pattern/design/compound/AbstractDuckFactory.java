package com.pattern.design.compound; /***********************************************************************
 * Module:  AbstractDuckFactory.java
 * Author:  Zack
 * Purpose: Defines the Interface AbstractDuckFactory
 ***********************************************************************/

import java.util.*;

/** @pdOid 25e5c3f7-316e-4834-9503-a83e087a7a9e */
public interface AbstractDuckFactory {
   /** @pdOid b5253d0e-247f-4589-82a9-a8a375c4effa */
   Quackable createMallardDuck();
   /** @pdOid cea5e25e-656b-458c-90cc-610c41124f38 */
   Quackable createRedheadDuck();
   /** @pdOid 08778ac9-0bd7-456d-b3a6-86a070b44313 */
   Quackable createDuckCall();
   /** @pdOid 5b75c6ca-6460-44d0-9e5f-4ddb58c48c52 */
   Quackable createRubberDuck();

}