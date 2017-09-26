package com.example.java;


public class Main {

    public static void main(String[] args) {

        // Test program to test Inheritance and Polymorphism of a printValue method in the super class Progression.
        // The super class is Progression with all other classes are sub-classes ie. ArithProgression class, Fibonacci
        // class, and Geometric class. Each of the three sub-classes inherit the instant variables and methods from
        // the super class.

        Progression prog;

        //test ArithProgression.

        System.out.println("Arithmetic progression with the default increment: ");

        prog = new ArithProgression();
        prog.printValue(10);


        System.out.println("Arithmetic progression with increment 5 : ");


        prog = new ArithProgression(5);
        prog.printValue(10);

        //test Geometric

        System.out.println("Geometric progression with default base : ");

        prog = new Geometric();
        prog.printValue(10);

        System.out.println("Geometric progression with base 3 : ");

        prog = new Geometric(3);
        prog.printValue(10);

        //test Fibonnacci

        System.out.println("Fibonacci progression with default start values : ");

        prog = new Fibonacci();
        prog.printValue(10);

        System.out.println("Fibonnacci progression with start values 4 and 6 : ");

        prog = new Fibonacci(4,6);
        prog.printValue(10);




    }
}
