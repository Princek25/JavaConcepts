package com.workspace.exception;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("Hello");
            System.out.println(a);
        } catch (NumberFormatException nFE) {
            System.out.println("int value can be change into string");
        }
    }
}
