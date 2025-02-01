package org.ilyasse.Java_OPP.Object_class;

class ObjectClassExample {
    private int id;
    private String name;

    public ObjectClassExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() method from Object class
    @Override
    public String toString() {
        return "ObjectClassExample{id=" + id + ", name='" + name + "'}";
    }

    // Overriding equals() method from Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectClassExample that = (ObjectClassExample) obj;
        return id == that.id && name.equals(that.name);
    }

    // Overriding hashCode() method from Object class
    @Override
    public int hashCode() {
        return id * 31 + name.hashCode();
    }
}

public class Java_object_class {
    public static void main(String[] args) {
        ObjectClassExample obj1 = new ObjectClassExample(1, "John");
        ObjectClassExample obj2 = new ObjectClassExample(1, "John");

        // Testing toString() method
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);

        // Testing equals() method
        System.out.println("Objects are equal: " + obj1.equals(obj2));

        // Testing hashCode() method
        System.out.println("HashCode of Object 1: " + obj1.hashCode());
        System.out.println("HashCode of Object 2: " + obj2.hashCode());
    }
}

