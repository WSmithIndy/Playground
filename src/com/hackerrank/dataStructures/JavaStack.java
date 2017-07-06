package com.hackerrank.dataStructures;

import com.sun.org.apache.bcel.internal.generic.RETURN;

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
   Stack<Character> grprStack = new Stack<Character>();

   while (sc.hasNext()) {
      // be sure to empty the stack each time around.
      grprStack.clear();
      String input = sc.next();

      // read each grouping symbol
      for (int i = 0; i < input.length(); i++) {
         char crChar = input.charAt(i);

         // if this is an open symbol, push it onto the stack
         if( isOpenGrouper(crChar))
            grprStack.add(crChar);
         else {
            // check to see if there is a matching grouping symbol to the left ..
            if(groupersMatch(grprStack.peek(),crChar))
               // if so pop it
               grprStack.pop();
         }
      } //for

      // if the stack is empty, then it is balanced
      System.out.println(grprStack.isEmpty());
   } //while

}

public static boolean isOpenGrouper(char c) {
   return (c==OPEN_BRACE || c==OPEN_BRACKET || c==OPEN_PAREN);
}

public static boolean groupersMatch(char left, char right) {
   if(left==OPEN_BRACE && right==CLOSE_BRACE)
      return true;
   if(left==OPEN_BRACKET && right == CLOSE_BRACKET)
      return true;
   if(left==OPEN_PAREN && right==CLOSE_PAREN)
      return true;
   return false;
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
