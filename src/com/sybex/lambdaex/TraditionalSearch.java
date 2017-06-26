package com.sybex.lambdaex;

import com.sybex.lambdaex.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wtsmi on 6/20/2017.
 */
public class TraditionalSearch {

   public static void main(String args[]) {
      List<Animal> animals = new ArrayList<Animal>();  // list of animals
      animals.add(new Animal("fish", false, true));
      animals.add(new Animal("kangaroo", true, false));
      animals.add( new Animal("rabbit", true, false));
      animals.add( new Animal ("turtle",false,true));
      //print(animals, new CheckIfHopper());
     // print (animals, a->a.canHop());
      print(animals, (Animal a) -> { return a.canHop();} ); // does not compile like book says
   }

   private static void print(List<Animal> animals, CheckTrait checker) {
      for(Animal animal : animals) {
         if (checker.test(animal))
            System.out.print(animal + " ");
      }
      System.out.println();
   }
}
