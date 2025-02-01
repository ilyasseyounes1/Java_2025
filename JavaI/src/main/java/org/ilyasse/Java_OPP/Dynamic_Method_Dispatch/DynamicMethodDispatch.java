package org.ilyasse.Java_OPP.Dynamic_Method_Dispatch;

// Parent class
class Parent {
    // Method to be overridden
    void show() {
        System.out.println("Parent's show() method");
    }
}

// Child class 1
class Child1 extends Parent {
    // Overriding the show() method
    @Override
    void show() {
        System.out.println("Child1's show() method");
    }
}

// Child class 2
class Child2 extends Parent {
    // Overriding the show() method
    @Override
    void show() {
        System.out.println("Child2's show() method");
    }
}

// Main class to demonstrate Dynamic Method Dispatch
public class DynamicMethodDispatch{
    public static void main(String[] args) {
        // Parent class reference
        Parent ref;

        // Assigning a Child1 object to Parent reference
        ref = new Child1();
        ref.show(); // Calls Child1's show() method

        // Assigning a Child2 object to Parent reference
        ref = new Child2();
        ref.show(); // Calls Child2's show() method
    }
}

