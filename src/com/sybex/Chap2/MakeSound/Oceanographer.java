package com.sybex.Chap2.MakeSound;

/**
 * Created by wtsmi on 7/18/2017.
 */
public class Oceanographer {
   public void checkSound(LivesInOcean animal) {
      animal.makeSound();
   }

   public static void main(String[] args) {
      Oceanographer o = new Oceanographer();
      o.checkSound(new Dolphin());
      o.checkSound(new Whale());
   }
}
