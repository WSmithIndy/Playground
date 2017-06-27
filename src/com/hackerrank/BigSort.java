package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class BigSort {

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();

   String strNum;
   Object newObject;

   VersaInt[] unsorted = new VersaInt[n];
   for(int idx=0; idx < n; idx++){
      strNum = in.next();
      unsorted[idx] = new VersaInt (strNum);
   }

   java.util.Arrays.sort(unsorted);

   for(VersaInt currLong: unsorted) {
      System.out.println(currLong);
   }

}
}

// versa int can be an integer of any size and compares appropriately
// when constructed, a VersaInt will check the string length if it will fit in a Long, it will
// be represented as a long.  If not it will be placed in a BigInteger.

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

   String numString = stripLeadingZeroes(init);

   try {
      isBigInteger = false;
      longRep = Long.parseLong(numString);
   }
   catch(NumberFormatException e)
   {
      isBigInteger = true;
      bigRep = new BigInteger(numString);
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

