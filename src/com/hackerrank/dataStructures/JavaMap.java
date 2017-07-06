package com.hackerrank.dataStructures;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
public static void main(String []argh)
{
   Scanner in = new Scanner(System.in);
   int n=in.nextInt();
   in.nextLine();

   Map<String, Integer> phoneBook = new HashMap<String,Integer>();

   String name;
   int phoneNum;
   for(int i=0;i<n;i++)
   {
      name=in.nextLine();
      phoneNum = in.nextInt();
      in.nextLine();
      phoneBook.put(name, phoneNum);
   }
   while(in.hasNext())
   {
      name = in.nextLine();

      try {
         phoneNum = phoneBook.get(name);
         //System.out.printf("%s=%d\n", name, phoneNum);
         System.out.println(name + "=" + phoneNum);
      }
      catch(Exception e) {
         System.out.println("Not found");
      }
   }
}
} // class
