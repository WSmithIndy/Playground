package com.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

static String kangaroo(int x1, int v1, int x2, int v2) {
   // Complete this function
   int k1Loc = x1, k2Loc=x2;
   int currDiff = k1Loc - k2Loc;
   int prevDiff;
   do {
      prevDiff = Math.abs(k1Loc-k2Loc);
      k1Loc += v1;
      k2Loc += v2;
      currDiff = Math.abs(k1Loc-k2Loc);
      if(k1Loc == k2Loc) {
         return "YES";
      }
   }while(currDiff < prevDiff);
   return("NO");
}

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int x1 = in.nextInt();
   int v1 = in.nextInt();
   int x2 = in.nextInt();
   int v2 = in.nextInt();
   String result = kangaroo(x1, v1, x2, v2);
   System.out.println(result);

}
}
