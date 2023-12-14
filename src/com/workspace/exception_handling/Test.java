package com.workspace.exception_handling;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("statement1");
            System.out.println(10/0);
            System.out.println("statement3");
        } catch (NumberFormatException e) {
            System.out.println(10 / 2);
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("hello");
    }
}
