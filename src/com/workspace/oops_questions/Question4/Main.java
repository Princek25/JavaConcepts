package com.workspace.oops_questions.Question4;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Area of circle:- " + (3.14 * c.getRadius() * c.getRadius()));
        System.out.println("Circumference of circle:- " + (2 * 3.14 * c.getRadius()));
    }
}
