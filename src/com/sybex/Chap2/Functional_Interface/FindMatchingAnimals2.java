package com.sybex.Chap2.Functional_Interface;

import java.util.function.Predicate;
/**
 * Created by wtsmi on 7/18/2017.
 */
public class FindMatchingAnimals2 {
   private static void printIf(Animal animal, Predicate<Animal>trait) {
      if(trait.test(animal))
         System.out.println(animal);
   }

   public static void main(String[] args) {
      printIf(new Animal("fish",false,true),
            a->a.canHop());
      printIf(new Animal("kangaroo", true, false),
            a->a.canHop());
   }
}

