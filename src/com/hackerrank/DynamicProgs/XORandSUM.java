package com.hackerrank.DynamicProgs;

import java.io.*;
import java.util.*;

public class XORandSUM {

public static int bitsToInt (String bitStr) {
   char[] numbers = bitStr.toCharArray();
   int result = 0;
   for(int i=numbers.length - 1; i>=0; i--)
      if(numbers[i]=='1')
         result += Math.pow(2, (numbers.length-i - 1));
   return result;
}
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   String bitStr1 = in.nextLine();
   String bitStr2 = in.nextLine();

   int num1 = bitsToInt(bitStr1);
   int num2 = bitsToInt(bitStr2);

   System.out.println(num1+num2);
}
}
