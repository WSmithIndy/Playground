package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleOrange {

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int hsLft = in.nextInt();
   int hsRgt = in.nextInt();
   int apLoc = in.nextInt();
   int orLoc = in.nextInt();
   int m = in.nextInt();
   int n = in.nextInt();
   int[] apples = new int[m];
   for(int apple_i=0; apple_i < m; apple_i++){
      apples [apple_i] = in.nextInt();
   }
   int oranges[] = new int[n];
   for(int orange_i=0; orange_i < n; orange_i++){
      oranges[orange_i] = in.nextInt();
   }

   // my solution
   int orangeHits = 0;
   for(int i=0; i<oranges.length; i++) {
      if(isInRange(oranges[i]+orLoc,hsLft,hsRgt))
         orangeHits++;
   }

   int appleHits = 0;
   for(int i=0; i<apples.length; i++) {
      if(isInRange(apples[i]+apLoc,hsLft,hsRgt))
         appleHits++;
   }
   System.out.println(appleHits);
   System.out.println(orangeHits);
}

public static boolean isInRange(int num, int left, int right) {
   if (left <= num && num<=right)
      return true;
   return false;
}
}
