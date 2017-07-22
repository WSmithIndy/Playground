package com.sybex;

/**
 * Created by wtsmi on 7/14/2017.
 */
public enum TestSuit {


   B_JOKER(Color.BLACK), R_JOKER(Color.RED),
   CLUBS(Color.BLACK),
   DIAMONDS(Color.RED), HEARTS(Color.RED),
   SPADES(Color.BLACK);

   public enum Color {RED, BLACK}

   private final Color color;

   TestSuit(Color color) {
      this.color = color;
   }

}
