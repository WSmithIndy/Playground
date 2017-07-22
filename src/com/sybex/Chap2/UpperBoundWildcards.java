package com.sybex.Chap2;

import com.sun.xml.internal.messaging.saaj.util.JaxmURI;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
public class UpperBoundWildcards {

   ArrayList<? extends Number> list = new ArrayList<Integer>();

   public static long total(List<? extends Number> list) {
      long count = 0;
      for(Number number: list)
         count += number.longValue();
      return count;
   }

   List<? super IOException> exceptions = new ArrayList<Exception>();
   {
      //exceptions.add(new Exception());
      exceptions.add(new IOException());
      exceptions.add(new FileNotFoundException());
      exceptions.add(new EOFException());
      exceptions.add(new JaxmURI.MalformedURIException());
      exceptions.add(new UnknownHostException());

      // exceptions.add(new ClassNotFoundException());  // not subclass IOException
      
      exceptions.add(new EOFException());

   }
}
