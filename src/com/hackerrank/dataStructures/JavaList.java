package com.hackerrank.dataStructures;
import java.io.*;
import java.util.*;

public class JavaList {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner in = new Scanner(System.in);

   int nNums = in.nextInt();
   List<Integer> numList = new ArrayList<Integer>();
   for(int i=0; i<nNums; i++) {
      int crNum = in.nextInt();
      numList.add(crNum);
   }

   int nQueries = in.nextInt();

   for(int i=0; i<nQueries; i++) {
      String command = in.next();
      command = command.trim();

      if(command.equalsIgnoreCase("Delete")) {
         int idx = in.nextInt();
         numList.remove((int)idx);
      }
      else if(command.equalsIgnoreCase("insert")) {
         int idx = in.nextInt();
         int newNum = in.nextInt();

         numList.add((int)idx, newNum);
      }
   }
   // print out the array
   for(Integer crNum : numList) {
      System.out.printf("%d ", crNum);
   }
}
}
