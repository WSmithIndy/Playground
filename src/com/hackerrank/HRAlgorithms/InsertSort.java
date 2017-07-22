package com.hackerrank.HRAlgorithms;


import java.util.*;

public class InsertSort {
public static void insertIntoSorted(int[] ar) {

   // shift int until it is in the right place
   int insertPos = ar.length -1;
   int insertNum = ar[insertPos--];

   while(insertPos>=0 && ar[insertPos]>insertNum) {
      shiftRight(ar,insertPos);
      printArray(ar);
      insertPos--;
   }
   ar[insertPos+1] = insertNum;
   printArray(ar);
}

public static void shiftRight(int[] ary, int pos) {
   if(pos>=0 && pos<ary.length-1)
      ary[pos+1] = ary[pos];
}


/* Tail starts here */
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int s = in.nextInt();
   int[] ar = new int[s];
   for(int i=0;i<s;i++){
      ar[i]=in.nextInt();
   }
   insertIntoSorted(ar);
}


private static void printArray(int[] ar) {
   for(int n: ar){
      System.out.print(n+" ");
   }
   System.out.println("");
}
}

