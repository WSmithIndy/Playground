package org.wtsmith.Experiments;
import static java.lang.System.out;

/**
 * Created by wtsmi on 7/17/2017.
 */
public interface StatMethodInterface {
   default void myMethod() { out.println("vlah");}

   int abstractMethod();

   static int statMethod() { return 42;}
}
