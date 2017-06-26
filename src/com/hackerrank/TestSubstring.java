package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TestSubstring {

public static String getSmallestAndLargest(String s, int k) {
   String smallest = s.substring(0);
   String largest = "";

   // Complete the function
   // 'smallest' must be the lexicographically smallest substring of length 'k'
   // 'largest' must be the lexicographically largest substring of length 'k'

   String sub;
   for(int len=0; len < s.length(); len++) {
      for(int pos=0; pos < s.length()-len; pos++) {
         sub = s.substring(pos,pos+len);
         if( smallest.compareTo(sub) < 0)
            smallest = sub;

         if( largest.compareTo(sub) > 0)
            largest = sub;
      }
   }

   return smallest + "\n" + largest;
}

public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String s = scan.next();
   int k = scan.nextInt();
   scan.close();

   System.out.println(getSmallestAndLargest(s, k));
}
}
