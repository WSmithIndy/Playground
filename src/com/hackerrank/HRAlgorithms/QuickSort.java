package com.hackerrank.HRAlgorithms;

import java.util.*;
public class QuickSort {

static void beginQuickSort(int[] ar) {
   quickSort(ar, 0, ar.length-1);
}

static void quickSort(int[] ar, int begin, int end)
{
   if(begin >= end)
      return;

   if(begin + 1 == end){
      sort2(ar, begin, end);
      return;
   }
   int pivotPos = partition(ar, begin, end);
   quickSort(ar, begin, pivotPos);
   quickSort(ar, pivotPos+1,end);
}

private static void sort2(int[] ar, int begin, int end) {
   if(ar[begin]>ar[end]) {
      swapPos(ar,begin,end);
      return;
   }
   else {
      return;
   }
}

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
   Scanner in = new Scanner(System.in);
   int nNums = in.nextInt();

   int[] aryNums = new int[nNums];
   for(int i=0; i< aryNums.length; i++) {
      aryNums[i] = in.nextInt();
   }
   quickSort(aryNums, 0,aryNums.length-1);
   printArray(aryNums);
}

public static int partition(int[] aryNums, int start, int end) {
   int leftPos = start;
   int rightPos = end;
   int pivotElement = aryNums[start];

   while (leftPos < rightPos) {
      // move the leftPos to an array value that is greater than the pivot
      while (leftPos < rightPos && aryNums[leftPos] < pivotElement)
         leftPos++;
      // move the rightPos to an array value that is less than the pivot
      while (rightPos > leftPos && aryNums[rightPos] > pivotElement) {
         rightPos--;
      }
      if (rightPos != leftPos)
         if (leftPos > 0) {
            swapPos(aryNums, leftPos - 1, 0);
            return leftPos - 1;
         } else
            return leftPos;
   }
   if (leftPos>0){
      return leftPos-1;
   }
   else
      return leftPos;
}

public static void swapPos(int[] ary, int pos1, int pos2) {
   int temp = ary[pos1];
   ary[pos1] = ary[pos2];
   ary[pos2] = temp;
}

public static void printArray(int[] ary) {
   for(int num : ary) {
      System.out.printf("%d ", num);
   }                                                                          
   System.out.println();
}
}
