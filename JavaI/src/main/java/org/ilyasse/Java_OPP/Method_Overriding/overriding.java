package org.ilyasse.Java_OPP.Method_Overriding;

class Calc {
    public int add(int a, int b) {
        return a+b;
    }
}
class AdvCalc  extends Calc {
    public int add(int a, int b) {
        return a+b+5;
    }
}
public class overriding{
    public static void main ( String[] args ) {
        AdvCalc obj = new AdvCalc();
        obj.add(1,2);
        // here it will call AdvCalc methode due to methode overriding
        // if advCalc methode not found it call parent methode then.

    }
}
