package com.workspace.string_basics;

public class ReverseAString {

    public static void method1() {
        String color = "purple";
        String reverse = "";

        for (int i = color.length() - 1; i >= 0; i--) {
            reverse = reverse + color.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(color);
    }

    public static void method2() {
        String color = "purple";
        String reverse = "";

        for (int i = 0; i <= color.length() - 1; i++) {
            reverse = color.charAt(i) + reverse;
        }
        System.out.println(reverse);
        System.out.println(color);
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
