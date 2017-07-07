package com.hackerrank.dataStructures;

import java.util.*;

public class JBitSet {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   // read the m/n values, initialized variables
   Scanner in = new Scanner(System.in);
   int nB1 = in.nextInt();
   int nB2 = in.nextInt();
   in.nextLine();

   BitSet btstB1 = new BitSet(nB1);
   BitSet btstB2 = new BitSet(nB2);

   // while there are new lines, read the commands
   while (in.hasNext()) {
      String crLine = in.nextLine();
      crLine = crLine.trim();

      String[] tknAry = crLine.split(" ");

      String cmd = tknAry[0];
      int arg1 = Integer.parseInt(tknAry[1]);
      int arg2 = Integer.parseInt(tknAry[2]);

      // set the target of the operation.
      BitSet trgtBits, altBits;
      if(arg1==1) {
         trgtBits = btstB1;
         altBits = btstB2;
      } else {
         trgtBits = btstB2;
         altBits = btstB1;
      }

      // execute the command
      switch(cmd) {
         case("AND"):
            trgtBits.and(altBits);
            break;
         case("SET"):
            trgtBits.set(arg2);
            break;
         case("OR"):
            trgtBits.or(altBits);
            break;
         case("XOR"):
            trgtBits.xor(altBits);
            break;
         case("FLIP"):
            trgtBits.flip(arg2);
            break;
      }//switch

      // print the number of bits set in each bitset respectively
      int numSet1 = countSetBits(btstB1);
      int numSet2 = countSetBits(btstB2);
      System.out.printf("%d %d\n",numSet1, numSet2);
   }
}
public static int countSetBits(BitSet bits) {
   int  numSet = 0;
   for(int i=0; i<bits.length(); i++) {
      if(bits.get(i) == true)
         numSet++;
   }
   return numSet;
}

}
