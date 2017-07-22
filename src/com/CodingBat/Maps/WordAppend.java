package com.CodingBat.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class WordAppend {
   public String wordAppend(String[] strings) {
      Map<String, Integer> frqMap = new HashMap<>();

      StringBuilder bldResultStr = new StringBuilder();

      // count frequencies of elements
      for( String crStr : strings ) {
         if( frqMap.containsKey(crStr) ) {
            int crVal = frqMap.get(crStr);
            crVal++;
            if(crVal >=2 && crVal%2==0)
               bldResultStr.append(crStr);
            frqMap.put(crStr, crVal);
         }else {
            frqMap.put(crStr, 1);
         }
      }

      // we now have a frequency map
      // iterate through the values and
      // append ones where that
      // appear once, twice, etc..

      return bldResultStr.toString();
   }

}
