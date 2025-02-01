package org.ilyasse.Java_OPP.Encapsulation.Example_1;


public class SubClass extends A{
    public SubClass ( int num , String name ) {
        super ( num , name );
    }

    public static void main ( String[] args ) {
        SubClass sub = new SubClass ( 10 , "Bob" );
        int num = sub.num;
        System.out.println (sub instanceof Object); // to check if its instance of obj
    }
}