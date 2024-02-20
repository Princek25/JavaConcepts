package com.workspace.oops_questions.oops2;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Rocky");
        d1.setBreed("German Shepherd");
        System.out.println("Name of the dog:- " + d1.getName() + " and breed:- " + d1.getBreed());

        Dog d2 = new Dog();
        d2.setName("Max");
        d2.setBreed("siberian Husky");
        System.out.println("Name of the dog:- " + d2.getName() + " and breed:- " + d2.getBreed());
    }
}
