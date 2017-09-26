package com.example.java;

//Sub-class ArithProgression with inherit from SuperClass Progression
// ArithProgression will inherit Progression class's methods firsValue() and printProgression()
// and nextValue()
// Also Sub-class Geometric will inherit the Super class instant variable such as
// variables first and cur.


public class ArithProgression extends Progression {

    protected long inc;     //Increment

    //Default constructor
    ArithProgression(){
        this(1);
    }

    //parameter constructor for providing increment
    ArithProgression(long increment){
        inc = increment;
    }

    //Advance the progression by adding the increment to the current value.
    //Return the next value of progression.
    protected long nextValue(){
        cur += inc;
        return cur;

    }






}
