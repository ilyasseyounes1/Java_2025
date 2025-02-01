package org.ilyasse.Java_OPP.Static;
// Static members belong to the class, not objects.
//✅ Static methods cannot use this or super keywords.
//✅ Static blocks execute before the main() method.
//✅ Static nested classes do not require an instance of the outer class.

class Mobile {
    int price ;
    String brand ;
    static String name ;

    public void print(){
        System.out.println (brand + " " + name + " " + price);
    }
    // A static method can call only other static methods and cannot call a non-static method from it.
    //A static method can be accessed directly by the class name and doesn’t need any object
    //A static method cannot refer to "this" or "super" keywords in any way

    public static void show ( Mobile obj){
        System.out.println (obj.brand + ":" + obj.price +":"+ name);
    }
}
public class staticVar{
    public static void main ( String[] args ) {
        Mobile obj1 = new Mobile ();
        obj1.price = 1500;
        obj1.brand = "Samsung";
        Mobile.name = "S44";

        Mobile obj2 = new Mobile ();
        obj2.price = 1800;
        obj2.brand = "lama11 ";
        Mobile.name = "X33";

        obj1.print();
        obj2.print();
        Mobile.show ( obj1 );
    }
    //  Static Variables (Class Variables) :
    // Shared across all objects of the class.
    //Stored in the Method Area (not in Heap Memory).
    //Can be accessed without creating an object.

}
