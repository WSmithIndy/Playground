package com.hackerrank.HRAlgorithms;

import java.util.*;
import java.math.*;

public class BigSort {

/**
 * Comparatorfor sorting strings by length()
 */
public static Comparator<String> StringLengthComparator =
      new  Comparator<String> () {

         public int compare(String s1, String s2) {
            if(s1.length()<s2.length())
               return -1;
            else if(s1.length()==s2.length()) {
               return s1.compareTo(s2);
            }
            else  return 1;
         }
      };

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();

   String strNum;
   Object newObject;

    String[] unsorted = new String[n];
   for(int idx=0; idx < n; idx++) {
      unsorted[idx] = in.next();
   }

   java.util.Arrays.sort(unsorted, StringLengthComparator);

   /*
   for(String currLong: unsorted) {
      System.out.println(currLong);
   }      */

   /*
   VersaInt[] aryNumbers = new VersaInt[n];
   // now we convert these to Versa Int and sort
   for(int idx=0; idx<unsorted.length; idx++) {
      aryNumbers[idx] = new VersaInt(unsorted[idx]);
   }

   java.util.Arrays.sort(aryNumbers);
   */

   StringBuilder output = new StringBuilder();

   for(int idx =0; idx < unsorted.length; idx++) {
      output.append(unsorted[idx]);
      output.append("\n");
   }
   System.out.println(output);
}
}

/**
 * Verse Int can be an integer of any size and compares appropriately when
 * constructed, a VersaInt will check the string length if it will fit in a
 * Long, it will be represented as a long.  If not, it will be place in a
 * BigInteger.
 */
class VersaInt implements Comparable {

private boolean isBigInteger;    // indicates if this is a BigInteger.

private Long longRep;
private BigInteger bigRep;

/**
 * Create a versa int.  The constructor will detect the size of the integer from the length of
 * the string.  If it is zero padded on the left, the constructor will remove any left zeros.
 *
 * Non padded number of 18 characters or more will require a BigInteger
 * Non padded numbers of 17 charac
 *
 * @param init
 */
public static final int BIG_THRESHOLD_LOG = (int)Math.log10(Long.MAX_VALUE)+1;

VersaInt (String init) {

   //String numString = stripLeadingZeroes(init);

   try {
      isBigInteger = false;
      longRep = Long.parseLong(init);
   }
   catch(NumberFormatException e)
   {
      isBigInteger = true;
      bigRep = new BigInteger(init);
   }

}

public static String stripLeadingZeroes(String str) {

   int startAt = 0;

   while(startAt < str.length() && str.charAt(startAt) == '0')
      startAt++;


   return (startAt>0) ? str.substring(startAt) : str;
}

public boolean isBig() {
   return isBigInteger;
}

public BigInteger getBigRep() {
   if (isBigInteger)
      return bigRep;
   else
      return BigInteger.valueOf(longRep);
}
    /*
    public BigInteger getLongRep() {
        if (isBigInteger)
            return Long.NaN;
        else
            return Long(longRep);
    }*/

public int compareTo(BigInteger other) {
   if(isBigInteger)
      return bigRep.compareTo(other);
   else {
      return 1;
   }
}

public int compareTo(VersaInt other) {
   if(this.isBig() && other.isBig())
      return this.bigRep.compareTo(other.bigRep);
   else if(this.isBig() && !other.isBig())
      return 1;
   else if(!this.isBig() && other.isBig())
      return -1;
   else if(!this.isBig() && !other.isBig())
      return this.longRep.compareTo(other.longRep);
   else return 0;
}


public int compareTo(Long other) {
   return isBig() ? 1 : longRep.compareTo(other);
}

@Override
public String toString() {
   if(isBigInteger)
      return bigRep.toString();
   else
      return longRep.toString();
}

@Override
public int compareTo(Object other) {
   if (other instanceof VersaInt) {
      return compareTo((VersaInt) other);
   }
   if(other instanceof Short) {
      return compareTo((Long)other);
   }
   else if(other instanceof Integer ) {
      return compareTo((Long)other);
   }
   else if(other instanceof Long) {
      return compareTo((Long) other);
   }
   return this.compareTo(other);
}
}

