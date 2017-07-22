package com.sybex.Chap1Quiz;

/**
 * Created by wtsmi on 7/15/2017.
 */
public interface Otter {
   default void play() {}
   
}

class RiverOtter implements Otter {
   @Override
   public boolean equals(Object o) {return false;}
}
