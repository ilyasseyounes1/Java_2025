package org.ilyasse.Java_OPP.Inheritance;


// Base Class: Box
public class Box {
    double l, w, h; // Length, Width, and Height of the Box.

    // Static method that belongs to the class and is not overridden
    static void greeting() {
        System.out.println("I'm inside Box");
    }

    // Default Constructor
    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // Cube Constructor (All sides are equal)
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // Parameterized Constructor
    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // Copy Constructor (Creates a new Box using another Box object)
    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}

// Child Class: BoxWeight (Extends Box → Single Inheritance)
class BoxWeight extends Box {
    double weight; // Additional property specific to BoxWeight.

    // Default Constructor
    public BoxWeight() {
        super(); // Calls the parent class constructor.
        this.weight = -1;
    }

    // Static method hiding (not overriding because static methods belong to the class)
    static void greeting() {
        System.out.println("I'm inside BoxWeight");
    }

    // Parameterized Constructor
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // Calls the parent class constructor to initialize dimensions.
        this.weight = weight;

        // There are two use cases of `super`:
        // (1) Used to initialize values from the parent class.
        // (2) If `weight` were in the parent class, we could access it using `super.weight`
    }

    // Copy Constructor (Creates a new BoxWeight from another BoxWeight object)
    public BoxWeight(BoxWeight other) {
        super(other); // Calls the parent class copy constructor.
        this.weight = other.weight;
    }

    // Cube Constructor with weight
    BoxWeight(double side, double weight) {
        super(side); // Calls the cube constructor from the parent class.
        this.weight = weight;
    }
}

// Child Class: BoxColor (Extends BoxWeight → Multilevel Inheritance)
class BoxColor extends BoxWeight {
    String color; //  Additional property specific to BoxColor.

    // Default Constructor
    BoxColor() {
        super(); // Calls the default constructor of BoxWeight.
        this.color = "none";
    }

    // Parameterized Constructor
    BoxColor(double l, double w, double h, double weight, String color) {
        super(l, w, h, weight); // Calls the parent class constructor.
        this.color = color;
    }
}

// Child Class: BoxPrice (Extends BoxWeight → Hierarchical Inheritance)
class BoxPrice extends BoxWeight {
    double cost; // Additional property specific to BoxPrice.

    // Default Constructor
    BoxPrice() {
        super(); // Calls the default constructor of BoxWeight.
        this.cost = -1;
    }

    // Copy Constructor
    BoxPrice(BoxPrice other) {
        super(other); // Calls the parent class copy constructor.
        this.cost = other.cost;
    }

    // Parameterized Constructor
    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight); // Calls the parent class constructor.
        this.cost = cost;
    }

    // Cube Constructor with weight and cost
    public BoxPrice(double side, double weight, double cost) {
        super(side, weight); // Calls the BoxWeight cube constructor.
        this.cost = cost;
    }
}

// Main Class for Execution
class Main {
    public static void main(String[] args) {
        /*
         * SINGLE INHERITANCE:
         * BoxWeight inherits from Box
         */
        BoxWeight box1 = new BoxWeight(1, 2, 3, 4);
        System.out.println("BoxWeight Dimensions: " + box1.l + "x" + box1.w + "x" + box1.h);
        System.out.println("Weight: " + box1.weight);

        // Box reference can hold a BoxWeight object, but it cannot access child-specific properties
        Box box4 = new BoxWeight(1, 2, 4, 5);
        System.out.println("Box reference width: " + box4.w);
        // System.out.println(box4.weight);  // ERROR: `Box` reference cannot access `weight`

        /*
         * MULTILEVEL INHERITANCE: Box → BoxWeight → BoxColor
         */
        BoxColor box2 = new BoxColor();
        BoxColor box3 = new BoxColor(2, 3, 4, 5, "Red");
        System.out.println("BoxColor: " + box3.color);

        /*
         * STATIC METHOD BEHAVIOR:
         * Static methods are inherited but cannot be overridden
         */
        Box.greeting(); // Calls the Box class greeting()
        Box box = new BoxWeight();
        box.greeting(); // Calls the Box class greeting() (static method binding at compile-time)

        /*
         * HIERARCHICAL INHERITANCE:
         * Box → BoxWeight
         *       ↘ BoxPrice
         */
        BoxPrice box5 = new BoxPrice(5, 3, 5);
        System.out.println("BoxPrice Cost: " + box5.cost);
    }
}
