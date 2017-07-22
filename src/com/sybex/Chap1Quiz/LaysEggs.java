package com.sybex.Chap1Quiz;

/**
 * Created by wtsmi on 7/15/2017.
 */
public class LaysEggs {
   enum AnimalEnums {
      MAMMAL {public boolean laysEggs() {return false;}},
      REPTILE {public boolean laysEggs() {return true;}};

      public abstract boolean laysEggs();
   }
}
