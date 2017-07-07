package com.hackerrank.dataStructures;

import java.util.*;

public class JavaDeque {
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   Deque deque = new ArrayDeque<>();

   int n = in.nextInt();
   int ssLen = in.nextInt();
   ArrayList<Integer> numList = new ArrayList<Integer>();
   numList.ensureCapacity(n);

   // put data in the deque
   for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      //deque.add(num);
      numList.add(num);
   }

   // search for uniqueness
   int maxUnqVals = 0;

   for (int start = 0; start <= numList.size() - ssLen; start++) {
      HashMap<Integer, Integer> crSet = new HashMap<>();

      for (int pos = start; pos < start + ssLen; pos++) {
         // check if the current element is in the subsequence "so far"
         int crNum = numList.get(pos);
         // if it's not it the current

         int crFreq = crSet.getOrDefault(crNum,0);

         if( crFreq == 0 ) {
            crSet.put(crNum,1);
         }
         else {
            crSet.put(crNum,crFreq++);
         }
      }  // for
      // STATE - a frequency map is present for the current subset of values
      int numUnqVals = 0;
      // count the number of unique keys in this subset
      //crSet.forEach((k,v)->numUnqVals++);
      //numUnqVals = crSet.entrySet().size();
      numUnqVals = crSet.size();

      maxUnqVals = Math.max(maxUnqVals, numUnqVals);
   } // for iterating over subsets

   System.out.println(maxUnqVals);
}
}
