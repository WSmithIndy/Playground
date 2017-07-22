package com.sybex.Chap2.Functional_Interface;

/**
 * Created by wtsmi on 7/17/2017.
 */
public class FindMatchingAnimals {
   private static void print(Animal animal, CheckTrait trait) {
      if(trait.test(animal))
         System.out.println(animal);
   }

   public static void main(String[] args) {
      print(new Animal("fish", false, true),
            a->a.canHop());
      print(new Animal("kangaroo",true,false),
            a->a.canHop());
   }
}
