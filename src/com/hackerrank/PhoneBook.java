package com.hackerrank;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
public static void main(String []argh){
   Scanner in = new Scanner(System.in);

   Map<String,Integer> phoneMap = new HashMap<String,Integer>();
   int n = in.nextInt();
   for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      // Write code here
      phoneMap.put(name,phone);

   }
   while(in.hasNext()){
      String strName = in.next();
      int phoneNum = phoneMap.get(strName);
      System.out.printf("%s=%d",strName,phoneNum);

   }
   in.close();
}
}
