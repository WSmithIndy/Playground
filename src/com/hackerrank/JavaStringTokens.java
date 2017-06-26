package com.hackerrank;

import java.io.*;
import java.util.*;
public class JavaStringTokens {

public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.err.println("Enter a string to parse!");
   String s = scan.nextLine();
   // Write your code here.
   scan.close();

   String[] aryTokens = s.split("[^a-zA-Z0-9]+");
   ArrayList<String> tokenList = new ArrayList<>(Arrays.asList(aryTokens));


   System.err.println("Print all tokens");
   for(String currStr : aryTokens)
      System.err.println(currStr);
   System.err.println("Remove non words");

   // remove non words
   int len = tokenList.size();
   for(int i=len-1; i>=0; i--)   {
      String strToken = tokenList.get(i);
      boolean isWord = strToken.matches("\\w+");
      if(!isWord)
         tokenList.remove(i);
   }

   System.out.println(tokenList.size());
   // print the resulting list
   int tokenCount = 0;
   for(String currToken : tokenList) {
      tokenCount++;
      System.out.println(currToken);
   }
   System.out.println(tokenCount);
}
}
