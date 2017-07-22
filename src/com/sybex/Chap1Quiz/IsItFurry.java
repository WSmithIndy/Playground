package com.sybex.Chap1Quiz;
import java.util.*;

/**
 * Created by wtsmi on 7/15/2017.
 */
public class IsItFurry {
   static class Chipmunk {}

   public static void main(String boo[]) {
      Chipmunk c = new Chipmunk();
      ArrayList<Chipmunk> l = new ArrayList<>();
      Runnable r = new Thread();
      int result = 0;

      if(c instanceof Chipmunk) result +=1;
      //if (l instanceof Chipmunk) result +=2;
      if (r instanceof Chipmunk) result += 4;
      System.out.println(result);

      boolean x = Boolean.FALSE;
   }
}
