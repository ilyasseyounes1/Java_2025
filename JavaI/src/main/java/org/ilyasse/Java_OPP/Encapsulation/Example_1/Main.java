package org.ilyasse.Java_OPP.Encapsulation.Example_1;

 public class Main{
    public static void main ( String[] args ) {
        A obj = new A (12,"ilyass");
        // need to do a few things :
        // 1. access the date members
        // 2. modify the data members

        obj.getNum (); // we can access a protected instance indirectly.
        int n = obj.num;

    }
}