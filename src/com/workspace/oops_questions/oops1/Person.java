package com.workspace.oops_questions.oops1;

public class Person {

    // Creating name and age attributes:-
    String name;
    int age;

    // Set their attributes using a constructor:-
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // using getter method:-
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
