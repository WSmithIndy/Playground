package com.hackerrank.dataStructures;

import java.util.*;

public class JavaDeque {
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   Deque deque = new ArrayDeque<>();

   int n = in.nextInt();
   int ssLen = in.nextInt();
   /* ArrayList<Integer> numList = new ArrayList<Integer>();
   numList.ensureCapacity(n);        */
   int[] numAry = new int[n];
   
   // put data in the deque
   for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      //deque.add(num);
      //numList.add(num);
      numAry[i] = num;
   }
   // search for uniqueness
   HashMap<Integer, Integer> crSet = new HashMap<>();

   // seed the hashMap with the initial subset of values
   for(int pos=0; pos<ssLen; pos++) {
      int crNum = numAry[pos];
      int crFreq = crSet.getOrDefault(crNum,0);
      crSet.put(numAry[pos],++crFreq);
   }
   int maxUnqVals = crSet.size();

   // interate over all positions
   for(int start =1; start<=numAry.length - ssLen; start++) {
      // adjust the previous frequency count
      int prvNum = numAry[start-1];
      int crFreq = crSet.getOrDefault(prvNum,0);
      if(crFreq == 1)
         crSet.remove(prvNum);
      else
         crSet.put(prvNum, --crFreq);

      // adjust the next frequency count
      int nxtNum = numAry[start+ssLen-1];
      int nxtFrq = crSet.getOrDefault(nxtNum,0);
      if(nxtFrq==0)
         crSet.put(nxtNum,1);
      else
         crSet.put(nxtNum,++nxtFrq);

      int crNumUnq = crSet.size();
      maxUnqVals = Math.max(maxUnqVals, crNumUnq);
   }
   
   System.out.println(maxUnqVals);
}
}
