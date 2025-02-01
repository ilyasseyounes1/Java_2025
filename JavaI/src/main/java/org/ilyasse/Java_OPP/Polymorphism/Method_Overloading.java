package org.ilyasse.Java_OPP.Polymorphism;
//  /* *****************************************************
//        Types of polymorphism:
//        ---> 1 compile time / Static Polymorphism;
//        this can be achieved via method overloading.
//        methode overloading means: same name but types, arguments, return type ordering and be different.
//         i.e   A a = new A();
//               A a = new A (3,4);
//              ********************************************************* */
//        /* ---> 2 Runtime /Dynamic Polymorphism
//        Overriding by method overriding
//        so, how it works:
//        parent obj = new child ();
//        here, which method will be called depend on child
//        this is known as UPcasting
//       + child def which to run
//       + parent def which to access
//          -->"parent : u can access an Area fun but which one ??? that is defined by the obj (child in this case) "
//          ---> how java determines which version of that method to call: dynamic method dispatch
//         */

class MathOperations {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));       // Calls add(int, int) → Output: 15
        System.out.println(math.add(5, 10, 20));   // Calls add(int, int, int) → Output: 35
        System.out.println(math.add(5.5, 2.3));    // Calls add(double, double) → Output: 7.8
    }
}

