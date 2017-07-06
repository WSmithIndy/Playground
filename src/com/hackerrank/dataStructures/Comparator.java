package com.hackerrank.dataStructures;

import java.util.*;

// IMPLEMENTED CODE ///////////////////////////

class Checker implements Comparator<Player> {
public int compare(Player o1, Player o2) {
   String name1 = o1.name;
   String name2 = o2.name;

   int scoreDiff = o2.score - o1.score;

   if (scoreDiff != 0)
      return scoreDiff;
   else
      return o1.name.compareTo(o2.name);
}
}//class

// END IMPLEMENTED CODE /////////////////////
class Player{
String name;
int score;

Player(String name, int score){
   this.name = name;
   this.score = score;
}
}

class Solution {

public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();

   Player[] player = new Player[n];
   Checker checker = new Checker();

   for(int i = 0; i < n; i++){
      player[i] = new Player(scan.next(), scan.nextInt());
   }
   scan.close();

   Arrays.sort(player, checker);
   for(int i = 0; i < player.length; i++){
      System.out.printf("%s %s\n", player[i].name, player[i].score);
   }
}
}
