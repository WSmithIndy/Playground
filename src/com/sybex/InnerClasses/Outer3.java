package com.sybex.InnerClasses;

/**
 * Created by wtsmi on 7/15/2017.
 */
public class Outer3 {
   final private static int x=24;
   public int getX() {
      String message = "x is ";
      int y = 24;

      class Inner {
         private int x = Outer3.this.x;
         public void printX() {
            System.out.println(message + y);
         }
      } // Inner

      Inner in = new Inner();
      in.printX();
      return x;
   }

   public static void main (String[] args) {
      new Outer3().getX();
   }
   
}
