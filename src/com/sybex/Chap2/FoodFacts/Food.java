package com.sybex.Chap2.FoodFacts;

/**
 * Created by wtsmi on 7/19/2017.
 */
public abstract class Food {
   private int quantity;

   Food(int quantity) { this.quantity = quantity; }
   int getQuantity() {return quantity;}
   public abstract void consumed();
}

class Hay extends Food {
   public Hay(int quantity) { super(quantity); }

   public void consumed() {
      System.out.println("Hay eaten: " + getQuantity());
   }
}

class Pellets extends Food {
   public Pellets(int quantity) {
      super(quantity);
   }
   public void consumed() {
      System.out.println("Pellets eaten: " + getQuantity());
   }
}

class Fish extends Food {
   public Fish(int quantity) { super(quantity);}
   public void consumed() {
      System.out.println("Fish eaten: " + getQuantity());
   }
}
