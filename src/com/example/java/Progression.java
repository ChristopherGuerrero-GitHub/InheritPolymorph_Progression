package com.example.java;


public class Progression {

    protected long first;   // first value of the progression.
    protected long cur;     // current value of progression.

    //Default constructor
    Progression(){
        cur = first = 0;

    }

    //Reset progression to first value and return first value.
    protected long firstValue(){
        cur = first;
        return cur;
    }

    //Advance the progression to the next value.
    protected long nextValue(){
        return ++cur;
    }

    //Print the first n values of the progression.
    //@parametere n numbers of values to print.
    public void printValue(int num){

        System.out.println(); // ends the line

        System.out.print(firstValue());

        for (int i = 2; i <= num; i++) {
            System.out.print(" " + nextValue());

        }
        System.out.println(); // ends the line
        System.out.println(); // ends the line

    }




}
