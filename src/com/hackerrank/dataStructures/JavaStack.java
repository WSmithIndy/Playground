package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
class JavaStack{

public static char   OPEN_BRACKET = '[';
public static char   CLOSE_BRACKET = ']';
public static char   OPEN_PAREN = '(';
public static char   CLOSE_PAREN = ')';
public static char   OPEN_BRACE = '{';
public static char   CLOSE_BRACE = '}';

public static void main(String []argh)
{

   Scanner sc = new Scanner(System.in);

   while (sc.hasNext()) {
      String input=sc.next();
      // put the string into a character array
      List<Character> grprList = new ArrayList<Character>();
      for(int i=0; i<input.length(); i++) {
         grprList.add(input.charAt(i));
      }
      // remove any spaces
      //grprList.removeIf( c -> c==' ');
      // strategy match first and last grouping symbol ...
      // if they match remove first and last
      boolean isBalanced = true;
      boolean keepChecking = true;
      while(grprList.size() > 0 && keepChecking) {
         if (endsMatch(grprList))
            trimEnds(grprList);
         else   {
            isBalanced = false;
            keepChecking = false;
         }
      }  // while
      if(isBalanced == true)
         System.out.println(true);
      else
         System.out.println(false);
   }
}

public static boolean endsMatch(List<Character> charList) {
   char firstChar = charList.get(0);
   char lastChar = charList.get(charList.size()-1);

   if(firstChar == OPEN_PAREN && lastChar == CLOSE_PAREN)
      return true;

   if(firstChar == OPEN_BRACKET && lastChar == CLOSE_BRACKET)
      return true;

   if(firstChar == OPEN_BRACE && lastChar == OPEN_BRACE)
      return true;
   // default
   return false;
}

public static void trimEnds(List<Character> charList) {
   int length = charList.size();
   if(length < 2)
      return;

   charList.remove(length-1);
   charList.remove(0);
}
}
