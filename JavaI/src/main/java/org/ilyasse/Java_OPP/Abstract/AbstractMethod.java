package org.ilyasse.Java_OPP.Abstract;
 // ilyasse younes 01/02/2025   7:12 pm :

abstract class Vehicle {
    abstract void start();  // Abstract method
    abstract void stop();   // Abstract method
}

// Subclass providing implementations
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping...");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car is starting...
        myCar.stop();  // Output: Car is stopping...
    }
}
/* 1. Abstract Class
✔ An abstract class cannot be instantiated.
✔ It can have both abstract and concrete methods.
✔ Used as a blueprint for other classes.
✔ Can have constructors, static methods, and final methods.

2. Abstract Methods
✔ Declared without an implementation (abstract void methodName();).
✔ Must be overridden by subclasses unless they are also abstract.
✔ Cannot be static, final, or private. <<----

3. Rules for Abstract Classes and Methods
✔ If a class has at least one abstract method, it must be abstract.
✔ Subclasses must implement all abstract methods or be declared abstract themselves.
✔ Cannot create an object of an abstract class.
✔ Abstract classes can extend other abstract classes.

4. Abstract vs Interface
✔ Abstract class can have both concrete & abstract methods, whereas interfaces (before Java 8) could only have abstract methods.
✔ Interfaces support multiple inheritance, but a class can extend only one abstract class.
✔ From Java 8+, interfaces can have default & static methods, making them more similar to abstract classes. */