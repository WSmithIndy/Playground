package com.CodingBat.Maps;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
   public String[] firstSwap(String[] strings) {
      Map<String, Integer> strIdxMap = new HashMap<>();

      // iterate over the array
      for( int crIdx = 0; crIdx<strings.length; crIdx++ ) {
         String frstChr = strings[crIdx].substring(0, 1);

         if( !strIdxMap.containsKey(frstChr) ) {
            // the the position in the map
            strIdxMap.put(frstChr, crIdx);
         } else {
            // it exists ... either it's valid or not
            // if valid do a swap
            int prvIdx = strIdxMap.get(frstChr);
            if( prvIdx>=0 ) {
               // it's valid ... do a swap
               String tempStr = strings[crIdx];
               strings[crIdx] = strings[prvIdx];
               strings[prvIdx] = tempStr;
               // then set value to -1 so it will not be used again
               strIdxMap.put(frstChr, -1);
            }
         }
      }
      return strings;
   }
}

