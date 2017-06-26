package com.hackerrank;

import java.io.*;
import java.util.*;

public class SmallestDiff {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scan = new Scanner(System.in);

   ArrayList<Integer> numList = new ArrayList<Integer>();

   // read in the numbers
   int nNumbers = scan.nextInt();
   int newInt;

   ArrayList<Integer> pairList = new ArrayList<Integer>();
   int smallestDiff = Integer.MAX_VALUE;

   int smallestNum = Integer.MIN_VALUE;
   int largestNum = Integer.MAX_VALUE;

   for(int i=0; i< nNumbers; i++) {
      newInt = scan.nextInt();
      numList.add(newInt);

      if( newInt > smallestNum || newInt < largestNum)  {
         for(int j=0; j < numList.size()-1; j++) {
            int currInt = numList.get(j);
            int currDiff = Math.abs(currInt - newInt);
            boolean addPair = false;

            if (currDiff <= smallestDiff) {
               addPair = true;
            }
            if (currDiff < smallestDiff) {
               pairList.clear();
               smallestDiff = currDiff;
            }
            if (addPair) {
               pairList.add(currInt);
               pairList.add(newInt);
            }
         }
      }    //if
   }

   Collections.sort(pairList);

   for(int np : pairList)
      System.out.printf("%d ", np);
}
}
