package com.hackerrank.dataStructures;

import java.util.*;
import java.util.stream.IntStream;

public class Java1DArray {
public static boolean canWin(int leap, int[] game) {
   // Return true if you can win the game; otherwise, return false.
   //  boolean canMove = false;
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

   Scanner s = new Scanner(System.in);
   int nGames = s.nextInt();

   IntStream.range(0, nGames).forEach(i -> {
      s.nextLine();
      int n = s.nextInt();
      int leap = s.nextInt();
      int[] arr = new int[n];
      s.nextLine();

      // populate array
      IntStream.range(0, n).forEach(j -> arr[j] = s.nextInt());
      // if index < array length, then goal never completed
      System.out.println(canWin(leap,arr)? "YES": "NO") ;
   });
}
}
