package com.hackerrank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by wtsmi on 6/26/2017.
 */
public class VersaIntTest {

public static final String biggest =  "99999999999999999999";
public static final String big =      "88888888888888888888";
public static final String notAsBig = "77777777777777777777";

@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}

@Test
public void stripLeadingZeroes() throws Exception {
   assertEquals("1234",VersaInt.stripLeadingZeroes("1234"));
   assertEquals("1234",VersaInt.stripLeadingZeroes("01234"));
   assertEquals("1234", VersaInt.stripLeadingZeroes("001234"));
   assertEquals("",VersaInt.stripLeadingZeroes("0000"));
   assertEquals("",VersaInt.stripLeadingZeroes(""));
}

@Test
public void isBig() throws Exception {

   // Construct a VersaInt that should be long
   Long smallLong = new Long(5);
   VersaInt versaLongSmall = new VersaInt(smallLong.toString());
   assertEquals(false, versaLongSmall.isBig());

   // Construct a VersaInt that should be long
   Long longMAX = Long.MAX_VALUE;
   VersaInt versaLong1 = new VersaInt(longMAX.toString());
   assertEquals(false, versaLong1.isBig());

   // Construct a VersaInt that should be long
   Long longMIN = Long.MIN_VALUE;
   VersaInt versaLong2 = new VersaInt(longMIN.toString());
   assertEquals(false, versaLong2.isBig());

   // Construct a VersaInt that should be a big
   BigInteger barelyBig2 = new BigInteger(longMAX.toString());
   barelyBig2 = barelyBig2.add(new BigInteger("1"));
   VersaInt versaBig2 = new VersaInt(barelyBig2.toString());
   assertEquals(true, versaBig2.isBig());

   // Construct a VersaInt that should be Big
   BigInteger barelyBig3 = new BigInteger(longMIN.toString());
   barelyBig3 = barelyBig3.subtract(new BigInteger("1"));
   VersaInt versaBig3 = new VersaInt(barelyBig3.toString());
   assertEquals(true, versaBig3.isBig());
}

@Test
public void getBigRep() throws Exception {
}

@Test
public void compareToVersaInt() throws Exception {
   VersaInt bigVersa1 = new VersaInt("9999999999999999999");
   assertEquals(true, bigVersa1.isBig());

   VersaInt bigVersa2 = new VersaInt("1111111111111111111");
   assertEquals(false, bigVersa2.isBig());

   assertTrue(bigVersa2.compareTo(bigVersa1)<0);
   assertTrue(bigVersa1.compareTo(bigVersa2)>0);
   assertTrue(bigVersa1.compareTo(bigVersa1)==0);
   assertTrue(bigVersa2.compareTo(bigVersa2)==0);
}

@Test
public void compareToLong() throws Exception {
   // compare a big versa int vs a long
   VersaInt bigVersa1 = new VersaInt("9999999999999999999");

   //
   assertEquals(true, bigVersa1.isBig());
   Long longInt10 = new Long(10);
   assertTrue(bigVersa1.compareTo(longInt10)>0);

   // compare a long versa int vs a long
   VersaInt longVersaInt200 = new VersaInt("200");
   assertTrue(longVersaInt200.compareTo(longInt10) > 0);

   Long longInt200 = new Long(200);
   assertTrue(longVersaInt200.compareTo(longInt200)==0);

   Long longInt1 = new Long(1);
   assertTrue(longVersaInt200.compareTo(longInt1)>0);
}

@Test
public void compareToBigInteger() throws Exception {

   
   VersaInt bigVersa1 = new VersaInt(big);
   assertEquals(true, bigVersa1.isBig());

   BigInteger bigIntSmaller = new BigInteger(notAsBig);
   assertTrue(bigVersa1.compareTo(bigIntSmaller)>0);

   BigInteger bigIntBigger = new BigInteger(biggest);
   assertTrue(bigVersa1.compareTo(bigIntBigger)<0);

   BigInteger bigIntEquals = new BigInteger(big);
   assertTrue(bigVersa1.compareTo(bigIntEquals)==0);
}

@Test
public void toStringTest() throws Exception {
   VersaInt bigVersa = new VersaInt(big);
   String bigString = bigVersa.toString();
   assertEquals(big, bigString);


   VersaInt longVersa = new VersaInt("1000");
   assertEquals("1000", longVersa.toString());
}

}
