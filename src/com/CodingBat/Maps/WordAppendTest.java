package com.CodingBat.Maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WordAppendTest {
   WordAppend testClass = null;
   @BeforeEach
   void setUp() {
      testClass = new WordAppend();
   }
   @AfterEach
   void tearDown() {
   }
   @Test
   void wordAppend() {
      String[] input1 = new String[] {"a","b","a"};
      String result1 = "a";
      assertEquals(result1, testClass.wordAppend(input1));

      String[] input2 =  new String[] {"a", "b", "a", "c", "a", "d", "a"};
      String result2 = "aa";
      assertEquals(result2, testClass.wordAppend(input2));

      String[] input3 =  new String[] {"a","", "a"};
      String result3 = "a";
      assertEquals(result3, testClass.wordAppend(input3));
   }

}
