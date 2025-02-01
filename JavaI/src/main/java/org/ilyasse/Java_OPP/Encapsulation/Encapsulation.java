package org.ilyasse.Java_OPP.Encapsulation;





//✅ Data Security: Prevents unauthorized access.
//✅ Flexibility: Changes to internal implementation do not affect external code.
//✅ Reusability: Encapsulated code can be reused in multiple programs.
//✅ Improved Maintainability: Encapsulated classes are easier to manage and debug.

class Student {
    private int age ;
    private String name;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }
}

public class Encapsulation{
    public static void main ( String[] args ) {
        Student s1 = new Student();
        s1.setAge (10);
        s1.setName ("John");
        System.out.println (s1.getAge () + " " + s1.getName ());
    }

}
