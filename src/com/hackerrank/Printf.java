package com.hackerrank;
import java.util.Scanner;

public class Printf {

public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("================================");
   for(int i=0;i<3;i++)
   {
      String s1=sc.next();
      int x=sc.nextInt();
      sc.nextLine();
      //Complete this line
      System.out.printf("%-15s",s1);
      System.out.printf("%-3d\n",x);

   }
   System.out.println("================================");

}
}
