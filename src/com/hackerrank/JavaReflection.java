package com.hackerrank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


class Student{
private String name;
private String id;
private String email;

public String getName() {
   return name;
}
public void setId(String id) {
   this.id = id;
}
public void setEmail(String email) {
   this.email = email;
}
public void anothermethod(){  }
}

public class JavaReflection {

public static void main(String[] args){

   String strClsNm = "com.hackerrank.Student2";
   Class stdntCls=null;
   try {
      stdntCls = Class.forName(strClsNm);
      Method[] methods = stdntCls.getMethods();

      ArrayList<String> methodList = new ArrayList<>();
      for(Method currMethod : methods){
         methodList.add(currMethod.getName());
      }
      Collections.sort(methodList);
      for(String name: methodList) {
         System.out.println(name);
      }
   }
      catch (Exception e) {
      System.err.printf("Class.forName() threw an exception");
      System.err.printf(e.getMessage());
   }
}

}
