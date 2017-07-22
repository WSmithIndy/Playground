package com.hackerrank.HR30Days;

import java.io.*;
import java.util.*;

public class BinaryNumbers {

public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   int b10Num = in.nextInt();

   String strBinForm = convertToBinary(b10Num);

   // count the number of 1s
   int maxCons = 0;
   int curCons = 0;
   boolean inConsRun = false;
   for(int i=0; i<strBinForm.length(); i++) {
      if(inConsRun) {
         if (strBinForm.charAt(i)=='1') {
            curCons++;
            maxCons = Math.max(maxCons, curCons );
         } else {
            inConsRun = false;
            curCons = 0;
         }
      }
      else if (strBinForm.charAt(i) == '1') {
         inConsRun = true;
         curCons = 1;
         maxCons = Math.max(maxCons, curCons);
      }
   }
   System.out.println(maxCons);
}

public static String convertToBinary(int num) {
   String last="";
   while(num>0){
      int mod=num%2;
      num=num/2;
      String binary=Integer.toString(mod);
      last=mod+last;
   }
   return last;
}
}
