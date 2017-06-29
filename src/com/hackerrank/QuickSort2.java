package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuickSort2 {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
           Your class should be named Solution. */
   Scanner in = new Scanner(System.in);
   int nNums = in.nextInt();

   //int[] aryNums = new int[nNums];
   List<Integer> numList = new ArrayList<Integer>();
   for(int i=0; i< nNums; i++) {
      numList.add(in.nextInt());
   }
   List<Integer> sortedList = quickSort(numList);
   //printNumList(sortedList);
}

/**
 * Replace my awesome in place quicksort with a lame quicksort that uses too much memory.
 * @param aryNums
 * @param start
 * @param end
 * @return the index of the partionining element
 */
public static List<Integer> quickSort(List<Integer> numList) {

   switch(numList.size()) {
      case 0:
         return numList;
      case 1:
         return numList;
      case 2:
         List<Integer> newList = sort2(numList);
         printNumList(newList);
         return numList;
   }
   int partitionNum = (int) numList.get(0);
   List<Integer> leftList = new ArrayList<Integer>();
   List<Integer> rightList = new ArrayList<Integer>();

   for(int i=1; i<numList.size(); i++) {
      int currNum = numList.get(i);
      if(currNum < partitionNum)
         leftList.add(currNum);
      else
         rightList.add(currNum);
   }

   leftList = quickSort(leftList);
   rightList = quickSort(rightList);

   List<Integer> resultList = new ArrayList<Integer>();
   resultList.addAll(leftList);
   resultList.add(partitionNum);
   resultList.addAll(rightList);

   printNumList(resultList);
   return resultList;
}  // method

public static void swapPos(int[] ary, int pos1, int pos2) {
   int temp = ary[pos1];
   ary[pos1] = ary[pos2];
   ary[pos2] = temp;
}

public static List sort2(List<Integer> numList) {
   if(numList.size() != 2)
      return numList;

   int num1 = numList.get(0);
   Integer num2 = numList.get(1);

   if(num1 > num2) {
      numList.set(0, num2);
      numList.set(1, num1);
   }
   return numList;
}

public static void printArray(int[] ary, int begin, int end) {
   if(begin > end)
      throw new IllegalArgumentException();

   for(int i=0; i<begin; i++) {
      System.out.print("  ");
   }

   for(int pos=begin; pos<=end; pos++) {
      System.out.printf("%d ", ary[pos]);
   }
   System.out.println();
}
public static void printArray(int[] ary) {
   printArray(ary,0,ary.length-1);
}

public static void printNumList(List<Integer> numList) {
   for(int num : numList) {
      System.out.printf("%d ", num);
   }
   System.out.println();
}
}

