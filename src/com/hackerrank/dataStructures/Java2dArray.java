package com.hackerrank.dataStructures;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2dArray {

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int arr[][] = new int[6][6];
   // read the 6x6 array
   for(int i=0; i < 6; i++){
      for(int j=0; j < 6; j++){
         arr[i][j] = in.nextInt();
      }
   }

   // scan the 2d array, bound by possible "hourglass" locations
   // create keep track of the largest hourglass sum.
   int maxSum = 0;
   for(int rw=0; rw<=3; rw++) {
      for(int cl=0; cl<=3; cl++) {
         int currSum = sumHourGlass(arr,rw,cl);

         if(currSum > maxSum)
            maxSum = currSum;
      }
   }
   System.out.println(maxSum);
}

public static int sumHourGlass(int[][] arr, int rw, int cl) {
   int sum = 0;
   // add the "upper cross"
   for(int i=0; i<3; i++)
      sum += arr[rw][cl+i];
   // add the "center
   sum += arr[rw+1][cl+1];

   // add the "bottom cross"
   for(int i=0; i<3; i++)
      sum += arr[rw+2][cl+i];

   return sum;

}
}

