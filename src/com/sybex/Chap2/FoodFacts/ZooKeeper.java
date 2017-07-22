package com.sybex.Chap2.FoodFacts;

public class ZooKeeper {
   public static void main(String[] args) {
      final Food food = FoodFactory.getFood("polar bear");
      food.consumed();
   }
}
