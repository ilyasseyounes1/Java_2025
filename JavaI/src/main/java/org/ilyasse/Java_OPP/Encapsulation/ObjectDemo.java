package org.ilyasse.Java_OPP.Encapsulation;
public class ObjectDemo{
    int num;
    float gpa;

    public  ObjectDemo(int num, float gpa){
        this.num=num;
        this.gpa=gpa;
    }

    @Override
    public int hashCode () {
        return super.hashCode ();
    }

    @Override
    public boolean equals ( Object obj ) {
        return super.equals ( obj );
    }

    @Override
    public String toString () {
        return super.toString ();
    }

    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone ();
    }

    //  @Override
    // protected void finalize () throws Throwable {
    //  super.finalize ();
    // }

    public static void main ( String[] args ) {
        ObjectDemo obj1 = new ObjectDemo(10,20);
        ObjectDemo obj2 = new ObjectDemo(10,20);

        if ( obj1 == obj2 ){
            System.out.println ("obj1 is equal to obj2"); // Note of String --> ...
        }
        if (obj1.equals(obj2)){
            System.out.println ("obj1 is equal to obj2");
        }
        System.out.println (obj1.getClass ().getName ());
        System.out.println (obj1.hashCode ());
        System.out.println (obj2.hashCode ());
    }

}
