package com.workspace.polymorphism;

public class Main {
    public static void main(String[] args) {
        // compile time polymorphism / method overloading

        Student student1 = new Student();
        student1.read("Think Python");

        Person person = new Person();
        person.showDetails(); // person details

        // runtime polymorphism / method overriding ---------------------

        Person person1 = new Employee();
        person1.showDetails();  // employee details

        Ram ram = new Ram();
        ram.doWork(person1);  // employee details

    }
}
