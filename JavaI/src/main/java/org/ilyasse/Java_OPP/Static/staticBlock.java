package org.ilyasse.Java_OPP.Static;

class phone{
    static String name;

    // Used for initialization of static variables.
    //Executes once when the class is loaded.
    static {
        name = "phone11";
        System.out.println ( "in static block" );
    }

    int price;
    String brand;

    public void print () {
        System.out.println ( brand + " " + name + " " + price );
    }
    public phone () {
        brand = "";
        price = 200;
        System.out.println ("in constructor ");
    }
}

public class staticBlock{
    public static void main ( String[] args ) {
        phone obj1 = new phone ();
        obj1.price = 1500;
        obj1.brand = "Samsung";
        phone.name = "S44";

        phone obj2 = new phone ();
        obj2.price = 1800;
        obj2.brand = "lama11 ";
        phone.name = "X33";

        obj1.print();
        obj2.print();

        // to load a class without creating an obj: Class.forName (className: "Mobile");
    }
}