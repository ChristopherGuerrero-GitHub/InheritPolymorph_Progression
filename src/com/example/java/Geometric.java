package com.example.java;

//Sub-class Geometric class with inherit from SuperClass Progression
// Geometric will inherit Progression class's methods firsValue() and printProgression()
// and nextValue()
// Also Sub-class Geometric will inherit the Super class instant variable such as
// variables first and cur.

public class Geometric extends Progression {

    //Default constructor
    Geometric(){
        this(2);
    }

    //parameter constructor with the base
    Geometric(long base){
        first = base;
        cur = first;
    }

    //Advance the progression by multiplying the base with the current value
    //return the next value of the progression.
    protected long nextValue(){
        cur *= first;
        return cur;
    }



}
