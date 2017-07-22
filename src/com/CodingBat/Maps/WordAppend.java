package com.CodingBat.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class WordAppend {
   public String wordAppend(String[] strings) {
      Map<String, Integer> frqMap = new HashMap<>();

      // count frequencies of elements
      for( String crStr : strings ) {
         if( frqMap.containsKey(crStr) ) {
            int crVal = frqMap.get(crStr);
            frqMap.put(crStr, crVal + 1);
         }else {
            frqMap.put(crStr, 1);
         }
      }

      // we now have a frequency map
      // iterate through the values and
      // append ones where that
      // appear once, twice, etc..
      StringBuilder bldResultStr = new StringBuilder();

      for( String crKey : frqMap.keySet() ) {
         int crFrq = frqMap.get(crKey);
         if(crFrq % 2 == 0) {
            for(int i=2; i<=crFrq; i+=2) {
               bldResultStr.append(crKey);
            }
         }
      }

      return bldResultStr.toString();

   }

}
