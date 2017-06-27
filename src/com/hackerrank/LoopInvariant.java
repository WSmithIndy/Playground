package com.hackerrank;

import java.io.*;
import java.util.*;

public class Solution {

public static void insertionSort(int[] A){
   for(int i = A.length-1; i >=0; i--){
      int value = A[i];
      int j = i - 1;
      while(j >= 0 && A[j] > value){
         A[j + 1] = A[j];
         j--;
      }
      A[j + 1] = value;
   }
   printArray(A);
}


static void printArray(int[] ar) {
   for(int n: ar){
      System.out.print(n+" ");
   }
}
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int[] ar = new int[n];
   for(int i=0;i<n;i++){
      ar[i]=in.nextInt();
   }
   insertionSort(ar);
}
}
