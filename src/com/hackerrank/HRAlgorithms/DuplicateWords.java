package com.hackerrank.HRAlgorithms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

public static void main(String[] args) {

   String regex ="\b(\\w+)\\s+\\1\\b"; /* Write a RegEx matching repeated words here. */
   Pattern p = Pattern.compile(regex);

   Scanner in = new Scanner(System.in);
   int numSentences = Integer.parseInt(in.nextLine());

   while (numSentences-- > 0) {
      String input = in.nextLine();

      Matcher m = p.matcher(input);

      // Check for subsequences of input that match the compiled pattern
      while (m.find()) {
         String foundStr = m.group();

         String subRegex = "\\w";
         Pattern p2= Pattern.compile(subRegex);
         Matcher m2 = p2.matcher(foundStr);
         m2.find();
         String singleWord = m2.group();

         input = input.replaceAll(foundStr, singleWord);/* The replacement. */
      }

      // Prints the modified sentence.
      System.out.println(input);
   }

   in.close();
}
}
