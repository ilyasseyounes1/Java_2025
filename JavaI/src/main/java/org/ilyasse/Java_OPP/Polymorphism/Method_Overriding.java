package org.ilyasse.Java_OPP.Polymorphism;

// Parent class
class Animal {
    // Method that will be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog overrides the makeSound() method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class Cat overrides the makeSound() method
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        // Parent class reference pointing to child class objects
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}
