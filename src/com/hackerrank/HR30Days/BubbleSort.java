package com.hackerrank.HR30Days;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] a = new int[n];
      for(int a_i=0; a_i < n; a_i++){
         a[a_i] = in.nextInt();
      }
      // Write Your Code Here
      int swapCount=0;
      for(int stIdx=0; stIdx<a.length-1; stIdx++) {
         for(int crIdx=0; crIdx<a.length-1; crIdx++) {
            if(a[crIdx]>a[crIdx+1]) {
               swapCount++;
               // swap the elements
               int temp = a[crIdx];
               a[crIdx] = a[crIdx+1];
               a[crIdx+1] = temp;
            }
         }
      }

      System.out.printf("Array is sorted in %d swaps.\n", swapCount);
      System.out.printf("First Element: %d\n", a[0]);
      System.out.printf("Last Element: %d\n",a[a.length-1]);
   }
}
