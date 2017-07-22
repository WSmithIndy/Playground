package com.sybex.Chap2.Functional_Interface;

/**
 * Created by wtsmi on 7/17/2017.
 */
public class Animal {
   private String species;
   private boolean canHop;
   private boolean canSwim;

   public Animal(String speciesName, boolean hopper, boolean swimmer) {
      species = speciesName;
      canHop = hopper;
      canSwim = swimmer;
   }

   public boolean canHop() {return canHop;}
   public boolean canSwim() {return canSwim;}
   public String toString() {return species;}
}
