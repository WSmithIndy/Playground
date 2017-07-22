package com.hackerrank.Advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


import static java.lang.System.in;

class Prime {
public void checkPrime(int ... primeCandAry ) {

   for(int idx=0; idx<primeCandAry.length; idx++) {
      int curCand = primeCandAry[idx];
      if ( isPrime(curCand) )
         System.out.print(curCand + " ");
   }
   System.out.println();
}

public boolean isPrime(int primeCand) {
   if(primeCand<2)
      return false;

   boolean isPrime = true;
   for(int fac=2; fac<=primeCand/2; fac+=1) {
      if (primeCand % fac == 0) {
         isPrime = false;
         break;
      }
   }
   return isPrime;
}
}

public class PrimeChecker {

public static void main(String[] args) {
   try{
      BufferedReader br=new BufferedReader(new InputStreamReader(in));
      int n1=Integer.parseInt(br.readLine());
      int n2=Integer.parseInt(br.readLine());
      int n3=Integer.parseInt(br.readLine());
      int n4=Integer.parseInt(br.readLine());
      int n5=Integer.parseInt(br.readLine());
      Prime ob=new Prime();
      ob.checkPrime(n1);
      ob.checkPrime(n1,n2);
      ob.checkPrime(n1,n2,n3);
      ob.checkPrime(n1,n2,n3,n4,n5);
      Method[] methods=Prime.class.getDeclaredMethods();
      Set<String> set=new HashSet<>();
      boolean overload=false;
      for(int i=0;i<methods.length;i++)
      {
         if(set.contains(methods[i].getName()))
         {
            overload=true;
            break;
         }
         set.add(methods[i].getName());

      }
      if(overload)
      {
         throw new Exception("Overloading not allowed");
      }
   }
   catch(Exception e)
   {
      System.out.println(e);
   }
}

}


