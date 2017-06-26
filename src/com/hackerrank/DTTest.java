package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;
//import java.time.DayOfWeek;
//import java.time.LocalDate;

public class DTTest {

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int month = in.nextInt();
   int day = in.nextInt();
   int year = in.nextInt();

   LocalDate date = LocalDate.of(year, month, day);
   DayOfWeek weekDay = date.getDayOfWeek();

   String strName;
   
   switch (weekDay) {
      case MONDAY:
         strName = "MONDAY";
         break;
      case TUESDAY:
         strName = "TUESDAY";
         break;
      case WEDNESDAY:
         strName = "WEDNESDAY";
         break;
      case THURSDAY:
         strName = "THURSDAY";
         break;
      case FRIDAY:
         strName = "FRIDAY";
         break;
      case SATURDAY:
         strName = "SATURDAY";
         break;
      case SUNDAY:
         strName = "SUNDAY";
         break;
      default:
         strName = "NO DAY";
         break;
   }
   System.out.println(strName);
}
}
