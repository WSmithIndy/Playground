package com.hackerrank.dataStructures;

import java.util.*;

public class Java1DArray {
public static boolean canWin(int leap, int[] game) {
   // Return true if you can win the game; otherwise, return false.
   boolean canMove = false;
   boolean canWin = false;
   boolean bLastUp1 = false;
   int pos = 0;
   while (true) {
      // check to see if there is a winning position
      if( pos + leap >= game.length) {
         return true;
      }
      // check to see if there is a leap
      else if( leap!=0 && leap != 1 && pos+leap < game.length && game[pos + leap] == 0) {
         pos += leap;
         //keepSearching = true;
         bLastUp1 = false;
      }
      // check to see if there is a we can step to the next position
      else if( (pos+1 < game.length) && game[pos+1] == 0) {
         pos++;
         //keepSearching = true;
         bLastUp1 = true;
      }
      // check to see if we can move back
      else if ( !bLastUp1 && pos>0 && game[pos]==0) {
         pos--;
         //keepSearching = true;
      }
      else
         return false;
   }
}
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int q = scan.nextInt();
   while (scan.hasNext()) {

      int n = scan.nextInt();
      int leap = scan.nextInt();
      scan.nextLine();
       /*
      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
         game[i] = scan.nextInt();
      }
      */
      String   curLine = scan.nextLine();
      String[] tokenAry = curLine.split(" ");

      // convert to integer array
      int[] digitAry = new int[tokenAry.length];
      for(int i=0; i<digitAry.length; i++) {
         digitAry[i] = Integer.parseInt(tokenAry[i]);
      }
      System.err.printf("%d %d\n", n, leap);
      System.out.println( (canWin(leap, digitAry)) ? "YES" : "NO" );
   }
   scan.close();
}
}
