import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArrays {

public static void main(String[] args) {
   // read in the number of elements and then the actual elements
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int[] numAry = new int[n];
   for(int idx=0; idx<n; idx++) {
      numAry[idx] = in.nextInt();
   }

   int nNegSums = 0;
   // loop over subsequence length
   for(int subLen=1; subLen <= n;  subLen++)
   {
      // loop over each subsequence and calulate it's sum
      for(int start=0; start<= n - subLen; start++) {
         int subSum = 0;
         for (int pos = start; pos < start + subLen; pos++)
            subSum += numAry[pos];

         // if the the subsequence sum is negative add it to the negative Sum Count
         if (subSum < 0)
            nNegSums++;
      }
   }

   // print out the number of negative subsequence sums
   System.out.print(nNegSums);

}
}
