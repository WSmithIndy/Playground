package com.hackerrank.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthDayChocolate {

static int solve(int n, int[] numAry, int expSum, int nSquares){
   // loop on the subsequence length
   int numWays = 0;
   for(int start=0; start <= numAry.length- nSquares; start++) {
      // add the sub array of length nSquares
      int seqSum = 0;
      for(int pos=start; pos<start+nSquares; pos++ ) {
         seqSum += numAry[pos];
      }

      if(seqSum == expSum) {
         numWays++;
      }
   }
   return numWays;
}

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int[] s = new int[n];
   for(int s_i=0; s_i < n; s_i++){
      s[s_i] = in.nextInt();
   }
   int d = in.nextInt();
   int m = in.nextInt();
   int result = solve(n, s, d, m);
   System.out.println(result);
}
}
