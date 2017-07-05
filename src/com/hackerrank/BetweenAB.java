package com.hackerrank;

import java.util.*;

public class BetweenAB {

static int getMax(int[] array) {
   int maxVal = Integer.MIN_VALUE;
   for(int currInt : array)
      if(currInt > maxVal)
         maxVal = currInt;
   return maxVal;
}

static int getMin(int[] array) {
   int minVal = Integer.MAX_VALUE;
   for(int currInt : array)
      if(currInt < minVal)
         minVal = currInt;
   return minVal;
}

static int getTotalX(int[] aryA, int[] aryB){
   // identify the range of values we need to check.
   int maxA = getMax(aryA);
   int minA = getMin(aryA);
   int maxB = getMax(aryB);
   int minB = getMin(aryB);
   // identify the range of values we need to check
   int min = Math.max(minA, maxA);
   int max = Math.min(minB, maxB);
   int nBetweenAB = 0; // the number of integers "between" set A and B

   boolean allA_divides_x;
   boolean xDividesAllB;
   // test each candidate and determin if it is "between" set A and B
   for(int x=min; x<=max; x++) {
      // check to see if all A | x
      allA_divides_x = true;  // default to true, will trigger false if it occurs and break
      for(int idx=0; idx<aryA.length; idx++) {
         if(x % aryA[idx] != 0){
            allA_divides_x = false;
            break;
         }
      } // for

      // check to see if x | all B
      xDividesAllB = true;
      for(int idx=0; idx<aryB.length; idx++) {
         if(aryB[idx] % x != 0) {
            xDividesAllB = false;
            continue;
         }
      }
      // count if all conditions are met
      if( allA_divides_x && xDividesAllB )
         nBetweenAB++;
   } // for x
   return nBetweenAB;
} // getTotalX()

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int m = in.nextInt();
   int[] a = new int[n];
   for(int a_i=0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
   }
   int[] b = new int[m];
   for(int b_i=0; b_i < m; b_i++){
      b[b_i] = in.nextInt();
   }
   int total = getTotalX(a, b);
   System.out.println(total);
}
}
