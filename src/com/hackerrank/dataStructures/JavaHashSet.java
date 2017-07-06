package com.hackerrank.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet {

public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int t = s.nextInt();
   String[] pair_left = new String[t];
   String[] pair_right = new String[t];

   for (int i = 0; i < t; i++) {
      pair_left[i] = s.next();
      pair_right[i] = s.next();
   }

   // IMPLEMENTED CODE ////////////////////////////

//Write your code here
   // create a hashSet
   Set<String> pairSet = new HashSet<String>();
   int numUnique = 0;
   // loop over the pairs
   for (int i = 0; i < pair_left.length; i++) {
      // check to see if the pair is in the hashSet
      String currPair = pair_left[i] + " " + pair_right[i];
      if (!pairSet.contains(currPair)) {
         // if it's in the not in the hashSet, add it and bump up the unique count
         numUnique++;
         pairSet.add(currPair);
      }
      // print out the number of duplicates
      System.out.println(numUnique);
   }
   /// END IMPLEMENTED CODE ////////////////////////
} // main()
} // class
