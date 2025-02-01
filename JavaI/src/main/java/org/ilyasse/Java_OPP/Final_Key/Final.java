package org.ilyasse.Java_OPP.Final_Key;

    class FinalExample {
        // 1. final variable (constant value)
        final int CONSTANT_VALUE = 100;

        // 2. final method (cannot be overridden)
        final void displayMessage() {
            System.out.println("This is a final method.");
        }
    }

    // 3. final class (cannot be extended)
    final class FinalClass {
        void show() {
            System.out.println("This is a final class.");
        }
    }

// Uncommenting the below line will cause a compilation error because a final class cannot be extended
// class ChildClass extends FinalClass {}

    class SubClass extends FinalExample {
        // Uncommenting the below method will cause a compilation error
        // because a final method cannot be overridden
    /*
    void displayMessage() {
        System.out.println("Cannot override final method.");
    }
    */
    }

    public class Final {
        public static void main(String[] args) {
            // 4. final variable example (reassignment attempt will cause an error)
            FinalExample obj = new FinalExample();
            System.out.println("Final variable value: " + obj.CONSTANT_VALUE);

            // Uncommenting the below line will cause a compilation error
            // obj.CONSTANT_VALUE = 200; // Cannot reassign a final variable

            // Calling final method
            obj.displayMessage();

            // Using final class
            FinalClass finalObj = new FinalClass();
            finalObj.show();
        }
    }

// Final Variables – Cannot be reassigned after initialization.
//Final Methods – Cannot be overridden in subclasses.
//Final Classes – Cannot be extended.
//Usage in a Main Method – Shows what happens when trying to reassign or override final elements.