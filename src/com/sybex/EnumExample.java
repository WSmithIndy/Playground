package com.sybex;

/**
 * Created by wtsmi on 7/14/2017.
 */
public class EnumExample {

   public static final int BLAH = 0;
   public static final int FOO = 1;

   public enum Season {
      WINTER, SPRING, SUMMER, FALL
   }

   public static void main(String args[]) {
      Season s = Season.SUMMER;
      System.out.println(Season.SUMMER);
      System.out.println(s == Season.SUMMER);

      for (Season crSeason : Season.values()) {
         System.out.println(crSeason.name() + " " + crSeason.ordinal());
      }

      int blahfoo = FOO;

      switch( blahfoo ) {
         case BLAH:
            System.out.println("Football");
            break;
         case FOO:
            System.out.println("Foo");
            break;
         default:
            System.out.println("I dunno");
            break;
      }
         
   }


}
