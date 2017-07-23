package com.sybex.Chap3.DuckSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class DuckDriver {
   public static void main(String[] args) {

      Comparator<Duck> byWeight = new Comparator<Duck>() {
         @Override
         public int compare(Duck d1, Duck d2) {
            return d1.getWeight() - d2.getWeight();
         }
      };

      // build a list of ducks
      List<Duck> ducks = new ArrayList<>();
      ducks.add(new Duck("Quack", 7));
      ducks.add(new Duck("Puddles", 10));
      ducks.add(new Duck("Gene", 3));
      ducks.add(new Duck("Gene", 4));
      ducks.add(new Duck("Bob", 10));
      ducks.add(new Duck("Quennith", 5));
      ducks.add(new Duck("Gerald", 7));
      ducks.add(new Duck("Ace",10));
      ducks.add(new Duck("Zed", 12));


      System.out.println("--------------  Unsorted ----------------");
      System.out.println(ducks);
      //
      System.out.println("------By compareTo (name forwards--------");
      Collections.sort(ducks);
      System.out.println(ducks);

      System.out.println("-----By Comparator byWeight (forwards)---");
      Collections.sort(ducks, byWeight);
      System.out.println(ducks);

      System.out.println("--- Using Lambda comparator weight backwards------");
      Comparator<Duck> byWeightBackwards =
            (d1,d2) -> d2.getWeight() - d1.getWeight();
      Collections.sort(ducks,byWeightBackwards);
      System.out.println(ducks);

      System.out.println("---- Using Lambda comparator name then weight (forwards)---------");
      Comparator<Duck> byNameThenWeightFwd =
            DuckDriver::compare;
      Collections.sort(ducks, byNameThenWeightFwd);
      System.out.println(ducks);


      System.out.println("---- Using Lambda comparator name then weight (backwards)---------");
      Comparator<Duck> byNameThenWeightBkwd =
            DuckDriver::compareBackwards;
      Collections.sort(ducks, byNameThenWeightBkwd);
      System.out.println(ducks);


      System.out.println("---- Using Lambda comparator weight then name (forwards)---------");
      Comparator<Duck> byWeightThenNameFwd =
            (Duck d1, Duck d2) -> {
               int compareName = d1.getName().compareTo(d2.getName());
               int compareWeight = d1.getWeight() - d2.getWeight();
               if(compareWeight==0) {
                  return compareName;
               } else
                  return compareWeight;
            };
      Collections.sort(ducks, byWeightThenNameFwd);
      System.out.println(ducks);

   } //main()

   private static int compare(Duck d1, Duck d2) {
      int compareName = d1.getName().compareTo(d2.getName());
      int compareWeight = d1.getWeight() - d2.getWeight();
      if( compareName == 0 ) {
         return compareWeight;
      } else
         return compareName;
   }

   private static int compareBackwards(Duck d1, Duck d2) {
      int compareName = d2.getName().compareTo(d1.getName());
      int compareWeight = d2.getWeight() - d1.getWeight();
      if( compareName == 0 ) {
         return compareWeight;
      } else
         return compareName;
   }

}//class
