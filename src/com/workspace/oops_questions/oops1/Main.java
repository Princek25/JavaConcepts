package com.workspace.oops_questions.oops1;

public class Main {
    public static void main(String[] args) {
        // Creating 2 instance of the Person Class:-
        Person p1 = new Person("Prince", 27);
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
        Person p2 = new Person("Rahul", 15);
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old.");
    }
}
