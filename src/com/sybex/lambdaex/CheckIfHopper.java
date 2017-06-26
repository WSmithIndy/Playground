package com.sybex.lambdaex;

/**
 * Created by wtsmi on 6/20/2017.
 */
public class CheckIfHopper implements CheckTrait{
   public boolean test(Animal a) {
      return a.canHop();
   }
}
