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
public void compareTo() throws Exception {
}

@Test
public void compareTo1() throws Exception {
}

@Test
public void compareTo2() throws Exception {
}

@Test
public void compareTo3() throws Exception {
}

}
