package com.workspace.string_basics;

public class StringMethods {
    public static void main(String[] args) {
        String color = "Red";
        String things = "Pen";

        System.out.println(color.length());       // 3
        System.out.println(color.charAt(0));      // R
        System.out.println(color.toLowerCase());  // red
        System.out.println(color.toUpperCase());  // RED
        System.out.println(color.concat(things)); // RedPen



    }
}
