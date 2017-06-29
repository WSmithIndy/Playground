package com.hackerrank;

import java.io.*;
import java.util.*;


public class LoopInvariant {

public static void insertionSort(int[] A){
   // the sorted portion will be on the left
   // assume the first element is sorted
   // add additional elements immediately to the right
   for(int i = 1; i < A.length; i++){
      // this is the element to move leftward into the sorted region
      int value = A[i];
      // We will be comapring to the left
      int j = i - 1;
      // if the element on the
      while(j >= 0 && value < A[j]){
         // shift elements to the right to make room for the value
         A[j + 1] = A[j];
         // decrement the index
         j--;
      }
      // we have found the position of the value ... 
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
