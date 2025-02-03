package org.ilyasse.Java_OPP.Type_Casting;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (subclass of Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class CastingExample {
    public static void main(String[] args) {
        // Upcasting: Converting a subclass object to a superclass reference
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Calls the overridden method in Dog class
        // myAnimal.bark(); // ERROR: Cannot call subclass-specific methods with superclass reference

        // Downcasting: Converting a superclass reference back to a subclass reference
        if (myAnimal instanceof Dog) { // Check before downcasting to avoid ClassCastException
            Dog myDog = (Dog) myAnimal; // Downcasting
            myDog.bark(); // Now we can call the subclass-specific method
        }
    }
}
