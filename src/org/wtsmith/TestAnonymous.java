package org.wtsmith;

import java.util.ArrayList;
import java.util.List;

public class TestAnonymous {

public static void main(String[] args) {
   // write your code here
   List<String> values = new ArrayList<String>() {
      {
      this.add("Lisa");
      this.add("Kevin");
      this.add("Roger");
      }
   };

   for (String value : values) {
      System.out.print(value + ", ");
   }
}
}
