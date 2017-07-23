package com.CodingBat.Maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FirstSwapTest {
   FirstSwap testClass = null;
   @BeforeEach
   void setUp() {
      testClass = new FirstSwap();
   }
   @AfterEach
   void tearDown() {
   }
   @Test
   void firstSwap() {
      String[] input1 = new String[] {"ab","ac"};
      String[] output1 = new String[] {"ac","ab"};
      assertArrayEquals(output1,testClass.firstSwap(input1));
      
   }

}
