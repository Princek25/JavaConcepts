package com.workspace.oops_questions.Question3;

// 3. Write a Java program to create a class called "Rectangle" with width and height
// attributes. Calculate the area and perimeter of the rectangle.
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 7);
        System.out.println("Area of the rectangle:- " + r1.getWidth() * r1.getHeight());
        System.out.println("Perimeter of the rectangle:- " + (2 * (r1.getWidth() + r1.getHeight())));
        r1.setWidth(6);
        r1.setHeight(8);
        System.out.println("Area of the rectangle:- " + r1.getWidth() * r1.getHeight());
        System.out.println("Perimeter of the rectangle:- " + (2 * (r1.getWidth() + r1.getHeight())));
    }
}
