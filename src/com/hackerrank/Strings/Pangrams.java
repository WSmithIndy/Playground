package com.hackerrank.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {
public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
   Scanner in = new Scanner(System.in);
   String sentence = in.nextLine();

   int[] alpbtFrq = new int[26];

   for(int i=0; i<sentence.length(); i++) {
      char crChar = sentence.charAt(i);
      if(Character.isLetter(crChar))
         alpbtFrq[charToIndex(crChar)]++;
   }

   // scan the alphabet frequency array, see if all the values are non zero.
   boolean isPangram = true;
   for(int crCnt : alpbtFrq) {
      if(crCnt==0)
         isPangram = false;
   }
   if(isPangram)
      System.out.println("pangram");
   else
      System.out.println("not pangram");
}

public static int charToIndex(char c) {
   int index = -1;
   if(Character.isUpperCase(c))
      index =  (int) c-'A';
   else if (Character.isLowerCase(c))
      index =  (int) c-'a';
   return index;
}
}
