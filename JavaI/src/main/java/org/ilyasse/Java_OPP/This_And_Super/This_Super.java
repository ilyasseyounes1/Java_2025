package org.ilyasse.Java_OPP.This_And_Super;
class A {
    public A (){
        super(); // call supper class : Object
        System.out.println ("in A constructor");
    }
    public A (int a){
        System.out.println ("in A parametrize constructor");
    }
}
class B extends A{
    public B (){
        super(); // call super const
        System.out.println ("in B constructor");
    }
    public B (int a){
        this(); // call the default const
        System.out.println ("in B parametrize constructor");
    }

}
public class This_Super{
    public static void main ( String[] args ) {
        B obj = new B (4);
        // in any constractor there is a hidden method : super();

    }
}
