package com.sybex.InnerClasses;

/**
 * From Sybex Pro Java Chapter Quiz p.39
 */

/**
 * Created by wtsmi on 7/15/2017.
 */
public class Outer2 {
   private int x = 5;
   protected static int p = 2;

   protected class Inner {
      public int x=10;
      public void go() { System.out.println(x);}
   }

   public static void main (String[] args) {
      Outer2 out = new Outer2();
      Outer2.Inner in = out.new Inner();
      in.go();
   }
}

class OtherClass {
   public static void main(String args[]) {
      Outer2 out = new Outer2();
      Outer2.Inner in = out.new Inner();
      in.go();
      System.out.println("Test the second one." + Outer2.p);


   }


}
