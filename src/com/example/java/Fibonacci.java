package com.example.java;

//Sub-class Fibonnacci class with inherit from SuperClass Progression
// Geometric will inherit Progression class's methods firsValue() and printProgression()
// and nextValue()
// Also Sub-class Fibonnacci will inherit the Super class instant variable such as
// variables first and cur.


public class Fibonacci extends Progression {

    long prev;  //Previous value

    //Default constructor setting 0 and 1 as the first two values.

    Fibonacci(){
        this(0,1);
    }

    //Parameter constructor providing the first and second values.
    Fibonacci(long value1, long value2){
        first = value1;
        prev = value2 - value1; //fictious value preceding the first
    }

    //Advance the progression by adding the previous values to the current value.
    //return the next value.
    protected long nextValue(){
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }


}
