package com.hackerrank.HRAlgorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

static int migratoryBirds(int n, int[] ar) {
   // Complete this function
   int[] frqAry = new int[6];
   for(int i=0; i<frqAry.length; i++)
      frqAry[i] = 0;

   for(int i=0; i<ar.length; i++) {
      int currNum = ar[i];

      frqAry[currNum]++;
   }

   // scan to find the largest frequency in the array
   int largestCountNum = 0;
   int largestCountIdx = 0;
   for(int pos=1; pos<frqAry.length; pos++) {
      if(frqAry[pos]>largestCountNum){
         largestCountIdx = pos;
         largestCountNum = frqAry[pos];
      }
   }
   return largestCountIdx;
}

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int[] ar = new int[n];
   for(int ar_i = 0; ar_i < n; ar_i++){
      ar[ar_i] = in.nextInt();
   }
   int result = migratoryBirds(n, ar);
   System.out.println(result);
}
}
