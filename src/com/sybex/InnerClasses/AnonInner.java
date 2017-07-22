package com.sybex.InnerClasses;

/**
 * Created by wtsmi on 7/15/2017.
 */
public class AnonInner {
   interface SaleTodayOnly {
      int dollarsOff();
   }
   public int pay() {
      return admission(5,
         new SaleTodayOnly() {
            public int dollarsOff() {return 3;}
         } );
   }

   public int admission (int basePrice, SaleTodayOnly sale) {
      return basePrice - sale.dollarsOff();
   }

}
