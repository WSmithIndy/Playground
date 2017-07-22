package com.sybex.InnerClasses;

/**
 * Created by wtsmi on 7/15/2017.
 */
public class Outer {
   private String greeting = "Hi";

   static class InnerStatic {

      public void go() {
         System.out.println("Inner.go()");
      }
   }

   protected class Inner {
      public int repeat = 3;
      public void go() {
         for(int i=0; i<repeat; i++)
            System.out.println(greeting);
      }
   }

   public void callInner() {
      Inner inner = new Inner();
      inner.go();
   }

   public void blah() {
      Outer.Inner inside = new Inner();
   }

   public Inner makeInner() {
      return new Inner();
   }

   public static void main(String[] args) {
      Outer outer = new Outer();
      outer.callInner();

      //Inner outsideIn = new Inner();       // non-static variable this
      Outer.Inner outsideIn = outer.new Inner();   // non-static variable
      // Outer.Inner outsideIn = new Outer.Inner(); // cannot be referenced from static context
      //Outer.Inner outsideIn = outer.makeInner();

      Outer.InnerStatic outInStatic = new Outer.InnerStatic();
      outInStatic.go();

   }
}
