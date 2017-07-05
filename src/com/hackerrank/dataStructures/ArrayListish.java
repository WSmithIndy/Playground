package com.hackerrank.dataStructures;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListish {

public static void main(String[] args) {
   // read the file
   Scanner in = new Scanner(System.in);
   // first read the number of data lines
   int nDataRw = in.nextInt();
   int[][] rwAry = new int[nDataRw][];
   // read all the lines
   for(int r=0; r<nDataRw; r++) {
      int nEntries = in.nextInt();

      rwAry[r] = new int[nEntries];
      for(int c=0; c<nEntries; c++) {
         rwAry[r][c] = in.nextInt();
      }
   }

   // now read the queries and output the results
   int nQueries = in.nextInt();
   for(int q=0; q<nQueries; q++) {
      int r = in.nextInt();
      int c = in.nextInt();

      try {
         System.out.println(rwAry[r-1][c-1]);
      }
      catch (Exception e) {
         System.out.println("ERROR!");
      }
   }
}
}
