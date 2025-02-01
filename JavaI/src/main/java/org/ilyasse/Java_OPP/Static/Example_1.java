package org.ilyasse.Java_OPP.Static;

public class Example_1{
    public class Human {
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        static void message() {
            System.out.println("Hello world!");
            //System.out.println(this.name);

        }

        public Human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population += 1; // this.population +=1;  same but use Human.pop...
        }

    }
}
