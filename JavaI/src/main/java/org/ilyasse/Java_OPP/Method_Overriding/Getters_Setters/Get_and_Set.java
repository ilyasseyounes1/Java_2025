package org.ilyasse.Java_OPP.Method_Overriding.Getters_Setters;
// // Encapsulation: Keeps fields private and controls how they are accessed.
////Validation: Allows adding logic before modifying a value.
////Read-Only or Write-Only Fields: A class can expose only a getter or a setter.
////Debugging & Flexibility: Provides a way to monitor changes to a variable.
class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


public class Get_and_Set{
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(10);
        h.getAge ();

    }

}
