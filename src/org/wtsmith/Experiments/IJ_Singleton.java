package org.wtsmith.Experiments;

/**
 * Created by wtsmi on 7/17/2017.
 */
public class IJ_Singleton {
private static IJ_Singleton ourInstance = new IJ_Singleton();

public static IJ_Singleton getInstance() {
   return ourInstance;
}

private IJ_Singleton() {
}
}
